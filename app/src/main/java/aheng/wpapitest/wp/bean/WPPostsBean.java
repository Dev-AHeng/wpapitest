package aheng.wpapitest.wp.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author AHeng
 * @date 2021/05/20 16:54
 */
public class WPPostsBean {
    @SerializedName("id")
    private Integer id;
    @SerializedName("date")
    private String date;
    @SerializedName("date_gmt")
    private String dateGmt;
    @SerializedName("guid")
    private GuidDTO guid;
    @SerializedName("modified")
    private String modified;
    @SerializedName("modified_gmt")
    private String modifiedGmt;
    @SerializedName("slug")
    private String slug;
    @SerializedName("status")
    private String status;
    @SerializedName("type")
    private String type;
    @SerializedName("link")
    private String link;
    @SerializedName("title")
    private TitleDTO title;
    @SerializedName("content")
    private ContentDTO content;
    @SerializedName("excerpt")
    private ExcerptDTO excerpt;
    @SerializedName("author")
    private Integer author;
    @SerializedName("featured_media")
    private Integer featuredMedia;
    @SerializedName("comment_status")
    private String commentStatus;
    @SerializedName("ping_status")
    private String pingStatus;
    @SerializedName("sticky")
    private Boolean sticky;
    @SerializedName("template")
    private String template;
    @SerializedName("format")
    private String format;
    @SerializedName("meta")
    private List<?> meta;
    @SerializedName("categories")
    private List<Integer> categories;
    @SerializedName("tags")
    private List<?> tags;
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
     * [200] 对象发布日期，在网站的时区。
     *
     * @return 对象发布日期，在网站的时区。
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
     * [200] 对象的全球唯一标识符。
     *
     * @return 对象的全球唯一标识符。
     */
    public GuidDTO getGuid() {
        return guid;
    }

    /**
     * [200] 对象上次修改的日期，在站点的时区。
     *
     * @return 对象上次修改的日期，在站点的时区。
     */
    public String getModified() {
        return modified;
    }

    /**
     * [200] 对象上次修改的日期为 GMT。
     *
     * @return 对象上次修改的日期为 GMT。
     */
    public String getModifiedGmt() {
        return modifiedGmt;
    }

    /**
     * [200] 对象的字母数字标识符，其类型独一无二。
     *
     * @return 对象的字母数字标识符，其类型独一无二。
     */
    public String getSlug() {
        return slug;
    }

    /**
     * [200] 对象的命名状态。
     *
     * @return 对象的命名状态。
     */
    public String getStatus() {
        return status;
    }

    /**
     * [200] 对象的帖子类型。
     *
     * @return 对象的帖子类型。
     */
    public String getType() {
        return type;
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
     * [200] 对象的标题。
     *
     * @return 对象的标题。
     */
    public TitleDTO getTitle() {
        return title;
    }

    /**
     * [200] 对象的内容。
     *
     * @return 对象的内容。
     */
    public ContentDTO getContent() {
        return content;
    }

    /**
     * [200] 对象的摘录。
     *
     * @return 对象的摘录。
     */
    public ExcerptDTO getExcerpt() {
        return excerpt;
    }

    /**
     * [200] 对象作者的 ID。
     *
     * @return 对象作者的 ID。
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * [200] 对象的特色媒体的 ID。
     *
     * @return 对象的特色媒体的 ID。
     */
    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    /**
     * [200] 是否对对象开放评论。
     *
     * @return 是否对对象开放评论。
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * [200] 对象是否可以 ping。
     *
     * @return 对象是否可以 ping。
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * [200] 对象是否应被视为粘性。
     *
     * @return 对象是否应被视为粘性。
     */
    public Boolean getSticky() {
        return sticky;
    }

    /**
     * [200] 用于显示对象的主题文件。
     *
     * @return 用于显示对象的主题文件。
     */
    public String getTemplate() {
        return template;
    }

    /**
     * [200] 对象的格式。
     *
     * @return 对象的格式。 选其一: standard, aside, chat, gallery, link, image, quote, status, video, audio
     */
    public String getFormat() {
        return format;
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
     * [200] 类别分类中分配给对象的术语。
     *
     * @return 类别分类中分配给对象的术语。
     */
    public List<Integer> getCategories() {
        return categories;
    }

    /**
     * [200] 分配给post_tag分类中的对象的术语。
     *
     * @return 分配给post_tag分类中的对象的术语。
     */
    public List<?> getTags() {
        return tags;
    }

    public LinksDTO getLinks() {
        return links;
    }

    // /**
    //  * [403/404] 代码。
    //  *
    //  * @return 代码。
    //  */
    // public String getCode() {
    //     return code;
    // }
    //
    // /**
    //  * [403/404] 错误内容
    //  *
    //  * @return 错误内容
    //  */
    // public String getMessage() {
    //     return message;
    // }
    //
    // /**
    //  * [403/404] 状态码。
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
    //      * [403/404] 状态码。
    //      *
    //      * @return 状态码。
    //      */
    //     public Integer getStatus() {
    //         return status;
    //     }
    // }

    public static class GuidDTO {
        @SerializedName("rendered")
        private String rendered;

        public String getRendered() {
            return rendered;
        }
    }

    public static class TitleDTO {
        @SerializedName("rendered")
        private String rendered;

        public String getRendered() {
            return rendered;
        }
    }

    public static class ContentDTO {
        @SerializedName("rendered")
        private String rendered;
        @SerializedName("protected")
        private Boolean protectedX;

        /**
         * [200] 内容
         *
         * @return 内容
         */
        public String getRendered() {
            return rendered;
        }

        public Boolean getProtectedX() {
            return protectedX;
        }
    }

    public static class ExcerptDTO {
        @SerializedName("rendered")
        private String rendered;
        @SerializedName("protected")
        private Boolean protectedX;

        public String getRendered() {
            return rendered;
        }

        public Boolean getProtectedX() {
            return protectedX;
        }
    }

    public static class LinksDTO {
        @SerializedName("self")
        private List<SelfDTO> self;
        @SerializedName("collection")
        private List<CollectionDTO> collection;
        @SerializedName("about")
        private List<AboutDTO> about;
        @SerializedName("author")
        private List<AuthorDTO> author;
        @SerializedName("replies")
        private List<RepliesDTO> replies;
        @SerializedName("version-history")
        private List<VersionhistoryDTO> versionhistory;
        @SerializedName("predecessor-version")
        private List<PredecessorversionDTO> predecessorversion;
        @SerializedName("wp:attachment")
        private List<WpattachmentDTO> wpattachment;
        @SerializedName("wp:term")
        private List<WptermDTO> wpterm;
        @SerializedName("curies")
        private List<CuriesDTO> curies;

        public List<SelfDTO> getSelf() {
            return self;
        }

        public List<CollectionDTO> getCollection() {
            return collection;
        }

        public List<AboutDTO> getAbout() {
            return about;
        }

        public List<AuthorDTO> getAuthor() {
            return author;
        }

        public List<RepliesDTO> getReplies() {
            return replies;
        }

        public List<VersionhistoryDTO> getVersionhistory() {
            return versionhistory;
        }

        public List<PredecessorversionDTO> getPredecessorversion() {
            return predecessorversion;
        }

        public List<WpattachmentDTO> getWpattachment() {
            return wpattachment;
        }

        public List<WptermDTO> getWpterm() {
            return wpterm;
        }

        public List<CuriesDTO> getCuries() {
            return curies;
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

        public static class AboutDTO {
            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }

        public static class AuthorDTO {
            @SerializedName("embeddable")
            private Boolean embeddable;
            @SerializedName("href")
            private String href;

            public Boolean getEmbeddable() {
                return embeddable;
            }

            public String getHref() {
                return href;
            }
        }

        public static class RepliesDTO {
            @SerializedName("embeddable")
            private Boolean embeddable;
            @SerializedName("href")
            private String href;

            public Boolean getEmbeddable() {
                return embeddable;
            }

            public String getHref() {
                return href;
            }
        }

        public static class VersionhistoryDTO {
            @SerializedName("count")
            private Integer count;
            @SerializedName("href")
            private String href;

            public Integer getCount() {
                return count;
            }

            public String getHref() {
                return href;
            }
        }

        public static class PredecessorversionDTO {
            @SerializedName("id")
            private Integer id;
            @SerializedName("href")
            private String href;

            public Integer getId() {
                return id;
            }

            public String getHref() {
                return href;
            }
        }

        public static class WpattachmentDTO {
            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }

        public static class WptermDTO {
            @SerializedName("taxonomy")
            private String taxonomy;
            @SerializedName("embeddable")
            private Boolean embeddable;
            @SerializedName("href")
            private String href;

            public String getTaxonomy() {
                return taxonomy;
            }

            public Boolean getEmbeddable() {
                return embeddable;
            }

            public String getHref() {
                return href;
            }
        }

        public static class CuriesDTO {
            @SerializedName("name")
            private String name;
            @SerializedName("href")
            private String href;
            @SerializedName("templated")
            private Boolean templated;

            public String getName() {
                return name;
            }

            public String getHref() {
                return href;
            }

            public Boolean getTemplated() {
                return templated;
            }
        }
    }

}
