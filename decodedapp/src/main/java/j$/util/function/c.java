package j$.util.function;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f17810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f17811c;

    public /* synthetic */ c(Function function, Function function2, int i10) {
        this.f17809a = i10;
        this.f17810b = function;
        this.f17811c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f17809a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f17809a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f17809a) {
            case 0:
                return this.f17811c.apply(this.f17810b.apply(obj));
            default:
                return this.f17810b.apply(this.f17811c.apply(obj));
        }
    }
}
