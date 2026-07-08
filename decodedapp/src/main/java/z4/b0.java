package z4;

import com.dw.ht.Cfg;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b0 {
    public static void a(com.dw.ht.map.b bVar, byte[] bArr, File file) {
        if (!Cfg.f5482d || bArr == null || bArr.length == 0 || file == null || file.isDirectory()) {
            return;
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (a6.m.d(new ByteArrayInputStream(bArr), new FileOutputStream(file)) == 0) {
                file.delete();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
