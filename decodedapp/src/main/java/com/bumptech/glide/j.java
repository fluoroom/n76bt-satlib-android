package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k2.t;
import k2.v;
import o2.o;
import o2.p;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a */
    private final p f5141a;

    /* JADX INFO: renamed from: b */
    private final z2.a f5142b;

    /* JADX INFO: renamed from: c */
    private final z2.e f5143c;

    /* JADX INFO: renamed from: d */
    private final z2.f f5144d;

    /* JADX INFO: renamed from: e */
    private final com.bumptech.glide.load.data.f f5145e;

    /* JADX INFO: renamed from: f */
    private final w2.f f5146f;

    /* JADX INFO: renamed from: g */
    private final z2.b f5147g;

    /* JADX INFO: renamed from: h */
    private final z2.d f5148h = new z2.d();

    /* JADX INFO: renamed from: i */
    private final z2.c f5149i = new z2.c();

    /* JADX INFO: renamed from: j */
    private final l0.d f5150j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public j() {
        l0.d dVarE = f3.a.e();
        this.f5150j = dVarE;
        this.f5141a = new p(dVarE);
        this.f5142b = new z2.a();
        this.f5143c = new z2.e();
        this.f5144d = new z2.f();
        this.f5145e = new com.bumptech.glide.load.data.f();
        this.f5146f = new w2.f();
        this.f5147g = new z2.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f5143c.d(cls, cls2)) {
            for (Class cls5 : this.f5146f.b(cls4, cls3)) {
                arrayList.add(new k2.i(cls, cls4, cls5, this.f5143c.b(cls, cls4), this.f5146f.a(cls4, cls5), this.f5150j));
            }
        }
        return arrayList;
    }

    public j a(Class cls, i2.d dVar) {
        this.f5142b.a(cls, dVar);
        return this;
    }

    public j b(Class cls, i2.k kVar) {
        this.f5144d.a(cls, kVar);
        return this;
    }

    public j c(Class cls, Class cls2, i2.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public j d(Class cls, Class cls2, o oVar) {
        this.f5141a.a(cls, cls2, oVar);
        return this;
    }

    public j e(String str, Class cls, Class cls2, i2.j jVar) {
        this.f5143c.a(str, jVar, cls, cls2);
        return this;
    }

    public List g() {
        List listB = this.f5147g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        t tVarA = this.f5149i.a(cls, cls2, cls3);
        t tVar = null;
        if (this.f5149i.c(tVarA)) {
            return null;
        }
        if (tVarA != null) {
            return tVarA;
        }
        List listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t(cls4, cls5, cls6, listF, this.f5150j);
        }
        this.f5149i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    public List i(Object obj) {
        return this.f5141a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List listA = this.f5148h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList();
            Iterator it = this.f5141a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f5143c.d((Class) it.next(), cls2)) {
                    if (!this.f5146f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f5148h.b(cls, cls2, cls3, DesugarCollections.unmodifiableList(listA));
        }
        return listA;
    }

    public i2.k k(v vVar) {
        i2.k kVarB = this.f5144d.b(vVar.d());
        if (kVarB != null) {
            return kVarB;
        }
        throw new d(vVar.d());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f5145e.a(obj);
    }

    public i2.d m(Object obj) {
        i2.d dVarB = this.f5142b.b(obj.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f5144d.b(vVar.d()) != null;
    }

    public j o(ImageHeaderParser imageHeaderParser) {
        this.f5147g.a(imageHeaderParser);
        return this;
    }

    public j p(e.a aVar) {
        this.f5145e.b(aVar);
        return this;
    }

    public j q(Class cls, Class cls2, w2.e eVar) {
        this.f5146f.c(cls, cls2, eVar);
        return this;
    }

    public final j r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f5143c.e(arrayList);
        return this;
    }
}
