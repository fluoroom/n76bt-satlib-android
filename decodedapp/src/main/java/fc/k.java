package fc;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f12919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fc.a f12921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f12925g;

    class a implements fc.a, g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f12926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C0177a f12927b;

        /* JADX INFO: renamed from: fc.k$a$a, reason: collision with other inner class name */
        class C0177a implements i {
            C0177a() {
            }

            @Override // fc.i
            public void a(Object obj) {
                if (a.this.f12926a.a()) {
                    return;
                }
                try {
                    k.this.f12921c.Q0(obj);
                } catch (Error | RuntimeException e10) {
                    a.this.e(e10, "Observer failed without an ErrorObserver set");
                }
            }
        }

        public a(e eVar) {
            this.f12926a = eVar;
            if (k.this.f12925g != null) {
                this.f12927b = new C0177a();
                k.b(k.this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Throwable th2, String str) {
            k.b(k.this);
            RuntimeException runtimeException = new RuntimeException(str, th2);
            runtimeException.printStackTrace();
            throw runtimeException;
        }

        @Override // fc.a
        public void Q0(Object obj) {
            k.c(k.this);
            d(obj);
        }

        @Override // fc.g
        public fc.a a() {
            return k.this.f12921c;
        }

        void d(Object obj) {
            if (this.f12926a.a()) {
                return;
            }
            if (k.this.f12925g != null) {
                k.this.f12925g.a(this.f12927b, obj);
                return;
            }
            try {
                k.this.f12921c.Q0(obj);
            } catch (Error | RuntimeException e10) {
                e(e10, "Observer failed without an ErrorObserver set");
            }
        }
    }

    public k(b bVar, Object obj) {
        this.f12919a = bVar;
        this.f12920b = obj;
    }

    static /* synthetic */ h b(k kVar) {
        kVar.getClass();
        return null;
    }

    static /* synthetic */ f c(k kVar) {
        kVar.getClass();
        return null;
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
    public d e(fc.a aVar) {
        l lVar;
        if (this.f12922d) {
            lVar = new l(aVar);
            aVar = lVar;
        } else {
            lVar = null;
        }
        this.f12921c = aVar;
        e eVar = new e(this.f12919a, this.f12920b, aVar);
        if (lVar != null) {
            lVar.b(eVar);
        }
        if (this.f12925g != null) {
            aVar = new a(eVar);
        }
        if (this.f12923e) {
            if (this.f12924f) {
                throw new IllegalStateException("Illegal combination of single() and onlyChanges()");
            }
            this.f12919a.b(aVar, this.f12920b);
            return eVar;
        }
        this.f12919a.c(aVar, this.f12920b);
        if (!this.f12924f) {
            this.f12919a.b(aVar, this.f12920b);
        }
        return eVar;
    }

    public k f(j jVar) {
        if (this.f12925g != null) {
            throw new IllegalStateException("Only one scheduler allowed");
        }
        this.f12925g = jVar;
        return this;
    }

    public k g() {
        this.f12924f = true;
        return this;
    }

    public k h() {
        this.f12922d = true;
        return this;
    }
}
