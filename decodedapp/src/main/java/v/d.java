package v;

import androidx.appcompat.widget.RtlSpacingHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.i;
import w.o;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f29320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f29321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f29322f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    s.i f29325i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet f29317a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29323g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f29324h = RtlSpacingHelper.UNDEFINED;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f29320d = eVar;
        this.f29321e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, RtlSpacingHelper.UNDEFINED, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z10 && !p(dVar)) {
            return false;
        }
        this.f29322f = dVar;
        if (dVar.f29317a == null) {
            dVar.f29317a = new HashSet();
        }
        HashSet hashSet = this.f29322f.f29317a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f29323g = i10;
        this.f29324h = i11;
        return true;
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f29317a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.i.a(((d) it.next()).f29320d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f29317a;
    }

    public int e() {
        if (this.f29319c) {
            return this.f29318b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f29320d.V() == 8) {
            return 0;
        }
        return (this.f29324h == Integer.MIN_VALUE || (dVar = this.f29322f) == null || dVar.f29320d.V() != 8) ? this.f29323g : this.f29324h;
    }

    public final d g() {
        switch (this.f29321e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f29320d.Q;
            case TOP:
                return this.f29320d.R;
            case RIGHT:
                return this.f29320d.O;
            case BOTTOM:
                return this.f29320d.P;
            default:
                throw new AssertionError(this.f29321e.name());
        }
    }

    public e h() {
        return this.f29320d;
    }

    public s.i i() {
        return this.f29325i;
    }

    public d j() {
        return this.f29322f;
    }

    public a k() {
        return this.f29321e;
    }

    public boolean l() {
        HashSet hashSet = this.f29317a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f29317a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f29319c;
    }

    public boolean o() {
        return this.f29322f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f29321e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarK == a.LEFT || aVarK == a.RIGHT;
                return dVar.h() instanceof h ? z10 || aVarK == a.CENTER_X : z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarK == a.TOP || aVarK == a.BOTTOM;
                return dVar.h() instanceof h ? z11 || aVarK == a.CENTER_Y : z11;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f29321e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        d dVar = this.f29322f;
        if (dVar != null && (hashSet = dVar.f29317a) != null) {
            hashSet.remove(this);
            if (this.f29322f.f29317a.size() == 0) {
                this.f29322f.f29317a = null;
            }
        }
        this.f29317a = null;
        this.f29322f = null;
        this.f29323g = 0;
        this.f29324h = RtlSpacingHelper.UNDEFINED;
        this.f29319c = false;
        this.f29318b = 0;
    }

    public void r() {
        this.f29319c = false;
        this.f29318b = 0;
    }

    public void s(s.c cVar) {
        s.i iVar = this.f29325i;
        if (iVar == null) {
            this.f29325i = new s.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.g();
        }
    }

    public void t(int i10) {
        this.f29318b = i10;
        this.f29319c = true;
    }

    public String toString() {
        return this.f29320d.t() + ":" + this.f29321e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f29324h = i10;
        }
    }
}
