package com.cazaea.recycler.sample.config;

/**
 * @author Cazaea
 * @time 2017/11/3 13:26
 * @mail wistorm@sina.com
 */

public class UrlConfig {

    // 接口根目录
    private static String ROOT = "http://192.168.1.7:801/app";

    //=========================文件路径=========================//
    public static final String PATH_NAME = "cazaea";

    //=========================接口数据=========================//

    // 登录
    public static String loginUrl = ROOT + "/Auth/login";
    // 上报
    public static String reportedUrl = ROOT + "/collateral/reckoningUpload";

}
