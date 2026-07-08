package com.google.protobuf;

import com.google.protobuf.o0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
final class d0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f8929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f8930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f8931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Field f8933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f8935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f8936h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final y1 f8937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Field f8938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class f8939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f8940u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final o0.e f8941v;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8942a;

        static {
            int[] iArr = new int[f0.values().length];
            f8942a = iArr;
            try {
                iArr[f0.f8993x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8942a[f0.F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8942a[f0.P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8942a[f0.f8982l0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private d0(Field field, int i10, f0 f0Var, Class cls, Field field2, int i11, boolean z10, boolean z11, y1 y1Var, Class cls2, Object obj, o0.e eVar, Field field3) {
        this.f8929a = field;
        this.f8930b = f0Var;
        this.f8931c = cls;
        this.f8932d = i10;
        this.f8933e = field2;
        this.f8934f = i11;
        this.f8935g = z10;
        this.f8936h = z11;
        this.f8937r = y1Var;
        this.f8939t = cls2;
        this.f8940u = obj;
        this.f8941v = eVar;
        this.f8938s = field3;
    }

    private static boolean C(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    private static void a(int i10) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i10);
    }

    public static d0 e(Field field, int i10, f0 f0Var, Field field2, int i11, boolean z10, o0.e eVar) {
        a(i10);
        o0.b(field, "field");
        o0.b(f0Var, "fieldType");
        o0.b(field2, "presenceField");
        if (field2 == null || C(i11)) {
            return new d0(field, i10, f0Var, null, field2, i11, false, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static d0 f(Field field, int i10, f0 f0Var, boolean z10) {
        a(i10);
        o0.b(field, "field");
        o0.b(f0Var, "fieldType");
        if (f0Var == f0.P || f0Var == f0.f8982l0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new d0(field, i10, f0Var, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static d0 g(Field field, int i10, f0 f0Var, o0.e eVar) {
        a(i10);
        o0.b(field, "field");
        return new d0(field, i10, f0Var, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static d0 h(Field field, int i10, f0 f0Var, Field field2, int i11, boolean z10, o0.e eVar) {
        a(i10);
        o0.b(field, "field");
        o0.b(f0Var, "fieldType");
        o0.b(field2, "presenceField");
        if (field2 == null || C(i11)) {
            return new d0(field, i10, f0Var, null, field2, i11, true, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static d0 i(Field field, int i10, Object obj, o0.e eVar) {
        o0.b(obj, "mapDefaultEntry");
        a(i10);
        o0.b(field, "field");
        return new d0(field, i10, f0.f8983m0, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static d0 j(int i10, f0 f0Var, y1 y1Var, Class cls, boolean z10, o0.e eVar) {
        a(i10);
        o0.b(f0Var, "fieldType");
        o0.b(y1Var, "oneof");
        o0.b(cls, "oneofStoredType");
        if (f0Var.g()) {
            return new d0(null, i10, f0Var, null, null, 0, false, z10, y1Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + f0Var);
    }

    public static d0 k(Field field, int i10, f0 f0Var, Field field2) {
        a(i10);
        o0.b(field, "field");
        o0.b(f0Var, "fieldType");
        if (f0Var == f0.P || f0Var == f0.f8982l0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new d0(field, i10, f0Var, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static d0 l(Field field, int i10, f0 f0Var, o0.e eVar, Field field2) {
        a(i10);
        o0.b(field, "field");
        return new d0(field, i10, f0Var, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static d0 m(Field field, int i10, f0 f0Var, Class cls) {
        a(i10);
        o0.b(field, "field");
        o0.b(f0Var, "fieldType");
        o0.b(cls, "messageClass");
        return new d0(field, i10, f0Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    public f0 A() {
        return this.f8930b;
    }

    public boolean B() {
        return this.f8936h;
    }

    public boolean D() {
        return this.f8935g;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(d0 d0Var) {
        return this.f8932d - d0Var.f8932d;
    }

    public Field n() {
        return this.f8938s;
    }

    public o0.e q() {
        return this.f8941v;
    }

    public Field r() {
        return this.f8929a;
    }

    public int s() {
        return this.f8932d;
    }

    public Object u() {
        return this.f8940u;
    }

    public Class v() {
        int i10 = a.f8942a[this.f8930b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Field field = this.f8929a;
            return field != null ? field.getType() : this.f8939t;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f8931c;
        }
        return null;
    }

    public y1 w() {
        return this.f8937r;
    }

    public Field x() {
        return this.f8933e;
    }

    public int y() {
        return this.f8934f;
    }
}
