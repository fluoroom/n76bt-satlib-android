package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m2.a;
import m2.i;
import x2.o;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c */
    private k2.k f5101c;

    /* JADX INFO: renamed from: d */
    private l2.d f5102d;

    /* JADX INFO: renamed from: e */
    private l2.b f5103e;

    /* JADX INFO: renamed from: f */
    private m2.h f5104f;

    /* JADX INFO: renamed from: g */
    private n2.a f5105g;

    /* JADX INFO: renamed from: h */
    private n2.a f5106h;

    /* JADX INFO: renamed from: i */
    private a.InterfaceC0285a f5107i;

    /* JADX INFO: renamed from: j */
    private m2.i f5108j;

    /* JADX INFO: renamed from: k */
    private x2.c f5109k;

    /* JADX INFO: renamed from: n */
    private o.b f5112n;

    /* JADX INFO: renamed from: o */
    private n2.a f5113o;

    /* JADX INFO: renamed from: p */
    private boolean f5114p;

    /* JADX INFO: renamed from: q */
    private List f5115q;

    /* JADX INFO: renamed from: a */
    private final Map f5099a = new androidx.collection.a();

    /* JADX INFO: renamed from: b */
    private final f.a f5100b = new f.a();

    /* JADX INFO: renamed from: l */
    private int f5110l = 4;

    /* JADX INFO: renamed from: m */
    private c.a f5111m = new a();

    class a implements c.a {
        a() {
        }

        @Override // com.bumptech.glide.c.a
        public a3.f build() {
            return new a3.f();
        }
    }

    static final class b {
    }

    public static final class c {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.d$d */
    public static final class C0077d {
    }

    public static final class e {
    }

    com.bumptech.glide.c a(Context context, List list, y2.a aVar) {
        if (this.f5105g == null) {
            this.f5105g = n2.a.s();
        }
        if (this.f5106h == null) {
            this.f5106h = n2.a.q();
        }
        if (this.f5113o == null) {
            this.f5113o = n2.a.l();
        }
        if (this.f5108j == null) {
            this.f5108j = new i.a(context).a();
        }
        if (this.f5109k == null) {
            this.f5109k = new x2.e();
        }
        if (this.f5102d == null) {
            int iB = this.f5108j.b();
            if (iB > 0) {
                this.f5102d = new l2.k(iB);
            } else {
                this.f5102d = new l2.e();
            }
        }
        if (this.f5103e == null) {
            this.f5103e = new l2.i(this.f5108j.a());
        }
        if (this.f5104f == null) {
            this.f5104f = new m2.g(this.f5108j.d());
        }
        if (this.f5107i == null) {
            this.f5107i = new m2.f(context);
        }
        if (this.f5101c == null) {
            this.f5101c = new k2.k(this.f5104f, this.f5107i, this.f5106h, this.f5105g, n2.a.v(), this.f5113o, this.f5114p);
        }
        List list2 = this.f5115q;
        if (list2 == null) {
            this.f5115q = Collections.EMPTY_LIST;
        } else {
            this.f5115q = DesugarCollections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f5101c, this.f5104f, this.f5102d, this.f5103e, new o(this.f5112n), this.f5109k, this.f5110l, this.f5111m, this.f5099a, this.f5115q, list, aVar, this.f5100b.b());
    }

    void b(o.b bVar) {
        this.f5112n = bVar;
    }
}
