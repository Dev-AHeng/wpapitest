package aheng.wpapitest.wp.bean;

/**
 * @author AHeng
 * @date 2021/05/18 21:24
 */
public class WPResponseCallbackBean {
    private int statusCode;
    private String responseContent;

    /**
     * [200] 获取服务器返回的状态码
     *
     * @return 服务器返回的状态码
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * [200] 设置服务器返回的状态码
     *
     * @param statusCode 服务器返回的状态码
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * [200] 获取服务器返回的内容
     *
     * @return 服务器返回的内容
     */
    public String getResponseContent() {
        return responseContent;
    }

    /**
     * [200] 设置服务器返回的内容
     *
     * @param responseContent 服务器返回的内容
     */
    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }
}
