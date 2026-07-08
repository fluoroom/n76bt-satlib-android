package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.c;
import e3.f;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final n f5117k = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.b f5118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.b f5119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b3.f f5120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.a f5121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f5122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f5123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k2.k f5124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f5125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f5126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a3.f f5127j;

    public e(Context context, l2.b bVar, f.b bVar2, b3.f fVar, c.a aVar, Map map, List list, k2.k kVar, f fVar2, int i10) {
        super(context.getApplicationContext());
        this.f5118a = bVar;
        this.f5120c = fVar;
        this.f5121d = aVar;
        this.f5122e = list;
        this.f5123f = map;
        this.f5124g = kVar;
        this.f5125h = fVar2;
        this.f5126i = i10;
        this.f5119b = e3.f.a(bVar2);
    }

    public b3.i a(ImageView imageView, Class cls) {
        return this.f5120c.a(imageView, cls);
    }

    public l2.b b() {
        return this.f5118a;
    }

    public List c() {
        return this.f5122e;
    }

    public synchronized a3.f d() {
        try {
            if (this.f5127j == null) {
                this.f5127j = (a3.f) this.f5121d.build().Q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f5127j;
    }

    public n e(Class cls) {
        n nVar = (n) this.f5123f.get(cls);
        if (nVar == null) {
            for (Map.Entry entry : this.f5123f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nVar = (n) entry.getValue();
                }
            }
        }
        return nVar == null ? f5117k : nVar;
    }

    public k2.k f() {
        return this.f5124g;
    }

    public f g() {
        return this.f5125h;
    }

    public int h() {
        return this.f5126i;
    }

    public j i() {
        return (j) this.f5119b.get();
    }
}
