package om.sstvencoder;

import android.content.Context;
import android.net.Uri;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f23829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f23830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f23831f;

    private f() {
        this.f23826a = 1;
        this.f23827b = "settings.json";
        this.f23829d = om.sstvencoder.Modes.b.c();
    }

    private File a() {
        return new File(this.f23828c.getFilesDir(), this.f23827b);
    }

    private void f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        if (j(jsonReader) == this.f23826a) {
            h(jsonReader);
            g(jsonReader);
            i(jsonReader);
        }
        jsonReader.endObject();
    }

    private void g(JsonReader jsonReader) throws IOException {
        jsonReader.nextName();
        if (jsonReader.peek() != JsonToken.NULL) {
            this.f23830e = jsonReader.nextString();
        } else {
            jsonReader.nextNull();
            this.f23830e = null;
        }
    }

    private void h(JsonReader jsonReader) throws IOException {
        jsonReader.nextName();
        this.f23829d = jsonReader.nextString();
    }

    private void i(JsonReader jsonReader) throws IOException {
        jsonReader.nextName();
        this.f23831f = jsonReader.nextString();
    }

    private int j(JsonReader jsonReader) throws IOException {
        jsonReader.nextName();
        return jsonReader.nextInt();
    }

    private void n(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        r(jsonWriter);
        p(jsonWriter);
        o(jsonWriter);
        q(jsonWriter);
        jsonWriter.endObject();
    }

    private void o(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("image_uri").value(this.f23830e);
    }

    private void p(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("mode_class_name").value(this.f23829d);
    }

    private void q(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("text_overlay_path").value(this.f23831f);
    }

    private void r(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("version").value(this.f23826a);
    }

    Uri b() {
        String str = this.f23830e;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    String c() {
        return this.f23829d;
    }

    File d() {
        if (this.f23831f == null) {
            this.f23831f = new File(this.f23828c.getFilesDir(), "text_overlay.json").getPath();
        }
        return new File(this.f23831f);
    }

    boolean e() throws Throwable {
        JsonReader jsonReader;
        Throwable th2;
        JsonReader jsonReader2 = null;
        try {
            jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(a()), Utf8Charset.NAME));
        } catch (Exception unused) {
        } catch (Throwable th3) {
            jsonReader = null;
            th2 = th3;
        }
        try {
            f(jsonReader);
            try {
                jsonReader.close();
            } catch (Exception unused2) {
            }
            return true;
        } catch (Exception unused3) {
            jsonReader2 = jsonReader;
            if (jsonReader2 != null) {
                try {
                    jsonReader2.close();
                } catch (Exception unused4) {
                }
            }
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            if (jsonReader != null) {
                try {
                    jsonReader.close();
                } catch (Exception unused5) {
                }
            }
            throw th2;
        }
    }

    boolean k() throws Throwable {
        JsonWriter jsonWriter;
        Throwable th2;
        JsonWriter jsonWriter2 = null;
        try {
            jsonWriter = new JsonWriter(new OutputStreamWriter(new FileOutputStream(a()), Utf8Charset.NAME));
        } catch (Exception unused) {
        } catch (Throwable th3) {
            jsonWriter = null;
            th2 = th3;
        }
        try {
            jsonWriter.setIndent(" ");
            n(jsonWriter);
            try {
                jsonWriter.close();
            } catch (Exception unused2) {
            }
            return true;
        } catch (Exception unused3) {
            jsonWriter2 = jsonWriter;
            if (jsonWriter2 != null) {
                try {
                    jsonWriter2.close();
                } catch (Exception unused4) {
                }
            }
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            if (jsonWriter != null) {
                try {
                    jsonWriter.close();
                } catch (Exception unused5) {
                }
            }
            throw th2;
        }
    }

    public void l(Uri uri) {
        this.f23830e = uri == null ? null : uri.toString();
    }

    void m(String str) {
        this.f23829d = str;
    }

    f(Context context) {
        this();
        this.f23828c = context;
    }
}
