package dd;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10929b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f10930a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ x(byte b10) {
        this.f10930a = b10;
    }

    public static final /* synthetic */ x a(byte b10) {
        return new x(b10);
    }

    public static boolean e(byte b10, Object obj) {
        return (obj instanceof x) && b10 == ((x) obj).h();
    }

    public static String g(byte b10) {
        return String.valueOf(b10 & MessagePack.Code.EXT_TIMESTAMP);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return rd.m.f(h() & MessagePack.Code.EXT_TIMESTAMP, ((x) obj).h() & MessagePack.Code.EXT_TIMESTAMP);
    }

    public boolean equals(Object obj) {
        return e(this.f10930a, obj);
    }

    public final /* synthetic */ byte h() {
        return this.f10930a;
    }

    public int hashCode() {
        return f(this.f10930a);
    }

    public String toString() {
        return g(this.f10930a);
    }

    public static byte d(byte b10) {
        return b10;
    }

    public static int f(byte b10) {
        return b10;
    }
}
