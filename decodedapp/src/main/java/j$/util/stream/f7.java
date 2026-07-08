package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f7 extends g7 implements Consumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f17983b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public f7(int i10) {
        this.f17983b = new Object[i10];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f17994a;
        this.f17994a = i10 + 1;
        this.f17983b[i10] = obj;
    }
}
