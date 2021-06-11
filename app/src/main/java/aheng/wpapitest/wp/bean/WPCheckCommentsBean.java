package aheng.wpapitest.wp.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author AHeng
 * @date 2021/05/29 15:03 27
 */
public class WPCheckCommentsBean {
    @SerializedName("id")
    private Integer id;
    @SerializedName("post")
    private Integer post;
    @SerializedName("parent")
    private Integer parent;
    @SerializedName("author")
    private Integer author;
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("author_url")
    private String authorUrl;
    @SerializedName("date")
    private String date;
    @SerializedName("date_gmt")
    private String dateGmt;
    @SerializedName("content")
    private ContentDTO content;
    @SerializedName("link")
    private String link;
    @SerializedName("status")
    private String status;
    @SerializedName("type")
    private String type;
    @SerializedName("author_avatar_urls")
    private AuthorAvatarUrlsDTO authorAvatarUrls;
    @SerializedName("meta")
    private List<?> meta;
    @SerializedName("_links")
    private LinksDTO links;
    // @SerializedName("code")
    // private String code;
    // @SerializedName("message")
    // private String message;
    // @SerializedName("data")
    // private DataDTO data;

    /**
     * [200] 对象的独特标识符。
     *
     * @return 对象的独特标识符。
     */
    public Integer getId() {
        return id;
    }

    /**
     * [200] 相关帖子对象的 ID。
     *
     * @return 相关帖子对象的 ID。
     */
    public Integer getPost() {
        return post;
    }

    /**
     * [200] 对象父的 ID
     *
     * @return 对象父的 ID
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * [200] 如果作者是用户，则用户对象的 ID。
     *
     * @return 如果作者是用户，则用户对象的 ID。
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * [200] 显示对象作者的名称。
     *
     * @return 显示对象作者的名称。
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * [200] 对象作者的网址。
     *
     * @return 对象作者的网址。
     */
    public String getAuthorUrl() {
        return authorUrl;
    }

    /**
     * [200] 对象发布日期，在网站的时区。
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * [200] 对象发布的日期，如 GMT。
     *
     * @return 对象发布的日期，如 GMT。
     */
    public String getDateGmt() {
        return dateGmt;
    }

    /**
     * [200] 评论
     *
     * @return 评论
     */
    public ContentDTO getContent() {
        return content;
    }

    /**
     * [200] 将网址转到对象。
     *
     * @return 将网址转到对象。
     */
    public String getLink() {
        return link;
    }

    /**
     * [200] 对象状态。
     *
     * @return 对象状态。
     */
    public String getStatus() {
        return status;
    }

    /**
     * [200] 对象的注释类型。
     *
     * @return 对象的注释类型。
     */
    public String getType() {
        return type;
    }

    /**
     * [200] 对象作者的avatar网址。
     *
     * @return 对象作者的avatar网址。
     */
    public AuthorAvatarUrlsDTO getAuthorAvatarUrls() {
        return authorAvatarUrls;
    }

    /**
     * [200] 元字段。
     *
     * @return 元字段。
     */
    public List<?> getMeta() {
        return meta;
    }

    /**
     * [200] 将网址转到对象。
     *
     * @return 将网址转到对象。
     */
    public LinksDTO getLinks() {
        return links;
    }

    // /**
    //  * [403] 代码。
    //  *
    //  * @return 代码。
    //  */
    // public String getCode() {
    //     return code;
    // }
    //
    // /**
    //  * [403] 错误内容
    //  *
    //  * @return 错误内容
    //  */
    // public String getMessage() {
    //     return message;
    // }
    //
    // /**
    //  * [403] 状态码。
    //  *
    //  * @return 状态码。
    //  */
    // public DataDTO getData() {
    //     return data;
    // }
    //
    // public static class DataDTO {
    //     @SerializedName("status")
    //     private Integer status;
    //
    //     /**
    //      * [403] 状态码。
    //      *
    //      * @return 状态码。
    //      */
    //     public Integer getStatus() {
    //         return status;
    //     }
    // }

    public static class ContentDTO {
        @SerializedName("rendered")
        private String rendered;

        /**
         * [200] 评论内容
         *
         * @return 评论内容
         */
        public String getRendered() {
            return rendered;
        }
    }

    public static class AuthorAvatarUrlsDTO {
        @SerializedName("24")
        private String $24;
        @SerializedName("48")
        private String $48;
        @SerializedName("96")
        private String $96;

        /**
         * [200] 评论人头像24x24
         *
         * @return 评论人头像24x24
         */
        public String get$24() {
            return $24;
        }

        /**
         * [200] 评论人头像48x48
         *
         * @return 评论人头像48x48
         */
        public String get$48() {
            return $48;
        }

        /**
         * [200] 评论人头像96x96
         *
         * @return 评论人头像96x96
         */
        public String get$96() {
            return $96;
        }
    }

    public static class LinksDTO {
        @SerializedName("self")
        private List<SelfDTO> self;
        @SerializedName("collection")
        private List<CollectionDTO> collection;
        @SerializedName("up")
        private List<UpDTO> up;

        public List<SelfDTO> getSelf() {
            return self;
        }

        public List<CollectionDTO> getCollection() {
            return collection;
        }

        public List<UpDTO> getUp() {
            return up;
        }

        public static class SelfDTO {
            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }

        public static class CollectionDTO {
            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }

        public static class UpDTO {
            @SerializedName("embeddable")
            private Boolean embeddable;
            @SerializedName("post_type")
            private String postType;
            @SerializedName("href")
            private String href;

            public Boolean getEmbeddable() {
                return embeddable;
            }

            public String getPostType() {
                return postType;
            }

            public String getHref() {
                return href;
            }
        }
    }

}
