package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPMyMessageBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 根据用户ID获取该用户信息
 *
 * @author AHeng
 * @date 2021/05/20 15:33
 */
public class WPCheckUser {
    private String token;
    private Integer id;

    private WPCheckUser() {
    }

    public static WPCheckUser builder() {
        return new WPCheckUser();
    }

    private Integer getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public WPCheckUser setId(Integer id) {
        this.id = id;
        return this;
    }

    private String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token token
     */
    public WPCheckUser setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPMyMessageBean> wpCallback) {
        OkHttpUtils
                .post()
                .url(MyApplication.init().getHost() + "/wp-json/wp/v2/users/" + getId())
                .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .addHeader("Authorization", "Bearer" + getToken())
                .build()
                .execute(new WPResponseCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        wpCallback.error(call, e);
                    }

                    @Override
                    public void onResponse(WPResponseCallbackBean response, int id) {
                        WPMyMessageBean wpMyMessageBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPMyMessageBean.class);
                        wpCallback.success(wpMyMessageBean, response.getResponseContent(), response.getStatusCode());
                    }
                });
    }

}
