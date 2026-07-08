package u6;

import com.fasterxml.jackson.databind.JavaType;
import s6.w;

/* JADX INFO: loaded from: classes.dex */
public class r extends w.a {
    public r() {
        super(e6.h.class);
    }

    private static final int R(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }

    private static final long S(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    private static s6.j T(String str, JavaType javaType, int i10) {
        return s6.j.b0(p6.y.a(str), javaType, null, null, null, null, i10, null, p6.x.f24067h);
    }

    @Override // s6.w
    public s6.u[] O(p6.g gVar) {
        JavaType javaTypeE = gVar.e(Integer.TYPE);
        JavaType javaTypeE2 = gVar.e(Long.TYPE);
        return new s6.u[]{T("sourceRef", gVar.e(Object.class), 0), T("byteOffset", javaTypeE2, 1), T("charOffset", javaTypeE2, 2), T("lineNr", javaTypeE, 3), T("columnNr", javaTypeE, 4)};
    }

    @Override // s6.w
    public boolean g() {
        return true;
    }

    @Override // s6.w
    public Object v(p6.h hVar, Object[] objArr) {
        return new e6.h(i6.e.p(objArr[0]), S(objArr[1]), S(objArr[2]), R(objArr[3]), R(objArr[4]));
    }
}
