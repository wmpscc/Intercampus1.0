package com.wmpscc.intercampus10;

/**
 * Created by wmpscc on 2017/10/5.
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate(){
        super.onCreate();
        TypefaceUtil.replaceSystemDefaultFont(this,"fonts/msyh.ttf");
    }
}
