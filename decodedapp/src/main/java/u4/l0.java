package u4;

import com.benshikj.ht.rpc.Im;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Im.ServerLocation f28105a;

    public l0(Im.ServerLocation serverLocation) {
        rd.m.e(serverLocation, "o");
        this.f28105a = serverLocation;
    }

    public final Im.ServerLocation a() {
        return this.f28105a;
    }

    public String toString() {
        String name = this.f28105a.getName();
        rd.m.d(name, "getName(...)");
        return name;
    }
}
