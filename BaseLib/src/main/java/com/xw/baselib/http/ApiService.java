package com.xw.baselib.http;

import com.xw.baselib.bean.BlogDetails;
import com.xw.baselib.bean.Blogs;
import com.xw.baselib.bean.HomeDetails;
import com.xw.baselib.bean.HomeList;
import com.xw.baselib.bean.HomeTitle;
import com.xw.baselib.bean.SingleList;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    /**
     * 获取标题
     */
    @GET("https://adultfrinendfinder-nsa.web.app/api/uber/hometitle")
    Observable<HomeTitle> getHomeTitle();

    /**
     * 首页列表
     */
    @GET(" https://adultfrinendfinder-nsa.web.app/api/uber/homeapi")
    Observable<List<HomeList>> getHomeList();

    /**
     * 首页详情
     * @return
     */
    @GET("https://adultfrinendfinder-nsa.web.app/api/uber/review" + "id")
    Observable<HomeDetails> getHomeDetails();

    /**
     * singles 列表
     * @return
     */
    @GET("https://adultfrinendfinder-nsa.web.app/api/uber/male")
    Observable<List<SingleList>> getSingles();

    /**
     * 第三个页面数据
     * @return
     */
    @GET("https://adultfrinendfinder-nsa.web.app/api/uber/blog")
    Observable<Blogs> getBlog();

    @GET("https://adultfrinendfinder-nsa.web.app/api/uber/blog1")
    Observable<BlogDetails> getBlogDetails();

}
