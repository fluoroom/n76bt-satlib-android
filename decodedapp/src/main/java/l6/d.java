package l6;

import e6.j;
import o6.h;

/* JADX INFO: loaded from: classes.dex */
public enum d implements h {
    ALLOW_JAVA_COMMENTS(false, j.a.ALLOW_COMMENTS),
    ALLOW_YAML_COMMENTS(false, j.a.ALLOW_YAML_COMMENTS),
    ALLOW_SINGLE_QUOTES(false, j.a.ALLOW_SINGLE_QUOTES),
    ALLOW_UNQUOTED_FIELD_NAMES(false, j.a.ALLOW_UNQUOTED_FIELD_NAMES),
    ALLOW_UNESCAPED_CONTROL_CHARS(false, j.a.ALLOW_UNQUOTED_CONTROL_CHARS),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false, j.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(false, j.a.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false, j.a.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false, j.a.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false, j.a.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_NON_NUMERIC_NUMBERS(false, j.a.ALLOW_NON_NUMERIC_NUMBERS),
    ALLOW_MISSING_VALUES(false, j.a.ALLOW_MISSING_VALUES),
    ALLOW_TRAILING_COMMA(false, j.a.ALLOW_TRAILING_COMMA);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20460b = 1 << ordinal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.a f20461c;

    d(boolean z10, j.a aVar) {
        this.f20459a = z10;
        this.f20461c = aVar;
    }

    @Override // o6.h
    public boolean a() {
        return this.f20459a;
    }

    @Override // o6.h
    public int d() {
        return this.f20460b;
    }

    public j.a g() {
        return this.f20461c;
    }
}
