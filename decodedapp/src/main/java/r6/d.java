package r6;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f25496e = h7.c.values().length;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f25497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final s f25498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected s[] f25499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Map f25500d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25501a;

        static {
            int[] iArr = new int[e.values().length];
            f25501a = iArr;
            try {
                iArr[e.EmptyArray.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25501a[e.Float.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25501a[e.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d() {
        this(b.TryConvert, new s(), null, null);
    }

    protected boolean a(h7.c cVar) {
        return cVar == h7.c.Float || cVar == h7.c.Integer || cVar == h7.c.Boolean || cVar == h7.c.DateTime;
    }

    public b b(p6.g gVar, h7.c cVar, Class cls, e eVar) {
        s sVar;
        b bVarA;
        s sVar2;
        b bVarA2;
        Map map = this.f25500d;
        if (map != null && cls != null && (sVar2 = (s) map.get(cls)) != null && (bVarA2 = sVar2.a(eVar)) != null) {
            return bVarA2;
        }
        s[] sVarArr = this.f25499c;
        if (sVarArr != null && cVar != null && (sVar = sVarArr[cVar.ordinal()]) != null && (bVarA = sVar.a(eVar)) != null) {
            return bVarA;
        }
        b bVarA3 = this.f25498b.a(eVar);
        if (bVarA3 != null) {
            return bVarA3;
        }
        int i10 = a.f25501a[eVar.ordinal()];
        if (i10 == 1) {
            return gVar.x0(p6.i.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? b.AsNull : b.Fail;
        }
        if (i10 != 2) {
            if (i10 == 3 && cVar == h7.c.Enum && gVar.x0(p6.i.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return b.Fail;
            }
        } else if (cVar == h7.c.Integer) {
            return gVar.x0(p6.i.ACCEPT_FLOAT_AS_INT) ? b.TryConvert : b.Fail;
        }
        boolean zA = a(cVar);
        return (!zA || gVar.L(p6.r.ALLOW_COERCION_OF_SCALARS) || (cVar == h7.c.Float && eVar == e.Integer)) ? eVar == e.EmptyString ? (zA || gVar.x0(p6.i.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) ? b.AsNull : cVar == h7.c.OtherScalar ? b.TryConvert : b.Fail : this.f25497a : b.Fail;
    }

    public b c(p6.g gVar, h7.c cVar, Class cls, b bVar) {
        Boolean boolB;
        b bVarA;
        s sVar;
        s sVar2;
        Map map = this.f25500d;
        if (map == null || cls == null || (sVar2 = (s) map.get(cls)) == null) {
            boolB = null;
            bVarA = null;
        } else {
            boolB = sVar2.b();
            bVarA = sVar2.a(e.EmptyString);
        }
        s[] sVarArr = this.f25499c;
        if (sVarArr != null && cVar != null && (sVar = sVarArr[cVar.ordinal()]) != null) {
            if (boolB == null) {
                boolB = sVar.b();
            }
            if (bVarA == null) {
                bVarA = sVar.a(e.EmptyString);
            }
        }
        if (boolB == null) {
            boolB = this.f25498b.b();
        }
        if (bVarA == null) {
            bVarA = this.f25498b.a(e.EmptyString);
        }
        if (!Boolean.FALSE.equals(boolB)) {
            if (bVarA != null) {
                return bVarA;
            }
            if (a(cVar)) {
                return b.AsNull;
            }
            if (gVar.x0(p6.i.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return b.AsNull;
            }
        }
        return bVar;
    }

    protected d(b bVar, s sVar, s[] sVarArr, Map map) {
        this.f25498b = sVar;
        this.f25497a = bVar;
        this.f25499c = sVarArr;
        this.f25500d = map;
    }
}
