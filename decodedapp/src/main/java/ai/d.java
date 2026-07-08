package ai;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ContentResolver f629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ContentValues f633e;

    public d(ContentResolver contentResolver, String str) {
        this.f629a = contentResolver;
        this.f630b = str;
        this.f633e = b(str);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f632d = this.f629a.insert(MediaStore.Audio.Media.getContentUri("external_primary"), this.f633e);
        } else {
            this.f631c = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), this.f630b);
        }
    }

    private ContentValues b(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mime_type", "audio/wav");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("_display_name", str);
            contentValues.put("relative_path", new File(Environment.DIRECTORY_MUSIC, "SSTV Encoder").getPath());
            contentValues.put("is_pending", (Integer) 1);
            return contentValues;
        }
        contentValues.put("album", "SSTV Encoder");
        contentValues.put("title", str);
        contentValues.put("is_music", Boolean.TRUE);
        return contentValues;
    }

    public void a() {
        try {
            if (this.f631c == null) {
                this.f631c = new File(this.f632d.getPath());
            }
            this.f631c.delete();
        } catch (Exception unused) {
        }
    }

    public String c() {
        return this.f630b;
    }

    public OutputStream d() {
        try {
            return Build.VERSION.SDK_INT >= 29 ? this.f629a.openOutputStream(this.f632d) : new FileOutputStream(this.f631c);
        } catch (Exception unused) {
            return null;
        }
    }

    public void e() {
        ContentValues contentValues;
        ContentValues contentValues2;
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f632d == null || (contentValues2 = this.f633e) == null) {
                return;
            }
            contentValues2.clear();
            this.f633e.put("is_pending", (Integer) 0);
            this.f629a.update(this.f632d, this.f633e, null, null);
            return;
        }
        File file = this.f631c;
        if (file == null || (contentValues = this.f633e) == null) {
            return;
        }
        contentValues.put("_data", file.toString());
        this.f632d = this.f629a.insert(MediaStore.Audio.Media.getContentUriForPath(this.f631c.getAbsolutePath()), this.f633e);
    }
}
