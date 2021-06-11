package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.HashMap;
import java.util.Map;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPCommentPostBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 评论帖子
 *
 * @author AHeng
 * @date 2021/05/29 21:53
 */
public class WPCommentPost {
    private String token;
    private Integer postId;
    private String commentContetn;
    private Integer parent;
    private Integer authorId;

    private WPCommentPost() {
    }

    public static WPCommentPost builder() {
        return new WPCommentPost();
    }

    private String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token token
     */
    public WPCommentPost setToken(String token) {
        this.token = token;
        return this;
    }

    private Integer getPostId() {
        return postId;
    }

    /**
     * 设置帖子id
     *
     * @param postId 帖子id
     */
    public WPCommentPost setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    private String getCommentContetn() {
        return commentContetn;
    }

    /**
     * 设置评论内容
     *
     * @param commentContetn 评论内容
     */
    public WPCommentPost setCommentContetn(String commentContetn) {
        this.commentContetn = commentContetn;
        return this;
    }

    private Integer getParent() {
        return parent;
    }

    /**
     * 评论所属父评论id，默认为0，即一级评论
     *
     * @param parent 对象父的 ID。
     */
    public WPCommentPost setParent(Integer parent) {
        this.parent = parent;
        return this;
    }

    private Integer getAuthorId() {
        return authorId;
    }

    /**
     * 设置评论人id
     *
     * @param authorId 评论人id
     */
    public WPCommentPost setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPCommentPostBean> wpCallback) {
        Map<String, String> map = new HashMap<>();

        if (getPostId() != null) {
            map.put("post", getPostId().toString());
        }

        if (getCommentContetn() != null && getCommentContetn().length() > 0) {
            map.put("content", getCommentContetn());
        }

        if (getParent() != null) {
            map.put("parent", getParent().toString());
        }

        if (getAuthorId() != null) {
            map.put("author", getAuthorId().toString());
        }

        OkHttpUtils
                .post()
                .url(MyApplication.init().getHost() + "/wp-json/wp/v2/comments")
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
                        WPCommentPostBean wpCommentPostBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPCommentPostBean.class);
                        wpCallback.success(wpCommentPostBean, response.getResponseContent(), response.getStatusCode());
                    }
                });
    }
}
