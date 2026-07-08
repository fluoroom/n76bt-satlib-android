package g7;

import f7.k;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final p6.p f13597a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final p6.p f13598b = new d();

    public static class a extends i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final int f13599c;

        public a(int i10, Class cls) {
            super(cls, false);
            this.f13599c = i10;
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            String strValueOf;
            switch (this.f13599c) {
                case 1:
                    d0Var.K((Date) obj, gVar);
                    break;
                case 2:
                    d0Var.H(((Calendar) obj).getTimeInMillis(), gVar);
                    break;
                case 3:
                    gVar.D0(((Class) obj).getName());
                    break;
                case 4:
                    if (d0Var.y0(p6.c0.WRITE_ENUMS_USING_TO_STRING)) {
                        strValueOf = obj.toString();
                    } else {
                        Enum r32 = (Enum) obj;
                        strValueOf = d0Var.y0(p6.c0.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r32.ordinal()) : r32.name();
                    }
                    gVar.D0(strValueOf);
                    break;
                case 5:
                case 6:
                    gVar.B0(((Number) obj).longValue());
                    break;
                case 7:
                    gVar.D0(d0Var.k().h().h((byte[]) obj));
                    break;
                default:
                    gVar.D0(obj.toString());
                    break;
            }
        }
    }

    public static class b extends i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected transient f7.k f13600c;

        public b() {
            super(String.class, false);
            this.f13600c = f7.k.c();
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            Class<?> cls = obj.getClass();
            f7.k kVar = this.f13600c;
            p6.p pVarJ = kVar.j(cls);
            if (pVarJ == null) {
                pVarJ = x(kVar, cls, d0Var);
            }
            pVarJ.f(obj, gVar, d0Var);
        }

        protected p6.p x(f7.k kVar, Class cls, p6.d0 d0Var) {
            if (cls == Object.class) {
                a aVar = new a(8, cls);
                this.f13600c = kVar.i(cls, aVar);
                return aVar;
            }
            k.d dVarD = kVar.d(cls, d0Var, null);
            f7.k kVar2 = dVarD.f12864b;
            if (kVar != kVar2) {
                this.f13600c = kVar2;
            }
            return dVarD.f12863a;
        }
    }

    public static class c extends i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final i7.l f13601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final i7.l f13602d;

        protected c(Class cls, i7.l lVar, i7.l lVar2) {
            super(cls, false);
            this.f13601c = lVar;
            this.f13602d = lVar2;
        }

        public static c x(Class cls, i7.l lVar, i7.l lVar2) {
            return new c(cls, lVar, lVar2);
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            if (d0Var.y0(p6.c0.WRITE_ENUMS_USING_TO_STRING)) {
                gVar.D0(obj.toString());
                return;
            }
            Enum r22 = (Enum) obj;
            i7.l lVar = this.f13602d;
            if (lVar != null) {
                gVar.C0(lVar.d(r22));
            } else if (d0Var.y0(p6.c0.WRITE_ENUM_KEYS_USING_INDEX)) {
                gVar.D0(String.valueOf(r22.ordinal()));
            } else {
                gVar.C0(this.f13601c.d(r22));
            }
        }
    }

    public static class d extends i0 {
        public d() {
            super(String.class, false);
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.D0((String) obj);
        }
    }

    public static p6.p a(p6.b0 b0Var, Class cls, x6.d dVar) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new b();
            }
            if (i7.h.M(cls)) {
                return c.x(cls, i7.l.b(b0Var, cls), m.C(b0Var, cls, dVar));
            }
        }
        return new a(8, cls);
    }

    public static p6.p b(p6.b0 b0Var, Class cls, boolean z10) {
        if (cls == null || cls == Object.class) {
            return new b();
        }
        if (cls == String.class) {
            return f13598b;
        }
        if (cls.isPrimitive()) {
            cls = i7.h.p0(cls);
        }
        if (cls == Integer.class) {
            return new a(5, cls);
        }
        if (cls == Long.class) {
            return new a(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new a(8, cls);
        }
        if (cls == Class.class) {
            return new a(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new a(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new a(2, cls);
        }
        if (cls == UUID.class) {
            return new a(8, cls);
        }
        if (cls == byte[].class) {
            return new a(7, cls);
        }
        if (z10) {
            return new a(8, cls);
        }
        return null;
    }
}
