package zj;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33383a;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double[] f33385b;

        a(String str, double[] dArr) {
            this.f33384a = str;
            this.f33385b = (double[]) dArr.clone();
        }

        public String a() {
            return this.f33384a;
        }

        public double[] b() {
            return (double[]) this.f33385b.clone();
        }
    }

    public f() {
        this(4);
    }

    public List a() {
        return DesugarCollections.unmodifiableList(this.f33383a);
    }

    public int b() {
        return this.f33383a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        for (int i10 = 0; i10 < this.f33383a.size(); i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(((a) this.f33383a.get(i10)).a());
            sb2.append('[');
            sb2.append(((a) this.f33383a.get(i10)).b().length);
            sb2.append(']');
        }
        sb2.append('}');
        return sb2.toString();
    }

    public f(int i10) {
        this.f33383a = new ArrayList(i10);
    }

    public f(f fVar) {
        this(fVar.a().size() + 4);
        for (a aVar : fVar.a()) {
            this.f33383a.add(new a(aVar.a(), aVar.b()));
        }
    }
}
