package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.HashMap;
import java.util.Map;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPMyMessageBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 修改我的信息
 *
 * @author AHeng
 * @date 2021/05/19 15:30
 */
public class WPChangeMyMessage {
    private String token;

    private String name;
    private String first_name;
    private String last_name;
    private String email;
    private String url;
    private String description;
    private String locale;
    private String nickname;
    private String roles;
    private String slug;

    private WPChangeMyMessage() {
    }

    public static WPChangeMyMessage builder() {
        return new WPChangeMyMessage();
    }

    private String getDescription() {
        return description;
    }

    /**
     * 设置我的描述
     *
     * @param description 我的描述
     */
    public WPChangeMyMessage setDescription(String description) {
        this.description = description;
        return this;
    }

    private String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token token
     */
    public WPChangeMyMessage setToken(String token) {
        this.token = token;
        return this;
    }

    private String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public WPChangeMyMessage setName(String name) {
        this.name = name;
        return this;
    }

    private String getFirst_name() {
        return first_name;
    }

    /**
     * 设置名字
     *
     * @param first_name 名字
     */
    public WPChangeMyMessage setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    private String getLast_name() {
        return last_name;
    }

    /**
     * 设置姓氏
     *
     * @param last_name 姓氏
     */
    public WPChangeMyMessage setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    private String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public WPChangeMyMessage setEmail(String email) {
        this.email = email;
        return this;
    }

    private String getUrl() {
        return url;
    }

    /**
     * 设置自定义的链接
     *
     * @param url 自定义的链接
     */
    public WPChangeMyMessage setUrl(String url) {
        this.url = url;
        return this;
    }

    private String getLocale() {
        return locale;
    }

    /**
     * 设置本地语言
     *
     * @param locale 本地语言
     */
    public WPChangeMyMessage setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    private String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public WPChangeMyMessage setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    private String getRoles() {
        return roles;
    }

    /**
     * 设置角色
     *
     * @param roles
     */
    public WPChangeMyMessage setRoles(String roles) {
        this.roles = roles;
        return this;
    }

    private String getSlug() {
        return slug;
    }

    /**
     * 设置slug
     *
     * @param slug slug
     */
    public WPChangeMyMessage setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPMyMessageBean> wpCallback) {
        Map<String, String> map = new HashMap<>();

        if (getName() != null && getName().length() > 0) {
            map.put("name", getName());
        }

        if (getFirst_name() != null && getFirst_name().length() > 0) {
            map.put("first_name", getFirst_name());
        }

        if (getLast_name() != null && getLast_name().length() > 0) {
            map.put("last_name", getLast_name());
        }

        if (getEmail() != null && getEmail().length() > 0) {
            map.put("email", getEmail());
        }

        if (getDescription() != null && getDescription().length() > 0) {
            map.put("description", getDescription());
        }

        if (getUrl() != null && getUrl().length() > 0) {
            map.put("url", getUrl());
        }

        if (getLocale() != null && getLocale().length() > 0) {
            map.put("locale", getLocale());
        }

        if (getNickname() != null && getNickname().length() > 0) {
            map.put("nickname", getNickname());
        }

        if (getRoles() != null && getRoles().length() > 0) {
            map.put("roles", getRoles());
        }

        if (getSlug() != null && getSlug().length() > 0) {
            map.put("slug", getSlug());
        }

        // System.out.println(map.toString());
        OkHttpUtils
                .post()
                .url(MyApplication.init().getHost() + "/wp-json/wp/v2/users/me")
                .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .addHeader("Authorization", "Bearer" + getToken())
                .params(map)
                .build()
                .execute(new WPResponseCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        wpCallback.error(call, e);
                    }

                    @Override
                    public void onResponse(WPResponseCallbackBean response, int id) {
                        WPMyMessageBean te = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPMyMessageBean.class);
                        wpCallback.success(te, response.getResponseContent(), response.getStatusCode());
                    }
                });
    }
}
