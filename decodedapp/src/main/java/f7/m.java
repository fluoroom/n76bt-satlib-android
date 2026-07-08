package f7;

import com.fasterxml.jackson.databind.JavaType;
import i7.d0;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f12871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12873c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p6.p f12874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f12875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Class f12876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final JavaType f12877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final boolean f12878e;

        public a(a aVar, d0 d0Var, p6.p pVar) {
            this.f12875b = aVar;
            this.f12874a = pVar;
            this.f12878e = d0Var.c();
            this.f12876c = d0Var.a();
            this.f12877d = d0Var.b();
        }

        public boolean a(JavaType javaType) {
            return this.f12878e && javaType.equals(this.f12877d);
        }

        public boolean b(Class cls) {
            return this.f12876c == cls && this.f12878e;
        }

        public boolean c(JavaType javaType) {
            return !this.f12878e && javaType.equals(this.f12877d);
        }

        public boolean d(Class cls) {
            return this.f12876c == cls && !this.f12878e;
        }
    }

    public m(i7.p pVar) {
        int iB = b(pVar.c());
        this.f12872b = iB;
        this.f12873c = iB - 1;
        final a[] aVarArr = new a[iB];
        pVar.a(new BiConsumer() { // from class: f7.l
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                m.a(this.f12869a, aVarArr, (d0) obj, (p6.p) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.f12871a = aVarArr;
    }

    public static /* synthetic */ void a(m mVar, a[] aVarArr, d0 d0Var, p6.p pVar) {
        mVar.getClass();
        int iHashCode = mVar.f12873c & d0Var.hashCode();
        aVarArr[iHashCode] = new a(aVarArr[iHashCode], d0Var, pVar);
    }

    private static final int b(int i10) {
        int i11 = 8;
        while (i11 < (i10 <= 64 ? i10 + i10 : i10 + (i10 >> 2))) {
            i11 += i11;
        }
        return i11;
    }

    public static m c(i7.p pVar) {
        return new m(pVar);
    }

    public p6.p d(JavaType javaType) {
        a aVar = this.f12871a[d0.d(javaType) & this.f12873c];
        if (aVar == null) {
            return null;
        }
        if (aVar.a(javaType)) {
            return aVar.f12874a;
        }
        do {
            aVar = aVar.f12875b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.a(javaType));
        return aVar.f12874a;
    }

    public p6.p e(Class cls) {
        a aVar = this.f12871a[d0.e(cls) & this.f12873c];
        if (aVar == null) {
            return null;
        }
        if (aVar.b(cls)) {
            return aVar.f12874a;
        }
        do {
            aVar = aVar.f12875b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.b(cls));
        return aVar.f12874a;
    }

    public p6.p f(JavaType javaType) {
        a aVar = this.f12871a[d0.f(javaType) & this.f12873c];
        if (aVar == null) {
            return null;
        }
        if (aVar.c(javaType)) {
            return aVar.f12874a;
        }
        do {
            aVar = aVar.f12875b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.c(javaType));
        return aVar.f12874a;
    }

    public p6.p g(Class cls) {
        a aVar = this.f12871a[d0.g(cls) & this.f12873c];
        if (aVar == null) {
            return null;
        }
        if (aVar.d(cls)) {
            return aVar.f12874a;
        }
        do {
            aVar = aVar.f12875b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.d(cls));
        return aVar.f12874a;
    }
}
