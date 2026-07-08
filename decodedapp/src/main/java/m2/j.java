package m2;

import e3.k;
import e3.l;
import f3.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.h f20954a = new e3.h(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.d f20955b = f3.a.d(10, new a());

    class a implements a.d {
        a() {
        }

        @Override // f3.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageDigest f20957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f3.c f20958b = f3.c.a();

        b(MessageDigest messageDigest) {
            this.f20957a = messageDigest;
        }

        @Override // f3.a.f
        public f3.c f() {
            return this.f20958b;
        }
    }

    private String a(i2.f fVar) {
        b bVar = (b) k.e((b) this.f20955b.b());
        try {
            fVar.a(bVar.f20957a);
            return l.x(bVar.f20957a.digest());
        } finally {
            this.f20955b.a(bVar);
        }
    }

    public String b(i2.f fVar) {
        String strA;
        synchronized (this.f20954a) {
            strA = (String) this.f20954a.g(fVar);
        }
        if (strA == null) {
            strA = a(fVar);
        }
        synchronized (this.f20954a) {
            this.f20954a.k(fVar, strA);
        }
        return strA;
    }
}
