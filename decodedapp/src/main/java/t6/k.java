package t6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s6.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    private static class a extends w.a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f27517b = new a();

        public a() {
            super(ArrayList.class);
        }

        @Override // s6.w
        public Object A(p6.h hVar) {
            return new ArrayList();
        }

        @Override // s6.w
        public boolean j() {
            return true;
        }

        @Override // s6.w
        public boolean l() {
            return true;
        }
    }

    private static class b extends w.a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Object f27518b;

        public b(Object obj) {
            super(obj.getClass());
            this.f27518b = obj;
        }

        @Override // s6.w
        public Object A(p6.h hVar) {
            return this.f27518b;
        }

        @Override // s6.w
        public boolean j() {
            return true;
        }

        @Override // s6.w
        public boolean l() {
            return true;
        }
    }

    private static class c extends w.a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f27519b = new c();

        public c() {
            super(HashMap.class);
        }

        @Override // s6.w
        public Object A(p6.h hVar) {
            return new HashMap();
        }

        @Override // s6.w
        public boolean j() {
            return true;
        }

        @Override // s6.w
        public boolean l() {
            return true;
        }
    }

    private static class d extends w.a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f27520b = new d();

        public d() {
            super(LinkedHashMap.class);
        }

        @Override // s6.w
        public Object A(p6.h hVar) {
            return new LinkedHashMap();
        }

        @Override // s6.w
        public boolean j() {
            return true;
        }

        @Override // s6.w
        public boolean l() {
            return true;
        }
    }

    public static s6.w a(p6.g gVar, Class cls) {
        if (cls == e6.h.class) {
            return new u6.r();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return a.f27517b;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new b(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new b(list);
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return d.f27520b;
        }
        if (cls == HashMap.class) {
            return c.f27519b;
        }
        Map map = Collections.EMPTY_MAP;
        if (map.getClass() == cls) {
            return new b(map);
        }
        return null;
    }
}
