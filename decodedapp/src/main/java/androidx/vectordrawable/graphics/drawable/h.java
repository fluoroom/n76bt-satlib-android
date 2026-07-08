package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import c0.k;
import c0.n;
import d0.d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.vectordrawable.graphics.drawable.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final PorterDuff.Mode f3501t = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0051h f3502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f3503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f3504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f3507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f3508h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Matrix f3509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f3510s;

    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3537b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3536a = d0.d.d(string2);
            }
            this.f3538c = n.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3472d);
                f(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$h, reason: collision with other inner class name */
    private static class C0051h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f3558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f3559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f3560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f3562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f3563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f3564h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3565i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f3566j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f3567k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f3568l;

        public C0051h(C0051h c0051h) {
            this.f3559c = null;
            this.f3560d = h.f3501t;
            if (c0051h != null) {
                this.f3557a = c0051h.f3557a;
                g gVar = new g(c0051h.f3558b);
                this.f3558b = gVar;
                if (c0051h.f3558b.f3545e != null) {
                    gVar.f3545e = new Paint(c0051h.f3558b.f3545e);
                }
                if (c0051h.f3558b.f3544d != null) {
                    this.f3558b.f3544d = new Paint(c0051h.f3558b.f3544d);
                }
                this.f3559c = c0051h.f3559c;
                this.f3560d = c0051h.f3560d;
                this.f3561e = c0051h.f3561e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f3562f.getWidth() && i11 == this.f3562f.getHeight();
        }

        public boolean b() {
            return !this.f3567k && this.f3563g == this.f3559c && this.f3564h == this.f3560d && this.f3566j == this.f3561e && this.f3565i == this.f3558b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f3562f == null || !a(i10, i11)) {
                this.f3562f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f3567k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3562f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3568l == null) {
                Paint paint = new Paint();
                this.f3568l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3568l.setAlpha(this.f3558b.getRootAlpha());
            this.f3568l.setColorFilter(colorFilter);
            return this.f3568l;
        }

        public boolean f() {
            return this.f3558b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3558b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3557a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f3558b.g(iArr);
            this.f3567k |= zG;
            return zG;
        }

        public void i() {
            this.f3563g = this.f3559c;
            this.f3564h = this.f3560d;
            this.f3565i = this.f3558b.getRootAlpha();
            this.f3566j = this.f3561e;
            this.f3567k = false;
        }

        public void j(int i10, int i11) {
            this.f3562f.eraseColor(0);
            this.f3558b.b(new Canvas(this.f3562f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0051h() {
            this.f3559c = null;
            this.f3560d = h.f3501t;
            this.f3558b = new g();
        }
    }

    h() {
        this.f3506f = true;
        this.f3508h = new float[9];
        this.f3509r = new Matrix();
        this.f3510s = new Rect();
        this.f3502b = new C0051h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static h b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f3500a = k.e(resources, i10, theme);
            hVar.f3507g = new i(hVar.f3500a.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0051h c0051h = this.f3502b;
        g gVar = c0051h.f3558b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f3548h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3524b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f3556p.put(cVar.getPathName(), cVar);
                    }
                    c0051h.f3557a = cVar.f3539d | c0051h.f3557a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3524b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f3556p.put(bVar.getPathName(), bVar);
                    }
                    c0051h.f3557a = bVar.f3539d | c0051h.f3557a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3524b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f3556p.put(dVar2.getGroupName(), dVar2);
                    }
                    c0051h.f3557a = dVar2.f3533k | c0051h.f3557a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && e0.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0051h c0051h = this.f3502b;
        g gVar = c0051h.f3558b;
        c0051h.f3560d = g(n.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = n.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            c0051h.f3559c = colorStateListG;
        }
        c0051h.f3561e = n.e(typedArray, xmlPullParser, "autoMirrored", 5, c0051h.f3561e);
        gVar.f3551k = n.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3551k);
        float fJ = n.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3552l);
        gVar.f3552l = fJ;
        if (gVar.f3551k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f3549i = typedArray.getDimension(3, gVar.f3549i);
        float dimension = typedArray.getDimension(2, gVar.f3550j);
        gVar.f3550j = dimension;
        if (gVar.f3549i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(n.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f3554n = string;
            gVar.f3556p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3500a;
        if (drawable == null) {
            return false;
        }
        e0.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f3502b.f3558b.f3556p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3510s);
        if (this.f3510s.width() <= 0 || this.f3510s.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3504d;
        if (colorFilter == null) {
            colorFilter = this.f3503c;
        }
        canvas.getMatrix(this.f3509r);
        this.f3509r.getValues(this.f3508h);
        float fAbs = Math.abs(this.f3508h[0]);
        float fAbs2 = Math.abs(this.f3508h[4]);
        float fAbs3 = Math.abs(this.f3508h[1]);
        float fAbs4 = Math.abs(this.f3508h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f3510s.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f3510s.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f3510s;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f3510s.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f3510s.offsetTo(0, 0);
        this.f3502b.c(iMin, iMin2);
        if (!this.f3506f) {
            this.f3502b.j(iMin, iMin2);
        } else if (!this.f3502b.b()) {
            this.f3502b.j(iMin, iMin2);
            this.f3502b.i();
        }
        this.f3502b.d(canvas, colorFilter, this.f3510s);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3500a;
        return drawable != null ? e0.a.d(drawable) : this.f3502b.f3558b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3500a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3502b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3500a;
        return drawable != null ? e0.a.e(drawable) : this.f3504d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3500a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3500a.getConstantState());
        }
        this.f3502b.f3557a = getChangingConfigurations();
        return this.f3502b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3500a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3502b.f3558b.f3550j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3500a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3502b.f3558b.f3549i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z10) {
        this.f3506f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3500a;
        return drawable != null ? e0.a.h(drawable) : this.f3502b.f3561e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0051h c0051h = this.f3502b;
        if (c0051h == null) {
            return false;
        }
        if (c0051h.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f3502b.f3559c;
        return colorStateList != null && colorStateList.isStateful();
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3505e && super.mutate() == this) {
            this.f3502b = new C0051h(this.f3502b);
            this.f3505e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0051h c0051h = this.f3502b;
        ColorStateList colorStateList = c0051h.f3559c;
        if (colorStateList == null || (mode = c0051h.f3560d) == null) {
            z10 = false;
        } else {
            this.f3503c = j(this.f3503c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!c0051h.g() || !c0051h.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f3502b.f3558b.getRootAlpha() != i10) {
            this.f3502b.f3558b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            e0.a.j(drawable, z10);
        } else {
            this.f3502b.f3561e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            e0.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            e0.a.o(drawable, colorStateList);
            return;
        }
        C0051h c0051h = this.f3502b;
        if (c0051h.f3559c != colorStateList) {
            c0051h.f3559c = colorStateList;
            this.f3503c = j(this.f3503c, colorStateList, c0051h.f3560d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            e0.a.p(drawable, mode);
            return;
        }
        C0051h c0051h = this.f3502b;
        if (c0051h.f3560d != mode) {
            c0051h.f3560d = mode;
            this.f3503c = j(this.f3503c, c0051h.f3559c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3500a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f3569a;

        public i(Drawable.ConstantState constantState) {
            this.f3569a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3569a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3569a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f3500a = (VectorDrawable) this.f3569a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f3500a = (VectorDrawable) this.f3569a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f3500a = (VectorDrawable) this.f3569a.newDrawable(resources, theme);
            return hVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3504d = colorFilter;
            invalidateSelf();
        }
    }

    private static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d.b[] f3536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f3537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3539d;

        public f() {
            super();
            this.f3536a = null;
            this.f3538c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f3536a;
            if (bVarArr != null) {
                d.b.i(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f3536a;
        }

        public String getPathName() {
            return this.f3537b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (d0.d.b(this.f3536a, bVarArr)) {
                d0.d.k(this.f3536a, bVarArr);
            } else {
                this.f3536a = d0.d.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f3536a = null;
            this.f3538c = 0;
            this.f3537b = fVar.f3537b;
            this.f3539d = fVar.f3539d;
            this.f3536a = d0.d.f(fVar.f3536a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3500a;
        if (drawable != null) {
            e0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0051h c0051h = this.f3502b;
        c0051h.f3558b = new g();
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3469a);
        i(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        c0051h.f3557a = getChangingConfigurations();
        c0051h.f3567k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3503c = j(this.f3503c, c0051h.f3559c, c0051h.f3560d);
    }

    h(C0051h c0051h) {
        this.f3506f = true;
        this.f3508h = new float[9];
        this.f3509r = new Matrix();
        this.f3510s = new Rect();
        this.f3502b = c0051h;
        this.f3503c = j(this.f3503c, c0051h.f3559c, c0051h.f3560d);
    }

    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f3511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        c0.d f3512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f3513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        c0.d f3514h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f3515i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f3516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f3517k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f3518l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f3519m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f3520n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f3521o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f3522p;

        c() {
            this.f3513g = 0.0f;
            this.f3515i = 1.0f;
            this.f3516j = 1.0f;
            this.f3517k = 0.0f;
            this.f3518l = 1.0f;
            this.f3519m = 0.0f;
            this.f3520n = Paint.Cap.BUTT;
            this.f3521o = Paint.Join.MITER;
            this.f3522p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3511e = null;
            if (n.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3537b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3536a = d0.d.d(string2);
                }
                this.f3514h = n.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f3516j = n.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f3516j);
                this.f3520n = e(n.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3520n);
                this.f3521o = f(n.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3521o);
                this.f3522p = n.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3522p);
                this.f3512f = n.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f3515i = n.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3515i);
                this.f3513g = n.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f3513g);
                this.f3518l = n.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3518l);
                this.f3519m = n.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3519m);
                this.f3517k = n.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f3517k);
                this.f3538c = n.k(typedArray, xmlPullParser, "fillType", 13, this.f3538c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            return this.f3514h.i() || this.f3512f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            return this.f3512f.j(iArr) | this.f3514h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3471c);
            h(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        float getFillAlpha() {
            return this.f3516j;
        }

        int getFillColor() {
            return this.f3514h.e();
        }

        float getStrokeAlpha() {
            return this.f3515i;
        }

        int getStrokeColor() {
            return this.f3512f.e();
        }

        float getStrokeWidth() {
            return this.f3513g;
        }

        float getTrimPathEnd() {
            return this.f3518l;
        }

        float getTrimPathOffset() {
            return this.f3519m;
        }

        float getTrimPathStart() {
            return this.f3517k;
        }

        void setFillAlpha(float f10) {
            this.f3516j = f10;
        }

        void setFillColor(int i10) {
            this.f3514h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f3515i = f10;
        }

        void setStrokeColor(int i10) {
            this.f3512f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f3513g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f3518l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f3519m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f3517k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f3513g = 0.0f;
            this.f3515i = 1.0f;
            this.f3516j = 1.0f;
            this.f3517k = 0.0f;
            this.f3518l = 1.0f;
            this.f3519m = 0.0f;
            this.f3520n = Paint.Cap.BUTT;
            this.f3521o = Paint.Join.MITER;
            this.f3522p = 4.0f;
            this.f3511e = cVar.f3511e;
            this.f3512f = cVar.f3512f;
            this.f3513g = cVar.f3513g;
            this.f3515i = cVar.f3515i;
            this.f3514h = cVar.f3514h;
            this.f3538c = cVar.f3538c;
            this.f3516j = cVar.f3516j;
            this.f3517k = cVar.f3517k;
            this.f3518l = cVar.f3518l;
            this.f3519m = cVar.f3519m;
            this.f3520n = cVar.f3520n;
            this.f3521o = cVar.f3521o;
            this.f3522p = cVar.f3522p;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f3540q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f3541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f3542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f3543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f3544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f3545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f3546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f3547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f3548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f3549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f3550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f3551k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f3552l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3553m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f3554n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f3555o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final androidx.collection.a f3556p;

        public g() {
            this.f3543c = new Matrix();
            this.f3549i = 0.0f;
            this.f3550j = 0.0f;
            this.f3551k = 0.0f;
            this.f3552l = 0.0f;
            this.f3553m = 255;
            this.f3554n = null;
            this.f3555o = null;
            this.f3556p = new androidx.collection.a();
            this.f3548h = new d();
            this.f3541a = new Path();
            this.f3542b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f3523a.set(matrix);
            dVar2.f3523a.preConcat(dVar2.f3532j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f3524b.size()) {
                e eVar = (e) dVar2.f3524b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f3523a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f3551k;
            float f11 = i11 / this.f3552l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f3523a;
            this.f3543c.set(matrix);
            this.f3543c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f3541a);
            Path path = this.f3541a;
            this.f3542b.reset();
            if (fVar.c()) {
                this.f3542b.setFillType(fVar.f3538c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3542b.addPath(path, this.f3543c);
                canvas.clipPath(this.f3542b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f3517k;
            if (f12 != 0.0f || cVar.f3518l != 1.0f) {
                float f13 = cVar.f3519m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f3518l + f13) % 1.0f;
                if (this.f3546f == null) {
                    this.f3546f = new PathMeasure();
                }
                this.f3546f.setPath(this.f3541a, false);
                float length = this.f3546f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f3546f.getSegment(f16, length, path, true);
                    this.f3546f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f3546f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3542b.addPath(path, this.f3543c);
            if (cVar.f3514h.l()) {
                c0.d dVar2 = cVar.f3514h;
                if (this.f3545e == null) {
                    Paint paint = new Paint(1);
                    this.f3545e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3545e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f3543c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f3516j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(dVar2.e(), cVar.f3516j));
                }
                paint2.setColorFilter(colorFilter);
                this.f3542b.setFillType(cVar.f3538c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3542b, paint2);
            }
            if (cVar.f3512f.l()) {
                c0.d dVar3 = cVar.f3512f;
                if (this.f3544d == null) {
                    Paint paint3 = new Paint(1);
                    this.f3544d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3544d;
                Paint.Join join = cVar.f3521o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f3520n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f3522p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f3543c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f3515i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(dVar3.e(), cVar.f3515i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f3513g * fMin * fE);
                canvas.drawPath(this.f3542b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f3548h, f3540q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f3555o == null) {
                this.f3555o = Boolean.valueOf(this.f3548h.a());
            }
            return this.f3555o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3548h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3553m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f3553m = i10;
        }

        public g(g gVar) {
            this.f3543c = new Matrix();
            this.f3549i = 0.0f;
            this.f3550j = 0.0f;
            this.f3551k = 0.0f;
            this.f3552l = 0.0f;
            this.f3553m = 255;
            this.f3554n = null;
            this.f3555o = null;
            androidx.collection.a aVar = new androidx.collection.a();
            this.f3556p = aVar;
            this.f3548h = new d(gVar.f3548h, aVar);
            this.f3541a = new Path(gVar.f3541a);
            this.f3542b = new Path(gVar.f3542b);
            this.f3549i = gVar.f3549i;
            this.f3550j = gVar.f3550j;
            this.f3551k = gVar.f3551k;
            this.f3552l = gVar.f3552l;
            this.f3547g = gVar.f3547g;
            this.f3553m = gVar.f3553m;
            this.f3554n = gVar.f3554n;
            String str = gVar.f3554n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3555o = gVar.f3555o;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f3523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f3524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f3526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f3527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f3528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f3529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f3530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f3531i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f3532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3533k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f3534l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f3535m;

        public d(d dVar, androidx.collection.a aVar) {
            f bVar;
            super();
            this.f3523a = new Matrix();
            this.f3524b = new ArrayList();
            this.f3525c = 0.0f;
            this.f3526d = 0.0f;
            this.f3527e = 0.0f;
            this.f3528f = 1.0f;
            this.f3529g = 1.0f;
            this.f3530h = 0.0f;
            this.f3531i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3532j = matrix;
            this.f3535m = null;
            this.f3525c = dVar.f3525c;
            this.f3526d = dVar.f3526d;
            this.f3527e = dVar.f3527e;
            this.f3528f = dVar.f3528f;
            this.f3529g = dVar.f3529g;
            this.f3530h = dVar.f3530h;
            this.f3531i = dVar.f3531i;
            this.f3534l = dVar.f3534l;
            String str = dVar.f3535m;
            this.f3535m = str;
            this.f3533k = dVar.f3533k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3532j);
            ArrayList arrayList = dVar.f3524b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f3524b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f3524b.add(bVar);
                    Object obj2 = bVar.f3537b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f3532j.reset();
            this.f3532j.postTranslate(-this.f3526d, -this.f3527e);
            this.f3532j.postScale(this.f3528f, this.f3529g);
            this.f3532j.postRotate(this.f3525c, 0.0f, 0.0f);
            this.f3532j.postTranslate(this.f3530h + this.f3526d, this.f3531i + this.f3527e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3534l = null;
            this.f3525c = n.j(typedArray, xmlPullParser, "rotation", 5, this.f3525c);
            this.f3526d = typedArray.getFloat(1, this.f3526d);
            this.f3527e = typedArray.getFloat(2, this.f3527e);
            this.f3528f = n.j(typedArray, xmlPullParser, "scaleX", 3, this.f3528f);
            this.f3529g = n.j(typedArray, xmlPullParser, "scaleY", 4, this.f3529g);
            this.f3530h = n.j(typedArray, xmlPullParser, "translateX", 6, this.f3530h);
            this.f3531i = n.j(typedArray, xmlPullParser, "translateY", 7, this.f3531i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3535m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f3524b.size(); i10++) {
                if (((e) this.f3524b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f3524b.size(); i10++) {
                zB |= ((e) this.f3524b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3470b);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public String getGroupName() {
            return this.f3535m;
        }

        public Matrix getLocalMatrix() {
            return this.f3532j;
        }

        public float getPivotX() {
            return this.f3526d;
        }

        public float getPivotY() {
            return this.f3527e;
        }

        public float getRotation() {
            return this.f3525c;
        }

        public float getScaleX() {
            return this.f3528f;
        }

        public float getScaleY() {
            return this.f3529g;
        }

        public float getTranslateX() {
            return this.f3530h;
        }

        public float getTranslateY() {
            return this.f3531i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f3526d) {
                this.f3526d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f3527e) {
                this.f3527e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f3525c) {
                this.f3525c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f3528f) {
                this.f3528f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f3529g) {
                this.f3529g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f3530h) {
                this.f3530h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f3531i) {
                this.f3531i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f3523a = new Matrix();
            this.f3524b = new ArrayList();
            this.f3525c = 0.0f;
            this.f3526d = 0.0f;
            this.f3527e = 0.0f;
            this.f3528f = 1.0f;
            this.f3529g = 1.0f;
            this.f3530h = 0.0f;
            this.f3531i = 0.0f;
            this.f3532j = new Matrix();
            this.f3535m = null;
        }
    }
}
