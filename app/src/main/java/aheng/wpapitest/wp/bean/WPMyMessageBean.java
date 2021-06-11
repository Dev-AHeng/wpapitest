package aheng.wpapitest.wp.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author AHeng
 * @date 2021/05/19 15:58
 */
public class WPMyMessageBean {
    @SerializedName("id")
    private Integer id;
    @SerializedName("username")
    private String username;
    @SerializedName("name")
    private String name;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("email")
    private String email;
    @SerializedName("url")
    private String url;
    @SerializedName("description")
    private String description;
    @SerializedName("link")
    private String link;
    @SerializedName("locale")
    private String locale;
    @SerializedName("nickname")
    private String nickname;
    @SerializedName("slug")
    private String slug;
    @SerializedName("roles")
    private List<String> roles;
    @SerializedName("registered_date")
    private String registeredDate;
    @SerializedName("capabilities")
    private CapabilitiesDTO capabilities;
    @SerializedName("extra_capabilities")
    private ExtraCapabilitiesDTO extraCapabilities;
    @SerializedName("avatar_urls")
    private AvatarUrlsDTO avatarUrls;
    @SerializedName("meta")
    private List<?> meta;
    @SerializedName("_links")
    private LinksDTO links;

    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private DataDTO data;

    /**
     * [200] 获取id。
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * [200] 获取用户名
     *
     * @return 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * [200] 获取对外显示的名称
     *
     * @return 对外显示的名称
     */
    public String getName() {
        return name;
    }

    /**
     * [200] 获取名字
     *
     * @return 名字
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * [200] 获取姓氏
     *
     * @return 姓氏
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * [200] 获取邮箱
     *
     * @return 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * [200] 获取自定义的链接
     *
     * @return 自定义的链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * [200] 获取个人说明
     *
     * @return 个人说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * [200] 获取我的主页
     *
     * @return 我的主页
     */
    public String getLink() {
        return link;
    }

    /**
     * [200] 获取本地的语言
     *
     * @return 本地的语言
     */
    public String getLocale() {
        return locale;
    }

    /**
     * [200] 获取昵称
     *
     * @return 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * [200] 获取slug,跟用户名一样的(未知)
     *
     * @return slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * [200] 获取角色
     *
     * @return 角色
     */
    public List<String> getRoles() {
        return roles;
    }

    /**
     * [200] 获取注册日期
     *
     * @return 注册日期
     */
    public String getRegisteredDate() {
        return registeredDate;
    }

    /**
     * [200] 获取当前用户可使用哪些功能的权限
     *
     * @return 当前用户可使用哪些功能的权限
     */
    public CapabilitiesDTO getCapabilities() {
        return capabilities;
    }

    public ExtraCapabilitiesDTO getExtraCapabilities() {
        return extraCapabilities;
    }

    public AvatarUrlsDTO getAvatarUrls() {
        return avatarUrls;
    }

    public List<?> getMeta() {
        return meta;
    }

    public LinksDTO getLinks() {
        return links;
    }

    /**
     * [403] 代码。
     *
     * @return 代码。
     */
    public String getCode() {
        return code;
    }

    /**
     * [403] 错误内容
     *
     * @return 错误内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * [403] 状态码。
     *
     * @return 状态码。
     */
    public DataDTO getData() {
        return data;
    }

    public static class DataDTO {
        @SerializedName("status")
        private Integer status;

        /**
         * [403] 状态码。
         *
         * @return 状态码。
         */
        public Integer getStatus() {
            return status;
        }
    }

    public static class CapabilitiesDTO {
        @SerializedName("switch_themes")
        private Boolean switchThemes;
        @SerializedName("edit_themes")
        private Boolean editThemes;
        @SerializedName("activate_plugins")
        private Boolean activatePlugins;
        @SerializedName("edit_plugins")
        private Boolean editPlugins;
        @SerializedName("edit_users")
        private Boolean editUsers;
        @SerializedName("edit_files")
        private Boolean editFiles;
        @SerializedName("manage_options")
        private Boolean manageOptions;
        @SerializedName("moderate_comments")
        private Boolean moderateComments;
        @SerializedName("manage_categories")
        private Boolean manageCategories;
        @SerializedName("manage_links")
        private Boolean manageLinks;
        @SerializedName("upload_files")
        private Boolean uploadFiles;
        @SerializedName("import")
        private Boolean importX;
        @SerializedName("unfiltered_html")
        private Boolean unfilteredHtml;
        @SerializedName("edit_posts")
        private Boolean editPosts;
        @SerializedName("edit_others_posts")
        private Boolean editOthersPosts;
        @SerializedName("edit_published_posts")
        private Boolean editPublishedPosts;
        @SerializedName("publish_posts")
        private Boolean publishPosts;
        @SerializedName("edit_pages")
        private Boolean editPages;
        @SerializedName("read")
        private Boolean read;
        @SerializedName("level_10")
        private Boolean level10;
        @SerializedName("level_9")
        private Boolean level9;
        @SerializedName("level_8")
        private Boolean level8;
        @SerializedName("level_7")
        private Boolean level7;
        @SerializedName("level_6")
        private Boolean level6;
        @SerializedName("level_5")
        private Boolean level5;
        @SerializedName("level_4")
        private Boolean level4;
        @SerializedName("level_3")
        private Boolean level3;
        @SerializedName("level_2")
        private Boolean level2;
        @SerializedName("level_1")
        private Boolean level1;
        @SerializedName("level_0")
        private Boolean level0;
        @SerializedName("edit_others_pages")
        private Boolean editOthersPages;
        @SerializedName("edit_published_pages")
        private Boolean editPublishedPages;
        @SerializedName("publish_pages")
        private Boolean publishPages;
        @SerializedName("delete_pages")
        private Boolean deletePages;
        @SerializedName("delete_others_pages")
        private Boolean deleteOthersPages;
        @SerializedName("delete_published_pages")
        private Boolean deletePublishedPages;
        @SerializedName("delete_posts")
        private Boolean deletePosts;
        @SerializedName("delete_others_posts")
        private Boolean deleteOthersPosts;
        @SerializedName("delete_published_posts")
        private Boolean deletePublishedPosts;
        @SerializedName("delete_private_posts")
        private Boolean deletePrivatePosts;
        @SerializedName("edit_private_posts")
        private Boolean editPrivatePosts;
        @SerializedName("read_private_posts")
        private Boolean readPrivatePosts;
        @SerializedName("delete_private_pages")
        private Boolean deletePrivatePages;
        @SerializedName("edit_private_pages")
        private Boolean editPrivatePages;
        @SerializedName("read_private_pages")
        private Boolean readPrivatePages;
        @SerializedName("delete_users")
        private Boolean deleteUsers;
        @SerializedName("create_users")
        private Boolean createUsers;
        @SerializedName("unfiltered_upload")
        private Boolean unfilteredUpload;
        @SerializedName("edit_dashboard")
        private Boolean editDashboard;
        @SerializedName("update_plugins")
        private Boolean updatePlugins;
        @SerializedName("delete_plugins")
        private Boolean deletePlugins;
        @SerializedName("install_plugins")
        private Boolean installPlugins;
        @SerializedName("update_themes")
        private Boolean updateThemes;
        @SerializedName("install_themes")
        private Boolean installThemes;
        @SerializedName("update_core")
        private Boolean updateCore;
        @SerializedName("list_users")
        private Boolean listUsers;
        @SerializedName("remove_users")
        private Boolean removeUsers;
        @SerializedName("promote_users")
        private Boolean promoteUsers;
        @SerializedName("edit_theme_options")
        private Boolean editThemeOptions;
        @SerializedName("delete_themes")
        private Boolean deleteThemes;
        @SerializedName("export")
        private Boolean export;
        @SerializedName("administrator")
        private Boolean administrator;

        public Boolean getSwitchThemes() {
            return switchThemes;
        }

        public Boolean getEditThemes() {
            return editThemes;
        }


        public Boolean getActivatePlugins() {
            return activatePlugins;
        }

        public Boolean getEditPlugins() {
            return editPlugins;
        }

        public Boolean getEditUsers() {
            return editUsers;
        }


        public Boolean getEditFiles() {
            return editFiles;
        }


        public Boolean getManageOptions() {
            return manageOptions;
        }


        public Boolean getModerateComments() {
            return moderateComments;
        }

        public Boolean getManageCategories() {
            return manageCategories;
        }


        public Boolean getManageLinks() {
            return manageLinks;
        }


        public Boolean getUploadFiles() {
            return uploadFiles;
        }


        public Boolean getImportX() {
            return importX;
        }


        public Boolean getUnfilteredHtml() {
            return unfilteredHtml;
        }

        public Boolean getEditPosts() {
            return editPosts;
        }


        public Boolean getEditOthersPosts() {
            return editOthersPosts;
        }

        public Boolean getEditPublishedPosts() {
            return editPublishedPosts;
        }


        public Boolean getPublishPosts() {
            return publishPosts;
        }


        public Boolean getEditPages() {
            return editPages;
        }

        public Boolean getRead() {
            return read;
        }


        public Boolean getLevel10() {
            return level10;
        }


        public Boolean getLevel9() {
            return level9;
        }


        public Boolean getLevel8() {
            return level8;
        }

        public Boolean getLevel7() {
            return level7;
        }

        public Boolean getLevel6() {
            return level6;
        }


        public Boolean getLevel5() {
            return level5;
        }


        public Boolean getLevel4() {
            return level4;
        }


        public Boolean getLevel3() {
            return level3;
        }


        public Boolean getLevel2() {
            return level2;
        }

        public Boolean getLevel1() {
            return level1;
        }


        public Boolean getLevel0() {
            return level0;
        }


        public Boolean getEditOthersPages() {
            return editOthersPages;
        }


        public Boolean getEditPublishedPages() {
            return editPublishedPages;
        }


        public Boolean getPublishPages() {
            return publishPages;
        }


        public Boolean getDeletePages() {
            return deletePages;
        }


        public Boolean getDeleteOthersPages() {
            return deleteOthersPages;
        }


        public Boolean getDeletePublishedPages() {
            return deletePublishedPages;
        }


        public Boolean getDeletePosts() {
            return deletePosts;
        }


        public Boolean getDeleteOthersPosts() {
            return deleteOthersPosts;
        }


        public Boolean getDeletePublishedPosts() {
            return deletePublishedPosts;
        }


        public Boolean getDeletePrivatePosts() {
            return deletePrivatePosts;
        }

        public Boolean getEditPrivatePosts() {
            return editPrivatePosts;
        }

        public Boolean getReadPrivatePosts() {
            return readPrivatePosts;
        }


        public Boolean getDeletePrivatePages() {
            return deletePrivatePages;
        }


        public Boolean getEditPrivatePages() {
            return editPrivatePages;
        }


        public Boolean getReadPrivatePages() {
            return readPrivatePages;
        }


        public Boolean getDeleteUsers() {
            return deleteUsers;
        }


        public Boolean getCreateUsers() {
            return createUsers;
        }


        public Boolean getUnfilteredUpload() {
            return unfilteredUpload;
        }


        public Boolean getEditDashboard() {
            return editDashboard;
        }


        public Boolean getUpdatePlugins() {
            return updatePlugins;
        }

        public Boolean getDeletePlugins() {
            return deletePlugins;
        }


        public Boolean getInstallPlugins() {
            return installPlugins;
        }


        public Boolean getUpdateThemes() {
            return updateThemes;
        }


        public Boolean getInstallThemes() {
            return installThemes;
        }

        public Boolean getUpdateCore() {
            return updateCore;
        }


        public Boolean getListUsers() {
            return listUsers;
        }


        public Boolean getRemoveUsers() {
            return removeUsers;
        }


        public Boolean getPromoteUsers() {
            return promoteUsers;
        }


        public Boolean getEditThemeOptions() {
            return editThemeOptions;
        }


        public Boolean getDeleteThemes() {
            return deleteThemes;
        }

        public Boolean getExport() {
            return export;
        }


        public Boolean getAdministrator() {
            return administrator;
        }


    }

    public static class ExtraCapabilitiesDTO {
        @SerializedName("administrator")
        private Boolean administrator;

        public Boolean getAdministrator() {
            return administrator;
        }
    }

    public static class AvatarUrlsDTO {
        @SerializedName("24")
        private String $24;
        @SerializedName("48")
        private String $48;
        @SerializedName("96")
        private String $96;

        public String get$24() {
            return $24;
        }


        public String get$48() {
            return $48;
        }


        public String get$96() {
            return $96;
        }
    }

    public static class LinksDTO {
        @SerializedName("self")
        private List<SelfDTO> self;
        @SerializedName("collection")
        private List<CollectionDTO> collection;

        public List<SelfDTO> getSelf() {
            return self;
        }


        public List<CollectionDTO> getCollection() {
            return collection;
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
    }
}
