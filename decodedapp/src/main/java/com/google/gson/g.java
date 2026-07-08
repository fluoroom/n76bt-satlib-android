package com.google.gson;

import com.google.gson.internal.bind.c;
import com.google.gson.reflect.TypeToken;
import j$.util.Objects;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z9.u f8663a = z9.u.f33049g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f8664b = s.f8822a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f8665c = b.f8619a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8666d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8667e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f8668f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8669g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8670h = f.B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8671i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8672j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8673k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8674l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8675m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f8676n = f.A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f8677o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private u f8678p = f.f8632z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8679q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private w f8680r = f.D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private w f8681s = f.E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque f8682t = new ArrayDeque();

    private static void a(String str, int i10, int i11, List list) {
        y yVarB;
        y yVarB2;
        boolean z10 = com.google.gson.internal.sql.d.f8810a;
        y yVarA = null;
        if (str != null && !str.trim().isEmpty()) {
            yVarB = c.b.f8693b.b(str);
            if (z10) {
                yVarA = com.google.gson.internal.sql.d.f8812c.b(str);
                yVarB2 = com.google.gson.internal.sql.d.f8811b.b(str);
            } else {
                yVarB2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            y yVarA2 = c.b.f8693b.a(i10, i11);
            if (z10) {
                yVarA = com.google.gson.internal.sql.d.f8812c.a(i10, i11);
                y yVarA3 = com.google.gson.internal.sql.d.f8811b.a(i10, i11);
                yVarB = yVarA2;
                yVarB2 = yVarA3;
            } else {
                yVarB = yVarA2;
                yVarB2 = null;
            }
        }
        list.add(yVarB);
        if (z10) {
            list.add(yVarA);
            list.add(yVarB2);
        }
    }

    private static boolean c(Type type) {
        return type == Object.class;
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f8667e.size() + this.f8668f.size() + 3);
        arrayList.addAll(this.f8667e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f8668f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f8670h, this.f8671i, this.f8672j, arrayList);
        return new f(this.f8663a, this.f8665c, new HashMap(this.f8666d), this.f8669g, this.f8673k, this.f8677o, this.f8675m, this.f8676n, this.f8678p, this.f8674l, this.f8679q, this.f8664b, this.f8670h, this.f8671i, this.f8672j, new ArrayList(this.f8667e), new ArrayList(this.f8668f), arrayList, this.f8680r, this.f8681s, new ArrayList(this.f8682t));
    }

    public g d(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        if (!(obj instanceof j) && !(obj instanceof x)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (c(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof j) {
            this.f8667e.add(com.google.gson.internal.bind.m.g(TypeToken.b(type), obj));
        }
        if (obj instanceof x) {
            this.f8667e.add(com.google.gson.internal.bind.o.a(TypeToken.b(type), (x) obj));
        }
        return this;
    }
}
