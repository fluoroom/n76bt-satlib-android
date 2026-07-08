package h1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f15053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f15055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RandomAccessFile f15056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FileChannel f15057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FileLock f15058f;

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    private static class b extends File {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15060a;

        public b(File file, String str) {
            super(file, str);
            this.f15060a = -1L;
        }
    }

    c(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f15053a = file;
        this.f15055c = file2;
        this.f15054b = n(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f15056d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f15057e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f15058f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                c(this.f15057e);
                throw e;
            } catch (Error e11) {
                e = e11;
                c(this.f15057e);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                c(this.f15057e);
                throw e;
            }
        } catch (IOException e13) {
            e = e13;
            c(this.f15056d);
            throw e;
        } catch (Error e14) {
            e = e14;
            c(this.f15056d);
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            c(this.f15056d);
            throw e;
        }
    }

    private void a() {
        File[] fileArrListFiles = this.f15055c.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f15055c.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    private static void e(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    c(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            c(inputStream);
            fileCreateTempFile.delete();
            throw th3;
        }
    }

    private static SharedPreferences k(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static long l(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long n(File file) throws IOException {
        long jC = d.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    private static boolean q(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesK = k(context);
        if (sharedPreferencesK.getLong(str + "timestamp", -1L) != l(file)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        return sharedPreferencesK.getLong(sb2.toString(), -1L) != j10;
    }

    private List s(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f15053a.getName() + ".classes";
        SharedPreferences sharedPreferencesK = k(context);
        int i10 = sharedPreferencesK.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            b bVar = new b(this.f15055c, str2 + i11 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f15060a = n(bVar);
            long j10 = sharedPreferencesK.getLong(str + "dex.crc." + i11, -1L);
            long j11 = sharedPreferencesK.getLong(str + "dex.time." + i11, -1L);
            long jLastModified = bVar.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesK;
                if (j10 == bVar.f15060a) {
                    arrayList.add(bVar);
                    i11++;
                    sharedPreferencesK = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f15060a);
        }
        return arrayList;
    }

    private List v() {
        boolean z10;
        String str = this.f15053a.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f15053a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i10 = 2;
            while (entry != null) {
                b bVar = new b(this.f15055c, str + i10 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    e(zipFile, entry, bVar, str);
                    try {
                        bVar.f15060a = n(bVar);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f15060a);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
            return arrayList;
        } finally {
        }
    }

    private static void w(Context context, String str, long j10, long j11, List list) {
        SharedPreferences.Editor editorEdit = k(context).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(str + "crc", j11);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            editorEdit.putLong(str + "dex.crc." + i10, bVar.f15060a);
            editorEdit.putLong(str + "dex.time." + i10, bVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15058f.release();
        this.f15057e.close();
        this.f15056d.close();
    }

    List r(Context context, String str, boolean z10) {
        List listV;
        List listS;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f15053a.getPath() + ", " + z10 + ", " + str + ")");
        if (!this.f15058f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !q(context, this.f15053a, this.f15054b, str)) {
            try {
                listS = s(context, str);
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                listV = v();
                w(context, str, l(this.f15053a), this.f15054b, listV);
                listS = listV;
            }
            Log.i("MultiDex", "load found " + listS.size() + " secondary dex files");
            return listS;
        }
        if (z10) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listV = v();
        w(context, str, l(this.f15053a), this.f15054b, listV);
        listS = listV;
        Log.i("MultiDex", "load found " + listS.size() + " secondary dex files");
        return listS;
    }
}
