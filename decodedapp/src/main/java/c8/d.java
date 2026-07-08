package c8;

import android.os.IBinder;
import c8.b;
import java.lang.reflect.Field;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f4478c;

    private d(Object obj) {
        this.f4478c = obj;
    }

    public static b v1(Object obj) {
        return new d(obj);
    }

    public static Object x(b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).f4478c;
        }
        IBinder iBinderAsBinder = bVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        q.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
