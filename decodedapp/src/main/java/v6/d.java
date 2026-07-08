package v6;

import com.fasterxml.jackson.databind.JavaType;
import p6.y;

/* JADX INFO: loaded from: classes.dex */
public class d extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final y f30317e;

    protected d(p6.h hVar, String str, y yVar) {
        super(hVar.i0(), str);
        this.f30317e = yVar;
    }

    public static d z(p6.h hVar, y yVar, JavaType javaType) {
        d dVar = new d(hVar, String.format("Invalid `null` value encountered for property %s", i7.h.d0(yVar, "<UNKNOWN>")), yVar);
        if (javaType != null) {
            dVar.x(javaType);
        }
        return dVar;
    }
}
