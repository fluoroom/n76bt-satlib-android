package hb;

import android.text.TextUtils;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15206a = 15000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15207b = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15208c;

    public b(String str) {
        this.f15208c = str;
    }

    private g d(String str, int i10) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        c cVar;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                g(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    try {
                        byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
                        while (true) {
                            int i11 = inputStream.read(bArr);
                            if (i11 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i11);
                        }
                        cVar = new c(httpURLConnection, byteArrayOutputStream.toString(), httpURLConnection.getContentLength(), i10, httpURLConnection.getResponseCode(), "");
                        f(byteArrayOutputStream);
                        f(inputStream);
                    } catch (Throwable th4) {
                        th2 = th4;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        f(byteArrayOutputStream2);
                        f(inputStream);
                        h(httpURLConnection);
                        throw th2;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "请求失败 code:" + httpURLConnection.getResponseCode();
                    }
                    cVar = new c(httpURLConnection, "", httpURLConnection.getContentLength(), i10, httpURLConnection.getResponseCode(), responseMessage);
                    f(null);
                    f(null);
                }
                h(httpURLConnection);
                return cVar;
            } catch (Throwable th5) {
                th2 = th5;
                inputStream = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    private g e(String str, int i10, String str2) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        c cVar;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                g(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Utf8Charset.NAME);
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
                            while (true) {
                                int i11 = inputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, i11);
                            }
                            cVar = new c(httpURLConnection, byteArrayOutputStream2.toString(), contentLength, i10, httpURLConnection.getResponseCode(), "");
                            f(byteArrayOutputStream2);
                            f(inputStream);
                        } catch (Throwable th3) {
                            th2 = th3;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            f(byteArrayOutputStream);
                            f(inputStream);
                            h(httpURLConnection);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "Unknown fail: " + httpURLConnection.getResponseCode();
                    }
                    cVar = new c(httpURLConnection, "", 0, i10, httpURLConnection.getResponseCode(), responseMessage);
                    f(null);
                    f(null);
                }
                h(httpURLConnection);
                return cVar;
            } catch (Throwable th5) {
                th2 = th5;
                inputStream = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            inputStream = null;
            httpURLConnection = null;
        }
    }

    private static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f15208c);
        httpURLConnection.setConnectTimeout(this.f15206a);
        httpURLConnection.setReadTimeout(this.f15207b);
        httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", Utf8Charset.NAME);
    }

    private static void h(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // hb.a
    public g a(String str, Map map) {
        jb.a.j("DefaultHttpServiceImpl", "post. ");
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append('&');
            }
            sb2.append(URLEncoder.encode((String) entry.getKey(), Utf8Charset.NAME));
            sb2.append('=');
            sb2.append(URLEncoder.encode((String) entry.getValue(), Utf8Charset.NAME));
        }
        String string = sb2.toString();
        return e(str, string.length(), string);
    }

    @Override // hb.a
    public g b(String str, String str2) {
        jb.a.j("DefaultHttpServiceImpl", "get. ");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str + "&";
            }
            str = str + str2;
        }
        return d(str, str2.length());
    }

    @Override // hb.a
    public void c(long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            return;
        }
        this.f15206a = (int) j10;
        this.f15207b = (int) j11;
    }
}
