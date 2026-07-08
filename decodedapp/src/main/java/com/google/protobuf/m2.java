package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class m2 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f9188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0[] f9189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l1 f9190e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b2 f9192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f9195e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f9196f;

        public a(int i10) {
            this.f9191a = new ArrayList(i10);
        }

        public m2 a() {
            if (this.f9193c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f9192b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f9193c = true;
            Collections.sort(this.f9191a);
            return new m2(this.f9192b, this.f9194d, this.f9195e, (d0[]) this.f9191a.toArray(new d0[0]), this.f9196f);
        }

        public void b(int[] iArr) {
            this.f9195e = iArr;
        }

        public void c(Object obj) {
            this.f9196f = obj;
        }

        public void d(d0 d0Var) {
            if (this.f9193c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f9191a.add(d0Var);
        }

        public void e(boolean z10) {
            this.f9194d = z10;
        }

        public void f(b2 b2Var) {
            this.f9192b = (b2) o0.b(b2Var, "syntax");
        }
    }

    m2(b2 b2Var, boolean z10, int[] iArr, d0[] d0VarArr, Object obj) {
        this.f9186a = b2Var;
        this.f9187b = z10;
        this.f9188c = iArr;
        this.f9189d = d0VarArr;
        this.f9190e = (l1) o0.b(obj, "defaultInstance");
    }

    public static a f(int i10) {
        return new a(i10);
    }

    @Override // com.google.protobuf.j1
    public boolean a() {
        return this.f9187b;
    }

    @Override // com.google.protobuf.j1
    public l1 b() {
        return this.f9190e;
    }

    @Override // com.google.protobuf.j1
    public b2 c() {
        return this.f9186a;
    }

    public int[] d() {
        return this.f9188c;
    }

    public d0[] e() {
        return this.f9189d;
    }
}
