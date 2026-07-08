package com.dw.ht;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6670a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6671a = new a("SendPlace", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6672b = new a("SendMessage", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f6673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kd.a f6674d;

        static {
            a[] aVarArrA = a();
            f6673c = aVarArrA;
            f6674d = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6671a, f6672b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6673c.clone();
        }

        public final q d() {
            return new q(this);
        }
    }

    public q(a aVar) {
        rd.m.e(aVar, "action");
        this.f6670a = aVar;
    }

    public final a a() {
        return this.f6670a;
    }
}
