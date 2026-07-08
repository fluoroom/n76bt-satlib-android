package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.d;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import e3.f;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import o2.a;
import o2.b;
import o2.d;
import o2.e;
import o2.g;
import o2.l;
import o2.o;
import o2.s;
import o2.t;
import o2.u;
import o2.v;
import o2.w;
import o2.x;
import o2.y;
import p2.a;
import p2.b;
import p2.c;
import p2.d;
import p2.e;
import r2.c0;
import r2.e0;
import r2.g0;
import r2.h0;
import r2.j0;
import r2.k0;
import r2.s;
import r2.v;
import s2.a;

/* JADX INFO: loaded from: classes.dex */
abstract class k {

    class a implements f.b {

        /* JADX INFO: renamed from: a */
        private boolean f5151a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ c f5152b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f5153c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ y2.a f5154d;

        a(c cVar, List list, y2.a aVar) {
            this.f5152b = cVar;
            this.f5153c = list;
            this.f5154d = aVar;
        }

        @Override // e3.f.b
        /* JADX INFO: renamed from: a */
        public j get() {
            if (this.f5151a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            p1.a.a("Glide registry");
            this.f5151a = true;
            try {
                return k.a(this.f5152b, this.f5153c, this.f5154d);
            } finally {
                this.f5151a = false;
                p1.a.b();
            }
        }
    }

    static j a(c cVar, List list, y2.a aVar) {
        l2.d dVarF = cVar.f();
        l2.b bVarE = cVar.e();
        Context applicationContext = cVar.i().getApplicationContext();
        f fVarG = cVar.i().g();
        j jVar = new j();
        b(applicationContext, jVar, dVarF, bVarE, fVarG);
        c(applicationContext, cVar, jVar, list, aVar);
        return jVar;
    }

    private static void b(Context context, j jVar, l2.d dVar, l2.b bVar, f fVar) {
        i2.j hVar;
        i2.j h0Var;
        String str;
        j jVar2;
        jVar.o(new r2.l());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            jVar.o(new v());
        }
        Resources resources = context.getResources();
        List listG = jVar.g();
        v2.a aVar = new v2.a(context, listG, dVar, bVar);
        i2.j jVarM = k0.m(dVar);
        s sVar = new s(jVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i10 < 28 || !fVar.a(d.b.class)) {
            hVar = new r2.h(sVar);
            h0Var = new h0(sVar, bVar);
        } else {
            h0Var = new c0();
            hVar = new r2.i();
        }
        if (i10 >= 28) {
            jVar.e("Animation", InputStream.class, Drawable.class, t2.c.f(listG, bVar));
            jVar.e("Animation", ByteBuffer.class, Drawable.class, t2.c.a(listG, bVar));
        }
        t2.g gVar = new t2.g(context);
        r2.c cVar = new r2.c(bVar);
        w2.a aVar2 = new w2.a();
        w2.d dVar2 = new w2.d();
        ContentResolver contentResolver = context.getContentResolver();
        jVar.a(ByteBuffer.class, new o2.c()).a(InputStream.class, new u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, hVar).e("Bitmap", InputStream.class, Bitmap.class, h0Var);
        if (ParcelFileDescriptorRewinder.c()) {
            str = "Animation";
            jVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new e0(sVar));
        } else {
            str = "Animation";
        }
        jVar.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, k0.c(dVar));
        String str2 = str;
        jVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, jVarM).d(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new j0()).b(Bitmap.class, cVar).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new r2.a(resources, hVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new r2.a(resources, h0Var)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new r2.a(resources, jVarM)).b(BitmapDrawable.class, new r2.b(dVar, cVar)).e(str2, InputStream.class, v2.c.class, new v2.j(listG, aVar, bVar)).e(str2, ByteBuffer.class, v2.c.class, aVar).b(v2.c.class, new v2.d()).d(h2.a.class, h2.a.class, w.a.a()).e("Bitmap", h2.a.class, Bitmap.class, new v2.h(dVar)).c(Uri.class, Drawable.class, gVar).c(Uri.class, Bitmap.class, new g0(gVar, dVar)).p(new a.C0361a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new u2.a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, w.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            jVar2 = jVar;
            jVar2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            jVar2 = jVar;
        }
        o oVarG = o2.f.g(context);
        o oVarC = o2.f.c(context);
        o oVarE = o2.f.e(context);
        Class cls = Integer.TYPE;
        jVar2.d(cls, InputStream.class, oVarG).d(Integer.class, InputStream.class, oVarG).d(cls, AssetFileDescriptor.class, oVarC).d(Integer.class, AssetFileDescriptor.class, oVarC).d(cls, Drawable.class, oVarE).d(Integer.class, Drawable.class, oVarE).d(Uri.class, InputStream.class, t.f(context)).d(Uri.class, AssetFileDescriptor.class, t.e(context));
        s.c cVar2 = new s.c(resources);
        s.a aVar3 = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        jVar2.d(Integer.class, Uri.class, cVar2).d(cls, Uri.class, cVar2).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, InputStream.class, bVar2).d(cls, InputStream.class, bVar2);
        jVar2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new v.c()).d(String.class, ParcelFileDescriptor.class, new v.b()).d(String.class, AssetFileDescriptor.class, new v.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i10 >= 29) {
            jVar2.d(Uri.class, InputStream.class, new d.c(context));
            jVar2.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        boolean zA = fVar.a(d.e.class);
        jVar2.d(Uri.class, InputStream.class, new x.d(contentResolver, zA)).d(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver, zA)).d(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver, zA)).d(Uri.class, InputStream.class, new y.a()).d(URL.class, InputStream.class, new e.a()).d(Uri.class, File.class, new l.a(context)).d(o2.h.class, InputStream.class, new a.C0327a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, w.a.a()).d(Drawable.class, Drawable.class, w.a.a()).c(Drawable.class, Drawable.class, new t2.h()).q(Bitmap.class, BitmapDrawable.class, new w2.b(resources)).q(Bitmap.class, byte[].class, aVar2).q(Drawable.class, byte[].class, new w2.c(dVar, aVar2, dVar2)).q(v2.c.class, byte[].class, dVar2);
        if (i10 >= 23) {
            i2.j jVarD = k0.d(dVar);
            jVar2.c(ByteBuffer.class, Bitmap.class, jVarD);
            jVar2.c(ByteBuffer.class, BitmapDrawable.class, new r2.a(resources, jVarD));
        }
    }

    private static void c(Context context, c cVar, j jVar, List list, y2.a aVar) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        if (aVar != null) {
            aVar.a(context, cVar, jVar);
        }
    }

    static f.b d(c cVar, List list, y2.a aVar) {
        return new a(cVar, list, aVar);
    }
}
