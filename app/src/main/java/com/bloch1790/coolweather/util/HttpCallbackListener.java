package com.bloch1790.coolweather.util;

/**
 * Created by Administrator on 2015/11/1 0001.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
