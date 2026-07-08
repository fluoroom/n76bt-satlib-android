package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0.b f2117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f2118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f2119c = new a(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f2120d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f2121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f2122b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f2121a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final o b() {
            return this.f2122b;
        }

        void c(o oVar, int i10, int i11) {
            a aVarA = a(oVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f2121a.put(oVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(oVar, i10 + 1, i11);
            } else {
                aVarA.f2122b = oVar;
            }
        }

        a(int i10) {
            this.f2121a = new SparseArray(i10);
        }
    }

    private m(Typeface typeface, u0.b bVar) {
        this.f2120d = typeface;
        this.f2117a = bVar;
        this.f2118b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(u0.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            o oVar = new o(this, i10);
            Character.toChars(oVar.f(), this.f2118b, i10 * 2);
            h(oVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            i0.l.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            i0.l.b();
        }
    }

    public char[] c() {
        return this.f2118b;
    }

    public u0.b d() {
        return this.f2117a;
    }

    int e() {
        return this.f2117a.l();
    }

    a f() {
        return this.f2119c;
    }

    Typeface g() {
        return this.f2120d;
    }

    void h(o oVar) {
        l0.g.h(oVar, "emoji metadata cannot be null");
        l0.g.b(oVar.c() > 0, "invalid metadata codepoint length");
        this.f2119c.c(oVar, 0, oVar.c() - 1);
    }
}
