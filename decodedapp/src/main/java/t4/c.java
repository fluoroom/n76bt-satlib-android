package t4;

import a3.f;
import android.content.Context;
import com.bumptech.glide.m;
import java.io.File;
import x2.j;
import x2.p;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {
    public c(com.bumptech.glide.c cVar, j jVar, p pVar, Context context) {
        super(cVar, jVar, pVar, context);
    }

    @Override // com.bumptech.glide.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b l(Class cls) {
        return new b(this.f5209a, this, cls, this.f5210b);
    }

    @Override // com.bumptech.glide.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b m() {
        return (b) super.m();
    }

    @Override // com.bumptech.glide.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b n() {
        return (b) super.n();
    }

    @Override // com.bumptech.glide.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b t(File file) {
        return (b) super.t(file);
    }

    @Override // com.bumptech.glide.m
    protected void y(f fVar) {
        if (fVar instanceof a) {
            super.y(fVar);
        } else {
            super.y(new a().a(fVar));
        }
    }
}
