package vh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import vh.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f30853r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final e0 f30854s = e0.a.e(e0.f30784b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e0 f30855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f30856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f30857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f30858h;

    private static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public q0(e0 e0Var, k kVar, Map map, String str) {
        rd.m.e(e0Var, "zipPath");
        rd.m.e(kVar, "fileSystem");
        rd.m.e(map, "entries");
        this.f30855e = e0Var;
        this.f30856f = kVar;
        this.f30857g = map;
        this.f30858h = str;
    }

    private final e0 X(e0 e0Var) {
        return f30854s.l(e0Var, true);
    }

    private final List h0(e0 e0Var, boolean z10) throws IOException {
        wh.n nVar = (wh.n) this.f30857g.get(X(e0Var));
        if (nVar != null) {
            return ed.q.H0(nVar.c());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x004e, blocks: (B:8:0x0027, B:34:0x005f, B:22:0x004a, B:9:0x0033, B:19:0x0045), top: B:60:0x0027, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    @Override // vh.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vh.j G(vh.e0 r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            rd.m.e(r14, r0)
            vh.e0 r14 = r13.X(r14)
            java.util.Map r0 = r13.f30857g
            java.lang.Object r14 = r0.get(r14)
            wh.n r14 = (wh.n) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            long r2 = r14.i()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L70
            vh.k r0 = r13.f30856f
            vh.e0 r2 = r13.f30855e
            vh.i r2 = r0.H(r2)
            long r3 = r14.i()     // Catch: java.lang.Throwable -> L4e
            vh.n0 r0 = r2.v(r3)     // Catch: java.lang.Throwable -> L4e
            vh.g r3 = vh.z.c(r0)     // Catch: java.lang.Throwable -> L4e
            wh.n r14 = wh.r.n(r3, r14)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L3f
            r3.close()     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L53
        L3f:
            r0 = r1
            goto L53
        L41:
            r0 = move-exception
            r14 = r0
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L51
        L49:
            r0 = move-exception
            dd.b.a(r14, r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            r14 = r0
            goto L60
        L51:
            r0 = r14
            r14 = r1
        L53:
            if (r0 != 0) goto L5f
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r0 = move-exception
            goto L6c
        L5d:
            r0 = r1
            goto L6c
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L4e
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            dd.b.a(r14, r0)
        L6a:
            r0 = r14
            r14 = r1
        L6c:
            if (r0 != 0) goto L6f
            goto L70
        L6f:
            throw r0
        L70:
            vh.j r2 = new vh.j
            boolean r0 = r14.k()
            r3 = r0 ^ 1
            boolean r4 = r14.k()
            boolean r0 = r14.k()
            if (r0 == 0) goto L84
        L82:
            r6 = r1
            goto L8d
        L84:
            long r0 = r14.j()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L82
        L8d:
            java.lang.Long r7 = r14.f()
            java.lang.Long r8 = r14.h()
            java.lang.Long r9 = r14.g()
            r11 = 128(0x80, float:1.794E-43)
            r12 = 0
            r5 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.q0.G(vh.e0):vh.j");
    }

    @Override // vh.k
    public i H(e0 e0Var) {
        rd.m.e(e0Var, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // vh.k
    public l0 T(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // vh.k
    public n0 W(e0 e0Var) throws FileNotFoundException {
        rd.m.e(e0Var, "file");
        wh.n nVar = (wh.n) this.f30857g.get(X(e0Var));
        if (nVar == null) {
            throw new FileNotFoundException("no such file: " + e0Var);
        }
        i iVarH = this.f30856f.H(this.f30855e);
        g th2 = null;
        try {
            g gVarC = z.c(iVarH.v(nVar.i()));
            if (iVarH != null) {
                try {
                    iVarH.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = gVarC;
        } catch (Throwable th4) {
            th = th4;
            if (iVarH != null) {
                try {
                    iVarH.close();
                } catch (Throwable th5) {
                    dd.b.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        wh.r.r(th2);
        return nVar.e() == 0 ? new wh.i(th2, nVar.j(), true) : new wh.i(new q(new wh.i(th2, nVar.d(), true), new Inflater(true)), nVar.j(), false);
    }

    @Override // vh.k
    public l0 c(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.k
    public void e(e0 e0Var, e0 e0Var2) throws IOException {
        rd.m.e(e0Var, "source");
        rd.m.e(e0Var2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.k
    public void n(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.k
    public void s(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.k
    public List w(e0 e0Var) throws IOException {
        rd.m.e(e0Var, "dir");
        List listH0 = h0(e0Var, true);
        rd.m.b(listH0);
        return listH0;
    }
}
