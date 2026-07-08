package eh;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f12602e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b0 f12603f = b0.f12251e.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f12605d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Charset f12606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f12607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f12608c;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            this.f12607b.add(uh.a.d(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f12606a, 91, null));
            this.f12608c.add(uh.a.d(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f12606a, 91, null));
            return this;
        }

        public final a b(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            this.f12607b.add(uh.a.d(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f12606a, 83, null));
            this.f12608c.add(uh.a.d(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f12606a, 83, null));
            return this;
        }

        public final t c() {
            return new t(this.f12607b, this.f12608c);
        }

        public a(Charset charset) {
            this.f12606a = charset;
            this.f12607b = new ArrayList();
            this.f12608c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, rd.h hVar) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    public t(List list, List list2) {
        rd.m.e(list, "encodedNames");
        rd.m.e(list2, "encodedValues");
        this.f12604c = fh.p.v(list);
        this.f12605d = fh.p.v(list2);
    }

    private final long g(vh.f fVar, boolean z10) throws EOFException {
        vh.e eVarH;
        if (z10) {
            eVarH = new vh.e();
        } else {
            rd.m.b(fVar);
            eVarH = fVar.h();
        }
        int size = this.f12604c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                eVarH.writeByte(38);
            }
            eVarH.J((String) this.f12604c.get(i10));
            eVarH.writeByte(61);
            eVarH.J((String) this.f12605d.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = eVarH.size();
        eVarH.k();
        return size2;
    }

    @Override // eh.g0
    public long a() {
        return g(null, true);
    }

    @Override // eh.g0
    public b0 b() {
        return f12603f;
    }

    @Override // eh.g0
    public void f(vh.f fVar) throws EOFException {
        rd.m.e(fVar, "sink");
        g(fVar, false);
    }
}
