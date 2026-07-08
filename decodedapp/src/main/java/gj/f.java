package gj;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f14563a = Pattern.compile("(.*)(?:(?:\\.zip)|(?:\\.jar))$");

    boolean a(Pattern pattern, e eVar, g gVar);
}
