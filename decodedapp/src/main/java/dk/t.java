package dk;

import dk.i;
import eh.i0;
import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends i.a {

    static final class a implements i {

        /* JADX INFO: renamed from: a */
        private final i f11209a;

        a(i iVar) {
            this.f11209a = iVar;
        }

        @Override // dk.i
        /* JADX INFO: renamed from: a */
        public Optional convert(i0 i0Var) {
            return Optional.ofNullable(this.f11209a.convert(i0Var));
        }
    }

    t() {
    }

    @Override // dk.i.a
    public i d(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (i.a.b(type) != Optional.class) {
            return null;
        }
        return new a(a0Var.h(i.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
