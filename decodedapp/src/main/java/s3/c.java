package s3;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.ImageView;
import androidx.collection.h;
import j$.util.DesugarCollections;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c implements Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static c f26326h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f26327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f26328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f26330d = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f26331e = new Handler(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f26333g;

    class a extends h {
        a(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    class b extends h {
        b(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, C0363c c0363c) {
            byte[] bArr = c0363c.f26336a;
            if (bArr != null) {
                return bArr.length;
            }
            return 10;
        }
    }

    /* JADX INFO: renamed from: s3.c$c, reason: collision with other inner class name */
    private static class C0363c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f26336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile boolean f26337b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Bitmap f26338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Reference f26339d;

        public C0363c(byte[] bArr) {
            this.f26336a = bArr;
        }
    }

    public interface d {
        void a(Object obj);
    }

    private class e extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f26340a;

        public e() {
            super("Picture Loader");
        }

        private void a(String str, byte[] bArr) {
            C0363c c0363c = new C0363c(bArr);
            c.this.f26327a.put(str, c0363c);
            c.h(c0363c);
        }

        private void c() {
            Reference reference;
            boolean z10 = false;
            for (f fVar : new ArrayList(c.this.f26330d.values())) {
                C0363c c0363c = (C0363c) c.this.f26327a.get(fVar.getId());
                if (c0363c != null && c0363c.f26336a != null && c0363c.f26337b && ((reference = c0363c.f26339d) == null || reference.get() == null)) {
                    c.h(c0363c);
                    z10 = true;
                } else if (c0363c == null || !c0363c.f26337b) {
                    byte[] bArrA = fVar.a();
                    a(fVar.getId(), bArrA);
                    if (bArrA != null) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                c.this.f26331e.sendEmptyMessage(2);
            }
        }

        public void b() {
            if (this.f26340a == null) {
                this.f26340a = new Handler(getLooper(), this);
            }
        }

        public void d() {
            b();
            this.f26340a.sendEmptyMessage(1);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                c();
            }
            return true;
        }
    }

    public interface f {
        byte[] a();

        String getId();
    }

    private c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        float f10 = (activityManager == null || activityManager.isLowRamDevice()) ? 0.5f : 1.0f;
        this.f26328b = new a((int) (1769472.0f * f10));
        this.f26327a = new b((int) (f10 * 2000000.0f));
    }

    private static int f(Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public static synchronized c g(Context context) {
        try {
            if (f26326h == null) {
                f26326h = new c(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f26326h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(C0363c c0363c) {
        byte[] bArr = c0363c.f26336a;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray == null) {
                return;
            }
            c0363c.f26338c = bitmapDecodeByteArray;
            c0363c.f26339d = new SoftReference(bitmapDecodeByteArray);
        } catch (OutOfMemoryError unused) {
        }
    }

    private boolean k(Object obj, f fVar) {
        C0363c c0363c = (C0363c) this.f26327a.get(fVar.getId());
        if (c0363c == null) {
            if (obj instanceof d) {
                ((d) obj).a(null);
            }
            return false;
        }
        byte[] bArr = c0363c.f26336a;
        if (bArr == null || bArr.length == 0) {
            if (obj instanceof d) {
                ((d) obj).a(null);
            }
            return c0363c.f26337b;
        }
        Reference reference = c0363c.f26339d;
        Bitmap bitmap = reference == null ? null : (Bitmap) reference.get();
        if (bitmap == null) {
            if (c0363c.f26336a.length >= 8192) {
                if (obj instanceof d) {
                    ((d) obj).a(null);
                }
                return false;
            }
            h(c0363c);
            bitmap = c0363c.f26338c;
            if (bitmap == null) {
                if (obj instanceof d) {
                    ((d) obj).a(null);
                }
                return false;
            }
        }
        if (obj instanceof ImageView) {
            ((ImageView) obj).setImageBitmap(bitmap);
        } else {
            ((d) obj).a(bitmap);
        }
        if (f(bitmap) < this.f26328b.maxSize() / 6) {
            this.f26328b.put(fVar.getId(), bitmap);
        }
        c0363c.f26338c = null;
        return c0363c.f26337b;
    }

    private void l(f fVar, Object obj, boolean z10) {
        C0363c c0363c;
        this.f26330d.remove(obj);
        if (z10 && (c0363c = (C0363c) this.f26327a.get(fVar.getId())) != null) {
            c0363c.f26337b = false;
        }
        if (!k(obj, fVar) || z10) {
            this.f26330d.put(obj, fVar);
            if (this.f26332f) {
                return;
            }
            o();
        }
    }

    private void m() {
        for (Object obj : this.f26330d.keySet().toArray()) {
            if (k(obj, (f) this.f26330d.get(obj))) {
                this.f26330d.remove(obj);
            }
        }
        p();
        if (this.f26330d.isEmpty()) {
            return;
        }
        o();
    }

    private void o() {
        if (this.f26329c) {
            return;
        }
        this.f26329c = true;
        this.f26331e.sendEmptyMessage(1);
    }

    private void p() {
        Iterator<Object> it = this.f26327a.snapshot().values().iterator();
        while (it.hasNext()) {
            ((C0363c) it.next()).f26338c = null;
        }
    }

    public void e() {
        if (this.f26333g == null) {
            e eVar = new e();
            this.f26333g = eVar;
            eVar.start();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            if (!this.f26332f) {
                m();
            }
            return true;
        }
        this.f26329c = false;
        if (!this.f26332f) {
            e();
            this.f26333g.d();
        }
        return true;
    }

    public void i(f fVar, ImageView imageView) {
        l(fVar, imageView, false);
    }

    public void j(f fVar, d dVar) {
        l(fVar, dVar, false);
    }

    public void n(f fVar, d dVar) {
        l(fVar, dVar, true);
    }
}
