package l5;

import android.content.Context;
import com.benshikj.ht.R;
import com.dw.multimon.MDecoder;

/* JADX INFO: loaded from: classes.dex */
public class b extends e {
    public b(Context context) {
        super(context, R.string.dtmf_decode);
    }

    public static /* synthetic */ void h(StringBuilder sb2, int i10, byte[] bArr) {
        for (byte b10 : bArr) {
            sb2.append((char) b10);
        }
    }

    @Override // l5.e
    protected String c(short[] sArr) {
        final StringBuilder sb2 = new StringBuilder();
        MDecoder mDecoder = new MDecoder(32000, 2);
        mDecoder.f(new MDecoder.a() { // from class: l5.a
            @Override // com.dw.multimon.MDecoder.a
            public final void a(int i10, byte[] bArr) {
                b.h(sb2, i10, bArr);
            }
        });
        try {
            mDecoder.c(sArr, 0, sArr.length);
            mDecoder.b();
            return sb2.toString();
        } catch (Throwable th2) {
            mDecoder.b();
            throw th2;
        }
    }
}
