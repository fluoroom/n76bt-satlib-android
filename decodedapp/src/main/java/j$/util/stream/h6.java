package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 extends z5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f18004d;

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18004d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void end() {
        List.EL.sort(this.f18004d, this.f18287b);
        long size = this.f18004d.size();
        l5 l5Var = this.f18003a;
        l5Var.c(size);
        if (!this.f18288c) {
            ArrayList arrayList = this.f18004d;
            Objects.requireNonNull(l5Var);
            Collection.EL.a(arrayList, new j$.util.q(8, l5Var));
        } else {
            ArrayList arrayList2 = this.f18004d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (l5Var.e()) {
                    break;
                } else {
                    l5Var.n(obj);
                }
            }
        }
        l5Var.end();
        this.f18004d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18004d.add(obj);
    }
}
