package com.google.gson;

import java.io.IOException;
import java.math.BigDecimal;
import z9.a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f8834a = new a("DOUBLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f8835b = new v("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.v.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.w
        public Number a(ca.a aVar) {
            return new z9.y(aVar.y0());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f8836c = new v("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.v.c
        {
            a aVar = null;
        }

        private Number e(String str, ca.a aVar) throws ca.d {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!aVar.S()) {
                        throw new ca.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.x());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e10) {
                throw new o("Cannot parse " + str + "; at path " + aVar.x(), e10);
            }
        }

        @Override // com.google.gson.w
        public Number a(ca.a aVar) throws IOException {
            String strY0 = aVar.y0();
            if (strY0.indexOf(46) >= 0) {
                return e(strY0, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(strY0));
            } catch (NumberFormatException unused) {
                return e(strY0, aVar);
            }
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f8837d = new v("BIG_DECIMAL", 3) { // from class: com.google.gson.v.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(ca.a aVar) throws IOException {
            String strY0 = aVar.y0();
            try {
                return a0.b(strY0);
            } catch (NumberFormatException e10) {
                throw new o("Cannot parse " + strY0 + "; at path " + aVar.x(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ v[] f8838e = d();

    enum a extends v {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double a(ca.a aVar) {
            return Double.valueOf(aVar.h0());
        }
    }

    private v(String str, int i10) {
    }

    private static /* synthetic */ v[] d() {
        return new v[]{f8834a, f8835b, f8836c, f8837d};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f8838e.clone();
    }

    /* synthetic */ v(String str, int i10, a aVar) {
        this(str, i10);
    }
}
