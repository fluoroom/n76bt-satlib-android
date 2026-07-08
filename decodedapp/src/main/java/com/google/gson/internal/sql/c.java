package com.google.gson.internal.sql;

import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class c extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y f8808b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f8809a;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public x a(f fVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.c() == Timestamp.class) {
                return new c(fVar.m(Date.class), aVar);
            }
            return null;
        }
    }

    /* synthetic */ c(x xVar, a aVar) {
        this(xVar);
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(ca.a aVar) {
        Date date = (Date) this.f8809a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ca.c cVar, Timestamp timestamp) {
        this.f8809a.d(cVar, timestamp);
    }

    private c(x xVar) {
        this.f8809a = xVar;
    }
}
