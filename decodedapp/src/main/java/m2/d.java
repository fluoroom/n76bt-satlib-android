package m2;

import java.io.File;
import m2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements a.InterfaceC0285a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f20931b;

    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f20930a = j10;
        this.f20931b = aVar;
    }

    @Override // m2.a.InterfaceC0285a
    public m2.a build() {
        File fileA = this.f20931b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f20930a);
        }
        return null;
    }
}
