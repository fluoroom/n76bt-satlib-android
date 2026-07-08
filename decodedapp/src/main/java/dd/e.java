package dd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10898a;

    public e(Object obj) {
        this.f10898a = obj;
    }

    @Override // dd.j
    public Object getValue() {
        return this.f10898a;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
