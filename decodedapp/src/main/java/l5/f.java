package l5;

import android.content.Context;
import com.benshikj.ht.R;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {
    public f(Context context) {
        super(context, R.string.morseDecode);
    }

    @Override // l5.e
    protected String c(short[] sArr) {
        a4.b bVar = new a4.b(32000, true);
        w3.b bVar2 = new w3.b(new b4.c(sArr), w3.d.PCM_FLOAT);
        float[] fArr = new float[WXMediaMessage.TITLE_LENGTH_LIMIT];
        while (true) {
            int iD = bVar2.d(fArr, 0, WXMediaMessage.TITLE_LENGTH_LIMIT);
            if (iD <= 0) {
                bVar.finish();
                return bVar.getText();
            }
            bVar.a(fArr, 0, iD);
        }
    }
}
