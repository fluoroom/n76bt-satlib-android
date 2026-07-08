package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements java.util.Comparator, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f17795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17796c;

    public /* synthetic */ e(java.util.Comparator comparator, Object obj, int i10) {
        this.f17794a = i10;
        this.f17795b = comparator;
        this.f17796c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17794a) {
            case 0:
                java.util.Comparator comparator = this.f17795b;
                java.util.Comparator comparator2 = (java.util.Comparator) this.f17796c;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
            default:
                java.util.Comparator comparator3 = this.f17795b;
                Function function = (Function) this.f17796c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
