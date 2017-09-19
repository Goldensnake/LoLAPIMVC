package com.juliens.lolapimvctest.util;

import android.content.Context;
import android.os.Build;

/**
 * Created by juliens on 14/09/2017.
 */

public class AndroidUtil {
    public static String getLocale(Context context){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            return context.getResources().getConfiguration().getLocales().get(0).toString();
        } else{
            return context.getResources().getConfiguration().locale.toString();
        }
    }

}
