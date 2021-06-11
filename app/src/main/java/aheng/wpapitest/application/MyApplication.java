package aheng.wpapitest.application;

import android.app.Application;

import aheng.wpapitest.wp.WPConfig;

/**
 * @author AHeng
 * @date 2021/05/16 16:43
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    public MyApplication() {
    }

    /*public static synchronized MyApplication getInstance() {
        if (null == instance) {
            instance = new MyApplication();
        }
        return instance;
    }*/

    /**
     * 获取wp配置对象
     *
     * @return wp配置对象
     */
    public static WPConfig init() {
        return new WPConfig("http://wp.bili-bili.cn");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // okhttp配置
        WPConfig.okhttpConfig();

    }
}