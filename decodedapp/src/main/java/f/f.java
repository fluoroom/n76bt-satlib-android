package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import qg.k;
import rd.h0;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f12738h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f12739a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f12740b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f12741c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f12742d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f12743e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f12744f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f12745g = new Bundle();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f.b f12746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g.a f12747b;

        public a(f.b bVar, g.a aVar) {
            m.e(bVar, "callback");
            m.e(aVar, "contract");
            this.f12746a = bVar;
            this.f12747b = aVar;
        }

        public final f.b a() {
            return this.f12746a;
        }

        public final g.a b() {
            return this.f12747b;
        }
    }

    private static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.m f12748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f12749b;

        public c(androidx.lifecycle.m mVar) {
            m.e(mVar, "lifecycle");
            this.f12748a = mVar;
            this.f12749b = new ArrayList();
        }

        public final void a(q qVar) {
            m.e(qVar, "observer");
            this.f12748a.a(qVar);
            this.f12749b.add(qVar);
        }

        public final void b() {
            Iterator it = this.f12749b.iterator();
            while (it.hasNext()) {
                this.f12748a.d((q) it.next());
            }
            this.f12749b.clear();
        }
    }

    public static final class d extends f.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.a f12752c;

        d(String str, g.a aVar) {
            this.f12751b = str;
            this.f12752c = aVar;
        }

        @Override // f.c
        public void b(Object obj, a0.c cVar) throws Exception {
            Object obj2 = f.this.f12740b.get(this.f12751b);
            g.a aVar = this.f12752c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                f.this.f12742d.add(this.f12751b);
                try {
                    f.this.k(iIntValue, this.f12752c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f12742d.remove(this.f12751b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.c
        public void c() {
            f.this.r(this.f12751b);
        }
    }

    public static final class e extends f.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.a f12755c;

        e(String str, g.a aVar) {
            this.f12754b = str;
            this.f12755c = aVar;
        }

        @Override // f.c
        public void b(Object obj, a0.c cVar) throws Exception {
            Object obj2 = f.this.f12740b.get(this.f12754b);
            g.a aVar = this.f12755c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                f.this.f12742d.add(this.f12754b);
                try {
                    f.this.k(iIntValue, this.f12755c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f12742d.remove(this.f12754b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.c
        public void c() {
            f.this.r(this.f12754b);
        }
    }

    private final void e(int i10, String str) {
        this.f12739a.put(Integer.valueOf(i10), str);
        this.f12740b.put(str, Integer.valueOf(i10));
    }

    private final void h(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f12742d.contains(str)) {
            this.f12744f.remove(str);
            this.f12745g.putParcelable(str, new f.a(i10, intent));
        } else {
            aVar.a().a(aVar.b().c(i10, intent));
            this.f12742d.remove(str);
        }
    }

    private final int i() {
        for (Number number : k.o(new qd.a() { // from class: f.e
            @Override // qd.a
            public final Object a() {
                return f.j();
            }
        })) {
            if (!this.f12739a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer j() {
        return Integer.valueOf(vd.c.f30542a.b(2147418112) + WXMediaMessage.THUMB_LENGTH_LIMIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(f fVar, String str, f.b bVar, g.a aVar, t tVar, m.a aVar2) {
        rd.m.e(tVar, "<unused var>");
        rd.m.e(aVar2, "event");
        if (m.a.ON_START != aVar2) {
            if (m.a.ON_STOP == aVar2) {
                fVar.f12743e.remove(str);
                return;
            } else {
                if (m.a.ON_DESTROY == aVar2) {
                    fVar.r(str);
                    return;
                }
                return;
            }
        }
        fVar.f12743e.put(str, new a(bVar, aVar));
        if (fVar.f12744f.containsKey(str)) {
            Object obj = fVar.f12744f.get(str);
            fVar.f12744f.remove(str);
            bVar.a(obj);
        }
        f.a aVar3 = (f.a) i0.b.a(fVar.f12745g, str, f.a.class);
        if (aVar3 != null) {
            fVar.f12745g.remove(str);
            bVar.a(aVar.c(aVar3.c(), aVar3.b()));
        }
    }

    private final void q(String str) {
        if (((Integer) this.f12740b.get(str)) != null) {
            return;
        }
        e(i(), str);
    }

    public final boolean f(int i10, int i11, Intent intent) {
        String str = (String) this.f12739a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        h(str, i11, intent, (a) this.f12743e.get(str));
        return true;
    }

    public final boolean g(int i10, Object obj) {
        String str = (String) this.f12739a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f12743e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f12745g.remove(str);
            this.f12744f.put(str, obj);
            return true;
        }
        f.b bVarA = aVar.a();
        rd.m.c(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f12742d.remove(str)) {
            return true;
        }
        bVarA.a(obj);
        return true;
    }

    public abstract void k(int i10, g.a aVar, Object obj, a0.c cVar);

    public final void l(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f12742d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f12745g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f12740b.containsKey(str)) {
                Integer num = (Integer) this.f12740b.remove(str);
                if (!this.f12745g.containsKey(str)) {
                    h0.a(this.f12739a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            rd.m.d(num2, "get(...)");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            rd.m.d(str2, "get(...)");
            e(iIntValue, str2);
        }
    }

    public final void m(Bundle bundle) {
        rd.m.e(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f12740b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f12740b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f12742d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f12745g));
    }

    public final f.c n(final String str, t tVar, final g.a aVar, final f.b bVar) {
        rd.m.e(str, "key");
        rd.m.e(tVar, "lifecycleOwner");
        rd.m.e(aVar, "contract");
        rd.m.e(bVar, "callback");
        androidx.lifecycle.m mVarS0 = tVar.S0();
        if (mVarS0.b().d(m.b.f2654d)) {
            throw new IllegalStateException(("LifecycleOwner " + tVar + " is attempting to register while current state is " + mVarS0.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        q(str);
        c cVar = (c) this.f12741c.get(str);
        if (cVar == null) {
            cVar = new c(mVarS0);
        }
        cVar.a(new q() { // from class: f.d
            @Override // androidx.lifecycle.q
            public final void k(t tVar2, m.a aVar2) {
                f.p(this.f12734a, str, bVar, aVar, tVar2, aVar2);
            }
        });
        this.f12741c.put(str, cVar);
        return new d(str, aVar);
    }

    public final f.c o(String str, g.a aVar, f.b bVar) {
        rd.m.e(str, "key");
        rd.m.e(aVar, "contract");
        rd.m.e(bVar, "callback");
        q(str);
        this.f12743e.put(str, new a(bVar, aVar));
        if (this.f12744f.containsKey(str)) {
            Object obj = this.f12744f.get(str);
            this.f12744f.remove(str);
            bVar.a(obj);
        }
        f.a aVar2 = (f.a) i0.b.a(this.f12745g, str, f.a.class);
        if (aVar2 != null) {
            this.f12745g.remove(str);
            bVar.a(aVar.c(aVar2.c(), aVar2.b()));
        }
        return new e(str, aVar);
    }

    public final void r(String str) {
        Integer num;
        rd.m.e(str, "key");
        if (!this.f12742d.contains(str) && (num = (Integer) this.f12740b.remove(str)) != null) {
            this.f12739a.remove(num);
        }
        this.f12743e.remove(str);
        if (this.f12744f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f12744f.get(str));
            this.f12744f.remove(str);
        }
        if (this.f12745g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((f.a) i0.b.a(this.f12745g, str, f.a.class)));
            this.f12745g.remove(str);
        }
        c cVar = (c) this.f12741c.get(str);
        if (cVar != null) {
            cVar.b();
            this.f12741c.remove(str);
        }
    }
}
