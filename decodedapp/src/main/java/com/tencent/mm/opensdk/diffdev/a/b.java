package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OAuthListener f10291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f10292g;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f10293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f10295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f10296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f10297e;

        private a() {
        }

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            a aVar = new a();
            if (bArr != null && bArr.length != 0) {
                try {
                } catch (Exception e10) {
                    str = String.format("parse fail, build String fail, ex = %s", e10.getMessage());
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                    int i10 = jSONObject.getInt("errcode");
                    if (i10 != 0) {
                        Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i10)));
                        aVar.f10293a = OAuthErrCode.WechatAuth_Err_NormalErr;
                        jSONObject.optString("errmsg");
                        return aVar;
                    }
                    String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                    if (string == null || string.length() == 0) {
                        Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                    } else {
                        byte[] bArrDecode = Base64.decode(string, 0);
                        if (bArrDecode != null && bArrDecode.length != 0) {
                            aVar.f10293a = OAuthErrCode.WechatAuth_Err_OK;
                            aVar.f10297e = bArrDecode;
                            aVar.f10294b = jSONObject.getString("uuid");
                            String string2 = jSONObject.getString("appname");
                            aVar.f10295c = string2;
                            Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f10294b, string2, Integer.valueOf(aVar.f10297e.length)));
                            return aVar;
                        }
                        Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                    }
                    aVar.f10293a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                    return aVar;
                } catch (Exception e11) {
                    str = String.format("parse json fail, ex = %s", e11.getMessage());
                    Log.e("MicroMsg.SDK.GetQRCodeResult", str);
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f10293a = oAuthErrCode;
                    return aVar;
                }
            }
            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.f10293a = oAuthErrCode;
            return aVar;
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f10286a = str;
        this.f10287b = str2;
        this.f10288c = str3;
        this.f10289d = str4;
        this.f10290e = str5;
        this.f10291f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.f10292g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f10286a, this.f10288c, this.f10289d, this.f10287b, this.f10290e);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(str, 60000);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.a(bArrA);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f10293a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f10291f.onAuthFinish(aVar2.f10293a, null);
            return;
        }
        Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f10297e.length);
        this.f10291f.onAuthGotQrcode(aVar2.f10296d, aVar2.f10297e);
        c cVar = new c(aVar2.f10294b, this.f10291f);
        this.f10292g = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
