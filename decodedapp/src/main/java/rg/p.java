package rg;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final l d(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xd.c e(MatchResult matchResult) {
        return xd.d.i(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xd.c f(MatchResult matchResult, int i10) {
        return xd.d.i(matchResult.start(i10), matchResult.end(i10));
    }
}
