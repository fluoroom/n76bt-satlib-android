package k0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f18899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f18900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f18902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f18903e;

        /* JADX INFO: renamed from: k0.c$a$a, reason: collision with other inner class name */
        public static class C0247a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f18904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f18905b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18906c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18907d;

            public C0247a(TextPaint textPaint) {
                this.f18904a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f18906c = 1;
                    this.f18907d = 1;
                } else {
                    this.f18907d = 0;
                    this.f18906c = 0;
                }
                this.f18905b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f18904a, this.f18905b, this.f18906c, this.f18907d);
            }

            public C0247a b(int i10) {
                this.f18906c = i10;
                return this;
            }

            public C0247a c(int i10) {
                this.f18907d = i10;
                return this;
            }

            public C0247a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f18905b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f18903e = b.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f18903e = null;
            }
            this.f18899a = textPaint;
            this.f18900b = textDirectionHeuristic;
            this.f18901c = i10;
            this.f18902d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f18901c != aVar.b() || this.f18902d != aVar.c())) || this.f18899a.getTextSize() != aVar.e().getTextSize() || this.f18899a.getTextScaleX() != aVar.e().getTextScaleX() || this.f18899a.getTextSkewX() != aVar.e().getTextSkewX() || this.f18899a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f18899a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f18899a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f18899a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f18899a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f18899a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f18899a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f18901c;
        }

        public int c() {
            return this.f18902d;
        }

        public TextDirectionHeuristic d() {
            return this.f18900b;
        }

        public TextPaint e() {
            return this.f18899a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f18900b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? l0.b.b(Float.valueOf(this.f18899a.getTextSize()), Float.valueOf(this.f18899a.getTextScaleX()), Float.valueOf(this.f18899a.getTextSkewX()), Float.valueOf(this.f18899a.getLetterSpacing()), Integer.valueOf(this.f18899a.getFlags()), this.f18899a.getTextLocales(), this.f18899a.getTypeface(), Boolean.valueOf(this.f18899a.isElegantTextHeight()), this.f18900b, Integer.valueOf(this.f18901c), Integer.valueOf(this.f18902d)) : l0.b.b(Float.valueOf(this.f18899a.getTextSize()), Float.valueOf(this.f18899a.getTextScaleX()), Float.valueOf(this.f18899a.getTextSkewX()), Float.valueOf(this.f18899a.getLetterSpacing()), Integer.valueOf(this.f18899a.getFlags()), this.f18899a.getTextLocale(), this.f18899a.getTypeface(), Boolean.valueOf(this.f18899a.isElegantTextHeight()), this.f18900b, Integer.valueOf(this.f18901c), Integer.valueOf(this.f18902d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f18899a.getTextSize());
            sb2.append(", textScaleX=" + this.f18899a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f18899a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f18899a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f18899a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f18899a.getTextLocales());
            } else {
                sb2.append(", textLocale=" + this.f18899a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f18899a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f18899a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f18900b);
            sb2.append(", breakStrategy=" + this.f18901c);
            sb2.append(", hyphenationFrequency=" + this.f18902d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f18899a = params.getTextPaint();
            this.f18900b = params.getTextDirection();
            this.f18901c = params.getBreakStrategy();
            this.f18902d = params.getHyphenationFrequency();
            this.f18903e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
