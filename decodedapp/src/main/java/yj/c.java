package yj;

import j$.util.DesugarCollections;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import zj.w0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f32647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32648b;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f32649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f32650b;

        protected a(b bVar, Collection collection) {
            if (collection.isEmpty()) {
                throw new hj.c(hj.f.NOT_ENOUGH_DATA, 0);
            }
            if (collection.size() == c.this.f32648b) {
                this.f32650b = DesugarCollections.unmodifiableList(new ArrayList(collection));
            } else {
                w0 w0Var = new w0(c.this.f32648b, collection);
                this.f32650b = DesugarCollections.unmodifiableList((List) w0Var.b(c.e(bVar, w0Var, c.this.f32647a)).collect(Collectors.toList()));
            }
            this.f32649a = bVar;
        }

        public b a() {
            return this.f32649a;
        }

        public List b() {
            return this.f32650b;
        }
    }

    public c(int i10, double d10) {
        this.f32648b = i10;
        this.f32647a = d10;
    }

    public static b d(b bVar, b bVar2, b bVar3, double d10) {
        return (bVar.compareTo(bVar2) >= 0 || aj.d.b(bVar.X(bVar2)) > d10) ? (bVar.compareTo(bVar3) <= 0 || aj.d.b(bVar.X(bVar3)) > d10) ? bVar : bVar3 : bVar2;
    }

    public static b e(b bVar, w0 w0Var, double d10) {
        return d(bVar, w0Var.f().getDate(), w0Var.g().getDate(), d10);
    }

    @Override // yj.x
    public g0 a(b bVar, Collection collection) {
        return f(new a(bVar, collection));
    }

    protected abstract g0 f(a aVar);
}
