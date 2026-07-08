package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f5201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f5202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f5203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f5204d;

    l(ContentResolver contentResolver, Uri uri, boolean z10) {
        this.f5203c = contentResolver;
        this.f5202b = uri;
        this.f5201a = z10;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f5204d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public i2.a d() {
        return i2.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object objF = f(this.f5202b, this.f5203c);
            this.f5204d = objF;
            aVar.f(objF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);

    protected AssetFileDescriptor g(Uri uri) {
        return (this.f5201a && j2.b.d(uri) && j2.b.c()) ? j2.b.h(uri, this.f5203c) : this.f5203c.openAssetFileDescriptor(uri, "r");
    }
}
