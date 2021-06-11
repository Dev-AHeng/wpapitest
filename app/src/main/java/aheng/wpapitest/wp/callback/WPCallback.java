package aheng.wpapitest.wp.callback;

import okhttp3.Call;

/**
 * @author AHeng
 * @date 2021/05/16 22:54
 */
public interface WPCallback<xxxBean> {
    /**
     * 请求成功
     *
     * @param responseContent 响应内容
     * @param responseContent 响应内容
     * @param statusCode      服务器状态码
     */
    void success(xxxBean xxxBean, String responseContent, int statusCode);

    /**
     * 请求错误
     *
     * @param call Call
     * @param e    请求异常
     */
    void error(Call call, Exception e);
}