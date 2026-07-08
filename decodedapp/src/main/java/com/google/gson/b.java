package com.google.gson;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements com.google.gson.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8619a = new a("IDENTITY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8620b = new b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return b.g(field.getName());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f8621c = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return b.g(b.f(field.getName(), ' '));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f8622d = new b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return b.f(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f8623e = new b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.b.e
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return b.f(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f8624f = new b("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.b.f
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return b.f(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f8625g = new b("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.b.g
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return b.f(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ b[] f8626h = e();

    enum a extends b {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return field.getName();
        }
    }

    private b(String str, int i10) {
    }

    private static /* synthetic */ b[] e() {
        return new b[]{f8619a, f8620b, f8621c, f8622d, f8623e, f8624f, f8625g};
    }

    static String f(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    static String g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (!Character.isLetter(cCharAt)) {
                i10++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8626h.clone();
    }

    @Override // com.google.gson.d
    public /* synthetic */ List a(Field field) {
        return com.google.gson.c.a(this, field);
    }

    /* synthetic */ b(String str, int i10, a aVar) {
        this(str, i10);
    }
}
