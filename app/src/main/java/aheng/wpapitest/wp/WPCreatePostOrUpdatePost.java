package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.HashMap;
import java.util.Map;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPCreatePostOrUpdatePostBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 创建一个帖子或更新一个帖子
 *
 * @author AHeng
 * @date 2021/05/26 21:33
 */
public class WPCreatePostOrUpdatePost {
    private String token;
    private Integer postId;
    private String date;
    private String date_gmt;
    private String slug;
    private String status;
    private String password;
    private String title;
    private String content;
    private Integer authorId;
    private String excerpt;
    private String featured_media;
    private String comment_status;
    private String ping_status;
    private String format;
    private String meta;
    private String sticky;
    private String template;
    private String categories;
    private String tags;

    private WPCreatePostOrUpdatePost() {
    }

    public static WPCreatePostOrUpdatePost builder() {
        return new WPCreatePostOrUpdatePost();
    }

    private Integer getPostId() {
        return postId;
    }

    /**
     * 设置要修改帖子的id
     *
     * @param postId 要修改帖子的id
     */
    public WPCreatePostOrUpdatePost setPostId(Integer postId) {
        this.postId = postId;
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
    public WPCreatePostOrUpdatePost setToken(String token) {
        this.token = token;
        return this;
    }

    private String getDate() {
        return date;
    }

    /**
     * 对象发布日期，在网站的时区。
     *
     * @param date 对象发布日期，在网站的时区。
     */
    public WPCreatePostOrUpdatePost setDate(String date) {
        this.date = date;
        return this;
    }

    private String getDate_gmt() {
        return date_gmt;
    }

    /**
     * 对象发布的日期，如 GMT。
     *
     * @param date_gmt 对象发布的日期，如 GMT。
     */
    public WPCreatePostOrUpdatePost setDate_gmt(String date_gmt) {
        this.date_gmt = date_gmt;
        return this;
    }

    private String getSlug() {
        return slug;
    }

    /**
     * 对象的字母数字标识符，其类型独一无二。
     *
     * @param slug 对象的字母数字标识符，其类型独一无二。
     */
    public WPCreatePostOrUpdatePost setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    private String getStatus() {
        return status;
    }

    /**
     * 帖子的命名状态。
     *
     * @param status 选其一: publish, future, draft, pending, private
     */
    public WPCreatePostOrUpdatePost setStatus(String status) {
        this.status = status;
        return this;
    }

    private String getPassword() {
        return password;
    }

    /**
     * 保护访问内容和摘录的密码。
     *
     * @param password 保护访问内容和摘录的密码。
     */
    public WPCreatePostOrUpdatePost setPassword(String password) {
        this.password = password;
        return this;
    }

    private String getTitle() {
        return title;
    }

    /**
     * 帖子的标题。
     *
     * @param title 帖子的标题。
     */
    public WPCreatePostOrUpdatePost setTitle(String title) {
        this.title = title;
        return this;
    }

    private String getContent() {
        return content;
    }

    /**
     * 帖子的内容。
     *
     * @param content 帖子的内容。
     */
    public WPCreatePostOrUpdatePost setContent(String content) {
        this.content = content;
        return this;
    }

    private Integer getAuthorId() {
        return authorId;
    }

    /**
     * 帖子作者的 ID。
     *
     * @param authorId 帖子作者的 ID。
     */
    public WPCreatePostOrUpdatePost setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    private String getExcerpt() {
        return excerpt;
    }

    /**
     * 对象的摘录。
     *
     * @param excerpt 对象的摘录。
     */
    public WPCreatePostOrUpdatePost setExcerpt(String excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    private String getFeatured_media() {
        return featured_media;
    }

    /**
     * 对象的特色媒体的 ID
     *
     * @param featured_media 对象的特色媒体的 ID
     */
    public WPCreatePostOrUpdatePost setFeatured_media(String featured_media) {
        this.featured_media = featured_media;
        return this;
    }

    private String getComment_status() {
        return comment_status;
    }

    /**
     * 是否对对象开放评论。
     *
     * @param comment_status 选其一: open, closed
     */
    public WPCreatePostOrUpdatePost setComment_status(String comment_status) {
        this.comment_status = comment_status;
        return this;
    }

    private String getPing_status() {
        return ping_status;
    }

    /**
     * 对象是否可以 ping。
     *
     * @param ping_status 选其一: open, closed
     */
    public WPCreatePostOrUpdatePost setPing_status(String ping_status) {
        this.ping_status = ping_status;
        return this;
    }

    private String getFormat() {
        return format;
    }

    /**
     * 对象的格式。
     *
     * @param format 选其一: standard, aside, chat, gallery, link, image, quote, status, video, audio
     */
    public WPCreatePostOrUpdatePost setFormat(String format) {
        this.format = format;
        return this;
    }

    private String getMeta() {
        return meta;
    }

    /**
     * 元字段。
     *
     * @param meta 元字段。
     */
    public WPCreatePostOrUpdatePost setMeta(String meta) {
        this.meta = meta;
        return this;
    }

    private String getSticky() {
        return sticky;
    }

    /**
     * 对象是否应被视为粘性。
     *
     * @param sticky 对象是否应被视为粘性。
     */
    public WPCreatePostOrUpdatePost setSticky(String sticky) {
        this.sticky = sticky;
        return this;
    }

    private String getTemplate() {
        return template;
    }

    /**
     * 用于显示对象的主题文件。
     *
     * @param template 用于显示对象的主题文件。
     */
    public WPCreatePostOrUpdatePost setTemplate(String template) {
        this.template = template;
        return this;
    }

    private String getCategories() {
        return categories;
    }

    /**
     * 类别分类中分配给对象的术语。
     *
     * @param categories 类别分类中分配给对象的术语。
     */
    public WPCreatePostOrUpdatePost setCategories(String categories) {
        this.categories = categories;
        return this;
    }

    private String getTags() {
        return tags;
    }

    /**
     * 分配给post_tag分类中的对象的术语。
     *
     * @param tags 分配给post_tag分类中的对象的术语。
     */
    public WPCreatePostOrUpdatePost setTags(String tags) {
        this.tags = tags;
        return this;
    }

    private Map map() {
        Map<String, String> map = new HashMap<>();

        if (getDate() != null && getDate().length() > 0) {
            map.put("date", getDate());
        }

        if (getDate_gmt() != null && getDate_gmt().length() > 0) {
            map.put("date_gmt", getDate_gmt());
        }

        if (getSlug() != null && getSlug().length() > 0) {
            map.put("slug", getSlug());
        }

        if (getStatus() != null && getStatus().length() > 0) {
            map.put("status", getStatus());
        }

        if (getPassword() != null && getPassword().length() > 0) {
            map.put("password", getPassword());
        }

        if (getTitle() != null && getTitle().length() > 0) {
            map.put("title", getTitle());
        }

        if (getContent() != null && getContent().length() > 0) {
            map.put("content", getContent());
        }

        if (getAuthorId() != null) {
            map.put("author", String.valueOf(getAuthorId()));
        }

        if (getExcerpt() != null && getExcerpt().length() > 0) {
            map.put("excerpt", getExcerpt());
        }

        if (getFeatured_media() != null && getFeatured_media().length() > 0) {
            map.put("featured_media", getFeatured_media());
        }

        if (getComment_status() != null && getComment_status().length() > 0) {
            map.put("comment_status", getComment_status());
        }

        if (getPing_status() != null && getPing_status().length() > 0) {
            map.put("ping_status", getPing_status());
        }

        if (getFormat() != null && getFormat().length() > 0) {
            map.put("format", getFormat());
        }

        if (getMeta() != null && getMeta().length() > 0) {
            map.put("meta", getMeta());
        }

        if (getSticky() != null && getSticky().length() > 0) {
            map.put("sticky", getSticky());
        }

        if (getTemplate() != null && getTemplate().length() > 0) {
            map.put("template", getTemplate());
        }

        if (getCategories() != null && getCategories().length() > 0) {
            map.put("categories", getCategories());
        }

        if (getTags() != null && getTags().length() > 0) {
            map.put("tags", getTags());
        }

        return map;
    }

    /**
     * 开始请求_创建帖子
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest_CreatePost(WPCallback<WPCreatePostOrUpdatePostBean> wpCallback) {
        OkHttpUtils
                .post()
                .url(MyApplication.init().getHost() + "/wp-json/wp/v2/posts")
                .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .addHeader("Authorization", "Bearer" + getToken())
                .params(map())
                .build()
                .execute(new WPResponseCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        wpCallback.error(call, e);
                    }

                    @Override
                    public void onResponse(WPResponseCallbackBean response, int id) {
                        WPCreatePostOrUpdatePostBean wpCreatePostOrUpdatePostBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPCreatePostOrUpdatePostBean.class);
                        wpCallback.success(wpCreatePostOrUpdatePostBean, response.getResponseContent(), response.getStatusCode());
                    }

                });
    }


    /**
     * 开始请求_更新帖子
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest_UpdatePost(WPCallback<WPCreatePostOrUpdatePostBean> wpCallback) {
        // 帖子id不能为空
        if (getPostId() != null) {
            OkHttpUtils
                    .post()
                    .url(MyApplication.init().getHost() + "/wp-json/wp/v2/posts/" + getPostId())
                    .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                    .addHeader("Authorization", "Bearer" + getToken())
                    .params(map())
                    .build()
                    .execute(new WPResponseCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            wpCallback.error(call, e);
                        }

                        @Override
                        public void onResponse(WPResponseCallbackBean response, int id) {
                            WPCreatePostOrUpdatePostBean wpCreatePostOrUpdatePostBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPCreatePostOrUpdatePostBean.class);
                            wpCallback.success(wpCreatePostOrUpdatePostBean, response.getResponseContent(), response.getStatusCode());
                        }

                    });
        } else {
            System.out.println("要修改的帖子的id不能为空");
        }
    }

}
