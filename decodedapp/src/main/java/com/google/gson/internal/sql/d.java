package com.google.gson.internal.sql;

import com.google.gson.internal.bind.c;
import com.google.gson.y;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.b f8811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.b f8812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f8813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f8814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f8815f;

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends c.b {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f8810a = z10;
        if (z10) {
            f8811b = new a(Date.class);
            f8812c = new b(Timestamp.class);
            f8813d = com.google.gson.internal.sql.a.f8804b;
            f8814e = com.google.gson.internal.sql.b.f8806b;
            f8815f = c.f8808b;
            return;
        }
        f8811b = null;
        f8812c = null;
        f8813d = null;
        f8814e = null;
        f8815f = null;
    }
}
