package com.ekito.simpleKML.model;

/* JADX INFO: loaded from: classes.dex */
public class BooleanUtil {
    public static Boolean valueOf(String str) {
        return str == null ? Boolean.FALSE : str.equals("1") ? Boolean.TRUE : str.equals("0") ? Boolean.FALSE : Boolean.valueOf(str.toUpperCase());
    }
}
