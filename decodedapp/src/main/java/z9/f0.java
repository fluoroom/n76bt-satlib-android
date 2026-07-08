package z9;

import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {
    public static com.google.gson.k a(ca.a aVar) {
        boolean z10;
        try {
            try {
                aVar.A0();
                z10 = false;
                try {
                    return (com.google.gson.k) com.google.gson.internal.bind.o.V.b(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return com.google.gson.m.f8816a;
                    }
                    throw new com.google.gson.r(e);
                }
            } catch (ca.d e11) {
                throw new com.google.gson.r(e11);
            } catch (IOException e12) {
                throw new com.google.gson.l(e12);
            } catch (NumberFormatException e13) {
                throw new com.google.gson.r(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    public static void b(com.google.gson.k kVar, ca.c cVar) {
        com.google.gson.internal.bind.o.V.d(cVar, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a */
        private final Appendable f33028a;

        /* JADX INFO: renamed from: b */
        private final a f33029b = new a();

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a */
            private char[] f33030a;

            /* JADX INFO: renamed from: b */
            private String f33031b;

            private a() {
            }

            void a(char[] cArr) {
                this.f33030a = cArr;
                this.f33031b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f33030a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f33030a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f33030a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f33031b == null) {
                    this.f33031b = new String(this.f33030a);
                }
                return this.f33031b;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        b(Appendable appendable) {
            this.f33028a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f33029b.a(cArr);
            this.f33028a.append(this.f33029b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f33028a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f33028a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f33028a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f33028a.append(str, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
