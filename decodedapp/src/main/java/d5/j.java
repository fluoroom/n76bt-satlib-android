package d5;

import a6.w;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import com.benshikj.ht.rpc.Um;
import com.dw.ht.Main;
import com.dw.ht.provider.a;

/* JADX INFO: loaded from: classes.dex */
public class j extends g4.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f10666h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f10667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f10668s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f10669a = {"_id", "user_id", "user_name", "nickname", "photo", "sync_at", "update_at"};
    }

    public j(Cursor cursor) {
        super(cursor.getLong(0));
        this.f10664f = cursor.getString(2);
        this.f10665g = cursor.getString(3);
        this.f10663e = cursor.getLong(1);
        this.f10666h = cursor.getBlob(4);
        this.f10667r = cursor.getLong(6);
        this.f10668s = cursor.getLong(5);
    }

    public static j k(long j10) {
        Cursor cursorQuery = Main.f5556h.query(a.e.f6669a, a.f10669a, "user_id=" + j10, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            j jVar = new j(cursorQuery);
            cursorQuery.close();
            return jVar;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public static j m(Um.UserPublicProfile userPublicProfile) {
        j jVar = new j(userPublicProfile);
        jVar.n();
        return jVar;
    }

    public String j() {
        return !w.b(this.f10665g) ? this.f10665g : !w.b(this.f10664f) ? this.f10664f : "";
    }

    public void n() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_id", Long.valueOf(this.f10663e));
        String str = this.f10664f;
        if (str == null) {
            str = "";
        }
        contentValues.put("user_name", str);
        String str2 = this.f10665g;
        contentValues.put("nickname", str2 != null ? str2 : "");
        contentValues.put("photo", this.f10666h);
        contentValues.put("sync_at", Long.valueOf(this.f10668s));
        contentValues.put("update_at", Long.valueOf(this.f10667r));
        long j10 = this.f13515c;
        if (j10 != 0) {
            Main.f5556h.update(ContentUris.withAppendedId(a.e.f6669a, j10), contentValues, null, null);
        } else {
            this.f13515c = ContentUris.parseId(Main.f5556h.insert(a.e.f6669a, contentValues));
        }
        g();
    }

    public void o(Um.UserPublicProfile userPublicProfile) {
        this.f10663e = userPublicProfile.getUid();
        this.f10664f = userPublicProfile.getUsername();
        this.f10665g = userPublicProfile.getNickname();
        this.f10666h = userPublicProfile.getPhoto().C();
        this.f10667r = userPublicProfile.getUpdateAt();
        this.f10668s = System.currentTimeMillis();
    }

    public j(Um.UserPublicProfile userPublicProfile) {
        super(0L);
        o(userPublicProfile);
    }
}
