package aheng.wpapitest.wp;

import android.text.TextUtils;

import com.google.gson.reflect.TypeToken;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.List;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.utils.SJ;
import aheng.wpapitest.wp.bean.WPPostsBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallbackList;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 根据page等条件查看帖子列
 *
 * @author AHeng
 * @date 2021/05/25 20:47
 */
public class WPPostList {
    private String token;
    private Integer page;
    private Integer per_page;
    private String search;
    private String after;
    private Integer authorId;
    private String author_exclude;
    private String before;
    private String exclude;
    private String slug;
    private String status;
    private String tax_relation;
    private String categories;
    private String categories_exclude;
    private String tags;
    private String tags_exclude;
    private String sticky;
    private Integer offset;
    // 默认降序
    private String order = "desc";
    // 默认日期
    private String orderby = "date";

    private WPPostList() {
    }

    public static WPPostList builder() {
        return new WPPostList();
    }

    private Integer getPer_page() {
        return per_page;
    }

    /**
     * 设置返回帖子条数(默认10)
     *
     * @param per_page 返回帖子条数(1-100之间)
     */
    public WPPostList setPer_page(Integer per_page) {
        this.per_page = per_page;
        return this;
    }

    private Integer getPage() {
        return page;
    }

    /**
     * 设置要返回的结果的页(默认1)
     *
     * @param page 第x页
     */
    public WPPostList setPage(Integer page) {
        this.page = page;
        return this;
    }

    private Integer getOffset() {
        return offset;
    }

    /**
     * 设置开始检索帖子的任意偏移量 offset=6将使用每页的默认帖子数，但从集合中的第6个帖子开始
     *
     * @param offset 开始检索帖子的任意偏移量 offset=6将使用每页的默认帖子数，但从集合中的第6个帖子开始
     */
    public WPPostList setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    private String getOrder() {
        return order;
    }

    /**
     * 设置顺序 默认降序 order=asc(升序) order=desc(降序)
     *
     * @param order asc(升序)/desc(降序)
     */
    public WPPostList setOrder(String order) {
        this.order = order;
        return this;
    }

    private String getOrderby() {
        return orderby;
    }

    /**
     * 按对象属性对集合进行排序
     *
     * @param orderby 选其一: author, date, id, include, modified, parent, relevance, slug, include_slugs, title
     */
    public WPPostList setOrderby(String orderby) {
        this.orderby = orderby;
        return this;
    }

    private String getSearch() {
        return search;
    }

    /**
     * 将结果限制为匹配字符串的人员。
     *
     * @param search 搜索内容
     */
    public WPPostList setSearch(String search) {
        this.search = search;
        return this;
    }

    private String getAfter() {
        return after;
    }

    /**
     * 限制对给定 ISO8601 合规日期后发布的帖子的响应。
     *
     * @param after ISO8601合规日期
     */
    public WPPostList setAfter(String after) {
        this.after = after;
        return this;
    }

    private Integer getAuthorId() {
        return authorId;
    }

    /**
     * 将结果限制为分配给特定作者的帖子。
     *
     * @param authorId 作者
     */
    public WPPostList setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    private String getAuthor_exclude() {
        return author_exclude;
    }

    /**
     * 确保结果集不包括分配给特定作者的帖子。
     *
     * @param author_exclude !作者
     */
    public WPPostList setAuthor_exclude(String author_exclude) {
        this.author_exclude = author_exclude;
        return this;
    }

    private String getBefore() {
        return before;
    }

    /**
     * 排序属性上升或下降。 默认desc 其中之一：asc/desc
     *
     * @param before
     */
    public WPPostList setBefore(String before) {
        this.before = before;
        return this;
    }

    private String getExclude() {
        return exclude;
    }

    /**
     * 确保结果集排除特定 ID。
     *
     * @param exclude 集排除特定 ID。
     */
    public WPPostList setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }

    private String getSlug() {
        return slug;
    }

    /**
     * 将结果限制为具有一个或多个特定的帖子。
     *
     * @param slug 将结果限制为具有一个或多个特定的帖子。
     */
    public WPPostList setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    private String getStatus() {
        return status;
    }

    /**
     * 将结果限制为分配一个或多个状态的帖子。(默认 publish)
     *
     * @param status 将结果限制为分配一个或多个状态的帖子。
     */
    public WPPostList setStatus(String status) {
        this.status = status;
        return this;
    }

    private String getTax_relation() {
        return tax_relation;
    }

    /**
     * 基于多个分类之间的关系设置的限制结果。
     *
     * @param tax_relation 选其一:AND, OR
     */
    public WPPostList setTax_relation(String tax_relation) {
        this.tax_relation = tax_relation;
        return this;
    }

    private String getCategories() {
        return categories;
    }

    /**
     * 将结果限制为类别分类中指定的指定术语的所有项目。
     *
     * @param categories 将结果限制为类别分类中指定的指定术语的所有项目。
     */
    public WPPostList setCategories(String categories) {
        this.categories = categories;
        return this;
    }

    private String getCategories_exclude() {
        return categories_exclude;
    }

    /**
     * 限制结果设置为除类别分类中指定术语的所有项目。
     *
     * @param categories_exclude 限制结果设置为除类别分类中指定术语的所有项目。
     */
    public WPPostList setCategories_exclude(String categories_exclude) {
        this.categories_exclude = categories_exclude;
        return this;
    }

    private String getTags() {
        return tags;
    }

    /**
     * 将结果限制为标签分类中分配的指定术语的所有项目。
     *
     * @param tags 将结果限制为标签分类中分配的指定术语的所有项目。
     */
    public WPPostList setTags(String tags) {
        this.tags = tags;
        return this;
    }

    private String getTags_exclude() {
        return tags_exclude;
    }

    /**
     * 限制结果设置为所有项目，但标签分类中分配指定术语的项除外。
     *
     * @param tags_exclude 限制结果设置为所有项目，但标签分类中分配指定术语的项除外。
     */
    public WPPostList setTags_exclude(String tags_exclude) {
        this.tags_exclude = tags_exclude;
        return this;
    }

    private String getSticky() {
        return sticky;
    }

    /**
     * 将结果限制为粘性项目。
     *
     * @param sticky 粘性项目。
     */
    public WPPostList setSticky(String sticky) {
        this.sticky = sticky;
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
    public WPPostList setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallbackList 请求接口回调
     */
    public void startQequest(WPCallbackList<WPPostsBean> wpCallbackList) {

        SJ stringJoiner = new SJ("&", "?", "");

        if (getPage() != null) {
            stringJoiner.add("page=" + getPage());
        }

        if (getPer_page() != null && (getPer_page() >= 1 && getPer_page() <= 100)) {
            stringJoiner.add("per_page=" + getPer_page());
        }

        if (getOffset() != null) {
            stringJoiner.add("offset=" + getOffset());
        }

        if (TextUtils.equals(getOrder(), "desc")) {
            stringJoiner.add("order=desc");
        } else if (TextUtils.equals(getOrder(), "asc")) {
            stringJoiner.add("order=asc");
        } else {
            stringJoiner.add("order=desc");
        }

        if (getSearch() != null && getSearch().length() > 0) {
            stringJoiner.add("search=" + getSearch());
        }

        if (getAfter() != null && getAfter().length() > 0) {
            stringJoiner.add("after=" + getAfter());
        }

        if (getAuthorId() != null) {
            stringJoiner.add("author=" + getAuthorId());
        }

        if (getAuthor_exclude() != null && getAuthor_exclude().length() > 0) {
            stringJoiner.add("author_exclude=" + getAuthor_exclude());
        }

        if (getBefore() != null && getBefore().length() > 0) {
            stringJoiner.add("before=" + getBefore());
        }

        if (getExclude() != null && getExclude().length() > 0) {
            stringJoiner.add("exclude=" + getExclude());
        }

        if (getSlug() != null && getSlug().length() > 0) {
            stringJoiner.add("slug=" + getSlug());
        }

        if (getStatus() != null && getStatus().length() > 0) {
            stringJoiner.add("status=" + getStatus());
        }

        if (getTax_relation() != null && getTax_relation().length() > 0) {
            stringJoiner.add("tax_relation=" + getTax_relation());
        }

        if (getCategories() != null && getCategories().length() > 0) {
            stringJoiner.add("categories=" + getCategories());
        }

        if (getCategories_exclude() != null && getCategories_exclude().length() > 0) {
            stringJoiner.add("categories_exclude" + getCategories_exclude());
        }

        if (getTags() != null && getTags().length() > 0) {
            stringJoiner.add("tags=" + getTags());
        }

        if (getTags_exclude() != null && getTags_exclude().length() > 0) {
            stringJoiner.add("tags_exclude=" + getTags_exclude());
        }

        if (getSticky() != null && getSticky().length() > 0) {
            stringJoiner.add("sticky=" + getSticky());
        }

        // System.out.println(stringJoiner.toString());

        OkHttpUtils
                .get()
                .url(MyApplication.init().getHost() + "/wp-json/wp/v2/posts" + stringJoiner.toString())
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
                        List<WPPostsBean> wpPostsBeans = null;
                        if (200 == response.getStatusCode()) {
                            wpPostsBeans = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), new TypeToken<List<WPPostsBean>>() {
                            }.getType());
                        }
                        wpCallbackList.success(wpPostsBeans, response.getResponseContent(), response.getStatusCode());
                    }
                });

    }
}
