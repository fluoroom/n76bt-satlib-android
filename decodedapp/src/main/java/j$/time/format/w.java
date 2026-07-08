package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class w {
    public static final w FULL;
    public static final w FULL_STANDALONE;
    public static final w NARROW;
    public static final w NARROW_STANDALONE;
    public static final w SHORT;
    public static final w SHORT_STANDALONE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w[] f17569a;

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f17569a.clone();
    }

    static {
        w wVar = new w("FULL", 0);
        FULL = wVar;
        w wVar2 = new w("FULL_STANDALONE", 1);
        FULL_STANDALONE = wVar2;
        w wVar3 = new w("SHORT", 2);
        SHORT = wVar3;
        w wVar4 = new w("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = wVar4;
        w wVar5 = new w("NARROW", 4);
        NARROW = wVar5;
        w wVar6 = new w("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = wVar6;
        f17569a = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
    }
}
