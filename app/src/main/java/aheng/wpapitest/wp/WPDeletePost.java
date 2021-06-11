package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPDeletePostBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 删除一篇帖子
 *
 * @author AHeng
 * @date 2021/05/27 0:12
 */
public class WPDeletePost {
    private String token;
    private Integer postId;
    // private boolean force = true;

    private WPDeletePost() {
    }

    public static WPDeletePost builder() {
        return new WPDeletePost();
    }

    // private boolean isForce() {
    //     return force;
    // }
    //
    // /**
    //  * 是否绕过垃圾并强制删除。
    //  *
    //  * @param force false:指定文章被移动到回收站，默认,true:文章将被永久删除
    //  * @return
    //  */
    // public WPDeletePost setForce(boolean force) {
    //     this.force = force;
    //     return this;
    // }

    private Integer getPostId() {
        return postId;
    }

    /**
     * 根据帖子id删除帖子
     *
     * @param postId 帖子id
     */
    public WPDeletePost setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    private String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token
     */
    public WPDeletePost setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPDeletePostBean> wpCallback) {
        if (getPostId() != null) {
            // StringJoiner stringJoiner = new StringJoiner("&", "", "");
            // stringJoiner.add(String.valueOf(getPostId()));
            // stringJoiner.add("force=" + isForce());
            // System.out.println("/wp-json/wp/v2/posts/" + getPostId());
            OkHttpUtils
                    .delete()
                    .url(MyApplication.init().getHost() + "/wp-json/wp/v2/posts/" + getPostId())
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
                            WPDeletePostBean wpDeletePostBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPDeletePostBean.class);
                            wpCallback.success(wpDeletePostBean, response.getResponseContent(), response.getStatusCode());
                        }
                    });
        }
    }
}
