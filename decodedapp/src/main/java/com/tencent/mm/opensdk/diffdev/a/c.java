package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;

/* JADX INFO: loaded from: classes3.dex */
class c extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OAuthListener f10300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10301d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f10302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10304c;

        a() {
        }
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f10298a = str;
        this.f10300c = oAuthListener;
        this.f10299b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1 A[Catch: Exception -> 0x00c6, TryCatch #1 {Exception -> 0x00c6, blocks: (B:20:0x008d, B:22:0x009c, B:26:0x00b5, B:28:0x00b9, B:31:0x00c8, B:35:0x00d3, B:32:0x00cb, B:33:0x00ce, B:34:0x00d1), top: B:66:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.tencent.mm.opensdk.diffdev.a.c.a doInBackground(java.lang.Void[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.diffdev.a.c.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f10300c.onAuthFinish(aVar2.f10302a, aVar2.f10303b);
    }
}
