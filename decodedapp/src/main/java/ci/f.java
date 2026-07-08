package ci;

/* JADX INFO: loaded from: classes3.dex */
public class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f4904a;

    public f(String str) {
        super(str);
    }

    public f(h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Missing argument for option: ");
        stringBuffer.append(hVar.h());
        this(stringBuffer.toString());
        this.f4904a = hVar;
    }
}
