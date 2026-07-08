package ve;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface u {
    cf.g a(a aVar);

    cf.u b(mf.c cVar, boolean z10);

    Set c(mf.c cVar);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mf.b f30672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f30673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final cf.g f30674c;

        public a(mf.b bVar, byte[] bArr, cf.g gVar) {
            rd.m.e(bVar, "classId");
            this.f30672a = bVar;
            this.f30673b = bArr;
            this.f30674c = gVar;
        }

        public final mf.b a() {
            return this.f30672a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return rd.m.a(this.f30672a, aVar.f30672a) && rd.m.a(this.f30673b, aVar.f30673b) && rd.m.a(this.f30674c, aVar.f30674c);
        }

        public int hashCode() {
            int iHashCode = this.f30672a.hashCode() * 31;
            byte[] bArr = this.f30673b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            cf.g gVar = this.f30674c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f30672a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f30673b) + ", outerClass=" + this.f30674c + ')';
        }

        public /* synthetic */ a(mf.b bVar, byte[] bArr, cf.g gVar, int i10, rd.h hVar) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }
    }
}
