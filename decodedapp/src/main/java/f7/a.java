package f7;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class a extends e7.s {
    protected final String D;

    protected a(String str, x6.u uVar, i7.b bVar, JavaType javaType) {
        this(str, uVar, bVar, javaType, uVar.j());
    }

    public static a R(String str, x6.u uVar, i7.b bVar, JavaType javaType) {
        return new a(str, uVar, bVar, javaType);
    }

    @Override // e7.s
    protected Object O(Object obj, e6.g gVar, d0 d0Var) {
        return d0Var.j0(this.D);
    }

    @Override // e7.s
    public e7.s Q(r6.q qVar, x6.d dVar, x6.u uVar, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }

    protected a(String str, x6.u uVar, i7.b bVar, JavaType javaType, r.b bVar2) {
        super(uVar, bVar, javaType, null, null, null, bVar2, null);
        this.D = str;
    }
}
