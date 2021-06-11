package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.HashMap;
import java.util.Map;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPRegisterBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;
import okhttp3.MediaType;

/**
 * 注册用户
 *
 * @author AHeng
 * @date 2021/05/16 21:38
 */
public class WPRegister {
    private String username;
    private String email;
    private String password;

    /**
     * 不能通过new初始化
     */
    private WPRegister() {
    }

    public static WPRegister builder() {
        return new WPRegister();
    }

    private String getUsername() {
        return username;
    }

    /**
     * 设置用户名。
     *
     * @param username 用户名。
     */
    public WPRegister setUsername(String username) {
        this.username = username;
        return this;
    }

    private String getEmail() {
        return email;
    }

    /**
     * 设置邮箱。
     *
     * @param email 邮箱。
     * @return
     */
    public WPRegister setEmail(String email) {
        this.email = email;
        return this;
    }

    private String getPassword() {
        return password;
    }

    /**
     * 设置密码。
     *
     * @param password 密码。
     */
    public WPRegister setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPRegisterBean> wpCallback) {
        Map<String, String> map = new HashMap<>();

        if (getEmail() != null && getEmail().length() >= 0 && getUsername() != null && getUsername().length() >= 0 && getPassword() != null && getPassword().length() >= 0) {
            map.put("username", getUsername());
            map.put("email", getEmail());
            map.put("password", getPassword());

            OkHttpUtils
                    .postString()
                    .url(MyApplication.init().getHost() + "/wp-json/wp/v2/users/register")
                    .content(WPConfig.getGsonConfig().toJson(map))
                    .mediaType(MediaType.parse("application/json; charset=utf-8"))
                    .build()
                    .execute(new WPResponseCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            wpCallback.error(call, e);
                        }

                        @Override
                        public void onResponse(WPResponseCallbackBean response, int id) {
                            WPRegisterBean wpRegisterBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPRegisterBean.class);
                            wpCallback.success(wpRegisterBean, response.getResponseContent(), response.getStatusCode());
                        }
                    });
        }

    }
}
