package kh;

import eh.b0;
import eh.i0;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.g f19952c;

    public h(String str, long j10, vh.g gVar) {
        m.e(gVar, "source");
        this.f19950a = str;
        this.f19951b = j10;
        this.f19952c = gVar;
    }

    @Override // eh.i0
    public long contentLength() {
        return this.f19951b;
    }

    @Override // eh.i0
    public b0 contentType() {
        String str = this.f19950a;
        if (str != null) {
            return b0.f12251e.b(str);
        }
        return null;
    }

    @Override // eh.i0
    public vh.g source() {
        return this.f19952c;
    }
}
