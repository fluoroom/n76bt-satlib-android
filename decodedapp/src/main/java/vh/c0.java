package vh;

import java.util.List;
import java.util.RandomAccess;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends ed.d implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final a f30769d = new a(null);

    /* JADX INFO: renamed from: b */
    private final h[] f30770b;

    /* JADX INFO: renamed from: c */
    private final int[] f30771c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private final void a(long j10, e eVar, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((h) list.get(i17)).Q() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) list.get(i11);
            h hVar2 = (h) list.get(i12 - 1);
            if (i16 == hVar.Q()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                h hVar3 = (h) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                hVar = hVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (hVar.h(i16) == hVar2.h(i16)) {
                int iMin = Math.min(hVar.Q(), hVar2.Q());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && hVar.h(i20) == hVar2.h(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(eVar) + ((long) 2) + ((long) i19) + 1;
                eVar.writeInt(-i19);
                eVar.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    eVar.writeInt(hVar.h(i16) & MessagePack.Code.EXT_TIMESTAMP);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((h) list.get(i13)).Q()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    eVar.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    e eVar2 = new e();
                    eVar.writeInt(((int) (c(eVar2) + jC)) * (-1));
                    a(jC, eVar2, i21, list, i13, i12, list2);
                    eVar.F0(eVar2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((h) list.get(i23 - 1)).h(i16) != ((h) list.get(i23)).h(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(eVar) + ((long) 2) + ((long) (i22 * 2));
            eVar.writeInt(i22);
            eVar.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bH = ((h) list.get(i24)).h(i16);
                if (i24 == i13 || bH != ((h) list.get(i24 - 1)).h(i16)) {
                    eVar.writeInt(bH & MessagePack.Code.EXT_TIMESTAMP);
                }
            }
            e eVar3 = new e();
            while (i13 < i12) {
                byte bH2 = ((h) list.get(i13)).h(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bH2 != ((h) list.get(i26)).h(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((h) list.get(i13)).Q()) {
                    eVar.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    eVar.writeInt(((int) (c(eVar3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, eVar3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            eVar.F0(eVar3);
        }

        static /* synthetic */ void b(a aVar, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(e eVar) {
            return eVar.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:93:0x00cb, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final vh.c0 d(vh.h... r17) {
            /*
                Method dump skipped, instruction units count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vh.c0.a.d(vh.h[]):vh.c0");
        }

        private a() {
        }
    }

    public /* synthetic */ c0(h[] hVarArr, int[] iArr, rd.h hVar) {
        this(hVarArr, iArr);
    }

    @Override // ed.b
    public int c() {
        return this.f30770b.length;
    }

    @Override // ed.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return e((h) obj);
        }
        return false;
    }

    public /* bridge */ boolean e(h hVar) {
        return super.contains(hVar);
    }

    @Override // ed.d, java.util.List
    /* JADX INFO: renamed from: f */
    public h get(int i10) {
        return this.f30770b[i10];
    }

    public final h[] g() {
        return this.f30770b;
    }

    public final int[] h() {
        return this.f30771c;
    }

    public /* bridge */ int i(h hVar) {
        return super.indexOf(hVar);
    }

    @Override // ed.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return i((h) obj);
        }
        return -1;
    }

    public /* bridge */ int j(h hVar) {
        return super.lastIndexOf(hVar);
    }

    @Override // ed.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return j((h) obj);
        }
        return -1;
    }

    private c0(h[] hVarArr, int[] iArr) {
        this.f30770b = hVarArr;
        this.f30771c = iArr;
    }
}
