package com.dw.ht;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f6649f = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f6650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0 f6651e;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final o a(Context context) {
            rd.m.e(context, "applicationContext");
            p pVar = new p(context, new n0(), null);
            o.l(pVar);
            return pVar;
        }

        private a() {
        }
    }

    public /* synthetic */ p(Context context, m0 m0Var, rd.h hVar) {
        this(context, m0Var);
    }

    @Override // com.dw.ht.o
    public Context e() {
        return this.f6650d;
    }

    @Override // com.dw.ht.o
    public m0 j() {
        return this.f6651e;
    }

    private p(Context context, m0 m0Var) {
        this.f6650d = context;
        this.f6651e = m0Var;
        n4.d.f22437a.a(e());
        n4.l.f22470a.b(e());
    }
}
