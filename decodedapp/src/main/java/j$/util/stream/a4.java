package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class a4 extends v3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f17901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f17902k;

    public /* synthetic */ a4(z6 z6Var, Object obj, Object obj2, Object obj3, int i10) {
        this.f17899h = i10;
        this.f17901j = obj;
        this.f17902k = obj2;
        this.f17900i = obj3;
    }

    @Override // j$.util.stream.v3
    public final q4 D0() {
        switch (this.f17899h) {
            case 0:
                return new x3((Supplier) this.f17900i, (ObjLongConsumer) this.f17902k, (p) this.f17901j);
            case 1:
                return new d4((Supplier) this.f17900i, (ObjDoubleConsumer) this.f17902k, (p) this.f17901j);
            case 2:
                return new f4(this.f17900i, (BiFunction) this.f17902k, (BinaryOperator) this.f17901j);
            case 3:
                return new j4((Supplier) this.f17900i, (BiConsumer) this.f17902k, (BiConsumer) this.f17901j);
            default:
                return new n4((Supplier) this.f17900i, (ObjIntConsumer) this.f17902k, (p) this.f17901j);
        }
    }
}
