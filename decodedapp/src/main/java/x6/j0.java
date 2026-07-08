package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public interface j0 {

    public static class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.fasterxml.jackson.databind.type.c f31762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.fasterxml.jackson.databind.type.b f31763b;

        public a(com.fasterxml.jackson.databind.type.c cVar, com.fasterxml.jackson.databind.type.b bVar) {
            this.f31762a = cVar;
            this.f31763b = bVar;
        }

        @Override // x6.j0
        public JavaType a(Type type) {
            return this.f31762a.Z(type, this.f31763b);
        }
    }

    JavaType a(Type type);
}
