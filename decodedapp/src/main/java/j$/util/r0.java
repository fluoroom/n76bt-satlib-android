package j$.util;

import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends q1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SortedSet f17870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f17870f = sortedSet;
    }

    @Override // j$.util.q1, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f17870f.comparator();
    }
}
