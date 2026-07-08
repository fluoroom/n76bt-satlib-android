package wh;

import dd.d0;
import dd.w;
import ed.k0;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import rd.a0;
import rd.b0;
import rd.y;
import vh.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gd.a.d(((n) obj).b(), ((n) obj2).b());
        }
    }

    private static final Map d(List list) {
        e0 e0VarE = e0.a.e(e0.f30784b, "/", false, 1, null);
        Map mapM = k0.m(w.a(e0VarE, new n(e0VarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (n nVar : ed.q.B0(list, new a())) {
            if (((n) mapM.put(nVar.b(), nVar)) == null) {
                while (true) {
                    e0 e0VarI = nVar.b().i();
                    if (e0VarI != null) {
                        n nVar2 = (n) mapM.get(e0VarI);
                        if (nVar2 != null) {
                            nVar2.c().add(nVar.b());
                            break;
                        }
                        n nVar3 = new n(e0VarI, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        mapM.put(e0VarI, nVar3);
                        nVar3.c().add(nVar.b());
                        nVar = nVar3;
                    }
                }
            }
        }
        return mapM;
    }

    public static final Long e(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(u.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long f(long j10) {
        return (j10 / ((long) 10000)) - 11644473600000L;
    }

    private static final String g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, rg.a.a(16));
        rd.m.d(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #13 {all -> 0x00df, blocks: (B:13:0x0062, B:15:0x006b, B:18:0x007c, B:43:0x00de, B:46:0x00e2, B:47:0x00e9, B:48:0x00ea), top: B:139:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:10:0x004e, B:12:0x005a, B:65:0x010b, B:59:0x00ff, B:66:0x010c, B:93:0x016e, B:97:0x017f, B:90:0x0168, B:100:0x0182, B:103:0x018e, B:104:0x0195, B:105:0x0196, B:106:0x0199, B:107:0x019a, B:108:0x01b4, B:7:0x0038, B:9:0x0041, B:67:0x011d, B:70:0x0125, B:72:0x0135, B:74:0x0141, B:77:0x0148, B:78:0x014c, B:79:0x0153, B:80:0x0154, B:87:0x0161, B:56:0x00f8), top: B:118:0x0019, inners: #0, #2, #3, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final vh.q0 h(vh.e0 r19, vh.k r20, qd.l r21) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.r.h(vh.e0, vh.k, qd.l):vh.q0");
    }

    public static final n i(final vh.g gVar) throws IOException {
        rd.m.e(gVar, "<this>");
        int iV = gVar.V();
        if (iV != 33639248) {
            throw new IOException("bad zip: expected " + g(33639248) + " but was " + g(iV));
        }
        gVar.skip(4L);
        short sB0 = gVar.b0();
        int i10 = sB0 & 65535;
        if ((sB0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + g(i10));
        }
        int iB0 = gVar.b0() & 65535;
        int iB02 = gVar.b0() & 65535;
        int iB03 = gVar.b0() & 65535;
        long jV = ((long) gVar.V()) & 4294967295L;
        final a0 a0Var = new a0();
        a0Var.f25932a = ((long) gVar.V()) & 4294967295L;
        final a0 a0Var2 = new a0();
        a0Var2.f25932a = ((long) gVar.V()) & 4294967295L;
        int iB04 = gVar.b0() & 65535;
        int iB05 = gVar.b0() & 65535;
        int iB06 = gVar.b0() & 65535;
        gVar.skip(8L);
        final a0 a0Var3 = new a0();
        a0Var3.f25932a = ((long) gVar.V()) & 4294967295L;
        String strO = gVar.o(iB04);
        if (rg.q.O(strO, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = a0Var2.f25932a == 4294967295L ? 8 : 0L;
        if (a0Var.f25932a == 4294967295L) {
            j10 += (long) 8;
        }
        if (a0Var3.f25932a == 4294967295L) {
            j10 += (long) 8;
        }
        final long j11 = j10;
        final b0 b0Var = new b0();
        final b0 b0Var2 = new b0();
        final b0 b0Var3 = new b0();
        final y yVar = new y();
        m(gVar, iB05, new qd.p() { // from class: wh.p
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return r.j(yVar, j11, a0Var2, gVar, a0Var, a0Var3, b0Var, b0Var2, b0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j11 <= 0 || yVar.f25960a) {
            return new n(e0.a.e(e0.f30784b, "/", false, 1, null).k(strO), rg.q.w(strO, "/", false, 2, null), gVar.o(iB06), jV, a0Var.f25932a, a0Var2.f25932a, iB0, a0Var3.f25932a, iB03, iB02, (Long) b0Var.f25935a, (Long) b0Var2.f25935a, (Long) b0Var3.f25935a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 j(y yVar, long j10, a0 a0Var, final vh.g gVar, a0 a0Var2, a0 a0Var3, final b0 b0Var, final b0 b0Var2, final b0 b0Var3, int i10, long j11) throws IOException {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                gVar.skip(4L);
                m(gVar, (int) (j11 - 4), new qd.p() { // from class: wh.q
                    @Override // qd.p
                    public final Object s(Object obj, Object obj2) {
                        return r.k(b0Var, gVar, b0Var2, b0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (yVar.f25960a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            yVar.f25960a = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jD0 = a0Var.f25932a;
            if (jD0 == 4294967295L) {
                jD0 = gVar.d0();
            }
            a0Var.f25932a = jD0;
            a0Var2.f25932a = a0Var2.f25932a == 4294967295L ? gVar.d0() : 0L;
            a0Var3.f25932a = a0Var3.f25932a == 4294967295L ? gVar.d0() : 0L;
        }
        return d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 k(b0 b0Var, vh.g gVar, b0 b0Var2, b0 b0Var3, int i10, long j10) throws IOException {
        if (i10 == 1) {
            if (b0Var.f25935a != null) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            b0Var.f25935a = Long.valueOf(gVar.d0());
            b0Var2.f25935a = Long.valueOf(gVar.d0());
            b0Var3.f25935a = Long.valueOf(gVar.d0());
        }
        return d0.f10897a;
    }

    private static final h l(vh.g gVar) throws IOException {
        int iB0 = gVar.b0() & 65535;
        int iB02 = gVar.b0() & 65535;
        long jB0 = gVar.b0() & 65535;
        if (jB0 != (gVar.b0() & 65535) || iB0 != 0 || iB02 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(4L);
        return new h(jB0, 4294967295L & ((long) gVar.V()), gVar.b0() & 65535);
    }

    private static final void m(vh.g gVar, int i10, qd.p pVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iB0 = gVar.b0() & 65535;
            long jB0 = ((long) gVar.b0()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jB0) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            gVar.l0(jB0);
            long size = gVar.h().size();
            pVar.s(Integer.valueOf(iB0), Long.valueOf(jB0));
            long size2 = (gVar.h().size() + jB0) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iB0);
            }
            if (size2 > 0) {
                gVar.h().skip(size2);
            }
            j10 = j11 - jB0;
        }
    }

    public static final n n(vh.g gVar, n nVar) throws IOException {
        rd.m.e(gVar, "<this>");
        rd.m.e(nVar, "centralDirectoryZipEntry");
        n nVarO = o(gVar, nVar);
        rd.m.b(nVarO);
        return nVarO;
    }

    private static final n o(final vh.g gVar, n nVar) throws IOException {
        int iV = gVar.V();
        if (iV != 67324752) {
            throw new IOException("bad zip: expected " + g(67324752) + " but was " + g(iV));
        }
        gVar.skip(2L);
        short sB0 = gVar.b0();
        int i10 = sB0 & 65535;
        if ((sB0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + g(i10));
        }
        gVar.skip(18L);
        long jB0 = ((long) gVar.b0()) & 65535;
        int iB0 = gVar.b0() & 65535;
        gVar.skip(jB0);
        if (nVar == null) {
            gVar.skip(iB0);
            return null;
        }
        final b0 b0Var = new b0();
        final b0 b0Var2 = new b0();
        final b0 b0Var3 = new b0();
        m(gVar, iB0, new qd.p() { // from class: wh.o
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return r.p(gVar, b0Var, b0Var2, b0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return nVar.a((Integer) b0Var.f25935a, (Integer) b0Var2.f25935a, (Integer) b0Var3.f25935a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 p(vh.g gVar, b0 b0Var, b0 b0Var2, b0 b0Var3, int i10, long j10) throws IOException {
        if (i10 == 21589) {
            if (j10 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b10 = gVar.readByte();
            boolean z10 = (b10 & 1) == 1;
            boolean z11 = (b10 & 2) == 2;
            boolean z12 = (b10 & 4) == 4;
            long j11 = z10 ? 5L : 1L;
            if (z11) {
                j11 += 4;
            }
            if (z12) {
                j11 += 4;
            }
            if (j10 < j11) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z10) {
                b0Var.f25935a = Integer.valueOf(gVar.V());
            }
            if (z11) {
                b0Var2.f25935a = Integer.valueOf(gVar.V());
            }
            if (z12) {
                b0Var3.f25935a = Integer.valueOf(gVar.V());
            }
        }
        return d0.f10897a;
    }

    private static final h q(vh.g gVar, h hVar) throws IOException {
        gVar.skip(12L);
        int iV = gVar.V();
        int iV2 = gVar.V();
        long jD0 = gVar.d0();
        if (jD0 != gVar.d0() || iV != 0 || iV2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(8L);
        return new h(jD0, gVar.d0(), hVar.b());
    }

    public static final void r(vh.g gVar) {
        rd.m.e(gVar, "<this>");
        o(gVar, null);
    }
}
