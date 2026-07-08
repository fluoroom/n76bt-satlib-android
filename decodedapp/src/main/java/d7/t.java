package d7;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.Objects;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class t extends v {

    /* JADX INFO: renamed from: b */
    static final t f10861b = new t("");

    /* JADX INFO: renamed from: a */
    protected final String f10862a;

    public t(String str) {
        this.f10862a = str;
    }

    public static t b0(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? f10861b : new t(str);
    }

    @Override // p6.n
    public m C() {
        return m.STRING;
    }

    @Override // p6.n
    public String Y() {
        return this.f10862a;
    }

    public byte[] a0(e6.a aVar) throws v6.c {
        String strTrim = this.f10862a.trim();
        o6.c cVar = new o6.c(Math.max(16, Math.min(WXMediaMessage.THUMB_LENGTH_LIMIT, ((strTrim.length() >> 2) * 3) + 4)));
        try {
            aVar.e(strTrim, cVar);
            return cVar.l();
        } catch (IllegalArgumentException e10) {
            throw v6.c.z(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e10.getMessage()), strTrim, byte[].class);
        }
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_STRING;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        String str = this.f10862a;
        if (str == null) {
            gVar.E0();
        } else {
            gVar.d1(str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof t)) {
            return Objects.equals(((t) obj).f10862a, this.f10862a);
        }
        return false;
    }

    @Override // p6.n
    public long h(long j10) {
        return i6.i.d(this.f10862a, j10);
    }

    public int hashCode() {
        return Objects.hashCode(this.f10862a);
    }

    @Override // p6.n
    public String i() {
        return this.f10862a;
    }

    @Override // p6.n
    public String j(String str) {
        String str2 = this.f10862a;
        return str2 == null ? str : str2;
    }

    @Override // p6.n
    public byte[] o() {
        return a0(e6.b.a());
    }
}
