package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPLoginBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 用户登录
 *
 * @author AHeng
 * @date 2021/05/17 12:29
 */
public class WPLogin {
    private String userName;
    private String password;

    private WPLogin() {
    }

    /**
     * 链式调用
     *
     * @return WPLogin
     */
    public static WPLogin builder() {
        return new WPLogin();
    }

    private String getUserName() {
        return userName;
    }

    /**
     * 设置用户名(必填)
     *
     * @param userName 用户名
     * @return WPLogin
     */
    public WPLogin setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    private String getPassword() {
        return password;
    }

    /**
     * 设置密码(必填)
     *
     * @param password 密码
     * @return WPLogin
     */
    public WPLogin setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPLoginBean> wpCallback) {
        OkHttpUtils
                .post()
                .url(MyApplication.init().getHost() + "/wp-json/jwt-auth/v1/token")
                .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .addParams("username", getUserName())
                .addParams("password", getPassword())
                .build()
                .execute(new WPResponseCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        wpCallback.error(call, e);
                    }

                    @Override
                    public void onResponse(WPResponseCallbackBean response, int id) {
                        WPLoginBean wpLoginBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPLoginBean.class);
                        wpCallback.success(wpLoginBean, response.getResponseContent(), response.getStatusCode());
                    }
                });
    }
}
