package ve;

import he.b;
import he.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(he.b bVar) {
        he.w wVarP0;
        if (bVar == null) {
            a(3);
        }
        if ((bVar instanceof y0) && (wVarP0 = ((y0) bVar).p0()) != null && wVarP0.getAnnotations().H(i0.f30589b)) {
            return true;
        }
        return bVar.getAnnotations().H(i0.f30589b);
    }

    public static boolean c(he.m mVar) {
        if (mVar == null) {
            a(1);
        }
        return qf.i.x(mVar) && qf.i.w(mVar.b()) && !d((he.e) mVar);
    }

    public static boolean d(he.e eVar) {
        if (eVar == null) {
            a(2);
        }
        return ee.e.a(ee.d.f11783a, eVar);
    }

    public static boolean e(y0 y0Var) {
        if (y0Var == null) {
            a(0);
        }
        if (y0Var.j() == b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(y0Var.b())) {
            return true;
        }
        return qf.i.x(y0Var.b()) && b(y0Var);
    }
}
