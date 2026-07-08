package a6;

import a6.m;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    public interface a {
        String a(String str);
    }

    public static ArrayList a(File file, ZipInputStream zipInputStream, a aVar, m.a aVar2) throws Throwable {
        FileOutputStream fileOutputStream;
        String canonicalPath = file.getCanonicalPath();
        FileOutputStream fileOutputStream2 = null;
        ArrayList arrayListA = null;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return arrayListA;
            }
            String name = nextEntry.getName();
            if (aVar != null) {
                name = aVar.a(name);
            }
            if (name != null) {
                File file2 = new File(file, name);
                if (!file2.getCanonicalPath().startsWith(canonicalPath)) {
                    throw new SecurityException("write file outside the target directory");
                }
                file2.getParentFile().mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (FileNotFoundException unused) {
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    try {
                        byte[] bArr = new byte[WXMediaMessage.THUMB_LENGTH_LIMIT];
                        while (true) {
                            int i10 = zipInputStream.read(bArr);
                            if (i10 <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                        }
                    } catch (FileNotFoundException unused2) {
                        if (arrayListA == null) {
                            arrayListA = o.a();
                        }
                        arrayListA.add(file2.getAbsolutePath());
                    }
                    m.b(fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    m.b(fileOutputStream2);
                    throw th;
                }
            }
        }
    }
}
