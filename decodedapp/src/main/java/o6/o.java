package o6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f23252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f23253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f23254c;

    public o() {
        this(':', ',', ',');
    }

    public static o a() {
        return new o();
    }

    public char b() {
        return this.f23254c;
    }

    public char c() {
        return this.f23253b;
    }

    public char d() {
        return this.f23252a;
    }

    public o(char c10, char c11, char c12) {
        this.f23252a = c10;
        this.f23253b = c11;
        this.f23254c = c12;
    }
}
