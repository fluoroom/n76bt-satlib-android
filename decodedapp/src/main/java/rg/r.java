package rg;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static void a(Appendable appendable, Object obj, qd.l lVar) throws IOException {
        rd.m.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.l(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
