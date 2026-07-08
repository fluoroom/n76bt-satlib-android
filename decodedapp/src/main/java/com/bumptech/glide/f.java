package com.bumptech.glide;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5128a;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f5129a = new HashMap();

        a() {
        }

        f b() {
            return new f(this);
        }
    }

    f(a aVar) {
        this.f5128a = DesugarCollections.unmodifiableMap(new HashMap(aVar.f5129a));
    }

    public boolean a(Class cls) {
        return this.f5128a.containsKey(cls);
    }
}
