package com.dw.ht.provider;

import a6.x;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.dw.ht.o;
import com.dw.ht.provider.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends SQLiteOpenHelper {
    public b(Context context) {
        super(context, "data.db", (SQLiteDatabase.CursorFactory) null, 20);
    }

    private void G(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", "bclo")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD bclo INTEGER NOT NULL DEFAULT 0");
    }

    private void H(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", "group_id")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD group_id INTEGER NOT NULL DEFAULT 0");
    }

    private void S(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "location_map", "altitude")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE location_map ADD altitude INTEGER");
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD altitude INTEGER");
    }

    private void T(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "sessions", "have_pic")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD have_pic INTEGER NOT NULL DEFAULT 0");
    }

    private void W(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", a.C0096a.f6665c)) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD " + a.C0096a.f6665c + " INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD sign INTEGER NOT NULL DEFAULT 0");
    }

    private void X(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "sessions", "rx_latitude")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD rx_latitude DOUBLE");
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD rx_longitude DOUBLE");
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS channels (_id INTEGER PRIMARY KEY AUTOINCREMENT,title TEXT NOT NULL DEFAULT '',tx_freq INTEGER NOT NULL DEFAULT 0,rx_freq INTEGER NOT NULL DEFAULT 0,rx_color INTEGER NOT NULL DEFAULT 0,tx_color INTEGER NOT NULL DEFAULT 0,slot INTEGER NOT NULL DEFAULT 0,group_id INTEGER NOT NULL DEFAULT 0,tx_modulation INTEGER NOT NULL DEFAULT 0,rx_modulation INTEGER NOT NULL DEFAULT 0,tx_sub_audio INTEGER NOT NULL DEFAULT 0,rx_sub_audio INTEGER NOT NULL DEFAULT 0,bandwidth INTEGER NOT NULL DEFAULT 0,tx_power INTEGER NOT NULL DEFAULT 0,scan INTEGER NOT NULL DEFAULT 0,offline INTEGER NOT NULL DEFAULT 0,sign INTEGER NOT NULL DEFAULT 0,tx_dis INTEGER NOT NULL DEFAULT 0,bclo INTEGER NOT NULL DEFAULT 0,mute INTEGER NOT NULL DEFAULT 0," + a.C0096a.f6665c + " INTEGER NOT NULL DEFAULT 0,last_use INTEGER NOT NULL DEFAULT 0,note TEXT NOT NULL DEFAULT '');");
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS location_map (_id INTEGER PRIMARY KEY AUTOINCREMENT,type INTEGER NOT NULL DEFAULT 0,text TEXT NOT NULL DEFAULT '',date INTEGER NOT NULL DEFAULT 0,_from TEXT NOT NULL DEFAULT '',_to TEXT NOT NULL DEFAULT '',_group TEXT NOT NULL DEFAULT '',repeaters TEXT NOT NULL DEFAULT '',symbol TEXT NOT NULL DEFAULT '',latitude DOUBLE,longitude DOUBLE,altitude INTEGER,course INTEGER NOT NULL DEFAULT 0,speed DOUBLE NOT NULL DEFAULT 0,bss_user_id INTEGER NOT NULL DEFAULT 0,freq INTEGER NOT NULL DEFAULT 0,protocol INTEGER NOT NULL DEFAULT 0,starred INTEGER NOT NULL DEFAULT 0,show_track INTEGER NOT NULL DEFAULT 0);");
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS regions (_id INTEGER PRIMARY KEY AUTOINCREMENT,title TEXT NOT NULL DEFAULT '',channels TEXT NOT NULL DEFAULT '',note TEXT NOT NULL DEFAULT '');");
    }

    private void h0(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "sessions", "freq")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD freq INTEGER NOT NULL DEFAULT 0");
    }

    private void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT,text TEXT NOT NULL DEFAULT '',date INTEGER NOT NULL DEFAULT 0,duration INTEGER NOT NULL DEFAULT 0,type INTEGER NOT NULL DEFAULT 0,data_type INTEGER NOT NULL DEFAULT 0,is_read INTEGER NOT NULL DEFAULT 0,have_pic INTEGER NOT NULL DEFAULT 0,note TEXT NOT NULL DEFAULT '',dev_id INTEGER NOT NULL DEFAULT 0,audio BLOB,_from TEXT NOT NULL DEFAULT '',_to TEXT NOT NULL DEFAULT '',_group TEXT NOT NULL DEFAULT '',repeaters TEXT NOT NULL DEFAULT '',symbol TEXT NOT NULL DEFAULT '',latitude DOUBLE,longitude DOUBLE,rx_latitude DOUBLE,rx_longitude DOUBLE,altitude INTEGER,course INTEGER NOT NULL DEFAULT 0,speed DOUBLE NOT NULL DEFAULT 0,bss_user_id INTEGER NOT NULL DEFAULT 0,freq INTEGER NOT NULL DEFAULT 0,protocol INTEGER NOT NULL DEFAULT 0);");
    }

    private void l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS users (_id INTEGER PRIMARY KEY AUTOINCREMENT,user_id INTEGER NOT NULL UNIQUE,update_at INTEGER NOT NULL DEFAULT 0,sync_at INTEGER NOT NULL DEFAULT 0,user_name TEXT NOT NULL DEFAULT '',nickname TEXT NOT NULL DEFAULT '',photo BLOB );");
    }

    private boolean n(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            return cursorRawQuery.getColumnIndex(str2) >= 0;
        } finally {
            cursorRawQuery.close();
        }
    }

    private void p0(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", "tx_dis")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD tx_dis INTEGER NOT NULL DEFAULT 0");
    }

    private void q(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "location_map", "freq")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE location_map ADD freq INTEGER NOT NULL DEFAULT 0");
    }

    private void r(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", "last_use")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD last_use INTEGER NOT NULL DEFAULT 0");
    }

    private void s(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "location_map", "starred")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE location_map ADD starred INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE location_map ADD show_track INTEGER NOT NULL DEFAULT 0");
        d5.b bVar = d5.b.f10596a;
        String[] strArrB = bVar.b();
        if (strArrB == null || strArrB.length <= 0) {
            return;
        }
        sQLiteDatabase.execSQL("UPDATE location_map SET starred=1 WHERE _from IN (" + x.a(",", "?", strArrB.length) + ")", strArrB);
        bVar.a();
    }

    private void t0(SQLiteDatabase sQLiteDatabase) {
        if (!n(sQLiteDatabase, "location_map", "speed")) {
            sQLiteDatabase.execSQL("ALTER TABLE location_map ADD course INTEGER NOT NULL DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE location_map ADD speed DOUBLE NOT NULL DEFAULT 0");
        }
        if (n(sQLiteDatabase, "sessions", "speed")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD course INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD speed DOUBLE NOT NULL DEFAULT 0");
    }

    private void v(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", "mute")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD mute INTEGER NOT NULL DEFAULT 0");
    }

    private void w(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", "rx_modulation")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD rx_modulation INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD tx_modulation INTEGER NOT NULL DEFAULT 0");
    }

    private void x(SQLiteDatabase sQLiteDatabase) {
        if (n(sQLiteDatabase, "channels", "rx_color")) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD rx_color INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD tx_color INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE channels ADD slot INTEGER NOT NULL DEFAULT 0");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
        k(sQLiteDatabase);
        a(sQLiteDatabase);
        e(sQLiteDatabase);
        o.d().c(sQLiteDatabase);
        l(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        switch (i10) {
            case 1:
                W(sQLiteDatabase);
            case 2:
                X(sQLiteDatabase);
            case 3:
                h0(sQLiteDatabase);
            case 4:
                l(sQLiteDatabase);
            case 5:
            case 6:
            case 7:
            case 8:
                p0(sQLiteDatabase);
            case 9:
                t0(sQLiteDatabase);
            case 10:
                q(sQLiteDatabase);
            case 11:
                r(sQLiteDatabase);
            case 12:
                s(sQLiteDatabase);
            case 13:
                v(sQLiteDatabase);
            case 14:
                w(sQLiteDatabase);
            case 15:
                x(sQLiteDatabase);
            case 16:
                G(sQLiteDatabase);
            case 17:
                H(sQLiteDatabase);
            case 18:
                S(sQLiteDatabase);
            case 19:
                T(sQLiteDatabase);
                break;
        }
    }
}
