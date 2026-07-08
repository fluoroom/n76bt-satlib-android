package gj;

import gj.h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f14599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14600c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClassLoader f14601d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final URL f14602e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f14603f;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Closeable, Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ZipInputStream f14604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f14605b;

        /* JADX INFO: renamed from: gj.h0$a$a, reason: collision with other inner class name */
        class C0206a implements Iterator {
            C0206a() {
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b next() {
                if (a.this.f14605b != null) {
                    return a.this.f14605b;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return a.this.f14605b != null;
            }
        }

        public class b extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f14607a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f14608b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f14609c = false;

            b(String str, boolean z10) {
                this.f14607a = str;
                this.f14608b = z10;
            }

            public String a() {
                return this.f14607a;
            }

            @Override // java.io.InputStream
            public int available() {
                return a.this.f14604a.available();
            }

            public boolean c() {
                return this.f14608b;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (this.f14609c) {
                    return;
                }
                a.this.f14604a.closeEntry();
                a.this.q();
                this.f14609c = true;
            }

            @Override // java.io.InputStream
            public void mark(int i10) {
                a.this.f14604a.mark(i10);
            }

            @Override // java.io.InputStream
            public boolean markSupported() {
                return a.this.f14604a.markSupported();
            }

            @Override // java.io.InputStream
            public int read() {
                return a.this.f14604a.read();
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                a.this.f14604a.reset();
            }

            @Override // java.io.InputStream
            public long skip(long j10) {
                return a.this.f14604a.skip(j10);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) {
                return a.this.f14604a.read(bArr, i10, i11);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr) {
                return a.this.f14604a.read(bArr);
            }
        }

        a(InputStream inputStream) throws IOException {
            this.f14604a = new ZipInputStream(inputStream);
            q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() throws IOException {
            ZipEntry nextEntry = this.f14604a.getNextEntry();
            if (nextEntry == null) {
                this.f14605b = null;
            } else {
                this.f14605b = new b(nextEntry.getName(), nextEntry.isDirectory());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f14604a.close();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0206a();
        }
    }

    public h0(File file) {
        this.f14599b = file;
        this.f14603f = file.getAbsolutePath();
    }

    public static /* synthetic */ InputStream b(a.b bVar) {
        return bVar;
    }

    private boolean c(String str, Pattern pattern, e eVar, g gVar, a aVar) throws IOException {
        Iterator it = aVar.iterator();
        hj.a e10 = null;
        boolean z10 = false;
        while (it.hasNext()) {
            final a.b bVar = (a.b) it.next();
            try {
            } catch (hj.a e11) {
                e10 = e11;
            }
            if (eVar.c() && !bVar.c()) {
                String str2 = str + "!/" + bVar.a();
                if (f.f14563a.matcher(bVar.a()).matches()) {
                    z10 = c(str2, pattern, eVar, gVar, new a(bVar)) || z10;
                } else {
                    String strA = bVar.a();
                    int iLastIndexOf = strA.lastIndexOf(47);
                    if (iLastIndexOf >= 0) {
                        strA = strA.substring(iLastIndexOf + 1);
                    }
                    h hVarB = gVar.e().b(new h(strA, new h.e() { // from class: gj.g0
                        @Override // gj.h.e
                        public final InputStream a() {
                            return h0.b(bVar);
                        }
                    }));
                    if (pattern.matcher(hVarB.a()).matches()) {
                        InputStream inputStreamB = hVarB.b().b();
                        try {
                            eVar.a(inputStreamB, str2);
                            if (inputStreamB != null) {
                                try {
                                    inputStreamB.close();
                                } catch (hj.a e12) {
                                    e10 = e12;
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            if (inputStreamB != null) {
                                try {
                                    try {
                                        inputStreamB.close();
                                    } catch (hj.a e13) {
                                        e10 = e13;
                                    }
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }
                }
            }
            bVar.close();
        }
        if (z10 || e10 == null) {
            return z10;
        }
        throw e10;
    }

    private InputStream d() {
        if (this.f14599b != null) {
            return new FileInputStream(this.f14599b);
        }
        String str = this.f14600c;
        return str != null ? this.f14601d.getResourceAsStream(str) : this.f14602e.openConnection().getInputStream();
    }

    @Override // gj.f
    public boolean a(Pattern pattern, e eVar, g gVar) {
        try {
            InputStream inputStreamD = d();
            try {
                a aVar = new a(inputStreamD);
                try {
                    boolean zC = c(this.f14603f, pattern, eVar, gVar, aVar);
                    aVar.close();
                    if (inputStreamD == null) {
                        return zC;
                    }
                    inputStreamD.close();
                    return zC;
                } finally {
                }
            } finally {
            }
        } catch (IOException | ParseException e10) {
            throw new hj.a(e10, new ui.a(e10.getMessage()), new Object[0]);
        }
    }
}
