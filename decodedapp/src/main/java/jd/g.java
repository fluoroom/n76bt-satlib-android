package jd;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    private static final f a(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int b(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement c(a aVar) {
        String strC;
        rd.m.e(aVar, "<this>");
        f fVarA = a(aVar);
        if (fVarA == null || fVarA.v() < 1) {
            return null;
        }
        int iB = b(aVar);
        int i10 = iB < 0 ? -1 : fVarA.l()[iB];
        String strB = i.f18642a.b(aVar);
        if (strB == null) {
            strC = fVarA.c();
        } else {
            strC = strB + '/' + fVarA.c();
        }
        return new StackTraceElement(strC, fVarA.m(), fVarA.f(), i10);
    }
}
