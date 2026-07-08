package com.auth0.android.jwt;

import j$.util.DesugarCollections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f4930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f4931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Date f4932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Date f4933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Date f4934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f4935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final List f4936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f4937h;

    f(String str, String str2, Date date, Date date2, Date date3, String str3, List list, Map map) {
        this.f4930a = str;
        this.f4931b = str2;
        this.f4932c = date;
        this.f4933d = date2;
        this.f4934e = date3;
        this.f4935f = str3;
        this.f4936g = list;
        this.f4937h = DesugarCollections.unmodifiableMap(map);
    }

    b a(String str) {
        b bVar = (b) this.f4937h.get(str);
        return bVar != null ? bVar : new a();
    }
}
