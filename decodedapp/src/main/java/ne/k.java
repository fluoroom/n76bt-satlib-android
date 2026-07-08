package ne;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final g a(Annotation[] annotationArr, mf.c cVar) {
        Annotation annotation;
        rd.m.e(annotationArr, "<this>");
        rd.m.e(cVar, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (rd.m.a(f.e(pd.a.b(pd.a.a(annotation))).a(), cVar)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new g(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        rd.m.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new g(annotation));
        }
        return arrayList;
    }
}
