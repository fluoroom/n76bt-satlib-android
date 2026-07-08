package com.google.protobuf;

import com.google.protobuf.r;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class w extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final w f10124j = new w(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f10125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f10126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f10127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f10128i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r.b f10129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10130b;

        a(r.b bVar, int i10) {
            this.f10129a = bVar;
            this.f10130b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10129a == aVar.f10129a && this.f10130b == aVar.f10130b;
        }

        public int hashCode() {
            return (this.f10129a.hashCode() * 65535) + this.f10130b;
        }
    }

    public static final class b {
    }

    w(boolean z10) {
        super(y.f10151e);
        Map map = Collections.EMPTY_MAP;
        this.f10125f = map;
        this.f10126g = map;
        this.f10127h = map;
        this.f10128i = map;
    }

    public static w e() {
        return f10124j;
    }

    public b d(r.b bVar, int i10) {
        android.support.v4.media.session.b.a(this.f10127h.get(new a(bVar, i10)));
        return null;
    }
}
