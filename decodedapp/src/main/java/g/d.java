package g;

import android.content.Context;
import android.content.Intent;
import dd.q;
import dd.w;
import ed.j;
import ed.k0;
import g.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13342a = new a(null);

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            m.e(strArr, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            m.d(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // g.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        m.e(context, "context");
        m.e(strArr, "input");
        return f13342a.a(strArr);
    }

    @Override // g.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.C0189a b(Context context, String[] strArr) {
        m.e(context, "context");
        m.e(strArr, "input");
        if (strArr.length == 0) {
            return new a.C0189a(k0.i());
        }
        for (String str : strArr) {
            if (b0.b.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(k0.e(strArr.length), 16));
        for (String str2 : strArr) {
            q qVarA = w.a(str2, Boolean.TRUE);
            linkedHashMap.put(qVarA.c(), qVarA.d());
        }
        return new a.C0189a(linkedHashMap);
    }

    @Override // g.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 != -1) {
            return k0.i();
        }
        if (intent == null) {
            return k0.i();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return k0.i();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return k0.r(ed.q.Q0(j.B(stringArrayExtra), arrayList));
    }
}
