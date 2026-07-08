package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f8024d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j9.d f8027g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f8021a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j9.f f8022b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8025e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f8026f = new WeakReference(null);

    class a extends j9.f {
        a() {
        }

        @Override // j9.f
        public void a(int i10) {
            j.this.f8025e = true;
            b bVar = (b) j.this.f8026f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // j9.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            j.this.f8025e = true;
            b bVar = (b) j.this.f8026f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f8021a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f8021a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f8023c = d(str);
        this.f8024d = c(str);
        this.f8025e = false;
    }

    public j9.d e() {
        return this.f8027g;
    }

    public float f(String str) {
        if (!this.f8025e) {
            return this.f8024d;
        }
        i(str);
        return this.f8024d;
    }

    public TextPaint g() {
        return this.f8021a;
    }

    public float h(String str) {
        if (!this.f8025e) {
            return this.f8023c;
        }
        i(str);
        return this.f8023c;
    }

    public void j(b bVar) {
        this.f8026f = new WeakReference(bVar);
    }

    public void k(j9.d dVar, Context context) {
        if (this.f8027g != dVar) {
            this.f8027g = dVar;
            if (dVar != null) {
                dVar.q(context, this.f8021a, this.f8022b);
                b bVar = (b) this.f8026f.get();
                if (bVar != null) {
                    this.f8021a.drawableState = bVar.getState();
                }
                dVar.p(context, this.f8021a, this.f8022b);
                this.f8025e = true;
            }
            b bVar2 = (b) this.f8026f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f8025e = z10;
    }

    public void m(boolean z10) {
        this.f8025e = z10;
    }

    public void n(Context context) {
        this.f8027g.p(context, this.f8021a, this.f8022b);
    }
}
