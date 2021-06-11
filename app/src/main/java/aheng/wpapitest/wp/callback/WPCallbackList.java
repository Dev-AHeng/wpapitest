package aheng.wpapitest.wp.callback;

import java.util.List;

import okhttp3.Call;

/**
 * @author AHeng
 * @date 2021/05/25 21:10
 */
public interface WPCallbackList<xxxBean> {
    /**
     * 请求成功
     *
     * @param xxxBeans        帖子列
     * @param responseContent 响应内容
     * @param statusCode      服务器状态码
     */
    void success(List<xxxBean> xxxBeans, String responseContent, int statusCode);

    /**
     * 请求错误
     *
     * @param call Call
     * @param e    请求异常
     */
    void error(Call call, Exception e);
}
