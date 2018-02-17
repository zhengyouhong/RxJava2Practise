package com.example.ourydc.rxjava2practise.inject;

import android.app.Activity;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by zhengyouhong on 2018/2/13.
 */

public class Bind {

    public static void bind(Activity activity){
        for (Field field : activity.getClass().getDeclaredFields()) {
            for (Annotation anno : field.getAnnotations()) {

            }
        }
    }
}
