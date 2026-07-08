package androidx.media;

import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2750a = aVar.p(audioAttributesImplBase.f2750a, 1);
        audioAttributesImplBase.f2751b = aVar.p(audioAttributesImplBase.f2751b, 2);
        audioAttributesImplBase.f2752c = aVar.p(audioAttributesImplBase.f2752c, 3);
        audioAttributesImplBase.f2753d = aVar.p(audioAttributesImplBase.f2753d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f2750a, 1);
        aVar.F(audioAttributesImplBase.f2751b, 2);
        aVar.F(audioAttributesImplBase.f2752c, 3);
        aVar.F(audioAttributesImplBase.f2753d, 4);
    }
}
