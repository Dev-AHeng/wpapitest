package aheng.wpapitest.wp;

import com.google.gson.reflect.TypeToken;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.List;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.utils.SJ;
import aheng.wpapitest.wp.bean.WPCheckCommentsBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPCallbackList;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 查看评论
 *
 * @author AHeng
 * @date 2021/05/27 21:47
 */
public class WPCheckComments {
    private String token;
    private Integer commentId;
    private Integer page;
    private Integer per_page;
    private String search;
    private String after;
    private Integer author;
    private Integer author_exclude;
    private String author_email;
    private String before;
    private Integer exclude;
    private Integer include;
    private String offset;
    private String order;
    private String orderby;
    private Integer parent;
    private Integer parent_exclude;
    private Integer postId;
    private String status;
    private String type;
    private String password;
    private WPCheckComments() {
    }

    public static WPCheckComments builder() {
        return new WPCheckComments();
    }

    private Integer getCommentId() {
        return commentId;
    }

    /**
     * 评论id
     *
     * @param commentId 评论的id
     */
    public WPCheckComments setCommentId(Integer commentId) {
        this.commentId = commentId;
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
    public WPCheckComments setToken(String token) {
        this.token = token;
        return this;
    }

    private Integer getPage() {
        return page;
    }

    /**
     * 当前集合页面。
     *
     * @param page 当x页(默认为:1)
     */
    public WPCheckComments setPage(Integer page) {
        this.page = page;
        return this;
    }

    private Integer getPer_page() {
        return per_page;
    }

    /**
     * 在结果集中要返回的最大项目数量。
     *
     * @param per_page 在结果集中要返回的最大项目数量。(默认为:10)
     */
    public WPCheckComments setPer_page(Integer per_page) {
        this.per_page = per_page;
        return this;
    }

    private String getSearch() {
        return search;
    }

    /**
     * 将结果限制为匹配字符串的人员。
     *
     * @param search 将结果限制为匹配字符串的人员。
     */
    public WPCheckComments setSearch(String search) {
        this.search = search;
        return this;
    }

    private String getAfter() {
        return after;
    }

    /**
     * 限制对给定 ISO8601 合规日期后发表的评论的响应。
     *
     * @param after 限制对给定 ISO8601 合规日期后发表的评论的响应。
     */
    public WPCheckComments setAfter(String after) {
        this.after = after;
        return this;
    }

    private Integer getAuthor() {
        return author;
    }

    /**
     * 将结果限制为分配给特定用户 ID 的注释。
     *
     * @param author 将结果限制为分配给特定用户 ID 的注释。
     */
    public WPCheckComments setAuthor(Integer author) {
        this.author = author;
        return this;
    }

    private Integer getAuthor_exclude() {
        return author_exclude;
    }

    /**
     * 确保结果集排除分配给特定用户 ID 的注释。
     *
     * @param author_exclude 确保结果集排除分配给特定用户 ID 的注释。
     */
    public WPCheckComments setAuthor_exclude(Integer author_exclude) {
        this.author_exclude = author_exclude;
        return this;
    }

    private String getAuthor_email() {
        return author_email;
    }

    /**
     * 将结果从特定作者的电子邮件设置为该结果。
     *
     * @param author_email 将结果从特定作者的电子邮件设置为该结果。
     */
    public WPCheckComments setAuthor_email(String author_email) {
        this.author_email = author_email;
        return this;
    }

    private String getBefore() {
        return before;
    }

    /**
     * 限制对在给定 ISO8601 合规日期之前发表的评论的响应。
     *
     * @param before 限制对在给定 ISO8601 合规日期之前发表的评论的响应。
     */
    public WPCheckComments setBefore(String before) {
        this.before = before;
        return this;
    }

    private Integer getExclude() {
        return exclude;
    }

    /**
     * 确保结果集排除特定 ID。
     *
     * @param exclude 确保结果集排除特定 ID。
     */
    public WPCheckComments setExclude(Integer exclude) {
        this.exclude = exclude;
        return this;
    }

    private Integer getInclude() {
        return include;
    }

    /**
     * 将结果限制为特定 ID。
     *
     * @param include 将结果限制为特定 ID。
     */
    public WPCheckComments setInclude(Integer include) {
        this.include = include;
        return this;
    }

    private String getOffset() {
        return offset;
    }

    /**
     * 抵消特定项目数设置的结果。
     *
     * @param offset 抵消特定项目数设置的结果。
     */
    public WPCheckComments setOffset(String offset) {
        this.offset = offset;
        return this;
    }

    private String getOrder() {
        return order;
    }

    /**
     * 排序属性上升或下降。
     *
     * @param order 排序属性上升或下降。选其一:asc升序, desc降序  (默认为:desc降序)
     */
    public WPCheckComments setOrder(String order) {
        this.order = order;
        return this;
    }

    private String getOrderby() {
        return orderby;
    }

    /**
     * 按对象属性对集合进行排序。
     *
     * @param orderby 按对象属性对集合进行排序。选其一: date, date_gmt, id, include, post, parent, type  (默认为:date_gmt)
     */
    public WPCheckComments setOrderby(String orderby) {
        this.orderby = orderby;
        return this;
    }

    private Integer getParent() {
        return parent;
    }

    /**
     * 将结果限制为特定父 ID 的评论。
     *
     * @param parent 将结果限制为特定父 ID 的评论。
     */
    public WPCheckComments setParent(Integer parent) {
        this.parent = parent;
        return this;
    }

    private Integer getParent_exclude() {
        return parent_exclude;
    }

    /**
     * 确保结果集排除特定的父 ID。
     *
     * @param parent_exclude 确保结果集排除特定的父 ID。
     */
    public WPCheckComments setParent_exclude(Integer parent_exclude) {
        this.parent_exclude = parent_exclude;
        return this;
    }

    private Integer getPostId() {
        return postId;
    }

    /**
     * 将结果限制为分配给特定帖子 ID 的评论。
     *
     * @param postId 将结果限制为分配给特定帖子 ID 的评论。
     */
    public WPCheckComments setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    private String getStatus() {
        return status;
    }

    /**
     * 将结果限制为分配给特定状态的评论。
     *
     * @param status 将结果限制为分配给特定状态的评论。(默认为:approve)
     */
    public WPCheckComments setStatus(String status) {
        this.status = status;
        return this;
    }

    private String getType() {
        return type;
    }

    /**
     * 将结果限制为指定特定类型的评论。
     *
     * @param type 将结果限制为指定特定类型的评论。(默认为:comment)
     */
    public WPCheckComments setType(String type) {
        this.type = type;
        return this;
    }

    private String getPassword() {
        return password;
    }

    /**
     * 如果帖子的密码受到密码保护，则该密码将保护。
     *
     * @param password 如果帖子的密码受到密码保护，则该密码将保护。
     */
    public WPCheckComments setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 根据帖子id查看帖子
     *
     * @param wpCallbackList 请求接口回调
     */
    public void checkComments(WPCallbackList<WPCheckCommentsBean> wpCallbackList) {
        SJ sj = new SJ("&", "?", "");

        if (getPage() != null) {
            sj.add("page=" + getPage());
        }

        if (getPer_page() != null) {
            sj.add("per_page=" + getPer_page());
        }

        if (getSearch() != null && getSearch().length() > 0) {
            sj.add("search=" + getSearch());
        }

        if (getAfter() != null && getAfter().length() > 0) {
            sj.add("after=" + getAfter());
        }

        if (getAuthor() != null) {
            sj.add("author=" + getAuthor());
        }

        if (getAuthor_exclude() != null) {
            sj.add("author_exclude=" + getAuthor_exclude());
        }

        if (getAuthor_email() != null && getAuthor_email().length() > 0) {
            sj.add("author_email=" + getAuthor_email());
        }

        if (getBefore() != null && getBefore().length() > 0) {
            sj.add("before=" + getBefore());
        }

        if (getExclude() != null) {
            sj.add("exclude=" + getExclude());
        }

        if (getInclude() != null) {
            sj.add("include=" + getInclude());
        }

        if (getOffset() != null && getOffset().length() > 0) {
            sj.add("offset=" + getOffset());
        }

        if (getOrder() != null && getOrder().length() > 0) {
            sj.add("order=" + getOrder());
        }

        if (getOrderby() != null && getOrderby().length() > 0) {
            sj.add("orderby=" + getOrderby());
        }

        if (getParent() != null) {
            sj.add("parent=" + getParent());
        }

        if (getParent_exclude() != null) {
            sj.add("parent_exclude=" + getParent_exclude());
        }

        if (getPostId() != null) {
            sj.add("post=" + getPostId());
        }

        if (getStatus() != null && getStatus().length() > 0) {
            sj.add("status=" + getStatus());
        }

        if (getType() != null && getType().length() > 0) {
            sj.add("type=" + getType());
        }

        if (getPassword() != null && getPassword().length() > 0) {
            sj.add("password=" + getPassword());
        }

        // System.out.println(MyApplication.init().getHost() + "/wp-json/wp/v2/comments" + sj.toString());

        OkHttpUtils
                .get()
                .url(MyApplication.init().getHost() + "/wp-json/wp/v2/comments")
                .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .addHeader("Authorization", "Bearer" + getToken())
                .build()
                .execute(new WPResponseCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        wpCallbackList.error(call, e);
                    }

                    @Override
                    public void onResponse(WPResponseCallbackBean response, int id) {
                        List<WPCheckCommentsBean> wpCheckCommentsBeans = null;
                        if (200 == response.getStatusCode()) {
                            wpCheckCommentsBeans = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), new TypeToken<List<WPCheckCommentsBean>>() {
                            }.getType());
                        }

                        wpCallbackList.success(wpCheckCommentsBeans, response.getResponseContent(), response.getStatusCode());
                    }
                });
    }

    /**
     * 根据评论id查看评论(只设置setCommentId就可以了)
     */
    public void CheckComment(WPCallback<WPCheckCommentsBean> wpCallback) {
        if (getCommentId() != null) {
            OkHttpUtils
                    .get()
                    .url(MyApplication.init().getHost() + "/wp-json/wp/v2/comments/" + getCommentId())
                    .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                    .addHeader("Authorization", "Bearer" + getToken())
                    .build()
                    .execute(new WPResponseCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            wpCallback.error(call, e);
                        }

                        @Override
                        public void onResponse(WPResponseCallbackBean response, int id) {
                            WPCheckCommentsBean wpCheckCommentsBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPCheckCommentsBean.class);
                            wpCallback.success(wpCheckCommentsBean, response.getResponseContent(), response.getStatusCode());
                        }
                    });
        }
    }

}
