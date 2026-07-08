package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f3467b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3466a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f3468c = new ArrayList();

    public z(View view) {
        this.f3467b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f3467b == zVar.f3467b && this.f3466a.equals(zVar.f3466a);
    }

    public int hashCode() {
        return (this.f3467b.hashCode() * 31) + this.f3466a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3467b + "\n") + "    values:";
        for (String str2 : this.f3466a.keySet()) {
            str = str + "    " + str2 + ": " + this.f3466a.get(str2) + "\n";
        }
        return str;
    }
}
