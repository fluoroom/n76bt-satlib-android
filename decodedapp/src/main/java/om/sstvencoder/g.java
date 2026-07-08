package om.sstvencoder;

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
class g {

    private class b implements bi.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JsonReader f23832a;

        @Override // bi.a
        public void a() throws IOException {
            this.f23832a.beginObject();
        }

        @Override // bi.a
        public void b() throws IOException {
            this.f23832a.endObject();
        }

        @Override // bi.a
        public String c() throws IOException {
            this.f23832a.nextName();
            if (this.f23832a.peek() != JsonToken.NULL) {
                return this.f23832a.nextString();
            }
            this.f23832a.nextNull();
            return null;
        }

        @Override // bi.a
        public void d() throws IOException {
            this.f23832a.endArray();
        }

        @Override // bi.a
        public void e() throws IOException {
            this.f23832a.nextName();
            this.f23832a.beginObject();
        }

        @Override // bi.a
        public void f() throws IOException {
            this.f23832a.nextName();
            this.f23832a.beginArray();
        }

        @Override // bi.a
        public boolean hasNext() {
            return this.f23832a.hasNext();
        }

        @Override // bi.a
        public boolean readBoolean() throws IOException {
            this.f23832a.nextName();
            return this.f23832a.nextBoolean();
        }

        @Override // bi.a
        public float readFloat() throws IOException {
            this.f23832a.nextName();
            return Float.valueOf(this.f23832a.nextString()).floatValue();
        }

        @Override // bi.a
        public int readInt() throws IOException {
            this.f23832a.nextName();
            return this.f23832a.nextInt();
        }

        private b(JsonReader jsonReader) {
            this.f23832a = jsonReader;
        }
    }

    private class c implements bi.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JsonWriter f23834a;

        @Override // bi.b
        public void a() throws IOException {
            this.f23834a.beginObject();
        }

        @Override // bi.b
        public void b() throws IOException {
            this.f23834a.endObject();
        }

        @Override // bi.b
        public void c(String str, String str2) throws IOException {
            this.f23834a.name(str).value(str2);
        }

        @Override // bi.b
        public void d() throws IOException {
            this.f23834a.endArray();
        }

        @Override // bi.b
        public void e(String str, boolean z10) throws IOException {
            this.f23834a.name(str).value(z10);
        }

        @Override // bi.b
        public void f(String str, int i10) throws IOException {
            this.f23834a.name(str).value(i10);
        }

        @Override // bi.b
        public void g(String str) throws IOException {
            this.f23834a.name(str);
            this.f23834a.beginArray();
        }

        @Override // bi.b
        public void h(String str, float f10) throws IOException {
            this.f23834a.name(str).value(f10);
        }

        @Override // bi.b
        public void i(String str) throws IOException {
            this.f23834a.name(str);
            this.f23834a.beginObject();
        }

        private c(JsonWriter jsonWriter) {
            this.f23834a = jsonWriter;
        }
    }

    g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [om.sstvencoder.g$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    boolean a(bi.d dVar, File file) throws Throwable {
        JsonReader jsonReader = 0;
        JsonReader jsonReader2 = null;
        try {
            JsonReader jsonReader3 = new JsonReader(new InputStreamReader(new FileInputStream(file), Utf8Charset.NAME));
            try {
                boolean zJ = dVar.j(new b(jsonReader3));
                try {
                    jsonReader3.close();
                    return zJ;
                } catch (Exception unused) {
                    return zJ;
                }
            } catch (Exception unused2) {
                jsonReader2 = jsonReader3;
                if (jsonReader2 != null) {
                    try {
                        jsonReader2.close();
                    } catch (Exception unused3) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                jsonReader = jsonReader3;
                if (jsonReader != 0) {
                    try {
                        jsonReader.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [om.sstvencoder.g$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    boolean b(bi.d dVar, File file) throws Throwable {
        JsonWriter jsonWriter;
        JsonWriter jsonWriter2 = 0;
        JsonWriter jsonWriter3 = null;
        try {
            jsonWriter = new JsonWriter(new OutputStreamWriter(new FileOutputStream(file), Utf8Charset.NAME));
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            jsonWriter.setIndent(" ");
            dVar.l(new c(jsonWriter));
            try {
                jsonWriter.close();
            } catch (Exception unused2) {
            }
            return true;
        } catch (Exception unused3) {
            jsonWriter3 = jsonWriter;
            if (jsonWriter3 != null) {
                try {
                    jsonWriter3.close();
                } catch (Exception unused4) {
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            jsonWriter2 = jsonWriter;
            if (jsonWriter2 != 0) {
                try {
                    jsonWriter2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }
}
