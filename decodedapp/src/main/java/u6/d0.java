package u6;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends p6.q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f28203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class f28204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p f28205c;

    static final class a extends p6.q implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Class f28206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final p6.l f28207b;

        protected a(Class cls, p6.l lVar) {
            this.f28206a = cls;
            this.f28207b = lVar;
        }

        @Override // p6.q
        public final Object a(String str, p6.h hVar) {
            if (str == null) {
                return null;
            }
            i7.b0 b0VarX = hVar.x();
            b0VarX.d1(str);
            try {
                e6.j jVarU1 = b0VarX.u1();
                jVarU1.X0();
                Object objE = this.f28207b.e(jVarU1, hVar);
                return objE != null ? objE : hVar.w0(this.f28206a, str, "not a valid representation", new Object[0]);
            } catch (Exception e10) {
                return hVar.w0(this.f28206a, str, "not a valid representation: %s", e10.getMessage());
            }
        }
    }

    static final class b extends d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final i7.k f28208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final x6.l f28209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected volatile i7.k f28210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected volatile i7.k f28211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final i7.k f28212h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        protected final Enum f28213r;

        protected b(i7.k kVar, x6.l lVar, i7.k kVar2) {
            super(-1, kVar.r());
            this.f28208d = kVar;
            this.f28209e = lVar;
            this.f28213r = kVar.q();
            this.f28212h = kVar2;
        }

        private i7.k h(p6.h hVar) {
            i7.k kVarL;
            i7.k kVar = this.f28211g;
            if (kVar != null) {
                return kVar;
            }
            synchronized (this) {
                try {
                    kVarL = this.f28211g;
                    if (kVarL == null) {
                        kVarL = i7.k.l(hVar.k(), this.f28208d.r());
                        this.f28211g = kVarL;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kVarL;
        }

        private i7.k i(p6.h hVar) {
            i7.k kVarO;
            i7.k kVar = this.f28210f;
            if (kVar != null) {
                return kVar;
            }
            synchronized (this) {
                try {
                    kVarO = this.f28210f;
                    if (kVarO == null) {
                        kVarO = i7.k.o(hVar.k(), this.f28208d.r());
                        this.f28210f = kVarO;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kVarO;
        }

        @Override // u6.d0
        public Object b(String str, p6.h hVar) {
            x6.l lVar = this.f28209e;
            if (lVar != null) {
                try {
                    return lVar.t(str);
                } catch (Exception e10) {
                    i7.h.m0(e10);
                }
            }
            i7.k kVarJ = j(hVar);
            Enum enumP = kVarJ.p(str);
            if (enumP == null && hVar.F0(r6.n.READ_ENUM_KEYS_USING_INDEX)) {
                kVarJ = h(hVar);
                enumP = kVarJ.p(str);
            }
            return enumP == null ? (this.f28213r == null || !hVar.D0(p6.i.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) ? !hVar.D0(p6.i.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? hVar.w0(this.f28204b, str, "not one of the values accepted for Enum class: %s", kVarJ.s()) : enumP : this.f28213r : enumP;
        }

        protected i7.k j(p6.h hVar) {
            i7.k kVar = this.f28212h;
            return kVar != null ? kVar : hVar.D0(p6.i.READ_ENUMS_USING_TO_STRING) ? i(hVar) : this.f28208d;
        }
    }

    static final class c extends d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final Constructor f28214d;

        public c(Constructor constructor) {
            super(-1, constructor.getDeclaringClass());
            this.f28214d = constructor;
        }

        @Override // u6.d0
        public Object b(String str, p6.h hVar) {
            return this.f28214d.newInstance(str);
        }
    }

    static final class d extends d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Method f28215d;

        public d(Method method) {
            super(-1, method.getDeclaringClass());
            this.f28215d = method;
        }

        @Override // u6.d0
        public Object b(String str, p6.h hVar) {
            return this.f28215d.invoke(null, str);
        }
    }

    protected d0(int i10, Class cls) {
        this(i10, cls, null);
    }

    public static d0 g(Class cls) {
        int i10;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return e.h(cls);
        }
        if (cls == UUID.class) {
            i10 = 12;
        } else if (cls == Integer.class) {
            i10 = 5;
        } else if (cls == Long.class) {
            i10 = 6;
        } else if (cls == Date.class) {
            i10 = 10;
        } else if (cls == Calendar.class) {
            i10 = 11;
        } else if (cls == Boolean.class) {
            i10 = 1;
        } else if (cls == Byte.class) {
            i10 = 2;
        } else if (cls == Character.class) {
            i10 = 4;
        } else if (cls == Short.class) {
            i10 = 3;
        } else if (cls == Float.class) {
            i10 = 7;
        } else if (cls == Double.class) {
            i10 = 8;
        } else if (cls == URI.class) {
            i10 = 13;
        } else if (cls == URL.class) {
            i10 = 14;
        } else if (cls == Class.class) {
            i10 = 15;
        } else {
            if (cls == Locale.class) {
                return new d0(9, cls, p.k1(Locale.class));
            }
            if (cls == Currency.class) {
                return new d0(16, cls, p.k1(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i10 = 17;
        }
        return new d0(i10, cls);
    }

    @Override // p6.q
    public Object a(String str, p6.h hVar) {
        if (str == null) {
            return null;
        }
        try {
            Object objB = b(str, hVar);
            if (objB != null) {
                return objB;
            }
            if (i7.h.M(this.f28204b) && hVar.k().x0(p6.i.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return hVar.w0(this.f28204b, str, "not a valid representation", new Object[0]);
        } catch (Exception e10) {
            return hVar.w0(this.f28204b, str, "not a valid representation, problem: (%s) %s", e10.getClass().getName(), i7.h.o(e10));
        }
    }

    protected Object b(String str, p6.h hVar) {
        switch (this.f28203a) {
            case 1:
                return "true".equals(str) ? Boolean.TRUE : "false".equals(str) ? Boolean.FALSE : hVar.w0(this.f28204b, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int iD = d(str);
                return (iD < -128 || iD > 255) ? hVar.w0(this.f28204b, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) iD);
            case 3:
                int iD2 = d(str);
                return (iD2 < -32768 || iD2 > 32767) ? hVar.w0(this.f28204b, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) iD2);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : hVar.w0(this.f28204b, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(d(str));
            case 6:
                return Long.valueOf(e(str));
            case 7:
                return Float.valueOf((float) c(str));
            case 8:
                return Double.valueOf(c(str));
            case 9:
                try {
                    return this.f28205c.e1(str, hVar);
                } catch (IllegalArgumentException e10) {
                    return f(hVar, str, e10);
                }
            case 10:
                return hVar.J0(str);
            case 11:
                return hVar.C(hVar.J0(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e11) {
                    return f(hVar, str, e11);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e12) {
                    return f(hVar, str, e12);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e13) {
                    return f(hVar, str, e13);
                }
            case 15:
                try {
                    return hVar.L(str);
                } catch (Exception unused) {
                    return hVar.w0(this.f28204b, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this.f28205c.e1(str, hVar);
                } catch (IllegalArgumentException e14) {
                    return f(hVar, str, e14);
                }
            case 17:
                try {
                    return hVar.k().h().f(str);
                } catch (IllegalArgumentException e15) {
                    return f(hVar, str, e15);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this.f28204b);
        }
    }

    protected double c(String str) {
        return i6.i.h(str);
    }

    protected int d(String str) {
        return i6.i.k(str);
    }

    protected long e(String str) {
        return i6.i.m(str);
    }

    protected Object f(p6.h hVar, String str, Exception exc) {
        return hVar.w0(this.f28204b, str, "problem: %s", i7.h.o(exc));
    }

    protected d0(int i10, Class cls, p pVar) {
        this.f28203a = i10;
        this.f28204b = cls;
        this.f28205c = pVar;
    }

    static final class e extends d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final e f28216d = new e(String.class);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final e f28217e = new e(Object.class);

        private e(Class cls) {
            super(-1, cls);
        }

        public static e h(Class cls) {
            return cls == String.class ? f28216d : cls == Object.class ? f28217e : new e(cls);
        }

        @Override // u6.d0, p6.q
        public Object a(String str, p6.h hVar) {
            return str;
        }
    }
}
