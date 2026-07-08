package androidx.media;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2750a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2751b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2752c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2753d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f2751b;
    }

    public int b() {
        int i10 = this.f2752c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f2753d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f2752c, this.f2750a);
    }

    public int d() {
        return this.f2750a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f2751b == audioAttributesImplBase.a() && this.f2752c == audioAttributesImplBase.b() && this.f2750a == audioAttributesImplBase.d() && this.f2753d == audioAttributesImplBase.f2753d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2751b), Integer.valueOf(this.f2752c), Integer.valueOf(this.f2750a), Integer.valueOf(this.f2753d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2753d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2753d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f2750a));
        sb2.append(" content=");
        sb2.append(this.f2751b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2752c).toUpperCase());
        return sb2.toString();
    }
}
