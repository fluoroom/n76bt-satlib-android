package io.objectbox.relation;

import cc.f;
import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class ToOne<TARGET> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Field f17431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17433e;

    private Field b() {
        Field field = this.f17431c;
        if (field != null) {
            return field;
        }
        f.a();
        this.f17429a.getClass();
        throw null;
    }

    public long a() {
        if (this.f17430b) {
            return this.f17432d;
        }
        Field fieldB = b();
        try {
            Long l10 = (Long) fieldB.get(this.f17429a);
            if (l10 != null) {
                return l10.longValue();
            }
            return 0L;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + fieldB);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ToOne) && a() == ((ToOne) obj).a();
    }

    public int hashCode() {
        long jA = a();
        return (int) (jA ^ (jA >>> 32));
    }

    public void setTargetId(long j10) {
        if (this.f17430b) {
            this.f17432d = j10;
        } else {
            try {
                b().set(this.f17429a, Long.valueOf(j10));
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Could not update to-one ID in entity", e10);
            }
        }
        if (j10 != 0) {
            this.f17433e = false;
        }
    }
}
