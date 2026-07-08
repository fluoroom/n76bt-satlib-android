package com.google.gson.internal.bind;

import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y f8714b = f(v.f8835b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f8715a;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public x a(com.google.gson.f fVar, TypeToken typeToken) {
            if (typeToken.c() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8717a;

        static {
            int[] iArr = new int[ca.b.values().length];
            f8717a = iArr;
            try {
                iArr[ca.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8717a[ca.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8717a[ca.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private i(w wVar) {
        this.f8715a = wVar;
    }

    public static y e(w wVar) {
        return wVar == v.f8835b ? f8714b : f(wVar);
    }

    private static y f(w wVar) {
        return new i(wVar).new a();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(ca.a aVar) throws IOException {
        ca.b bVarA0 = aVar.A0();
        int i10 = b.f8717a[bVarA0.ordinal()];
        if (i10 == 1) {
            aVar.w0();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f8715a.a(aVar);
        }
        throw new r("Expecting number, got: " + bVarA0 + "; at path " + aVar.v());
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(ca.c cVar, Number number) throws IOException {
        cVar.A0(number);
    }
}
