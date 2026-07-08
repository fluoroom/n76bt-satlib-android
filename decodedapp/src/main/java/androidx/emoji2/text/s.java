package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
class s implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2133a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spannable f2134b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.chars());
        }

        static IntStream b(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return false;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.s.b
        boolean a(CharSequence charSequence) {
            return t.a(charSequence);
        }
    }

    s(Spannable spannable) {
        this.f2134b = spannable;
    }

    private void a() {
        Spannable spannable = this.f2134b;
        if (!this.f2133a && c().a(spannable)) {
            this.f2134b = new SpannableString(spannable);
        }
        this.f2133a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f2134b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f2134b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2134b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2134b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2134b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f2134b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2134b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f2134b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f2134b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f2134b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f2134b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2134b.toString();
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f2134b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f2134b);
    }

    s(CharSequence charSequence) {
        this.f2134b = new SpannableString(charSequence);
    }
}
