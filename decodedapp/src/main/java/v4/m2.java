package v4;

import android.content.Context;
import com.benshikj.ht.rpc.Dm;
import com.dw.ht.Main;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipInputStream;
import me.ele.patch.BsPatch;

/* JADX INFO: loaded from: classes.dex */
public class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SoftReference f30000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f30001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dm.CheckFirmwareUpdateResult f30002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private kc.b f30003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f30004k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b.a f30005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f30006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File f30007c;
    }

    public static class b extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f30008a;

        enum a {
            unzip,
            dataValidation,
            patch
        }

        b(a aVar) {
            this.f30008a = aVar;
        }
    }

    public m2(int i10, Dm.CheckFirmwareUpdateResult checkFirmwareUpdateResult, boolean z10) {
        this.f30000g = new SoftReference(null);
        this.f29994a = i10;
        this.f30004k = z10;
        if (checkFirmwareUpdateResult != null && checkFirmwareUpdateResult.hasFirmware()) {
            this.f30002i = checkFirmwareUpdateResult;
            this.f29995b = checkFirmwareUpdateResult.getFirmware().getVersion();
        }
    }

    public static /* synthetic */ Boolean a(m2 m2Var, byte[] bArr) {
        m2Var.getClass();
        m2Var.f30000g = new SoftReference(bArr);
        m2Var.f30001h = null;
        return Boolean.TRUE;
    }

    public static /* synthetic */ byte[] b(m2 m2Var, Dm.CheckFirmwareUpdateResult checkFirmwareUpdateResult) throws IOException {
        a aVarC;
        m2Var.getClass();
        if (checkFirmwareUpdateResult.hasBase()) {
            Dm.FirmwareInfo base = checkFirmwareUpdateResult.getBase();
            aVarC = m2Var.c(base, false, true);
            if (aVarC.f30007c == null && aVarC.f30006b) {
                aVarC = m2Var.c(base, true, true);
            }
            if (aVarC.f30007c == null) {
                throw new b(aVarC.f30005a);
            }
        } else {
            aVarC = null;
        }
        Dm.FirmwareInfo firmware = checkFirmwareUpdateResult.getFirmware();
        a aVarC2 = m2Var.c(firmware, false, aVarC == null);
        if (aVarC2.f30007c == null && aVarC2.f30006b) {
            aVarC2 = m2Var.c(firmware, true, aVarC == null);
        }
        while (aVarC2.f30007c != null) {
            File fileF = m2Var.f();
            if (aVarC == null) {
                aVarC2.f30007c.renameTo(fileF);
            } else if (!BsPatch.c(aVarC.f30007c.getPath(), fileF.getPath(), aVarC2.f30007c.getPath())) {
                throw new b(b.a.patch);
            }
            byte[] bArrJ = a6.n.j(fileF);
            if (aVarC == null || a6.n.f(a6.n.e(bArrJ)).equals(firmware.getMd5())) {
                return bArrJ;
            }
            if (!aVarC2.f30006b) {
                throw new b(b.a.dataValidation);
            }
            aVarC2 = m2Var.c(firmware, true, false);
        }
        throw new b(aVarC2.f30005a);
    }

    private a c(Dm.FirmwareInfo firmwareInfo, boolean z10, boolean z11) throws IOException {
        a aVar = new a();
        File file = new File(Main.f5555g.getCacheDir(), "Firmware");
        file.mkdirs();
        URL url = new URL(firmwareInfo.getUrl());
        String name = new File(url.getPath()).getName();
        File file2 = new File(file, name);
        if (z10 || !file2.exists()) {
            a6.m.d(url.openConnection().getInputStream(), new FileOutputStream(file2));
        } else {
            aVar.f30006b = true;
        }
        if (file2.getName().endsWith(".zip")) {
            File file3 = new File(file, name.substring(0, name.length() - 4));
            a6.n.b(file3);
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                try {
                    a6.b0.a(file3, zipInputStream, null, null);
                    zipInputStream.close();
                    fileInputStream.close();
                    File[] fileArrListFiles = file3.listFiles();
                    if (fileArrListFiles == null || fileArrListFiles.length != 1) {
                        aVar.f30005a = b.a.unzip;
                        return aVar;
                    }
                    file2 = fileArrListFiles[0];
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (!z11 || a6.n.f(a6.n.c(file2)).equals(firmwareInfo.getMd5())) {
            aVar.f30007c = file2;
            return aVar;
        }
        aVar.f30005a = b.a.dataValidation;
        return aVar;
    }

    private File f() {
        File file = new File(Main.f5555g.getCacheDir(), "Firmware");
        file.mkdirs();
        return new File(file, "" + this.f29994a + ".firmware");
    }

    private byte[] j() {
        if (this.f30002i == null) {
            return null;
        }
        File fileF = f();
        if (fileF.exists()) {
            try {
                byte[] bArrJ = a6.n.j(fileF);
                byte[] bArrE = a6.n.e(bArrJ);
                if (!a6.n.f(bArrE).equals(this.f30002i.getFirmware().getMd5())) {
                    fileF.delete();
                    return bArrJ;
                }
                this.f30000g = new SoftReference(bArrJ);
                this.f30001h = bArrE;
                return bArrJ;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private byte[] k(Context context) throws Throwable {
        InputStream inputStreamOpenRawResource;
        Throwable th2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        byte[] bArr;
        File file = new File(context.getExternalCacheDir(), "tmp/upgrade");
        file.mkdirs();
        File file2 = new File(file, "base.bin");
        File file3 = new File(file, "patch.bin");
        File file4 = new File(file, "upgrade.bin");
        BsPatch.b(context);
        try {
            inputStreamOpenRawResource = context.getResources().openRawResource(this.f29997d);
            try {
                fileOutputStream2 = new FileOutputStream(file2);
                try {
                    try {
                        a6.m.c(inputStreamOpenRawResource, fileOutputStream2);
                        a6.m.b(inputStreamOpenRawResource);
                        a6.m.b(fileOutputStream2);
                        inputStreamOpenRawResource = context.getResources().openRawResource(this.f29998e);
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            a6.m.c(inputStreamOpenRawResource, fileOutputStream);
                            a6.m.b(inputStreamOpenRawResource);
                            a6.m.b(fileOutputStream);
                        } catch (Exception e10) {
                            e = e10;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        fileOutputStream = fileOutputStream2;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream2 = null;
            } catch (Throwable th5) {
                th2 = th5;
                fileOutputStream = null;
            }
        } catch (Exception e13) {
            e = e13;
            inputStreamOpenRawResource = null;
            fileOutputStream2 = null;
        } catch (Throwable th6) {
            inputStreamOpenRawResource = null;
            th2 = th6;
            fileOutputStream = null;
        }
        if (!BsPatch.c(file2.getPath(), file4.getPath(), file3.getPath())) {
            a6.m.b(inputStreamOpenRawResource);
            a6.m.b(fileOutputStream);
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file4.getPath());
        try {
            bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            a6.m.b(fileInputStream);
        } catch (Exception e14) {
            e = e14;
            fileOutputStream2 = fileOutputStream;
            inputStreamOpenRawResource = fileInputStream;
            e.printStackTrace();
            a6.m.b(inputStreamOpenRawResource);
            a6.m.b(fileOutputStream2);
        } catch (Throwable th7) {
            th2 = th7;
            inputStreamOpenRawResource = fileInputStream;
            a6.m.b(inputStreamOpenRawResource);
            a6.m.b(fileOutputStream);
            throw th2;
        }
        if (a6.w.b(this.f29999f)) {
            this.f30000g = new SoftReference(bArr);
            this.f30001h = null;
        } else {
            byte[] bArrE = a6.n.e(bArr);
            if (!a6.q.d(a6.n.f(bArrE), this.f29999f)) {
                a6.m.b(fileInputStream);
                a6.m.b(fileOutputStream);
                return null;
            }
            this.f30001h = bArrE;
            this.f30000g = new SoftReference(bArr);
        }
        a6.m.b(fileInputStream);
        a6.m.b(fileOutputStream);
        return bArr;
        e.printStackTrace();
        a6.m.b(inputStreamOpenRawResource);
        a6.m.b(fileOutputStream2);
        return null;
    }

    public byte[] d(Context context) throws Throwable {
        byte[] bArr = (byte[]) this.f30000g.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrJ = j();
        if (bArrJ != null) {
            return bArrJ;
        }
        if (this.f29998e != 0) {
            return k(context);
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(this.f29997d);
            try {
                byte[] bArr2 = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr2);
                inputStreamOpenRawResource.close();
                if (a6.w.b(this.f29999f)) {
                    this.f30000g = new SoftReference(bArr2);
                    this.f30001h = null;
                } else {
                    byte[] bArrE = a6.n.e(bArr2);
                    if (a6.q.d(a6.n.f(bArrE), this.f29999f)) {
                        this.f30000g = new SoftReference(bArr2);
                        this.f30001h = bArrE;
                        bArrJ = bArr2;
                    }
                    bArr2 = bArrJ;
                }
                a6.m.b(inputStreamOpenRawResource);
                return bArr2;
            } catch (Exception unused) {
                inputStream = inputStreamOpenRawResource;
                a6.m.b(inputStream);
                return bArrJ;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenRawResource;
                a6.m.b(inputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String e(Context context) {
        Dm.CheckFirmwareUpdateResult checkFirmwareUpdateResult = this.f30002i;
        if (checkFirmwareUpdateResult != null) {
            return checkFirmwareUpdateResult.getFirmware().getReleaseNotes();
        }
        int i10 = this.f29996c;
        return i10 == 0 ? "" : context.getString(i10);
    }

    public byte[] g(Context context) throws Throwable {
        byte[] bArrD = d(context);
        if (this.f30001h == null && bArrD != null) {
            try {
                this.f30001h = a6.n.e(bArrD);
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
        }
        return this.f30001h;
    }

    public boolean h() {
        if (this.f30000g.get() != null || this.f29998e != 0) {
            return true;
        }
        j();
        return this.f30000g.get() != null;
    }

    public boolean i(int i10) {
        return this.f30004k ? this.f29995b < i10 : this.f29995b <= i10;
    }

    public void l(Context context, final mc.c cVar, final mc.c cVar2) {
        if (this.f30002i == null) {
            return;
        }
        kc.b bVar = this.f30003j;
        if (bVar == null || bVar.d()) {
            BsPatch.b(context);
            hc.g gVarD = hc.g.c(this.f30002i).e(zc.a.b()).d(new mc.d() { // from class: v4.i2
                @Override // mc.d
                public final Object apply(Object obj) {
                    return m2.b(this.f29903a, (Dm.CheckFirmwareUpdateResult) obj);
                }
            }).e(jc.a.a()).d(new mc.d() { // from class: v4.j2
                @Override // mc.d
                public final Object apply(Object obj) {
                    return m2.a(this.f29911a, (byte[]) obj);
                }
            });
            Objects.requireNonNull(cVar);
            mc.c cVar3 = new mc.c() { // from class: v4.k2
                @Override // mc.c
                public final void accept(Object obj) {
                    cVar.accept((Boolean) obj);
                }
            };
            Objects.requireNonNull(cVar2);
            this.f30003j = gVarD.i(cVar3, new mc.c() { // from class: v4.l2
                @Override // mc.c
                public final void accept(Object obj) {
                    cVar2.accept((Throwable) obj);
                }
            });
        }
    }

    public m2(int i10) {
        this(i10, null, false);
    }
}
