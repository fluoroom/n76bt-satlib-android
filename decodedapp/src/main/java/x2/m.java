package x2;

import android.content.Context;
import androidx.fragment.app.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x2.o;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a */
    final Map f31557a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final o.b f31558b;

    private final class b implements p {

        /* JADX INFO: renamed from: a */
        private final w f31561a;

        b(w wVar) {
            this.f31561a = wVar;
        }

        private void b(w wVar, Set set) {
            List listV0 = wVar.v0();
            int size = listV0.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) listV0.get(i10);
                b(oVar.j1(), set);
                com.bumptech.glide.m mVarA = m.this.a(oVar.S0());
                if (mVarA != null) {
                    set.add(mVarA);
                }
            }
        }

        @Override // x2.p
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f31561a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f31558b = bVar;
    }

    com.bumptech.glide.m a(androidx.lifecycle.m mVar) {
        e3.l.a();
        return (com.bumptech.glide.m) this.f31557a.get(mVar);
    }

    com.bumptech.glide.m b(Context context, com.bumptech.glide.c cVar, androidx.lifecycle.m mVar, w wVar, boolean z10) {
        e3.l.a();
        com.bumptech.glide.m mVarA = a(mVar);
        if (mVarA != null) {
            return mVarA;
        }
        k kVar = new k(mVar);
        com.bumptech.glide.m mVarA2 = this.f31558b.a(cVar, kVar, new b(wVar), context);
        this.f31557a.put(mVar, mVarA2);
        kVar.b(new a(mVar));
        if (z10) {
            mVarA2.b();
        }
        return mVarA2;
    }

    class a implements l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.lifecycle.m f31559a;

        a(androidx.lifecycle.m mVar) {
            this.f31559a = mVar;
        }

        @Override // x2.l
        public void f() {
            m.this.f31557a.remove(this.f31559a);
        }

        @Override // x2.l
        public void b() {
        }

        @Override // x2.l
        public void g() {
        }
    }
}
