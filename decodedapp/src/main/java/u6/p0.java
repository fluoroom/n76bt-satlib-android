package u6;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class p0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Object[] f28309f = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p0 f28310g = new p0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f28311e;

    public p0() {
        this(false);
    }

    private Object e1(e6.j jVar, p6.h hVar, int i10) {
        switch (i10) {
            case 6:
                return jVar.C0();
            case 7:
                return hVar.D0(p6.i.USE_BIG_INTEGER_FOR_INTS) ? jVar.r() : jVar.w0();
            case 8:
                return hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? jVar.W() : jVar.w0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jVar.h0();
            default:
                return hVar.q0(Y0(hVar), jVar);
        }
    }

    private Object f1(e6.j jVar, p6.h hVar, a aVar) {
        Object objC0;
        Object objC02;
        boolean zA0 = hVar.A0(c0.f28198c);
        boolean zD0 = hVar.D0(p6.i.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        a aVarJ = aVar;
        while (true) {
            if (aVarJ.m()) {
                String strV0 = jVar.V0();
                while (true) {
                    if (strV0 != null) {
                        e6.m mVarX0 = jVar.X0();
                        if (mVarX0 == null) {
                            mVarX0 = e6.m.NOT_AVAILABLE;
                        }
                        int iE = mVarX0.e();
                        if (iE == 1) {
                            aVarJ = aVarJ.f(strV0);
                        } else if (iE != 3) {
                            switch (iE) {
                                case 6:
                                    objC0 = jVar.C0();
                                    break;
                                case 7:
                                    objC0 = !zA0 ? jVar.w0() : R(jVar, hVar);
                                    break;
                                case 8:
                                    objC0 = !hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? jVar.w0() : jVar.W();
                                    break;
                                case 9:
                                    objC0 = Boolean.TRUE;
                                    break;
                                case 10:
                                    objC0 = Boolean.FALSE;
                                    break;
                                case 11:
                                    objC0 = null;
                                    break;
                                case 12:
                                    objC0 = jVar.h0();
                                    break;
                                default:
                                    return hVar.q0(Y0(hVar), jVar);
                            }
                            aVarJ.o(strV0, objC0);
                        } else {
                            aVarJ = aVarJ.d(strV0);
                        }
                        strV0 = jVar.V0();
                    } else {
                        if (aVarJ == aVar) {
                            return aVarJ.l();
                        }
                        aVarJ = aVarJ.j();
                    }
                }
            } else {
                while (true) {
                    e6.m mVarX02 = jVar.X0();
                    if (mVarX02 == null) {
                        mVarX02 = e6.m.NOT_AVAILABLE;
                    }
                    switch (mVarX02.e()) {
                        case 1:
                            aVarJ = aVarJ.e();
                            continue;
                        case 2:
                        case 5:
                        default:
                            return hVar.q0(Y0(hVar), jVar);
                        case 3:
                            aVarJ = aVarJ.c();
                            continue;
                        case 4:
                            if (aVarJ == aVar) {
                                return aVarJ.k(zD0);
                            }
                            aVarJ = aVarJ.i(zD0);
                            continue;
                            break;
                        case 6:
                            objC02 = jVar.C0();
                            break;
                        case 7:
                            objC02 = !zA0 ? jVar.w0() : R(jVar, hVar);
                            break;
                        case 8:
                            objC02 = !hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? jVar.w0() : jVar.W();
                            break;
                        case 9:
                            objC02 = Boolean.TRUE;
                            break;
                        case 10:
                            objC02 = Boolean.FALSE;
                            break;
                        case 11:
                            objC02 = null;
                            break;
                        case 12:
                            objC02 = jVar.h0();
                            break;
                    }
                    aVarJ.b(objC02);
                }
            }
        }
    }

    private Object g1(e6.j jVar, p6.h hVar) {
        Object objF1;
        a aVarS = a.s(hVar.C0(e6.q.DUPLICATE_PROPERTIES));
        String strL = jVar.l();
        while (strL != null) {
            e6.m mVarX0 = jVar.X0();
            if (mVarX0 == null) {
                mVarX0 = e6.m.NOT_AVAILABLE;
            }
            int iE = mVarX0.e();
            if (iE == 1) {
                objF1 = f1(jVar, hVar, aVarS.e());
            } else {
                if (iE == 2) {
                    return aVarS.l();
                }
                objF1 = iE != 3 ? e1(jVar, hVar, mVarX0.e()) : f1(jVar, hVar, aVarS.c());
            }
            aVarS.o(strL, objF1);
            strL = jVar.V0();
        }
        return aVarS.l();
    }

    public static p0 h1(boolean z10) {
        return z10 ? new p0(true) : f28310g;
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        switch (jVar.q()) {
            case 1:
                return f1(jVar, hVar, a.s(hVar.C0(e6.q.DUPLICATE_PROPERTIES)));
            case 2:
                return a.h();
            case 3:
                return f1(jVar, hVar, a.r());
            case 4:
            default:
                return hVar.q0(Y0(hVar), jVar);
            case 5:
                return g1(jVar, hVar);
            case 6:
                return jVar.C0();
            case 7:
                return hVar.A0(c0.f28198c) ? R(jVar, hVar) : jVar.w0();
            case 8:
                return hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? jVar.W() : jVar.w0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jVar.h0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r5.X0() == e6.m.END_OBJECT) goto L28;
     */
    @Override // p6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(e6.j r5, p6.h r6, java.lang.Object r7) {
        /*
            r4 = this;
            boolean r0 = r4.f28311e
            if (r0 == 0) goto L9
            java.lang.Object r5 = r4.e(r5, r6)
            return r5
        L9:
            int r0 = r5.q()
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L45
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L45
            r1 = 5
            if (r0 == r1) goto L46
            goto L6f
        L1d:
            e6.m r0 = r5.X0()
            e6.m r1 = e6.m.END_ARRAY
            if (r0 != r1) goto L26
            goto L45
        L26:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
        L2d:
            java.lang.Object r1 = r4.e(r5, r6)
            r0.add(r1)
            e6.m r1 = r5.X0()
            e6.m r2 = e6.m.END_ARRAY
            if (r1 != r2) goto L2d
            return r7
        L3d:
            e6.m r0 = r5.X0()
            e6.m r1 = e6.m.END_OBJECT
            if (r0 != r1) goto L46
        L45:
            return r7
        L46:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r5.l()
        L51:
            r5.X0()
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L5f
            java.lang.Object r3 = r4.f(r5, r6, r2)
            goto L63
        L5f:
            java.lang.Object r3 = r4.e(r5, r6)
        L63:
            if (r3 == r2) goto L68
            r0.put(r1, r3)
        L68:
            java.lang.String r1 = r5.V0()
            if (r1 != 0) goto L51
            return r7
        L6f:
            java.lang.Object r5 = r4.e(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.p0.f(e6.j, p6.h, java.lang.Object):java.lang.Object");
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        int iQ = jVar.q();
        return (iQ == 1 || iQ == 3 || iQ == 5) ? eVar.c(jVar, hVar) : e1(jVar, hVar, jVar.q());
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Untyped;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        if (this.f28311e) {
            return Boolean.FALSE;
        }
        return null;
    }

    protected p0(boolean z10) {
        super(Object.class);
        this.f28311e = z10;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f28312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f28313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f28315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f28316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f28317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f28318g;

        private a(a aVar) {
            this.f28312a = aVar;
            this.f28314c = false;
            this.f28315d = false;
        }

        private void a(String str, Object obj) {
            Map map = this.f28317f;
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f28317f = linkedHashMap;
                linkedHashMap.put(str, obj);
                return;
            }
            Object objPut = map.put(str, obj);
            if (objPut != null) {
                if (objPut instanceof List) {
                    ((List) objPut).add(obj);
                    this.f28317f.put(str, objPut);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objPut);
                    arrayList.add(obj);
                    this.f28317f.put(str, arrayList);
                }
            }
        }

        public static List g() {
            return new ArrayList(2);
        }

        public static Map h() {
            return new LinkedHashMap(2);
        }

        private a p() {
            this.f28314c = false;
            return this;
        }

        private a q(boolean z10) {
            this.f28314c = true;
            this.f28315d = z10;
            return this;
        }

        public static a r() {
            return new a(null);
        }

        public static a s(boolean z10) {
            return new a(null, true, z10);
        }

        public void b(Object obj) {
            if (this.f28318g == null) {
                this.f28318g = new ArrayList();
            }
            this.f28318g.add(obj);
        }

        public a c() {
            a aVar = this.f28313b;
            return aVar == null ? new a(this) : aVar.p();
        }

        public a d(String str) {
            this.f28316e = str;
            a aVar = this.f28313b;
            return aVar == null ? new a(this) : aVar.p();
        }

        public a e() {
            a aVar = this.f28313b;
            return aVar == null ? new a(this, true, this.f28315d) : aVar.q(this.f28315d);
        }

        public a f(String str) {
            this.f28316e = str;
            a aVar = this.f28313b;
            return aVar == null ? new a(this, true, this.f28315d) : aVar.q(this.f28315d);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public a i(boolean z10) {
            Object objG;
            List list = this.f28318g;
            Object array = list;
            if (list == null) {
                objG = z10 ? p0.f28309f : g();
            } else {
                if (z10) {
                    array = list.toArray(p0.f28309f);
                }
                this.f28318g = null;
                objG = array;
            }
            if (this.f28312a.m()) {
                return this.f28312a.n(objG);
            }
            this.f28312a.b(objG);
            return this.f28312a;
        }

        public a j() {
            Object linkedHashMap = this.f28317f;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                this.f28317f = null;
            }
            if (this.f28312a.m()) {
                return this.f28312a.n(linkedHashMap);
            }
            this.f28312a.b(linkedHashMap);
            return this.f28312a;
        }

        public Object k(boolean z10) {
            List list = this.f28318g;
            return list == null ? z10 ? p0.f28309f : g() : z10 ? list.toArray(p0.f28309f) : list;
        }

        public Object l() {
            Map map = this.f28317f;
            return map == null ? h() : map;
        }

        public boolean m() {
            return this.f28314c;
        }

        public a n(Object obj) {
            String str = this.f28316e;
            Objects.requireNonNull(str);
            this.f28316e = null;
            if (this.f28315d) {
                a(str, obj);
                return this;
            }
            if (this.f28317f == null) {
                this.f28317f = new LinkedHashMap();
            }
            this.f28317f.put(str, obj);
            return this;
        }

        public void o(String str, Object obj) {
            if (this.f28315d) {
                a(str, obj);
                return;
            }
            if (this.f28317f == null) {
                this.f28317f = new LinkedHashMap();
            }
            this.f28317f.put(str, obj);
        }

        private a(a aVar, boolean z10, boolean z11) {
            this.f28312a = aVar;
            this.f28314c = z10;
            this.f28315d = z11;
        }
    }
}
