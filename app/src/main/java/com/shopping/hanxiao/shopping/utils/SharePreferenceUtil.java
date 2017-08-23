package com.shopping.hanxiao.shopping.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenzhi on 17/8/4.
 */

public class SharePreferenceUtil {

    public static boolean saveDatas(Context context, String preferenceName, String key, List<String> values) {
        SharedPreferences sp = context.getSharedPreferences(preferenceName, context.MODE_PRIVATE);
        SharedPreferences.Editor mEdit1 = sp.edit();
        mEdit1.putInt(key, values.size());

        for (int i = 0; i < values.size(); i++) {
            mEdit1.remove(key + i);
            mEdit1.putString(key + i, values.get(i));
        }
        return mEdit1.commit();
    }

    public static List getDatas(Context context, String preferenceName, String key) {
        SharedPreferences sp = context.getSharedPreferences(preferenceName, context.MODE_PRIVATE);
        int size = sp.getInt(key, 0);
        List<String> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(sp.getString(key + i, null));
        }
        return list;
    }
}
