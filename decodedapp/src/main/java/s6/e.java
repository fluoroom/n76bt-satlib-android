package s6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p6.y;
import q6.f;
import t6.e0;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.g f26924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p6.h f26925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p6.c f26926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Map f26927d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List f26928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected HashMap f26929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected HashSet f26930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected HashSet f26931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected w f26932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected t6.s f26933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected t f26934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f26935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected x6.l f26936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected f.a f26937n;

    public e(p6.c cVar, p6.h hVar) {
        this.f26926c = cVar;
        this.f26925b = hVar;
        this.f26924a = hVar.k();
    }

    public void A(x6.l lVar, f.a aVar) {
        this.f26936m = lVar;
        this.f26937n = aVar;
    }

    public void B(w wVar) {
        this.f26932i = wVar;
    }

    protected Map a(Collection collection) {
        p6.b bVarG = this.f26924a.g();
        HashMap map = null;
        if (bVarG != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                List listR = bVarG.R(uVar.h());
                if (listR != null && !listR.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(uVar.getName(), listR);
                }
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }

    protected boolean b() {
        Boolean boolE = this.f26926c.g(null).e(k.a.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        return boolE == null ? this.f26924a.L(p6.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : boolE.booleanValue();
    }

    protected void c(Collection collection) throws p6.f {
        if (this.f26924a.b()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ((u) it.next()).q(this.f26924a);
                } catch (IllegalArgumentException e10) {
                    d(e10);
                }
            }
        }
        t tVar = this.f26934k;
        if (tVar != null) {
            try {
                tVar.h(this.f26924a);
            } catch (IllegalArgumentException e11) {
                d(e11);
            }
        }
        x6.l lVar = this.f26936m;
        if (lVar != null) {
            try {
                lVar.i(this.f26924a.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e12) {
                d(e12);
            }
        }
    }

    protected void d(IllegalArgumentException illegalArgumentException) throws p6.f {
        try {
            this.f26925b.O0(this.f26926c, illegalArgumentException.getMessage(), new Object[0]);
        } catch (p6.f e10) {
            if (e10.getCause() == null) {
                e10.initCause(illegalArgumentException);
            }
            throw e10;
        }
    }

    public void e(String str, u uVar) {
        if (this.f26929f == null) {
            this.f26929f = new HashMap(4);
        }
        if (this.f26924a.b()) {
            try {
                uVar.q(this.f26924a);
            } catch (IllegalArgumentException e10) {
                d(e10);
            }
        }
        this.f26929f.put(str, uVar);
    }

    public void f(u uVar) {
        k(uVar);
    }

    public void g(String str) {
        if (this.f26930g == null) {
            this.f26930g = new HashSet();
        }
        this.f26930g.add(str);
    }

    public void h(String str) {
        if (this.f26931h == null) {
            this.f26931h = new HashSet();
        }
        this.f26931h.add(str);
    }

    public void i(y yVar, JavaType javaType, i7.b bVar, x6.k kVar, Object obj) {
        if (this.f26928e == null) {
            this.f26928e = new ArrayList();
        }
        if (this.f26924a.b()) {
            try {
                kVar.i(this.f26924a.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e10) {
                d(e10);
            }
        }
        this.f26928e.add(new e0(yVar, javaType, kVar, obj));
    }

    public void j(u uVar, boolean z10) {
        this.f26927d.put(uVar.getName(), uVar);
    }

    public void k(u uVar) {
        u uVar2 = (u) this.f26927d.put(uVar.getName(), uVar);
        if (uVar2 == null || uVar2 == uVar) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + uVar.getName() + "' for " + this.f26926c.z());
    }

    public p6.l l() {
        boolean z10;
        Collection collectionValues = this.f26927d.values();
        c(collectionValues);
        t6.c cVarL = t6.c.l(this.f26924a, collectionValues, a(collectionValues), b());
        cVarL.j();
        boolean zL = this.f26924a.L(p6.r.DEFAULT_VIEW_INCLUSION);
        boolean z11 = !zL;
        if (zL) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((u) it.next()).D()) {
                    z10 = true;
                    break;
                }
            }
            z10 = z11;
        } else {
            z10 = z11;
        }
        if (this.f26933j != null) {
            cVarL = cVarL.L(new t6.u(this.f26933j, p6.x.f24067h));
        }
        return new c(this, this.f26926c, cVarL, this.f26929f, this.f26930g, this.f26935l, this.f26931h, z10);
    }

    public a m() {
        return new a(this, this.f26926c, this.f26929f, this.f26927d);
    }

    public p6.l n(JavaType javaType, String str) {
        x6.l lVar = this.f26936m;
        boolean z10 = true;
        if (lVar != null) {
            Class<?> clsL = lVar.L();
            Class clsR = javaType.r();
            if (clsL != clsR && !clsL.isAssignableFrom(clsR) && !clsR.isAssignableFrom(clsL)) {
                this.f26925b.q(this.f26926c.z(), String.format("Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)", this.f26936m.l(), i7.h.y(clsL), i7.h.G(javaType)));
            }
        } else if (!str.isEmpty()) {
            this.f26925b.q(this.f26926c.z(), String.format("Builder class %s does not have build method (name: '%s')", i7.h.G(this.f26926c.z()), str));
        }
        Collection collectionValues = this.f26927d.values();
        c(collectionValues);
        t6.c cVarL = t6.c.l(this.f26924a, collectionValues, a(collectionValues), b());
        cVarL.j();
        boolean zL = this.f26924a.L(p6.r.DEFAULT_VIEW_INCLUSION);
        boolean z11 = !zL;
        if (zL) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((u) it.next()).D()) {
                    break;
                }
            }
            z10 = z11;
        } else {
            z10 = z11;
        }
        if (this.f26933j != null) {
            cVarL = cVarL.L(new t6.u(this.f26933j, p6.x.f24067h));
        }
        return o(javaType, cVarL, z10);
    }

    protected p6.l o(JavaType javaType, t6.c cVar, boolean z10) {
        return new h(this, this.f26926c, javaType, cVar, this.f26929f, this.f26930g, this.f26935l, this.f26931h, z10);
    }

    public u p(y yVar) {
        return (u) this.f26927d.get(yVar.c());
    }

    public t q() {
        return this.f26934k;
    }

    public x6.l r() {
        return this.f26936m;
    }

    public List s() {
        return this.f26928e;
    }

    public t6.s t() {
        return this.f26933j;
    }

    public Iterator u() {
        return this.f26927d.values().iterator();
    }

    public w v() {
        return this.f26932i;
    }

    public boolean w(String str) {
        return i7.o.c(str, this.f26930g, this.f26931h);
    }

    public void x(t tVar) {
        if (this.f26934k != null && tVar != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.f26934k = tVar;
    }

    public void y(boolean z10) {
        this.f26935l = z10;
    }

    public void z(t6.s sVar) {
        this.f26933j = sVar;
    }
}
