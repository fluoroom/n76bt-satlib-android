package dk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class c {

    static final class a extends c {
        a() {
        }

        @Override // dk.c
        List a(Executor executor) {
            return Arrays.asList(new h(), new j(executor));
        }

        @Override // dk.c
        List b() {
            return Collections.singletonList(new t());
        }
    }

    c() {
    }

    List a(Executor executor) {
        return Collections.singletonList(new j(executor));
    }

    List b() {
        return Collections.EMPTY_LIST;
    }
}
