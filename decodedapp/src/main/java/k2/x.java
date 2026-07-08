package k2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class x implements i2.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e3.h f19126j = new e3.h(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.b f19127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i2.f f19128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i2.f f19129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f19132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i2.h f19133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i2.l f19134i;

    x(l2.b bVar, i2.f fVar, i2.f fVar2, int i10, int i11, i2.l lVar, Class cls, i2.h hVar) {
        this.f19127b = bVar;
        this.f19128c = fVar;
        this.f19129d = fVar2;
        this.f19130e = i10;
        this.f19131f = i11;
        this.f19134i = lVar;
        this.f19132g = cls;
        this.f19133h = hVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private byte[] c() {
        e3.h hVar = f19126j;
        byte[] bArr = (byte[]) hVar.g(this.f19132g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f19132g.getName().getBytes(i2.f.f15750a);
        hVar.k(this.f19132g, bytes);
        return bytes;
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f19127b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f19130e).putInt(this.f19131f).array();
        this.f19129d.a(messageDigest);
        this.f19128c.a(messageDigest);
        messageDigest.update(bArr);
        i2.l lVar = this.f19134i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f19133h.a(messageDigest);
        messageDigest.update(c());
        this.f19127b.put(bArr);
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f19131f == xVar.f19131f && this.f19130e == xVar.f19130e && e3.l.d(this.f19134i, xVar.f19134i) && this.f19132g.equals(xVar.f19132g) && this.f19128c.equals(xVar.f19128c) && this.f19129d.equals(xVar.f19129d) && this.f19133h.equals(xVar.f19133h)) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        int iHashCode = (((((this.f19128c.hashCode() * 31) + this.f19129d.hashCode()) * 31) + this.f19130e) * 31) + this.f19131f;
        i2.l lVar = this.f19134i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return (((iHashCode * 31) + this.f19132g.hashCode()) * 31) + this.f19133h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f19128c + ", signature=" + this.f19129d + ", width=" + this.f19130e + ", height=" + this.f19131f + ", decodedResourceClass=" + this.f19132g + ", transformation='" + this.f19134i + "', options=" + this.f19133h + '}';
    }
}
