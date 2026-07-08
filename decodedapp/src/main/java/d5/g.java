package d5;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.provider.a;
import com.dw.mdc.Packet;
import g4.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
public class g extends d5.c {

    /* JADX INFO: renamed from: q */
    public long f10633q;

    /* JADX INFO: renamed from: r */
    public int f10634r;

    /* JADX INFO: renamed from: s */
    public int f10635s;

    /* JADX INFO: renamed from: t */
    public boolean f10636t;

    /* JADX INFO: renamed from: u */
    public double f10637u;

    /* JADX INFO: renamed from: v */
    public double f10638v;

    /* JADX INFO: renamed from: w */
    public int f10639w;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f10640a;

        static {
            int[] iArr = new int[d.b.values().length];
            f10640a = iArr;
            try {
                iArr[d.b.BA_ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10640a[d.b.BA_ALARM_AND_MUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a */
        public String f10641a;

        /* JADX INFO: renamed from: b */
        public long f10642b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f10643c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public String f10644d;

        /* JADX INFO: renamed from: e */
        public boolean f10645e;

        /* JADX INFO: renamed from: f */
        public boolean f10646f;

        /* JADX INFO: renamed from: g */
        public long f10647g;

        /* JADX INFO: renamed from: h */
        public boolean f10648h;

        /* JADX INFO: renamed from: i */
        public boolean f10649i;

        public g4.f a() {
            g4.f fVar = this.f10645e ? new g4.f("data_type=?", new String[]{String.valueOf(1)}) : null;
            if (this.f10649i) {
                fVar = new g4.f("have_pic=?", new String[]{String.valueOf(1)}).h(fVar);
            }
            if (this.f10642b != 0) {
                g4.f fVar2 = new g4.f("dev_id=?", new String[]{String.valueOf(this.f10642b)});
                if (!this.f10643c.isEmpty()) {
                    fVar2 = new f.b().i("dev_id", this.f10643c).g().h(new g4.f("type=1")).r(fVar2);
                }
                fVar = fVar2.h(fVar);
            }
            if (!TextUtils.isEmpty(this.f10641a)) {
                if (this.f10646f) {
                    String str = this.f10641a;
                    fVar = new g4.f("_from=? OR _to=?", new String[]{str, str}).h(fVar);
                } else {
                    fVar = new g4.f("_from=?", new String[]{this.f10641a}).h(fVar);
                }
            }
            if (!TextUtils.isEmpty(this.f10644d)) {
                String str2 = "%" + this.f10644d + "%";
                fVar = new g4.f("_from LIKE(?) OR _to LIKE(?) OR repeaters LIKE(?) OR text LIKE(?) OR freq LIKE(?)", new String[]{str2, str2, str2, str2, this.f10644d.replaceAll("\\.", "") + "%"}).h(fVar);
            }
            if (this.f10647g != 0) {
                fVar = new g4.f("bss_user_id=?", new String[]{String.valueOf(this.f10647g)}).h(fVar);
            }
            if (this.f10648h) {
                fVar = new g4.f("data_type!=3").h(fVar);
            }
            return fVar == null ? new g4.f() : fVar;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a */
        public static final String[] f10650a = {"_id", "date", "duration", "is_read", "type", "dev_id", "text", "_from", "_to", "repeaters", "latitude", "longitude", "symbol", "protocol", "_group", "bss_user_id", "rx_latitude", "rx_longitude", "freq", "data_type", "speed", "course", "altitude"};
    }

    public g() {
        this.f10637u = Double.MAX_VALUE;
        this.f10638v = Double.MAX_VALUE;
        this.f10602d = Double.MAX_VALUE;
        this.f10603e = Double.MAX_VALUE;
    }

    public static /* synthetic */ void f(int i10, Uri uri) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("freq", Integer.valueOf(i10));
        Main.f5555g.getContentResolver().update(uri, contentValues, null, null);
    }

    public static void h(ContentResolver contentResolver, long[] jArr) {
        g4.f fVarG = new f.b().j("_id", jArr).g();
        contentResolver.delete(a.d.f6668a, fVarG.n(), fVarG.k());
    }

    public static g j(ContentResolver contentResolver, long j10) {
        return k(contentResolver, ContentUris.withAppendedId(a.d.f6668a, j10));
    }

    public static g k(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = contentResolver.query(uri, c.f10650a, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            g gVar = new g(cursorQuery);
            cursorQuery.close();
            return gVar;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public static byte[] l(ContentResolver contentResolver, long j10) {
        Cursor cursorQuery = contentResolver.query(ContentUris.withAppendedId(a.d.f6668a, j10), new String[]{"audio"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    byte[] blob = cursorQuery.getBlob(0);
                    cursorQuery.close();
                    return blob;
                }
            } finally {
            }
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    public static g[] m(ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(a.d.f6668a, c.f10650a, "data_type=1 AND type=1 AND is_read!=1", null, "date");
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.getCount() == 0) {
                return null;
            }
            g[] gVarArr = new g[cursorQuery.getCount()];
            int i10 = 0;
            while (cursorQuery.moveToNext()) {
                int i11 = i10 + 1;
                gVarArr[i10] = new g(cursorQuery);
                i10 = i11;
            }
            return gVarArr;
        } finally {
            cursorQuery.close();
        }
    }

    public static void n(long[] jArr) {
        g4.f fVarG = new f.b().j("_id", jArr).g();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_read", (Integer) 1);
        Main.f5555g.getContentResolver().update(a.d.f6668a, contentValues, fVarG.n(), fVarG.k());
    }

    public static Uri o(long j10, int i10, int i11, long j11, int i12, String str, Packet[] packetArr, w5.h hVar) {
        return p(j10, 0L, i10, i11, j11, i12, false, str, packetArr, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0404 A[EDGE_INSN: B:317:0x0404->B:314:0x0404 BREAK  A[LOOP:0: B:307:0x03a3->B:313:0x0401], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri p(long r22, long r24, int r26, int r27, long r28, int r30, boolean r31, java.lang.String r32, com.dw.mdc.Packet[] r33, w5.h r34) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.g.p(long, long, int, int, long, int, boolean, java.lang.String, com.dw.mdc.Packet[], w5.h):android.net.Uri");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri q(long r13, long r15, int r17, int r18, w5.h r19) {
        /*
            r12 = r19
            r0 = 0
            if (r12 != 0) goto L6
            return r0
        L6:
            java.lang.Class<w5.d> r1 = w5.d.class
            w5.h r1 = r12.g(r1)
            w5.d r1 = (w5.d) r1
            java.lang.Class<w5.c> r2 = w5.c.class
            w5.h r2 = r12.g(r2)
            w5.c r2 = (w5.c) r2
            if (r1 != 0) goto L1b
            if (r2 != 0) goto L1b
            return r0
        L1b:
            r0 = 0
            if (r2 == 0) goto L2c
            w5.h r2 = r2.f31316b
            boolean r3 = r2 instanceof w5.a
            if (r3 == 0) goto L2c
            w5.a r2 = (w5.a) r2
            long r2 = r2.N()
            goto L2d
        L2c:
            r2 = r0
        L2d:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L35
            long r2 = java.lang.System.currentTimeMillis()
        L35:
            r6 = r2
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r0 = r13
            r2 = r15
            r4 = r17
            r5 = r18
            android.net.Uri r13 = p(r0, r2, r4, r5, r6, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.g.q(long, long, int, int, w5.h):android.net.Uri");
    }

    public static Uri r(long j10, long j11, int i10, w5.h hVar) {
        return q(j10, j11, i10, 1, hVar);
    }

    public static Uri s(String str) {
        return null;
    }

    public static void t(long j10, int i10, int i11, Bitmap bitmap) throws Throwable {
        Uri uriP = p(j10, 0L, i10, i11, System.currentTimeMillis(), 0, true, null, null, null);
        if (uriP != null) {
            u(ContentUris.parseId(uriP), bitmap, uriP);
        }
    }

    public static void u(long j10, Bitmap bitmap, Uri uri) throws Throwable {
        File fileI = Cfg.I(j10);
        if (fileI == null) {
            return;
        }
        fileI.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileI);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    a6.m.b(fileOutputStream2);
                    Main.f5555g.getContentResolver().update(uri, null, null, null);
                } catch (FileNotFoundException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    a6.m.b(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    a6.m.b(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e11) {
            e = e11;
        }
    }

    public static void v(Uri uri, int i10) {
        if (uri == null) {
            return;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("type", Integer.valueOf(i10));
        Main.f5556h.update(uri, contentValues, null, null);
    }

    public static void w(final Uri uri, final int i10) {
        a6.h.a(new Runnable() { // from class: d5.f
            @Override // java.lang.Runnable
            public final void run() {
                g.f(i10, uri);
            }
        });
    }

    @Override // d5.c
    public String b() {
        String strB = super.b();
        int i10 = this.f10635s;
        if (i10 == 0) {
            return strB;
        }
        if (strB == null) {
            return String.format(Locale.ENGLISH, "@%.4f", Float.valueOf(i10 / 1000000.0f));
        }
        return strB + String.format(Locale.ENGLISH, "@%.4f", Float.valueOf(this.f10635s / 1000000.0f));
    }

    public void g(ContentResolver contentResolver) {
        File fileN = Cfg.n(this.f10611m);
        if (fileN != null) {
            fileN.delete();
        }
        File fileI = Cfg.I(this.f10611m);
        if (fileI != null) {
            fileI.delete();
        }
        contentResolver.delete(ContentUris.withAppendedId(a.d.f6668a, this.f10611m), null, null);
    }

    public Location i() {
        if (this.f10602d == Double.MAX_VALUE || this.f10603e == Double.MAX_VALUE) {
            return null;
        }
        Location location = new Location("");
        location.setLatitude(this.f10637u);
        location.setLongitude(this.f10638v);
        return location;
    }

    public void x(ContentResolver contentResolver, String str) {
        if (str == null) {
            str = "";
        }
        this.f10610l = str;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("text", str);
        contentResolver.update(ContentUris.withAppendedId(a.d.f6668a, this.f10611m), contentValues, null, null);
    }

    public g(Cursor cursor) {
        this.f10611m = cursor.getLong(0);
        this.f10612n = cursor.getLong(1);
        this.f10634r = cursor.getInt(2);
        this.f10636t = cursor.getInt(3) == 1;
        this.f10614p = cursor.getInt(4);
        this.f10639w = cursor.getInt(19);
        this.f10609k = cursor.getInt(13);
        this.f10633q = cursor.getLong(5);
        this.f10613o = cursor.getLong(15);
        this.f10610l = cursor.getString(6);
        this.f10599a = cursor.getString(7);
        this.f10600b = cursor.getString(8);
        this.f10608j = cursor.getString(14);
        this.f10601c = cursor.getString(9);
        this.f10606h = cursor.getFloat(20);
        this.f10605g = cursor.getInt(21);
        if (!cursor.isNull(22)) {
            this.f10604f = Integer.valueOf(cursor.getInt(22));
        }
        this.f10635s = cursor.getInt(18);
        if (cursor.isNull(10)) {
            this.f10602d = Double.MAX_VALUE;
        } else {
            this.f10602d = cursor.getDouble(10);
        }
        if (cursor.isNull(11)) {
            this.f10603e = Double.MAX_VALUE;
        } else {
            this.f10603e = cursor.getDouble(11);
        }
        if (cursor.isNull(16)) {
            this.f10637u = Double.MAX_VALUE;
        } else {
            this.f10637u = cursor.getDouble(16);
        }
        if (cursor.isNull(17)) {
            this.f10638v = Double.MAX_VALUE;
        } else {
            this.f10638v = cursor.getDouble(17);
        }
        this.f10607i = cursor.getString(12);
    }
}
