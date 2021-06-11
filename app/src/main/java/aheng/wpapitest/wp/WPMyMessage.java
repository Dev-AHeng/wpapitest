package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPMyMessageBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 查看我的信息
 *
 * @author AHeng
 * @date 2021/05/19 13:59
 */
public class WPMyMessage {
    private String token;

    private WPMyMessage() {
    }

    public static WPMyMessage builder() {
        return new WPMyMessage();
    }

    private String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token
     */
    public WPMyMessage setToken(String token) {
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
                .url(MyApplication.init().getHost() + "/wp-json/wp/v2/users/me")
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
