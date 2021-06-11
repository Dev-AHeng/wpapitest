package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.bean.WPValidateTokenBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 验证token(好像token寿命只有一天)
 *
 * @author AHeng
 * @date 2021/05/18 22:08
 */
public class WPValidateToken {
    private String token;

    private WPValidateToken() {
    }

    public static WPValidateToken builder() {
        return new WPValidateToken();
    }

    private String getToken() {
        return token;
    }

    /**
     * 设置token(必填)
     *
     * @param token token
     */
    public WPValidateToken setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPValidateTokenBean> wpCallback) {
        OkHttpUtils
                .post()
                .url(MyApplication.init().getHost() + "/wp-json/jwt-auth/v1/token/validate")
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
                        WPValidateTokenBean wpValidateTokenBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPValidateTokenBean.class);
                        wpCallback.success(wpValidateTokenBean, response.getResponseContent(), response.getStatusCode());
                    }
                });
    }

}
