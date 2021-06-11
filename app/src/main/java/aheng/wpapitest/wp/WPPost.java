package aheng.wpapitest.wp;

import com.zhy.http.okhttp.OkHttpUtils;

import aheng.wpapitest.application.MyApplication;
import aheng.wpapitest.wp.bean.WPPostsBean;
import aheng.wpapitest.wp.bean.WPResponseCallbackBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPResponseCallback;
import okhttp3.Call;

/**
 * 单个帖子
 *
 * @author AHeng
 * @date 2021/05/25 18:24
 */
public class WPPost {
    private String token;
    private Integer postId;

    private WPPost() {
    }

    public static WPPost builder() {
        return new WPPost();
    }

    private Integer getPostId() {
        return postId;
    }

    /**
     * 根据帖子id获取帖子
     *
     * @param postId 帖子id
     */
    public WPPost setPostId(Integer postId) {
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
    public WPPost setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 开始请求
     *
     * @param wpCallback 请求接口回调
     */
    public void startQequest(WPCallback<WPPostsBean> wpCallback) {
        OkHttpUtils
                .post()
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
                        WPPostsBean wpPostsBean = WPConfig.getGsonConfig().fromJson(response.getResponseContent(), WPPostsBean.class);
                        wpCallback.success(wpPostsBean, response.getResponseContent(), response.getStatusCode());
                    }
                });
    }
}
