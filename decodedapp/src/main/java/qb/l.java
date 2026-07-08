package qb;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface l extends n, v {

    public static final class a implements l {
        @Override // qb.n, qb.v
        public String a() {
            return "gzip";
        }

        @Override // qb.v
        public InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // qb.n
        public OutputStream c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f24679a = new b();

        private b() {
        }

        @Override // qb.n, qb.v
        public String a() {
            return "identity";
        }

        @Override // qb.v
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // qb.n
        public OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
