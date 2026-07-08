package u4;

import com.benshikj.ii.IILink;
import com.benshikj.ii.NBSS;
import com.benshikj.ii.ReceiveStatus;
import v4.l1;
import v4.n0;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f28149c;

        static {
            int[] iArr = new int[IILink.LinkStatus.values().length];
            try {
                iArr[IILink.LinkStatus.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IILink.LinkStatus.Interrupted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IILink.LinkStatus.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IILink.LinkStatus.ConnectionFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IILink.LinkStatus.Connected.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IILink.LinkStatus.Sending.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f28147a = iArr;
            int[] iArr2 = new int[n0.c.values().length];
            try {
                iArr2[n0.c.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[n0.c.Interrupted.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[n0.c.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[n0.c.ConnectionFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[n0.c.Connected.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[n0.c.Sending.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f28148b = iArr2;
            int[] iArr3 = new int[IILink.Reason.values().length];
            try {
                iArr3[IILink.Reason.UnableToRecord.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[IILink.Reason.TxTimeout.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[IILink.Reason.NotInChannel.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[IILink.Reason.LinkInterrupted.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[IILink.Reason.ChannelIsOccupied.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[IILink.Reason.Unauthenticated.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[IILink.Reason.Unknown.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            f28149c = iArr3;
        }
    }

    public static final w5.d a(NBSS nbss) {
        rd.m.e(nbss, "<this>");
        w5.d dVarC = new d.c().c();
        if (nbss.InForward) {
            if (a6.w.b(nbss.From)) {
                return null;
            }
            dVarC.o(nbss.From);
            return dVarC;
        }
        dVarC.f31252c = nbss.From;
        dVarC.f31260t = nbss.Uid;
        dVarC.f31256g = nbss.Latitude;
        dVarC.f31257h = nbss.Longitude;
        return dVarC;
    }

    public static final w5.d b(ReceiveStatus receiveStatus) {
        rd.m.e(receiveStatus, "<this>");
        byte[] bArr = receiveStatus.bss;
        if (bArr == null) {
            return null;
        }
        try {
            return w5.d.A(bArr, 0, bArr.length);
        } catch (w5.g e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static final l1.h c(IILink.Reason reason) {
        rd.m.e(reason, "<this>");
        switch (a.f28149c[reason.ordinal()]) {
            case 1:
                return l1.h.UnableToRecord;
            case 2:
                return l1.h.TxTimeout;
            case 3:
                return l1.h.NotInChannel;
            case 4:
                return l1.h.LinkInterrupted;
            case 5:
                return l1.h.ChannelIsOccupied;
            case 6:
                return l1.h.Unauthenticated;
            case 7:
                return l1.h.Unknown;
            default:
                throw new dd.o();
        }
    }

    public static final String d(ReceiveStatus receiveStatus) {
        String strF;
        String str;
        rd.m.e(receiveStatus, "<this>");
        w5.d dVarB = b(receiveStatus);
        NBSS nbss = receiveStatus.nbss;
        if (dVarB == null || (((strF = dVarB.f31252c) == null || strF.length() <= 0) && ((strF = d5.l.g().f(dVarB.f31260t)) == null || strF.length() <= 0))) {
            strF = "";
        }
        if (nbss != null && (str = nbss.From) != null && str.length() > 0) {
            if (strF.length() == 0 && !nbss.InForward) {
                return str;
            }
            if (nbss.InForward) {
                return strF + '(' + str + ')';
            }
        }
        return strF;
    }

    public static final n0.c e(IILink.LinkStatus linkStatus) {
        rd.m.e(linkStatus, "<this>");
        switch (a.f28147a[linkStatus.ordinal()]) {
            case 1:
                return n0.c.Idle;
            case 2:
                return n0.c.Interrupted;
            case 3:
                return n0.c.Connecting;
            case 4:
                return n0.c.ConnectionFailed;
            case 5:
                return n0.c.Connected;
            case 6:
                return n0.c.Sending;
            default:
                throw new dd.o();
        }
    }
}
