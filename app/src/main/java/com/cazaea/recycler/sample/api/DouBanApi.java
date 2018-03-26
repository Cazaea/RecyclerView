package com.cazaea.recycler.sample.api;

/**
 * Created by Cazaea on 2017/4/12.
 * <p>
 * <p>
 * 豆瓣电影API
 * <p>
 * 1、电影正在热映
 * URL: http://api.douban.com/v2/movie/in_theaters?city=北京
 * URL: http://api.douban.com/v2/movie/nowplaying?apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 2、电影条目信息
 * URL：http://api.douban.com/v2/movie/subject/1764796
 * URL：https://api.douban.com/v2/movie/subject/:id
 * <p>
 * 3、电影条目剧照
 * URL：http://api.douban.com/v2/movie/subject/:id/photos?apikey=0df993c66c0c636e29ecbb5344252a4a
 * URL：http://api.douban.com/v2/movie/celebrity/105439
 * <p>
 * http://api.douban.com/movie/subject/:id/photos?alt=json&apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * http://api.douban.com/movie/subject/:id/photos?alt=json&apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 4.影人条目信息 URL：http://api.douban.com/v2/movie/celebrity/:id?apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 5.影人剧照 URL: http://api.douban.com/v2/movie/celebrity/:id/photos?apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 6.即将上映
 * URL：http://api.douban.com/v2/movie/coming_soon?start=0&count=5
 * URL：http://api.douban.com/v2/movie/coming?apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 8.TOP250
 * URL：http://api.douban.com/v2/movie/top250?start=0&count=5
 * URL：http://api.douban.com/v2/movie/top250?apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 9.电影本周口碑榜 URL：http://api.douban.com/v2/movie/weekly?apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 10.北美票房榜
 * URL：http://api.douban.com/v2/movie/us_box
 * URL：http://api.douban.com/v2/movie/us_box?apikey=0df993c66c0c636e29ecbb5344252a4a
 * <p>
 * 11.新片榜 URL：http://api.douban.com/v2/movie/new_movies?apikey=0df993c66c0c636e29ecbb5344252a4a
 */

public class DouBanApi {

    //    public static final String BaseUrl = "http://news-at.zhihu.com/api/4/";
//    public static final String lastestNews = "news/latest";

    // 接口根目录
    private static String BaseUrl = "http://api.douban.com/";

    // 豆瓣key
    public static final String ApiKey = "0df993c66c0c636e29ecbb5344252a4a";

    // 正在热播的电影
    public static final String Url_HotMovie = BaseUrl + "v2/movie/in_theaters";

    // 电影详情
    public static final String Url_MovieDetail = BaseUrl + "v2/movie/subject/";

}
