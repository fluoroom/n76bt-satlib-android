package fh;

import java.text.Normalizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final String a(String str) {
        rd.m.e(str, "string");
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        rd.m.d(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
