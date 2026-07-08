package g5;

import com.benshikj.ht.rpc.Im;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Im.IIChannelMember f13542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f13543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f13544d;

    public b(boolean z10, Im.IIChannelMember iIChannelMember) {
        m.e(iIChannelMember, "data");
        this.f13541a = z10;
        this.f13542b = iIChannelMember;
    }

    public final int a() {
        return this.f13542b.getCallPriority();
    }

    public final boolean b() {
        return this.f13541a;
    }

    public final long c() {
        return this.f13542b.getUserID();
    }

    public final boolean d() {
        Boolean bool = this.f13544d;
        if (bool == null) {
            return this.f13542b.getIsAdmin();
        }
        m.b(bool);
        return bool.booleanValue();
    }

    public final boolean e() {
        Boolean bool = this.f13543c;
        if (bool == null) {
            return this.f13542b.getBan();
        }
        m.b(bool);
        return bool.booleanValue();
    }

    public final void f(boolean z10) {
        this.f13544d = Boolean.valueOf(z10);
    }

    public final void g(boolean z10) {
        this.f13543c = Boolean.valueOf(z10);
    }
}
