package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class d extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final y f8695d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8698c;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public x a(com.google.gson.f fVar, TypeToken typeToken) {
            Class clsC = typeToken.c();
            a aVar = null;
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new d(clsC, aVar);
        }
    }

    /* synthetic */ d(Class cls, a aVar) {
        this(cls);
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum b(ca.a aVar) throws IOException {
        if (aVar.A0() == ca.b.NULL) {
            aVar.w0();
            return null;
        }
        String strY0 = aVar.y0();
        Enum r02 = (Enum) this.f8696a.get(strY0);
        return r02 == null ? (Enum) this.f8697b.get(strY0) : r02;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ca.c cVar, Enum r32) throws IOException {
        cVar.B0(r32 == null ? null : (String) this.f8698c.get(r32));
    }

    private d(Class cls) {
        this.f8696a = new HashMap();
        this.f8697b = new HashMap();
        this.f8698c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                y9.c cVar = (y9.c) field2.getAnnotation(y9.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f8696a.put(str, r42);
                    }
                }
                this.f8696a.put(strName, r42);
                this.f8697b.put(string, r42);
                this.f8698c.put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
