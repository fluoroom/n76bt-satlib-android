package z4;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f32898a = new e();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32899a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f32941e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f32940d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f32939c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.f32942f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32899a = iArr;
        }
    }

    private e() {
    }

    public final q8.x a(Context context, j jVar) {
        q8.y dVar;
        rd.m.e(context, "context");
        rd.m.e(jVar, "layer");
        int i10 = a.f32899a[jVar.ordinal()];
        if (i10 == 1) {
            dVar = new d(i.f32932c, context);
        } else if (i10 == 2 || i10 == 3) {
            b bVar = new b(jVar, context);
            dVar = bVar;
        } else {
            dVar = i10 != 4 ? null : new c(i.f32931b, context);
        }
        if (dVar == null) {
            return null;
        }
        return new q8.x().i(-100.0f).h(dVar);
    }
}
