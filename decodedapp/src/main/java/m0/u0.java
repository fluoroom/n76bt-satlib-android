package m0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    public static final class a implements qg.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20896a;

        a(ViewGroup viewGroup) {
            this.f20896a = viewGroup;
        }

        @Override // qg.h
        public Iterator iterator() {
            return u0.c(this.f20896a);
        }
    }

    static final class b implements qd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20897a = new b();

        b() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterator l(View view) {
            qg.h hVarA;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (hVarA = u0.a(viewGroup)) == null) {
                return null;
            }
            return hVarA.iterator();
        }
    }

    public static final class c implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f20898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20899b;

        c(ViewGroup viewGroup) {
            this.f20899b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f20899b;
            int i10 = this.f20898a;
            this.f20898a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20898a < this.f20899b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f20899b;
            int i10 = this.f20898a - 1;
            this.f20898a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final class d implements qg.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20900a;

        public d(ViewGroup viewGroup) {
            this.f20900a = viewGroup;
        }

        @Override // qg.h
        public Iterator iterator() {
            return new j0(u0.a(this.f20900a).iterator(), b.f20897a);
        }
    }

    public static final qg.h a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final qg.h b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
