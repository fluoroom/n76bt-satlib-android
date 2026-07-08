package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f8822a = new a("DEFAULT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f8823b = new s("STRING", 1) { // from class: com.google.gson.s.b
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ s[] f8824c = a();

    enum a extends s {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    private s(String str, int i10) {
    }

    private static /* synthetic */ s[] a() {
        return new s[]{f8822a, f8823b};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f8824c.clone();
    }

    /* synthetic */ s(String str, int i10, a aVar) {
        this(str, i10);
    }
}
