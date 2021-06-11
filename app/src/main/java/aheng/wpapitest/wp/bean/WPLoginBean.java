package aheng.wpapitest.wp.bean;

import com.google.gson.annotations.SerializedName;

/**
 * 解析登录json数据
 *
 * @author AHeng
 * @date 2021/05/17 21:08
 */
public class WPLoginBean {
    // @SerializedName("user_id")
    // private Integer userId;
    // @SerializedName("user_login")
    // private String userLogin;
    // @SerializedName("user_first_name")
    // private String userFirstName;
    // @SerializedName("user_last_name")
    // private String userLastName;
    // @SerializedName("user_roles")
    // private List<String> userRoles;
    // @SerializedName("user_role")
    // private String userRole;
    // @SerializedName("user_registered")
    // private String userRegistered;
    // @SerializedName("user_url")
    // private String userUrl;
    // @SerializedName("user_status")
    // private String userStatus;
    // @SerializedName("user_avatar_url")
    // private String userAvatarUrl;
    // @SerializedName("user_activation_key")
    // private String userActivationKey;
    @SerializedName("token")
    private String token;
    @SerializedName("user_email")
    private String userEmail;
    @SerializedName("user_nicename")
    private String userNicename;
    @SerializedName("user_display_name")
    private String userDisplayName;
    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private DataDTO data;

    // /**
    //  * 用户唯一的身份识别器。
    //  *
    //  * @return 用户唯一的身份识别器。
    //  */
    // public Integer getUserId() {
    //     return userId;
    // }
    //
    // /**
    //  * @return
    //  */
    // public String getUserLogin() {
    //     return userLogin;
    // }
    //
    // /**
    //  * 用户名字。
    //  *
    //  * @return 用户名字。
    //  */
    // public String getUserFirstName() {
    //     return userFirstName;
    // }
    //
    // /**
    //  * 用户的姓氏。
    //  *
    //  * @return 用户的姓氏。
    //  */
    // public String getUserLastName() {
    //     return userLastName;
    // }
    //
    // /**
    //  * 分配给用户的角色(多个)。
    //  *
    //  * @return 分配给用户的角色(多个)。
    //  */
    // public List<String> getUserRoles() {
    //     return userRoles;
    // }
    //
    // /**
    //  * 分配给用户的角色。
    //  *
    //  * @return 分配给用户的角色。
    //  */
    // public String getUserRole() {
    //     return userRole;
    // }
    //
    // /**
    //  * @return
    //  */
    // public String getUserRegistered() {
    //     return userRegistered;
    // }
    //
    // /**
    //  * 用户的网址。
    //  *
    //  * @return 用户的网址。
    //  */
    // public String getUserUrl() {
    //     return userUrl;
    // }
    //
    // /**
    //  * 用户状态。
    //  *
    //  * @return 用户状态。
    //  */
    // public String getUserStatus() {
    //     return userStatus;
    // }
    //
    // /**
    //  * 用户的Avatar网址。
    //  *
    //  * @return 用户的Avatar网址。
    //  */
    // public String getUserAvatarUrl() {
    //     return userAvatarUrl;
    // }
    //
    // /**
    //  * @return
    //  */
    // public String getUserActivationKey() {
    //     return userActivationKey;
    // }

    /**
     * [200] token
     *
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * [200] 用户的电子邮件地址。
     *
     * @return 用户的电子邮件地址。
     */
    public String getUserEmail() {
        return userEmail;
    }


    /**
     * [200] 用户的昵称。
     *
     * @return 用户的昵称。
     */
    public String getUserNicename() {
        return userNicename;
    }


    /**
     * [200] 对外显示的名称。
     *
     * @return 对外显示的名称。
     */
    public String getUserDisplayName() {
        return userDisplayName;
    }

    /**
     * [403] 代码。
     *
     * @return 代码。
     */
    public String getCode() {
        return code;
    }

    /**
     * [403] 错误内容
     *
     * @return 错误内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * [403] 状态码。
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
         * [403] 状态码。
         *
         * @return 状态码。
         */
        public Integer getStatus() {
            return status;
        }
    }
}
