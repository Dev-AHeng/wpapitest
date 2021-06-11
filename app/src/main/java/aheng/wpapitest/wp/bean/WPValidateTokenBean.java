package aheng.wpapitest.wp.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author AHeng
 * @date 2021/06/08 22:17
 */
public class WPValidateTokenBean {
    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private DataDTO data;

    /**
     * [200/403] 代码。
     *
     * @return 代码。
     */
    public String getCode() {
        return code;
    }

    /**
     * [200] 内容
     *
     * @return 内容
     */
    public String getMessage() {
        return message;
    }

    public DataDTO getData() {
        return data;
    }

    public static class DataDTO {
        @SerializedName("status")
        private Integer status;

        /**
         * [200/403] 状态码。
         *
         * @return 状态码。
         */
        public Integer getStatus() {
            return status;
        }
    }
}
