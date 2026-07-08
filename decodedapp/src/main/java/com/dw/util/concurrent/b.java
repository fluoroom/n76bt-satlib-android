package com.dw.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Thread f6905a = Thread.currentThread();

    public static boolean a() {
        return Thread.currentThread() == f6905a;
    }
}
