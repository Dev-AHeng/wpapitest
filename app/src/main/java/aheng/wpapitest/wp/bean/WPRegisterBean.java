package aheng.wpapitest.wp.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author AHeng
 * @date 2021/05/17 13:16
 */
public class WPRegisterBean {
    @SerializedName("code")
    private Integer code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private WPRegisterBean.DataDTO data;
    @SerializedName("id")
    private Integer id;

    /**
     * [200/400] 错误代码。
     *
     * @return 错误代码。
     */
    public Integer getCode() {
        return code;
    }

    /**
     * [200/400] 问题信息。
     *
     * @return 问题信息。
     */
    public String getMessage() {
        return message;
    }

    /**
     * [400] 服务器状态码。
     *
     * @return 服务器状态码。
     */
    public WPRegisterBean.DataDTO getData() {
        return data;
    }

    /**
     * [200] 用户id。
     *
     * @return 用户id。
     */
    public Integer getId() {
        return id;
    }

    public static class DataDTO {
        @SerializedName("status")
        private Integer status;

        /**
         * [400] 服务器状态码。
         *
         * @return 服务器状态码。
         */
        public Integer getStatus() {
            return status;
        }
    }
}
