package aheng.wpapitest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import aheng.wpapitest.wp.WPChangeMyMessage;
import aheng.wpapitest.wp.WPCheckComments;
import aheng.wpapitest.wp.WPCheckUser;
import aheng.wpapitest.wp.WPCommentPost;
import aheng.wpapitest.wp.WPCreatePostOrUpdatePost;
import aheng.wpapitest.wp.WPDeletePost;
import aheng.wpapitest.wp.WPLogin;
import aheng.wpapitest.wp.WPMyMessage;
import aheng.wpapitest.wp.WPPostList;
import aheng.wpapitest.wp.WPPost;
import aheng.wpapitest.wp.WPRegister;
import aheng.wpapitest.wp.WPValidateToken;
import aheng.wpapitest.wp.bean.WPCheckCommentsBean;
import aheng.wpapitest.wp.bean.WPCommentPostBean;
import aheng.wpapitest.wp.bean.WPCreatePostOrUpdatePostBean;
import aheng.wpapitest.wp.bean.WPDeletePostBean;
import aheng.wpapitest.wp.bean.WPLoginBean;
import aheng.wpapitest.wp.bean.WPMyMessageBean;
import aheng.wpapitest.wp.bean.WPPostsBean;
import aheng.wpapitest.wp.bean.WPRegisterBean;
import aheng.wpapitest.wp.bean.WPValidateTokenBean;
import aheng.wpapitest.wp.callback.WPCallback;
import aheng.wpapitest.wp.callback.WPCallbackList;
import okhttp3.Call;

/**
 * @author Dev_Heng
 */
public class MainActivity extends AppCompatActivity {
    private final static String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOlwvXC93cC5iaWxpLWJpbGkuY24iLCJpYXQiOjE2MjM0MzcxNDIsIm5iZiI6MTYyMzQzNzE0MiwiZXhwIjoxNjI0MDQxOTQyLCJkYXRhIjp7InVzZXIiOnsiaWQiOiIxIn19fQ.HireNuDpgIGjxWUAJULNKdrlenzU5jYJCNBWMJBDs3Q";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);

        // ?????? ok
        button.setOnClickListener(view -> {
            WPRegister.builder()
                    .setUsername("123")
                    .setEmail("666@qq.com")
                    .setPassword("123abc")
                    .startQequest(new WPCallback<WPRegisterBean>() {
                        @Override
                        public void success(WPRegisterBean wpRegisterBean, String responseContent, int statusCode) {
                            if (200 == statusCode) {
                                System.out.println(wpRegisterBean.getCode());
                                System.out.println(wpRegisterBean.getMessage());
                                System.out.println(wpRegisterBean.getData().getStatus());
                                System.out.println("?????????" + statusCode);
                            } else if (400 == statusCode) {
                                System.out.println(wpRegisterBean.getMessage());
                                System.out.println(wpRegisterBean.getId());
                            }
                        }

                        @Override
                        public void error(Call call, Exception e) {
                        }
                    });
        });

        // ?????? ok
        button2.setOnClickListener(click -> {
            WPLogin.builder()
                    .setUserName("123")
                    .setPassword("123")
                    .startQequest(new WPCallback<WPLoginBean>() {
                        @Override
                        public void success(WPLoginBean wpLoginBean, String responseContent, int statusCode) {
                            if (200 == statusCode) {
                                System.out.println(wpLoginBean.getToken());
                                System.out.println(wpLoginBean.getUserNicename());
                                System.out.println(wpLoginBean.getUserEmail());
                                System.out.println(wpLoginBean.getUserDisplayName());
                            } else if (403 == statusCode) {
                                System.out.println(wpLoginBean.getCode());
                                System.out.println(wpLoginBean.getMessage());
                                System.out.println(wpLoginBean.getData().getStatus());
                                System.out.println(wpLoginBean.getMessage());
                            } else {
                                System.out.println("????????????");
                            }
                        }

                        @Override
                        public void error(Call call, Exception e) {
                        }
                    });
        });


        // {
        //     "code": "jwt_auth_invalid_token",
        //     "message": "Expired token",
        //     "data": {
        //         "status": 403
        //     }
        // }

        // {
        //     "code": "jwt_auth_valid_token",
        //         "data": {
        //     "status": 200
        // }
        // }

        // token?????? ok
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPValidateToken.builder()
                        .setToken(token)
                        .startQequest(new WPCallback<WPValidateTokenBean>() {
                            @Override
                            public void success(WPValidateTokenBean wpValidateTokenBean, String responseContent, int statusCode) {
                                if (200 == statusCode) {
                                    System.out.println(wpValidateTokenBean.getCode());
                                    System.out.println(wpValidateTokenBean.getData().getStatus());
                                    System.out.println(wpValidateTokenBean.getMessage());
                                } else if (403 == statusCode) {
                                    System.out.println(wpValidateTokenBean.getCode());
                                }

                            }

                            @Override
                            public void error(Call call, Exception e) {
                                System.out.println(e);
                            }
                        });
            }
        });

        // {
        //     "code": "jwt_auth_valid_token",
        //         "data": {
        //     "status": 200
        // }
        // }

        // {
        //     "code": "jwt_auth_invalid_token",
        //         "message": "Syntax error, malformed JSON",
        //         "data": {
        //     "status": 403
        // }
        // }

        // ???????????? ok
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPMyMessage.builder()
                        .setToken(token)
                        .startQequest(new WPCallback<WPMyMessageBean>() {
                            @Override
                            public void success(WPMyMessageBean wpMyMessageBean, String responseContent, int statusCode) {
                                if (200 == statusCode) {
                                    System.out.println(responseContent);
                                    System.out.println(wpMyMessageBean.getId());
                                    System.out.println(wpMyMessageBean.getName());
                                    System.out.println(wpMyMessageBean.getUrl());
                                    System.out.println(wpMyMessageBean.getDescription());
                                    System.out.println(wpMyMessageBean.getLink());
                                    System.out.println(wpMyMessageBean.getSlug());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$24());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$48());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$96());
                                } else if (403 == statusCode) {
                                    System.out.println(wpMyMessageBean.getCode());
                                    System.out.println(wpMyMessageBean.getData().getStatus());
                                    System.out.println(wpMyMessageBean.getMessage());
                                    System.out.println(wpMyMessageBean.getCode());
                                }

                            }

                            @Override
                            public void error(Call call, Exception e) {
                                System.out.println(e.getMessage());
                            }
                        });
            }
        });


        // ?????????????????? ok
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPChangeMyMessage.builder()
                        .setToken(token)
                        .setLast_name("??????")
                        .setFirst_name("112233")
                        .setName("??????name")
                        .setDescription("??????11111")
                        .startQequest(new WPCallback<WPMyMessageBean>() {
                            @Override
                            public void success(WPMyMessageBean wpMyMessageBean, String responseContent, int statusCode) {
                                if (200 == statusCode) {
                                    System.out.println(wpMyMessageBean.getId());
                                    System.out.println(wpMyMessageBean.getName());
                                    System.out.println(wpMyMessageBean.getLastName());
                                    System.out.println(wpMyMessageBean.getFirstName());
                                    System.out.println(wpMyMessageBean.getUrl());
                                    System.out.println(wpMyMessageBean.getDescription());
                                    System.out.println(wpMyMessageBean.getLink());
                                    System.out.println(wpMyMessageBean.getSlug());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$24());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$48());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$96());
                                } else if (403 == statusCode) {
                                    System.out.println(wpMyMessageBean.getCode());
                                    System.out.println(wpMyMessageBean.getData().getStatus());
                                    System.out.println(wpMyMessageBean.getMessage());
                                    System.out.println(wpMyMessageBean.getCode());
                                }
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });


        // {
        //     "code": "jwt_auth_invalid_token",
        //         "message": "Signature verification failed",
        //         "data": {
        //     "status": 403
        // }
        // }

        // ??????id?????????????????? ok
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPCheckUser.builder()
                        .setToken(token)
                        .setId(9)
                        .startQequest(new WPCallback<WPMyMessageBean>() {
                            @Override
                            public void success(WPMyMessageBean wpMyMessageBean, String responseContent, int statusCode) {
                                System.out.println("????????????:" + responseContent);
                                System.out.println("??????:" + statusCode);
                                if (200 == statusCode) {
                                    System.out.println(responseContent);
                                    System.out.println(wpMyMessageBean.getId());
                                    System.out.println(wpMyMessageBean.getName());
                                    System.out.println(wpMyMessageBean.getUrl());
                                    System.out.println(wpMyMessageBean.getDescription());
                                    System.out.println(wpMyMessageBean.getLink());
                                    System.out.println(wpMyMessageBean.getSlug());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$24());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$48());
                                    System.out.println(wpMyMessageBean.getAvatarUrls().get$96());
                                } else if (403 == statusCode) {
                                    System.out.println(wpMyMessageBean.getCode());
                                    System.out.println(wpMyMessageBean.getData().getStatus());
                                    System.out.println(wpMyMessageBean.getMessage());
                                    System.out.println(wpMyMessageBean.getCode());
                                }

                            }

                            @Override
                            public void error(Call call, Exception e) {
                                System.out.println(e.getMessage());
                            }
                        });
            }
        });

        // {
        //     "code": "jwt_auth_invalid_token",
        //         "message": "Expired token",
        //         "data": {
        //     "status": 403
        // }
        // }

        // ?????????????????? ok
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPPostList.builder()
                        .setToken(token)
                        .setPage(1)
                        .setOffset(1)
                        .setPage(2)
                        .setAuthorId(1)
                        .startQequest(new WPCallbackList<WPPostsBean>() {
                            @Override
                            public void success(List<WPPostsBean> wpPostsBeans, String responseContent, int statusCode) {
                                if (200 == statusCode) {
                                    System.out.println(wpPostsBeans.size());
                                    for (WPPostsBean wpPostsBean : wpPostsBeans) {
                                        System.out.println(wpPostsBean.getId());
                                        System.out.println(wpPostsBean.getDate());
                                        System.out.println(wpPostsBean.getLink());
                                        System.out.println(wpPostsBean.getAuthor());
                                        System.out.println("\n\n");
                                    }
                                } else if (403 == statusCode) {
                                    System.out.println(responseContent);
                                }
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });

            }
        });


        // ????????? ok
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPPost.builder()
                        .setToken(token)
                        .setPostId(1)
                        .startQequest(new WPCallback<WPPostsBean>() {
                            @Override
                            public void success(WPPostsBean wpPostsBean, String responseContent, int statusCode) {
                                if (200 == statusCode) {
                                    System.out.println(wpPostsBean.getId());
                                    System.out.println(wpPostsBean.getDate());
                                } else if (403 == statusCode) {
                                    System.out.println(responseContent);
                                } else if (404 == statusCode) {
                                    System.out.println(responseContent);
                                }
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });

        // ?????????????????? ok
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPCreatePostOrUpdatePost.builder()
                        .setToken(token)
                        .setTitle("??????")
                        .setContent("??????")
                        .setAuthorId(1)
                        .setStatus("publish")
                        .startQequest_CreatePost(new WPCallback<WPCreatePostOrUpdatePostBean>() {
                            @Override
                            public void success(WPCreatePostOrUpdatePostBean wpCreatePostOrUpdatePostBean, String responseContent, int statusCode) {
                                if (201 == statusCode) {
                                    System.out.println(wpCreatePostOrUpdatePostBean.getAuthor());
                                    System.out.println(wpCreatePostOrUpdatePostBean.getDate());
                                    System.out.println(wpCreatePostOrUpdatePostBean.getSlug());
                                    System.out.println(wpCreatePostOrUpdatePostBean.getId());
                                } else if (403 == statusCode) {
                                    System.out.println(wpCreatePostOrUpdatePostBean.getMessage());
                                }
                                // System.out.println(responseContent);
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });

        // ?????????????????? ok
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPCreatePostOrUpdatePost.builder()
                        .setToken(token)
                        .setPostId(64)
                        .setTitle("??????1")
                        .setContent("??????1")
                        .startQequest_UpdatePost(new WPCallback<WPCreatePostOrUpdatePostBean>() {
                            @Override
                            public void success(WPCreatePostOrUpdatePostBean wpCreatePostOrUpdatePostBean, String responseContent, int statusCode) {
                                if (200 == statusCode) {
                                    System.out.println(wpCreatePostOrUpdatePostBean.getAuthor());
                                    System.out.println(wpCreatePostOrUpdatePostBean.getContent().getRendered());
                                    System.out.println(wpCreatePostOrUpdatePostBean.getDate());
                                } else if (403 == statusCode) {
                                    System.out.println(wpCreatePostOrUpdatePostBean.getMessage());
                                }

                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });

        // {
        //     "code": "rest_post_invalid_id",
        //         "message": "??????ID?????????",
        //         "data": {
        //     "status": 404
        // }
        // }

        // {
        //     "code": "rest_already_trashed",
        //         "message": "????????????????????????",
        //         "data": {
        //     "status": 410
        // }
        // }

        // ?????????????????? ok
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPDeletePost.builder()
                        .setToken(token)
                        .setPostId(56)
                        .startQequest(new WPCallback<WPDeletePostBean>() {
                            @Override
                            public void success(WPDeletePostBean wpDeletePostBean, String responseContent, int statusCode) {
                                System.out.println(responseContent);
                                System.out.println(statusCode);
                                if (200 == statusCode) {
                                    System.out.println("????????????");
                                } else if (410 == statusCode) {
                                    System.out.println(wpDeletePostBean.getMessage());
                                } else if (404 == statusCode) {
                                    System.out.println(wpDeletePostBean.getMessage());
                                } else if (401 == statusCode) {
                                    System.out.println(wpDeletePostBean.getMessage());
                                }
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });


        // {
        //     "code": "jwt_auth_invalid_token",
        //         "message": "Expired token",
        //         "data": {
        //     "status": 403
        // }
        // }

        // ????????????id?????????????????? ok
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPCheckComments.builder()
                        .setToken(token)
                        .setPostId(58)
                        .setAuthor(0)
                        .checkComments(new WPCallbackList<WPCheckCommentsBean>() {
                            @Override
                            public void success(List<WPCheckCommentsBean> wpCheckCommentsBeans, String responseContent, int statusCode) {
                                if (200 == statusCode) {
                                    System.out.println(wpCheckCommentsBeans.size());
                                    System.out.println(wpCheckCommentsBeans.get(0).getId());
                                    System.out.println(wpCheckCommentsBeans.get(0).getDate());
                                    System.out.println(wpCheckCommentsBeans.get(0).getPost());
                                    System.out.println(wpCheckCommentsBeans.get(0).getParent());
                                    System.out.println("?????????" + wpCheckCommentsBeans.get(0).getContent().getRendered());
                                } else if (403 == statusCode) {
                                    System.out.println(responseContent);
                                }
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });

        // ????????????id??????????????? ok
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPCheckComments.builder()
                        .setToken(token)
                        .setCommentId(16)
                        .CheckComment(new WPCallback<WPCheckCommentsBean>() {
                            @Override
                            public void success(WPCheckCommentsBean wpCheckCommentsBean, String responseContent, int statusCode) {
                                System.out.println(responseContent);
                                if (200 == statusCode) {
                                    System.out.println(wpCheckCommentsBean.getId());
                                    System.out.println(wpCheckCommentsBean.getDate());
                                    System.out.println(wpCheckCommentsBean.getPost());
                                    System.out.println(wpCheckCommentsBean.getParent());
                                    System.out.println("?????????" + wpCheckCommentsBean.getContent().getRendered());
                                } else if (403 == statusCode) {
                                    System.out.println(responseContent);
                                }
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });


        // {
        //     "code": "jwt_auth_invalid_token",
        //         "message": "Expired token",
        //         "data": {
        //     "status": 403
        // }
        // }

        // ???????????? ok
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WPCommentPost.builder()
                        .setToken(token)
                        .setPostId(58)
                        .setAuthorId(1)
                        .setParent(1)
                        .setCommentContetn("??????????????????")
                        .startQequest(new WPCallback<WPCommentPostBean>() {
                            @Override
                            public void success(WPCommentPostBean wpCommentPostBean, String responseContent, int statusCode) {
                                System.out.println(responseContent);
                                if (201 == statusCode) {
                                    System.out.println(wpCommentPostBean.getAuthor());
                                    System.out.println(wpCommentPostBean.getContent());
                                    System.out.println("ip-->" + wpCommentPostBean.getAuthorIp());
                                } else if (400 == statusCode) {
                                    System.out.println("??????????????????ID???");
                                } else if (409 == statusCode) {
                                    System.out.println("??????????????????????????????????????????????????????????????????");
                                } else if (401 == statusCode) {
                                    System.out.println("???????????????????????????????????????");
                                } else if (403 == statusCode) {
                                    System.out.println(wpCommentPostBean.getCode());
                                    System.out.println(wpCommentPostBean.getMessage());
                                }
                            }

                            @Override
                            public void error(Call call, Exception e) {

                            }
                        });
            }
        });

    }

}
