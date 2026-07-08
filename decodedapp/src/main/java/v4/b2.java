package v4;

import android.location.Location;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f29730a = new b2();

    private b2() {
    }

    public static final Location a(byte[] bArr, int i10) {
        rd.m.e(bArr, "data");
        return c(bArr, i10, null, 4, null);
    }

    public static final Location b(byte[] bArr, int i10, String str) {
        rd.m.e(bArr, "data");
        return e(new a6.v(bArr, i10 * 8), str, false, 4, null);
    }

    public static /* synthetic */ Location c(byte[] bArr, int i10, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "HT";
        }
        return b(bArr, i10, str);
    }

    public static final Location d(a6.v vVar, String str, boolean z10) {
        rd.m.e(vVar, "p");
        Location location = new Location(str);
        int iJ = vVar.j(24);
        int iJ2 = vVar.j(24);
        double d10 = 30000;
        location.setLatitude(((double) iJ) / d10);
        location.setLongitude(((double) iJ2) / d10);
        if (!z10) {
            try {
                int iJ3 = vVar.j(16);
                if (iJ3 != -32768) {
                    location.setAltitude(iJ3);
                }
                int iJ4 = vVar.j(16);
                if (iJ4 >= 0) {
                    location.setSpeed(iJ4 / 3.6f);
                }
                int iJ5 = vVar.j(16);
                if (iJ5 >= 0) {
                    location.setBearing(iJ5);
                }
                int i10 = vVar.i(32);
                if (i10 != 0) {
                    location.setTime(((long) i10) * ((long) CloseCodes.NORMAL_CLOSURE));
                }
                int i11 = vVar.i(16);
                if (i11 > 0) {
                    location.setAccuracy(i11);
                }
            } catch (Exception unused) {
            }
        }
        return location;
    }

    public static /* synthetic */ Location e(a6.v vVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return d(vVar, str, z10);
    }

    public static final void h(a6.v vVar, Location location) {
        rd.m.e(vVar, "sc");
        double latitude = location != null ? location.getLatitude() : 0.0d;
        double d10 = 60;
        double d11 = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        vVar.n((int) (latitude * d10 * d11), 24).n((int) ((location != null ? location.getLongitude() : 0.0d) * d10 * d11), 24);
    }

    public final byte[] f(Location location) {
        rd.m.e(location, "loc");
        byte[] bArr = new byte[6];
        h(new a6.v(bArr), location);
        return bArr;
    }

    public final byte[] g(Location location, boolean z10) {
        rd.m.e(location, "loc");
        byte[] bArr = new byte[(z10 ? 2 : 0) + 16];
        a6.v vVar = new a6.v(bArr);
        double d10 = 60;
        double latitude = location.getLatitude() * d10;
        double d11 = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        vVar.n((int) (latitude * d11), 24).n((int) (location.getLongitude() * d10 * d11), 24);
        if (location.hasAltitude()) {
            vVar.n((int) location.getAltitude(), 16);
        } else {
            vVar.n(-32768, 16);
        }
        if (location.hasSpeed()) {
            vVar.n((int) (location.getSpeed() * 3.6f), 16);
        } else {
            vVar.n(-1, 16);
        }
        if (location.hasBearing()) {
            vVar.n((int) location.getBearing(), 16);
        } else {
            vVar.n(-1, 16);
        }
        vVar.o(System.currentTimeMillis() / ((long) CloseCodes.NORMAL_CLOSURE), 32);
        if (z10) {
            if (location.hasAccuracy()) {
                int accuracy = (int) location.getAccuracy();
                if (accuracy < 1) {
                    accuracy = 1;
                }
                if (accuracy > 65535) {
                    accuracy = 65535;
                }
                vVar.n(accuracy, 16);
                return bArr;
            }
            vVar.n(0, 16);
        }
        return bArr;
    }
}
