package z9;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements com.google.gson.y, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f33049g = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f33050a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33051b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33052c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f33054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f33055f;

    class a extends com.google.gson.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile com.google.gson.x f33056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f33057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f33059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TypeToken f33060e;

        a(boolean z10, boolean z11, com.google.gson.f fVar, TypeToken typeToken) {
            this.f33057b = z10;
            this.f33058c = z11;
            this.f33059d = fVar;
            this.f33060e = typeToken;
        }

        private com.google.gson.x e() {
            com.google.gson.x xVar = this.f33056a;
            if (xVar != null) {
                return xVar;
            }
            com.google.gson.x xVarN = this.f33059d.n(u.this, this.f33060e);
            this.f33056a = xVarN;
            return xVarN;
        }

        @Override // com.google.gson.x
        public Object b(ca.a aVar) throws IOException {
            if (!this.f33057b) {
                return e().b(aVar);
            }
            aVar.K0();
            return null;
        }

        @Override // com.google.gson.x
        public void d(ca.c cVar, Object obj) throws IOException {
            if (this.f33058c) {
                cVar.S();
            } else {
                e().d(cVar, obj);
            }
        }
    }

    public u() {
        List list = Collections.EMPTY_LIST;
        this.f33054e = list;
        this.f33055f = list;
    }

    private static boolean g(Class cls) {
        return cls.isMemberClass() && !ba.a.n(cls);
    }

    private boolean h(y9.d dVar) {
        if (dVar != null) {
            return this.f33050a >= dVar.value();
        }
        return true;
    }

    private boolean i(y9.e eVar) {
        if (eVar != null) {
            return this.f33050a < eVar.value();
        }
        return true;
    }

    private boolean j(y9.d dVar, y9.e eVar) {
        return h(dVar) && i(eVar);
    }

    @Override // com.google.gson.y
    public com.google.gson.x a(com.google.gson.f fVar, TypeToken typeToken) {
        Class clsC = typeToken.c();
        boolean zD = d(clsC, true);
        boolean zD2 = d(clsC, false);
        if (zD || zD2) {
            return new a(zD2, zD, fVar, typeToken);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u clone() {
        try {
            return (u) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(Class cls, boolean z10) {
        if (this.f33050a != -1.0d && !j((y9.d) cls.getAnnotation(y9.d.class), (y9.e) cls.getAnnotation(y9.e.class))) {
            return true;
        }
        if (!this.f33052c && g(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && ba.a.l(cls)) {
            return true;
        }
        Iterator it = (z10 ? this.f33054e : this.f33055f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public boolean f(Field field, boolean z10) {
        y9.a aVar;
        if ((this.f33051b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f33050a != -1.0d && !j((y9.d) field.getAnnotation(y9.d.class), (y9.e) field.getAnnotation(y9.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f33053d && ((aVar = (y9.a) field.getAnnotation(y9.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) || d(field.getType(), z10)) {
            return true;
        }
        List list = z10 ? this.f33054e : this.f33055f;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
