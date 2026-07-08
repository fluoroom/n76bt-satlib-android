package ka;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import ia.h;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public class f extends ia.d {
    public f(o8.c cVar, InputStream inputStream, Context context, ha.c cVar2, ha.d dVar, ha.e eVar, ha.a aVar, h.b bVar) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("KML InputStream cannot be null");
        }
        n nVar = new n(cVar, context, cVar2, dVar, eVar, aVar, bVar);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
        ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                HashMap map = new HashMap();
                j jVarF = null;
                while (nextEntry != null) {
                    if (jVarF == null && nextEntry.getName().toLowerCase().endsWith(".kml")) {
                        jVarF = f(zipInputStream);
                    } else {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(zipInputStream);
                        if (bitmapDecodeStream != null) {
                            map.put(nextEntry.getName(), bitmapDecodeStream);
                        } else {
                            Log.w("KmlLayer", "Unsupported KMZ contents file type: " + nextEntry.getName());
                        }
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (jVarF == null) {
                    throw new IllegalArgumentException("KML not found in InputStream");
                }
                nVar.D0(jVarF.e(), jVarF.d(), jVarF.c(), jVarF.a(), jVarF.b(), map);
            } else {
                bufferedInputStream.reset();
                j jVarF2 = f(bufferedInputStream);
                nVar.C0(jVarF2.e(), jVarF2.d(), jVarF2.c(), jVarF2.a(), jVarF2.b());
                nVar = nVar;
            }
            c(nVar);
            inputStream.close();
            bufferedInputStream.close();
            zipInputStream.close();
        } catch (Throwable th2) {
            inputStream.close();
            bufferedInputStream.close();
            zipInputStream.close();
            throw th2;
        }
    }

    private static XmlPullParser e(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return xmlPullParserNewPullParser;
    }

    private static j f(InputStream inputStream) throws XmlPullParserException, IOException {
        j jVar = new j(e(inputStream));
        jVar.f();
        return jVar;
    }

    public void d() {
        super.a();
    }
}
