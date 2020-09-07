package com.test.commonlibrary;

import android.text.TextUtils;
import android.util.Log;

/**
 *  common包测试工具类
 */
public class CommonTestUtil {

    public static void log(String content){
        if(TextUtils.isEmpty(content)){
            return;
        }

        Log.e(CommonTestUtil.class.getName(),content);
    }

}
