package j$.time.format;

import j$.time.y;
import j$.time.z;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17534a;

    public /* synthetic */ i(int i10) {
        this.f17534a = i10;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb2) {
        switch (this.f17534a) {
            case 0:
                Long lA = qVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.n nVar = qVar.f17562a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long lValueOf = nVar.e(aVar) ? Long.valueOf(nVar.w(aVar)) : null;
                int i10 = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.f17612b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j10 = jLongValue - 253402300800L;
                    long jX = j$.com.android.tools.r8.a.x(j10, 315569520000L) + 1;
                    j$.time.i iVarG = j$.time.i.G(j$.com.android.tools.r8.a.w(j10, 315569520000L) - 62167219200L, 0, z.f17652e);
                    if (jX > 0) {
                        sb2.append('+');
                        sb2.append(jX);
                    }
                    sb2.append(iVarG);
                    if (iVarG.f17579b.f17588c == 0) {
                        sb2.append(":00");
                    }
                } else {
                    long j11 = jLongValue + 62167219200L;
                    long j12 = j11 / 315569520000L;
                    long j13 = j11 % 315569520000L;
                    j$.time.i iVarG2 = j$.time.i.G(j13 - 62167219200L, 0, z.f17652e);
                    int length = sb2.length();
                    sb2.append(iVarG2);
                    if (iVarG2.f17579b.f17588c == 0) {
                        sb2.append(":00");
                    }
                    if (j12 < 0) {
                        if (iVarG2.f17578a.f17572a == -10000) {
                            sb2.replace(length, length + 2, Long.toString(j12 - 1));
                        } else if (j13 == 0) {
                            sb2.insert(length, j12);
                        } else {
                            sb2.insert(length + 1, Math.abs(j12));
                        }
                    }
                }
                if (iA > 0) {
                    sb2.append('.');
                    int i11 = 100000000;
                    while (true) {
                        if (iA > 0 || i10 % 3 != 0 || i10 < -2) {
                            int i12 = iA / i11;
                            sb2.append((char) (i12 + 48));
                            iA -= i12 * i11;
                            i11 /= 10;
                            i10++;
                        }
                    }
                }
                sb2.append('Z');
                return true;
            default:
                b bVar = o.f17552f;
                j$.time.temporal.n nVar2 = qVar.f17562a;
                Object objL = nVar2.l(bVar);
                if (objL == null && qVar.f17564c == 0) {
                    throw new j$.time.b("Unable to extract " + bVar + " from temporal " + nVar2);
                }
                y yVar = (y) objL;
                if (yVar == null) {
                    return false;
                }
                sb2.append(yVar.h());
                return true;
        }
    }

    public final String toString() {
        switch (this.f17534a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
