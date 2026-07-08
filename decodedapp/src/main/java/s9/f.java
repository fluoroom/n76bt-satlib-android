package s9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r9.i f27032a = r9.i.a();

    class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f27033b;

        /* JADX INFO: renamed from: s9.f$a$a, reason: collision with other inner class name */
        class C0370a extends s9.a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterable[] f27034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f27035d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0370a(a aVar, int i10, Iterable[] iterableArr) {
                super(i10);
                this.f27034c = iterableArr;
                this.f27035d = aVar;
            }

            @Override // s9.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Iterator a(int i10) {
                return this.f27034c[i10].iterator();
            }
        }

        a(Iterable[] iterableArr) {
            this.f27033b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            Iterable[] iterableArr = this.f27033b;
            return o.b(new C0370a(this, iterableArr.length, iterableArr));
        }
    }

    protected f() {
    }

    public static f b(Iterable iterable, Iterable iterable2) {
        return c(iterable, iterable2);
    }

    private static f c(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            r9.l.n(iterable);
        }
        return new a(iterableArr);
    }

    private Iterable d() {
        return (Iterable) this.f27032a.c(this);
    }

    public String toString() {
        return n.d(d());
    }
}
