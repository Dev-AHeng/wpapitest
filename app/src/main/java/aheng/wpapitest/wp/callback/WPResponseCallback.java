package aheng.wpapitest.wp.callback;

import com.zhy.http.okhttp.callback.Callback;

import java.io.IOException;

import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import okhttp3.Response;

/**
 * 自定义请求回调
 *
 * @author AHeng
 * @date 2021/05/18 21:13
 */
public abstract class WPResponseCallback extends Callback<WPResponseCallbackBean> {
    WPResponseCallbackBean wpResponseCallback = new WPResponseCallbackBean();

    @Override
    public WPResponseCallbackBean parseNetworkResponse(Response response, int id) throws IOException {
        // 服务器响应内容
        wpResponseCallback.setResponseContent(response.body().string());
        // 状态码
        wpResponseCallback.setStatusCode(response.code());
        return wpResponseCallback;
    }
}