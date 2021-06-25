package com.xw.baselib.http;

public class API {

    public ApiService service;

    public static class SingleHolder{
        private static final API instance = new API();
    }

    public API() {
        service = HttpManager.getInstance().creatApi(ApiService.class);
    }

    public static API getInstance(){
        return SingleHolder.instance;
    }
}
