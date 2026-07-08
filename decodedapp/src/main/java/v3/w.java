package v3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class w extends androidx.fragment.app.o {
    public static w S3(String str, String str2) {
        w wVar = new w();
        Bundle bundle = new Bundle(2);
        bundle.putString("android.intent.extra.TEXT", str);
        bundle.putString("encoding", str2);
        wVar.E3(bundle);
        return wVar;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Bundle bundleI1 = i1();
        if (bundleI1 == null) {
            return null;
        }
        String string = bundleI1.getString("android.intent.extra.TEXT");
        String string2 = bundleI1.getString("encoding");
        int i10 = bundleI1.getInt("raw_res_id");
        if (i10 != 0) {
            InputStream inputStreamOpenRawResource = H1().openRawResource(i10);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource);
            try {
                try {
                    char[] cArr = new char[inputStreamOpenRawResource.available()];
                    inputStreamReader.read(cArr);
                    String str2 = new String(cArr);
                    a6.m.b(inputStreamReader);
                    str = str2;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    a6.m.b(inputStreamReader);
                    str = string;
                    WebView webView = new WebView(e1());
                    webView.loadDataWithBaseURL(null, str, "text/html", string2, null);
                    return webView;
                }
            } catch (Throwable th2) {
                a6.m.b(inputStreamReader);
                throw th2;
            }
        } else {
            str = string;
        }
        WebView webView2 = new WebView(e1());
        webView2.loadDataWithBaseURL(null, str, "text/html", string2, null);
        return webView2;
    }
}
