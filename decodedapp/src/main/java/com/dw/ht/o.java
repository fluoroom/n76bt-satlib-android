package com.dw.ht;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.dw.ht.Cfg;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: b */
    public static final a f6637b = new a(null);

    /* JADX INFO: renamed from: c */
    private static volatile o f6638c;

    /* JADX INFO: renamed from: a */
    private WeakReference f6639a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final o a() {
            o oVar = o.f6638c;
            rd.m.b(oVar);
            return oVar;
        }

        protected final void b(o oVar) {
            o.f6638c = oVar;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a {

            /* JADX INFO: renamed from: a */
            private short[] f6640a;

            /* JADX INFO: renamed from: b */
            private int f6641b;

            /* JADX INFO: renamed from: c */
            private int f6642c;

            public a(short[] sArr, int i10, int i11) {
                rd.m.e(sArr, "data");
                this.f6640a = sArr;
                this.f6641b = i10;
                this.f6642c = i11;
            }

            public final int a() {
                return this.f6642c;
            }

            public final short[] b() {
                return this.f6640a;
            }

            public final int c() {
                return this.f6641b;
            }
        }

        void a();

        a b(short[] sArr, int i10, int i11);
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        private int f6643a;

        /* JADX INFO: renamed from: b */
        private nb.b f6644b;

        /* JADX INFO: renamed from: c */
        private nb.a f6645c;

        /* JADX INFO: renamed from: d */
        private final b6.d f6646d = new b6.d(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);

        /* JADX INFO: renamed from: e */
        private final b6.d f6647e = new b6.d(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);

        /* JADX INFO: renamed from: f */
        private final short[] f6648f = new short[160];

        public c(int i10) {
            this.f6643a = i10;
            Cfg.Settings settingsO = Cfg.O();
            if (settingsO.audioOutputNS) {
                this.f6644b = new nb.b(this.f6643a, 2, 1);
            }
            if (settingsO.audioOutputAGC) {
                this.f6645c = new nb.a(this.f6643a, 1);
            }
        }

        @Override // com.dw.ht.o.b
        public void a() {
            nb.b bVar = this.f6644b;
            if (bVar != null) {
                bVar.c();
            }
            nb.a aVar = this.f6645c;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.dw.ht.o.b
        public b.a b(short[] sArr, int i10, int i11) {
            rd.m.e(sArr, "audio");
            if (i11 > this.f6646d.b()) {
                throw new RuntimeException("输出滤波器的输入数据太多");
            }
            this.f6646d.o(sArr, i10, i11);
            while (true) {
                int iC = this.f6646d.c();
                short[] sArr2 = this.f6648f;
                if (iC < sArr2.length) {
                    short[] sArrK = this.f6647e.k();
                    rd.m.d(sArrK, "getBase(...)");
                    b.a aVar = new b.a(sArrK, 0, this.f6647e.c());
                    this.f6647e.e();
                    return aVar;
                }
                this.f6646d.l(sArr2, 0, sArr2.length);
                nb.b bVar = this.f6644b;
                if (bVar != null) {
                    short[] sArr3 = this.f6648f;
                    bVar.b(sArr3, sArr3);
                }
                nb.a aVar2 = this.f6645c;
                if (aVar2 != null) {
                    short[] sArr4 = this.f6648f;
                    aVar2.b(sArr4, sArr4);
                }
                b6.d dVar = this.f6647e;
                short[] sArr5 = this.f6648f;
                dVar.o(sArr5, 0, sArr5.length);
            }
        }
    }

    public static final o d() {
        return f6637b.a();
    }

    protected static final void l(o oVar) {
        f6637b.b(oVar);
    }

    public void c(SQLiteDatabase sQLiteDatabase) {
        rd.m.e(sQLiteDatabase, "db");
        if ("google" == "btech") {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("bandwidth", (Integer) 25000);
        contentValues.put("tx_power", (Integer) 0);
        if (!Cfg.f5482d) {
            contentValues.put("scan", (Integer) 1);
        }
        contentValues.put("sign", (Integer) 1);
        int i10 = 430075000;
        for (int i11 = 0; i11 < 20; i11++) {
            contentValues.put("rx_freq", Integer.valueOf(i10));
            contentValues.put("tx_freq", Integer.valueOf(i10));
            i10 += 500000;
            sQLiteDatabase.insert("channels", null, contentValues);
        }
        contentValues.clear();
        contentValues.put("channels", "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16");
        sQLiteDatabase.insert("regions", null, contentValues);
    }

    public abstract Context e();

    public boolean f() {
        return true;
    }

    public b g(int i10) {
        Cfg.Settings settingsO = Cfg.O();
        if (settingsO.audioOutputNS || settingsO.audioOutputAGC) {
            return new c(i10);
        }
        return null;
    }

    public final m0 h() {
        return j();
    }

    public final Context i() {
        Context context;
        WeakReference weakReference = this.f6639a;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            return context;
        }
        Main main = Main.f5555g;
        rd.m.d(main, "sMain");
        return main;
    }

    public abstract m0 j();

    public boolean k() {
        return true;
    }

    public final void m(Context context) {
        rd.m.e(context, "value");
        this.f6639a = new WeakReference(context);
    }
}
