package rg;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26074b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f26075a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public o(Pattern pattern) {
        rd.m.e(pattern, "nativePattern");
        this.f26075a = pattern;
    }

    public final l a(CharSequence charSequence, int i10) {
        rd.m.e(charSequence, "input");
        Matcher matcherRegion = this.f26075a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        rd.m.b(matcherRegion);
        return new m(matcherRegion, charSequence);
    }

    public final l b(CharSequence charSequence) {
        rd.m.e(charSequence, "input");
        Matcher matcher = this.f26075a.matcher(charSequence);
        rd.m.d(matcher, "matcher(...)");
        return p.d(matcher, charSequence);
    }

    public final boolean c(CharSequence charSequence) {
        rd.m.e(charSequence, "input");
        return this.f26075a.matcher(charSequence).matches();
    }

    public final String d(CharSequence charSequence, String str) {
        rd.m.e(charSequence, "input");
        rd.m.e(str, "replacement");
        String strReplaceAll = this.f26075a.matcher(charSequence).replaceAll(str);
        rd.m.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final List e(CharSequence charSequence, int i10) {
        rd.m.e(charSequence, "input");
        e0.x0(i10);
        Matcher matcher = this.f26075a.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return ed.q.e(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? xd.d.c(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f26075a.toString();
        rd.m.d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String str) {
        rd.m.e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        rd.m.d(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
