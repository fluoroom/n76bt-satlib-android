package com.dw.ht.channels;

import android.content.Context;
import com.dw.ht.Cfg;
import com.dw.ht.provider.a;
import d4.d;
import d5.e;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b extends g4.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e f5641r;

    public static class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f5642a;

        a(ArrayList arrayList) {
            this.f5642a = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public b(Context context) {
        super(context);
        N(a.C0096a.f6663a);
    }

    public e P() {
        return this.f5641r;
    }

    @Override // g1.a
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a H() {
        e eVar = this.f5641r;
        return new a(d.c(eVar == null ? new d5.a[Cfg.M()] : eVar.m(true)));
    }

    public void R(e eVar) {
        this.f5641r = eVar;
        p();
    }
}
