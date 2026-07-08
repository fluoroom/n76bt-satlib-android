package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18062b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18064d;

    public /* synthetic */ l(l5 l5Var) {
        super(l5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j8 j8Var, l5 l5Var) {
        super(l5Var);
        this.f18064d = j8Var;
        this.f18063c = true;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j10) {
        switch (this.f18062b) {
            case 0:
                this.f18063c = false;
                this.f18064d = null;
                this.f18003a.c(-1L);
                break;
            case 1:
                this.f18003a.c(-1L);
                break;
            default:
                this.f18003a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.f18062b) {
            case 0:
                l5 l5Var = this.f18003a;
                if (obj == null) {
                    if (this.f18063c) {
                        return;
                    }
                    this.f18063c = true;
                    this.f18064d = null;
                    l5Var.n((Object) null);
                    return;
                }
                Object obj2 = this.f18064d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f18064d = obj;
                    l5Var.n(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.util.q) ((r) this.f18064d).f18134t).apply(obj);
                if (stream != null) {
                    try {
                        boolean z10 = this.f18063c;
                        l5 l5Var2 = this.f18003a;
                        if (!z10) {
                            ((Stream) stream.sequential()).forEach(l5Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!l5Var2.e() && spliterator.tryAdvance(l5Var2)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f18063c) {
                    boolean zTest = ((j8) this.f18064d).f18039t.test(obj);
                    this.f18063c = zTest;
                    if (zTest) {
                        this.f18003a.n(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public boolean e() {
        switch (this.f18062b) {
            case 1:
                this.f18063c = true;
                return this.f18003a.e();
            case 2:
                return !this.f18063c || this.f18003a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public void end() {
        switch (this.f18062b) {
            case 0:
                this.f18063c = false;
                this.f18064d = null;
                this.f18003a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, l5 l5Var) {
        super(l5Var);
        this.f18064d = rVar;
    }
}
