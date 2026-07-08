package a0;

import android.app.RemoteInput;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    static class a {
        public static RemoteInput a(t tVar) {
            throw null;
        }
    }

    static RemoteInput a(t tVar) {
        return a.a(tVar);
    }

    static RemoteInput[] b(t[] tVarArr) {
        if (tVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            t tVar = tVarArr[i10];
            remoteInputArr[i10] = a(null);
        }
        return remoteInputArr;
    }
}
