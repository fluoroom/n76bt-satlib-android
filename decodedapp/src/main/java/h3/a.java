package h3;

/* JADX INFO: loaded from: classes.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0211a f15112a;

    /* JADX INFO: renamed from: h3.a$a, reason: collision with other inner class name */
    public enum EnumC0211a {
        ILLEGAL_ARGUMENTS_PAYLOAD_LENGTH_TOO_LONG
    }

    public a(EnumC0211a enumC0211a) {
        this.f15112a = enumC0211a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Build of a frame failed: ");
        if (this.f15112a.ordinal() == 0) {
            sb2.append("illegal arguments, the payload length is bigger than the length of the payload array.");
        }
        return sb2.toString();
    }
}
