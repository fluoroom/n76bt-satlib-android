package xf;

import xf.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32035a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f32036b;

        static {
            d.a aVar = d.f32038c;
            f32036b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // xf.c
        public int a() {
            return f32036b;
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32037a = new b();

        private b() {
        }

        @Override // xf.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
