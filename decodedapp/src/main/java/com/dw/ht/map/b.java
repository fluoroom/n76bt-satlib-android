package com.dw.ht.map;

import android.content.Context;
import rd.m;
import z4.f;
import z4.i;
import z4.j;
import z4.u;
import z4.z;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6534a = a.f6535a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f6535a = new a();

        /* JADX INFO: renamed from: com.dw.ht.map.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0093a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6536a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.f32942f.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.f32941e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.f32940d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j.f32939c.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f6536a = iArr;
            }
        }

        private a() {
        }

        public final b a(Context context, j jVar) {
            m.e(context, "context");
            m.e(jVar, "layer");
            int i10 = C0093a.f6536a[jVar.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new f(jVar, context) : new f(jVar, context) : new f(jVar, context) : new z(i.f32932c, context) : new u(i.f32931b, context);
        }
    }

    int b();

    int c(int i10, int i11, int i12);

    int d(int i10, int i11, int i12, boolean z10);
}
