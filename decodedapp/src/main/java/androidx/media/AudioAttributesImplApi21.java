package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AudioAttributes f2748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2749b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2748a.equals(((AudioAttributesImplApi21) obj).f2748a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2748a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2748a;
    }
}
