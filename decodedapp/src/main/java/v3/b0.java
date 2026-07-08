package v3;

import android.content.Context;
import android.os.Build;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Hashtable f29545a = new Hashtable();

    public static boolean a(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        for (String str : strArr) {
            Hashtable hashtable = f29545a;
            Integer numValueOf = (Integer) hashtable.get(str);
            if (numValueOf == null || numValueOf.intValue() == -1) {
                numValueOf = Integer.valueOf(context.checkSelfPermission(str));
                hashtable.put(str, numValueOf);
            }
            if (numValueOf.intValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
