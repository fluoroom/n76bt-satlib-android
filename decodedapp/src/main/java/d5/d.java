package d5;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import com.dw.ht.Main;
import com.dw.ht.provider.a;
import com.dw.ht.satellite.a;
import com.google.android.gms.maps.model.LatLng;
import java.util.Locale;
import w5.a;

/* JADX INFO: loaded from: classes.dex */
public class d extends d5.c {

    /* JADX INFO: renamed from: t */
    public static Location f10615t;

    /* JADX INFO: renamed from: u */
    private static d f10616u;

    /* JADX INFO: renamed from: v */
    private static boolean f10617v;

    /* JADX INFO: renamed from: q */
    public int f10618q;

    /* JADX INFO: renamed from: r */
    private boolean f10619r;

    /* JADX INFO: renamed from: s */
    private boolean f10620s;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f10621a;

        static {
            int[] iArr = new int[a.g.values().length];
            f10621a = iArr;
            try {
                iArr[a.g.OBJECT_LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10621a[a.g.ITEM_LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10621a[a.g.OBJECT_KILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10621a[a.g.ITEM_KILLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        LastRxLocationChanged,
        ShowTrackChanged
    }

    public static class c {

        /* JADX INFO: renamed from: a */
        public static final String[] f10625a = {"_id", "date", "text", "_from", "_to", "repeaters", "latitude", "longitude", "symbol", "type", "protocol", "_group", "bss_user_id", "speed", "course", "freq", "starred", "show_track", "altitude"};
    }

    private d() {
    }

    public static d h() {
        if (f10616u == null && !f10617v) {
            f10617v = true;
            Cursor cursorQuery = Main.f5555g.getContentResolver().query(a.b.f6666a, c.f10625a, "show_track=1", null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        s(new d(cursorQuery));
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return f10616u;
    }

    public static d k(long j10) {
        a.C0097a c0097aH;
        if (j10 >= 0) {
            Cursor cursorQuery = Main.f5555g.getContentResolver().query(ContentUris.withAppendedId(a.b.f6666a, j10), c.f10625a, null, null, null);
            try {
                if (!cursorQuery.moveToNext()) {
                    cursorQuery.close();
                    return null;
                }
                d dVar = new d(cursorQuery);
                cursorQuery.close();
                return dVar;
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - (jCurrentTimeMillis % 1000);
        com.dw.ht.satellite.a aVarB = com.dw.ht.satellite.b.B(-((int) j10));
        if (aVarB == null || (c0097aH = aVarB.h(j11)) == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f10611m = j10;
        dVar2.f10602d = c0097aH.e();
        dVar2.f10603e = c0097aH.f();
        dVar2.f10606h = (float) c0097aH.i();
        dVar2.f10604f = Integer.valueOf((int) c0097aH.a());
        dVar2.f10599a = c0097aH.g();
        dVar2.f10612n = System.currentTimeMillis();
        dVar2.f10620s = com.dw.ht.satellite.b.F(aVarB.f());
        dVar2.f10619r = com.dw.ht.satellite.b.G(aVarB.f());
        return dVar2;
    }

    public static d l(String str) {
        Cursor cursorQuery;
        if (str == null || (cursorQuery = Main.f5555g.getContentResolver().query(a.b.f6666a, c.f10625a, "_from=?", new String[]{str}, null)) == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToNext()) {
                return new d(cursorQuery);
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public static d m(long j10) {
        Cursor cursorQuery;
        if (j10 == 0 || (cursorQuery = Main.f5555g.getContentResolver().query(a.b.f6666a, c.f10625a, "bss_user_id=?", new String[]{String.valueOf(j10)}, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            d dVar = new d(cursorQuery);
            cursorQuery.close();
            return dVar;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public static Location n(w5.c cVar, long j10, int i10, int i11) {
        Location location;
        ContentValues contentValues = new ContentValues(11);
        String string = cVar.f31219d.toString();
        w5.h hVar = cVar.f31316b;
        if (!(hVar instanceof w5.a)) {
            return null;
        }
        w5.a aVar = (w5.a) hVar;
        if (aVar.F() != null) {
            contentValues.put("text", aVar.F());
        }
        if (aVar.J() != null) {
            contentValues.put("latitude", Double.valueOf(aVar.J().f31198a));
            contentValues.put("longitude", Double.valueOf(aVar.J().f31199b));
            location = new Location("gps");
            location.setLatitude(aVar.J().f31198a);
            location.setLongitude(aVar.J().f31199b);
        } else {
            location = null;
        }
        String strM = aVar.M();
        if (!TextUtils.isEmpty(strM)) {
            contentValues.put("symbol", strM);
        }
        contentValues.put("altitude", aVar.B());
        contentValues.put("course", Integer.valueOf(aVar.D()));
        contentValues.put("speed", Float.valueOf(aVar.L()));
        int i12 = a.f10621a[aVar.O().ordinal()];
        if (i12 == 1 || i12 == 2) {
            String strI = aVar.I();
            if (!TextUtils.isEmpty(strI)) {
                cVar.r().add(0, cVar.f31219d);
                string = strI;
            }
        } else if (i12 == 3 || i12 == 4) {
            String strI2 = aVar.I();
            if (!TextUtils.isEmpty(strI2)) {
                Main.f5555g.getContentResolver().delete(a.b.f6666a, "_from=? AND bss_user_id=0", new String[]{strI2});
            }
            return null;
        }
        contentValues.put("date", Long.valueOf(j10));
        contentValues.put("_from", string);
        contentValues.put("_to", cVar.f31218c.toString());
        contentValues.put("type", Integer.valueOf(i10));
        contentValues.put("freq", Integer.valueOf(i11));
        if (!cVar.r().isEmpty()) {
            contentValues.put("repeaters", TextUtils.join(",", cVar.r()));
        }
        ContentResolver contentResolver = Main.f5555g.getContentResolver();
        Uri uri = a.b.f6666a;
        if (contentResolver.update(uri, contentValues, "_from=? AND bss_user_id=0", new String[]{string}) == 0) {
            contentResolver.insert(uri, contentValues);
        }
        return location;
    }

    public static Location o(w5.d dVar, long j10, int i10, int i11) {
        Double d10;
        String str = dVar.f31252c;
        Location location = null;
        if (TextUtils.isEmpty(str)) {
            long j11 = dVar.f31260t;
            if (j11 == 0) {
                return null;
            }
            str = String.format(Locale.ENGLISH, "UID%d", Long.valueOf(j11));
        }
        if (!dVar.y()) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("date", Long.valueOf(j10));
        if (str != null) {
            contentValues.put("_from", str);
        }
        String str2 = dVar.f31253d;
        if (str2 != null) {
            contentValues.put("_to", str2);
        }
        String str3 = dVar.f31254e;
        if (str3 != null) {
            contentValues.put("_group", str3);
        }
        long j12 = dVar.f31260t;
        if (j12 != 0) {
            contentValues.put("bss_user_id", Long.valueOf(j12));
        }
        if (dVar.f31257h != null && (d10 = dVar.f31256g) != null) {
            contentValues.put("latitude", d10);
            contentValues.put("longitude", dVar.f31257h);
            location = new Location("gps");
            location.setLatitude(dVar.f31256g.doubleValue());
            location.setLongitude(dVar.f31257h.doubleValue());
        }
        contentValues.put("protocol", (Integer) 1);
        contentValues.put("type", Integer.valueOf(i10));
        contentValues.put("altitude", dVar.t());
        contentValues.put("course", Integer.valueOf(dVar.v()));
        contentValues.put("speed", Float.valueOf(dVar.w()));
        contentValues.put("freq", Integer.valueOf(i11));
        ContentResolver contentResolver = Main.f5555g.getContentResolver();
        if (dVar.f31260t != 0) {
            Uri uri = a.b.f6666a;
            if (contentResolver.update(uri, contentValues, "bss_user_id=?", new String[]{"" + dVar.f31260t}) == 0) {
                contentResolver.insert(uri, contentValues);
                return location;
            }
        } else {
            Uri uri2 = a.b.f6666a;
            if (contentResolver.update(uri2, contentValues, "_from=? AND bss_user_id=0", new String[]{str}) == 0) {
                contentResolver.insert(uri2, contentValues);
            }
        }
        return location;
    }

    public static void p(w5.h hVar, int i10, int i11) {
        if (hVar == null) {
            if (i11 != 0) {
                return;
            } else {
                return;
            }
        }
        try {
            w5.d dVar = (w5.d) hVar.g(w5.d.class);
            if (dVar != null) {
                Location locationO = o(dVar, System.currentTimeMillis(), i10, i11);
                if (i11 != 0) {
                    q(locationO);
                    return;
                }
                return;
            }
            w5.c cVar = (w5.c) hVar.g(w5.c.class);
            if (cVar == null) {
                if (i11 != 0) {
                    q(null);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            w5.h hVar2 = hVar.f31316b;
            if (hVar2 instanceof w5.a) {
                long jN = ((w5.a) hVar2).N();
                if (jN < jCurrentTimeMillis && jN != 0) {
                    jCurrentTimeMillis = jN;
                }
            }
            Location locationN = n(cVar, jCurrentTimeMillis, i10, i11);
            if (i11 != 0) {
                q(locationN);
            }
        } finally {
            if (i11 != 0) {
                q(null);
            }
        }
    }

    public static void q(Location location) {
        f10615t = location;
        mi.c.e().m(b.LastRxLocationChanged);
    }

    public static void s(d dVar) {
        f10616u = dVar;
        mi.c.e().m(b.ShowTrackChanged);
    }

    @Override // d5.c
    public Location a() {
        if (this.f10602d == Double.MAX_VALUE || this.f10603e == Double.MAX_VALUE) {
            return null;
        }
        Location location = new Location("");
        location.setLatitude(this.f10602d);
        location.setLongitude(this.f10603e);
        return location;
    }

    @Override // d5.c
    public boolean e() {
        return (this.f10602d == Double.MAX_VALUE || this.f10603e == Double.MAX_VALUE) ? false : true;
    }

    public void f(ContentResolver contentResolver) {
        contentResolver.delete(ContentUris.withAppendedId(a.b.f6666a, this.f10611m), null, null);
    }

    public LatLng g() {
        if (this.f10602d == Double.MAX_VALUE || this.f10603e == Double.MAX_VALUE) {
            return null;
        }
        return new LatLng(this.f10602d, this.f10603e);
    }

    public boolean i() {
        return this.f10620s;
    }

    public boolean j() {
        return this.f10619r;
    }

    public void r(boolean z10) {
        if (this.f10620s == z10) {
            return;
        }
        this.f10620s = z10;
        long j10 = this.f10611m;
        if (j10 < 0) {
            com.dw.ht.satellite.b.T(-((int) j10), z10);
            return;
        }
        if (z10) {
            s(this);
        } else {
            d dVar = f10616u;
            if (dVar == this || (dVar != null && dVar.f10611m == j10)) {
                s(null);
            } else {
                mi.c.e().m(b.ShowTrackChanged);
            }
        }
        if (this.f10611m <= 0) {
            return;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("show_track", (Integer) 0);
        ContentResolver contentResolver = com.dw.ht.o.d().e().getContentResolver();
        if (z10) {
            contentResolver.update(a.b.f6666a, contentValues, null, null);
        }
        contentValues.put("show_track", Integer.valueOf(z10 ? 1 : 0));
        contentResolver.update(ContentUris.withAppendedId(a.b.f6666a, this.f10611m), contentValues, null, null);
    }

    public void t(boolean z10) {
        if (this.f10619r == z10) {
            return;
        }
        this.f10619r = z10;
        long j10 = this.f10611m;
        if (j10 < 0) {
            com.dw.ht.satellite.b.U(-((int) j10), z10);
            return;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("starred", Integer.valueOf(z10 ? 1 : 0));
        com.dw.ht.o.d().e().getContentResolver().update(ContentUris.withAppendedId(a.b.f6666a, this.f10611m), contentValues, null, null);
    }

    public d(Cursor cursor) {
        this.f10611m = cursor.getLong(0);
        this.f10612n = cursor.getLong(1);
        this.f10610l = cursor.getString(2);
        this.f10599a = cursor.getString(3);
        this.f10600b = cursor.getString(4);
        this.f10601c = cursor.getString(5);
        this.f10606h = cursor.getFloat(13);
        this.f10605g = cursor.getInt(14);
        if (!cursor.isNull(6)) {
            this.f10604f = Integer.valueOf(cursor.getInt(18));
        }
        if (cursor.isNull(6)) {
            this.f10602d = Double.MAX_VALUE;
        } else {
            this.f10602d = cursor.getDouble(6);
        }
        if (cursor.isNull(7)) {
            this.f10603e = Double.MAX_VALUE;
        } else {
            this.f10603e = cursor.getDouble(7);
        }
        this.f10607i = cursor.getString(8);
        this.f10614p = cursor.getInt(9);
        this.f10609k = cursor.getInt(10);
        this.f10608j = cursor.getString(11);
        this.f10613o = cursor.getLong(12);
        this.f10618q = cursor.getInt(15);
        this.f10619r = cursor.getInt(16) == 1;
        this.f10620s = cursor.getInt(17) == 1;
    }
}
