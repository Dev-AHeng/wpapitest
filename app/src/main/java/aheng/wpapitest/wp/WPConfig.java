package aheng.wpapitest.wp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.log.LoggerInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * WordPress SDK的基本配置
 *
 * @author AHeng
 * @date 2021/05/16 22:33
 */
public class WPConfig {
    private String host;

    public WPConfig(String host) {
        this.host = host;
    }

    /**
     * gson配置
     *
     * @return gson obj
     */
    public static Gson getGsonConfig() {
        Gson gson = new GsonBuilder()
                // json宽松
                .setLenient()
                // 支持Map的key为复杂对象的形式
                .enableComplexMapKeySerialization()
                // 智能null(如果没有值的话会用null/0填充  如果不使用该方法，没值就忽略不进行转换)
                .serializeNulls()
                // 调教格式(分行格式)
                // .setPrettyPrinting()
                // 默认是GSON把HTML转义
                .disableHtmlEscaping()
                .create();
        return gson;
    }

    /**
     * okhttp配置
     */
    public static void okhttpConfig() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                // okhttp拦截器(输出请求信息)
                .addInterceptor(new LoggerInterceptor("out"))
                // 的是建立连接所用的时间，适用于网络状况正常的情况下，两端连接所用的时间(连接超时时间)
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                // 指的是建立连接后从服务器读取到可用资源所用的时间
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                // 允许http重定向
                .followRedirects(true)
                // 运行https重定向
                .followSslRedirects(true)
                .build();

        OkHttpUtils.initClient(okHttpClient);
    }

    /**
     * 获取host
     *
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置host(例如:http://aheng.com)
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

}
