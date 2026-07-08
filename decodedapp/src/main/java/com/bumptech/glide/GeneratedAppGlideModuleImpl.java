package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.dw.ht.glide.HTGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HTGlideModule f5086a = new HTGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.dw.ht.glide.HTGlideModule");
        }
    }

    @Override // y2.c
    public void a(Context context, c cVar, j jVar) {
        this.f5086a.a(context, cVar, jVar);
    }

    @Override // y2.a
    public void b(Context context, d dVar) {
        this.f5086a.b(context, dVar);
    }

    @Override // y2.a
    public boolean c() {
        return this.f5086a.c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set d() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a();
    }
}
