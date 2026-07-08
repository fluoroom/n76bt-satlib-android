package com.facebook.stetho.server.http;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class HandlerRegistry {
    private final ArrayList<PathMatcher> mPathMatchers = new ArrayList<>();
    private final ArrayList<HttpHandler> mHttpHandlers = new ArrayList<>();

    public synchronized HttpHandler lookup(String str) {
        int size = this.mPathMatchers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.mPathMatchers.get(i10).match(str)) {
                return this.mHttpHandlers.get(i10);
            }
        }
        return null;
    }

    public synchronized void register(PathMatcher pathMatcher, HttpHandler httpHandler) {
        this.mPathMatchers.add(pathMatcher);
        this.mHttpHandlers.add(httpHandler);
    }

    public synchronized boolean unregister(PathMatcher pathMatcher, HttpHandler httpHandler) {
        int iIndexOf = this.mPathMatchers.indexOf(pathMatcher);
        if (iIndexOf < 0 || httpHandler != this.mHttpHandlers.get(iIndexOf)) {
            return false;
        }
        this.mPathMatchers.remove(iIndexOf);
        this.mHttpHandlers.remove(iIndexOf);
        return true;
    }
}
