package z5;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.QuoteSpan;
import k3.c;
import k3.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: z5.a$a, reason: collision with other inner class name */
    public static class C0445a extends QuoteSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f33018a;

        public C0445a(int i10, int i11) {
            super(i10);
            this.f33018a = i11;
        }

        @Override // android.text.style.QuoteSpan, android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z10) {
            return this.f33018a;
        }
    }

    public static Spannable a(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }

    public static Spanned b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c(context, Html.fromHtml(str));
    }

    static Spanned c(Context context, Spanned spanned) {
        if (spanned == null) {
            return null;
        }
        int length = spanned.length();
        if (length == 0) {
            return spanned;
        }
        SpannableStringBuilder spannableStringBuilder = spanned instanceof SpannableStringBuilder ? (SpannableStringBuilder) spanned : new SpannableStringBuilder(spanned);
        QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spannableStringBuilder.getSpans(0, length, QuoteSpan.class);
        if (quoteSpanArr != null && quoteSpanArr.length != 0) {
            Resources resources = context.getResources();
            int color = resources.getColor(c.f19166a);
            int dimensionPixelSize = resources.getDimensionPixelSize(d.f19175i);
            for (QuoteSpan quoteSpan : quoteSpanArr) {
                d(spannableStringBuilder, quoteSpan, new C0445a(color, dimensionPixelSize));
            }
        }
        ImageSpan[] imageSpanArr = (ImageSpan[]) spannableStringBuilder.getSpans(0, length, ImageSpan.class);
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                d(spannableStringBuilder, imageSpan, new ImageSpan(imageSpan.getDrawable(), 1));
            }
        }
        int i10 = length;
        for (int length2 = spannableStringBuilder.length() - 1; length2 >= 0 && spannableStringBuilder.charAt(length2) == '\n'; length2--) {
            i10 = length2;
        }
        return i10 == length ? spannableStringBuilder : new SpannableStringBuilder(spannableStringBuilder, 0, i10);
    }

    private static void d(SpannableStringBuilder spannableStringBuilder, Object obj, Object obj2) {
        spannableStringBuilder.setSpan(obj2, spannableStringBuilder.getSpanStart(obj), spannableStringBuilder.getSpanEnd(obj), spannableStringBuilder.getSpanFlags(obj));
        spannableStringBuilder.removeSpan(obj);
    }

    public static CharSequence e(CharSequence charSequence, int i10) {
        if (charSequence == null) {
            return null;
        }
        return f(charSequence, i10, 0, charSequence.length());
    }

    public static CharSequence f(CharSequence charSequence, int i10, int i11, int i12) {
        Spannable spannableA = a(charSequence);
        spannableA.setSpan(new ForegroundColorSpan(i10), i11, i12, 17);
        return spannableA;
    }
}
