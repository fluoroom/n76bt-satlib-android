package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import z9.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f8684c = new C0128a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f8685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f8686b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C0128a implements y {
        C0128a() {
        }

        @Override // com.google.gson.y
        public x a(com.google.gson.f fVar, TypeToken typeToken) {
            Type typeD = typeToken.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = v.g(typeD);
            return new a(fVar, fVar.l(TypeToken.b(typeG)), v.k(typeG));
        }
    }

    public a(com.google.gson.f fVar, x xVar, Class cls) {
        this.f8686b = new n(fVar, xVar, cls);
        this.f8685a = cls;
    }

    @Override // com.google.gson.x
    public Object b(ca.a aVar) throws IOException {
        if (aVar.A0() == ca.b.NULL) {
            aVar.w0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.H()) {
            arrayList.add(this.f8686b.b(aVar));
        }
        aVar.q();
        int size = arrayList.size();
        if (!this.f8685a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f8685a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f8685a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.x
    public void d(ca.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.S();
            return;
        }
        cVar.k();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f8686b.d(cVar, Array.get(obj, i10));
        }
        cVar.q();
    }
}
