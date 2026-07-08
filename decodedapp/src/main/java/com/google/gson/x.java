package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    private final class b extends x {
        private b() {
        }

        @Override // com.google.gson.x
        public Object b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return x.this.b(aVar);
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        public void d(ca.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.S();
            } else {
                x.this.d(cVar, obj);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + x.this + "]";
        }
    }

    public final x a() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract Object b(ca.a aVar);

    public final k c(Object obj) {
        try {
            com.google.gson.internal.bind.g gVar = new com.google.gson.internal.bind.g();
            d(gVar, obj);
            return gVar.E0();
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    public abstract void d(ca.c cVar, Object obj);
}
