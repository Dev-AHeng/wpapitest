package aheng.wpapitest.wp.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author AHeng
 * @date 2021/06/09 1:16
 */
public class WPDeletePostBean {
    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private DataDTO data;

    /**
     * [403/404/410] 代码。
     *
     * @return 代码。
     */
    public String getCode() {
        return code;
    }

    /**
     * [403/404/410] 错误内容
     *
     * @return 错误内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * [403/404/410] 状态码。
     *
     * @return 状态码。
     */
    public DataDTO getData() {
        return data;
    }

    public static class DataDTO {
        @SerializedName("status")
        private Integer status;

        /**
         * [403/404/410] 状态码。
         *
         * @return 状态码。
         */
        public Integer getStatus() {
            return status;
        }
    }


}
