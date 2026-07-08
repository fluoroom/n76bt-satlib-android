package ga;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import ea.c;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o8.c;

/* JADX INFO: loaded from: classes3.dex */
public class h implements ga.a {

    /* JADX INFO: renamed from: s */
    private static final int[] f13709s = {10, 20, 50, 100, HttpStatus.HTTP_OK, HttpStatus.HTTP_INTERNAL_SERVER_ERROR, CloseCodes.NORMAL_CLOSURE};

    /* JADX INFO: renamed from: t */
    private static final TimeInterpolator f13710t = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    private final o8.c f13711a;

    /* JADX INFO: renamed from: b */
    private final oa.b f13712b;

    /* JADX INFO: renamed from: c */
    private final ea.c f13713c;

    /* JADX INFO: renamed from: d */
    private final float f13714d;

    /* JADX INFO: renamed from: h */
    private ShapeDrawable f13718h;

    /* JADX INFO: renamed from: m */
    private Set f13723m;

    /* JADX INFO: renamed from: o */
    private float f13725o;

    /* JADX INFO: renamed from: q */
    private c.b f13727q;

    /* JADX INFO: renamed from: r */
    private c.e f13728r;

    /* JADX INFO: renamed from: g */
    private final Executor f13717g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i */
    private Set f13719i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: j */
    private SparseArray f13720j = new SparseArray();

    /* JADX INFO: renamed from: k */
    private c f13721k = new c();

    /* JADX INFO: renamed from: l */
    private int f13722l = 4;

    /* JADX INFO: renamed from: n */
    private c f13724n = new c();

    /* JADX INFO: renamed from: p */
    private final g f13726p = new g();

    /* JADX INFO: renamed from: e */
    private boolean f13715e = true;

    /* JADX INFO: renamed from: f */
    private long f13716f = 300;

    private class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        private final e f13729a;

        /* JADX INFO: renamed from: b */
        private final q8.i f13730b;

        /* JADX INFO: renamed from: c */
        private final LatLng f13731c;

        /* JADX INFO: renamed from: d */
        private final LatLng f13732d;

        /* JADX INFO: renamed from: e */
        private boolean f13733e;

        /* JADX INFO: renamed from: f */
        private ha.c f13734f;

        /* synthetic */ a(h hVar, e eVar, LatLng latLng, LatLng latLng2, j jVar) {
            this(eVar, latLng, latLng2);
        }

        public void a() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(h.f13710t);
            valueAnimatorOfFloat.setDuration(h.this.f13716f);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void b(ha.c cVar) {
            this.f13734f = cVar;
            this.f13733e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13733e) {
                h.this.f13721k.d(this.f13730b);
                h.this.f13724n.d(this.f13730b);
                this.f13734f.l(this.f13730b);
            }
            this.f13729a.f13752b = this.f13732d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f13732d == null || this.f13731c == null || this.f13730b == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f13732d;
            double d10 = latLng.f7320a;
            LatLng latLng2 = this.f13731c;
            double d11 = latLng2.f7320a;
            double d12 = animatedFraction;
            double d13 = ((d10 - d11) * d12) + d11;
            double dSignum = latLng.f7321b - latLng2.f7321b;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.f13730b.i(new LatLng(d13, (dSignum * d12) + this.f13731c.f7321b));
        }

        private a(e eVar, LatLng latLng, LatLng latLng2) {
            this.f13729a = eVar;
            this.f13730b = eVar.f13751a;
            this.f13731c = latLng;
            this.f13732d = latLng2;
        }
    }

    private class b {

        /* JADX INFO: renamed from: a */
        private final ea.a f13736a;

        /* JADX INFO: renamed from: b */
        private final Set f13737b;

        /* JADX INFO: renamed from: c */
        private final LatLng f13738c;

        public b(ea.a aVar, Set set, LatLng latLng) {
            this.f13736a = aVar;
            this.f13737b = set;
            this.f13738c = latLng;
        }

        public void b(d dVar) {
            e eVar;
            e eVar2;
            if (h.this.d0(this.f13736a)) {
                q8.i iVarB = h.this.f13724n.b(this.f13736a);
                if (iVarB == null) {
                    q8.j jVar = new q8.j();
                    LatLng position = this.f13738c;
                    if (position == null) {
                        position = this.f13736a.getPosition();
                    }
                    q8.j jVarT = jVar.t(position);
                    h.this.X(this.f13736a, jVarT);
                    iVarB = h.this.f13713c.i().j(jVarT);
                    h.this.f13724n.c(this.f13736a, iVarB);
                    eVar = new e(iVarB);
                    LatLng latLng = this.f13738c;
                    if (latLng != null) {
                        dVar.b(eVar, latLng, this.f13736a.getPosition());
                    }
                } else {
                    eVar = new e(iVarB);
                    h.this.b0(this.f13736a, iVarB);
                }
                h.this.a0(this.f13736a, iVarB);
                this.f13737b.add(eVar);
                return;
            }
            for (ea.b bVar : this.f13736a.c()) {
                q8.i iVarB2 = h.this.f13721k.b(bVar);
                if (iVarB2 == null) {
                    q8.j jVar2 = new q8.j();
                    LatLng latLng2 = this.f13738c;
                    if (latLng2 != null) {
                        jVar2.t(latLng2);
                    } else {
                        jVar2.t(bVar.getPosition());
                        if (bVar.a() != null) {
                            jVar2.x(bVar.a().floatValue());
                        }
                    }
                    h.this.W(bVar, jVar2);
                    iVarB2 = h.this.f13713c.j().j(jVar2);
                    eVar2 = new e(iVarB2);
                    h.this.f13721k.c(bVar, iVarB2);
                    LatLng latLng3 = this.f13738c;
                    if (latLng3 != null) {
                        dVar.b(eVar2, latLng3, bVar.getPosition());
                    }
                } else {
                    eVar2 = new e(iVarB2);
                    h.this.Z(bVar, iVarB2);
                }
                h.this.Y(bVar, iVarB2);
                this.f13737b.add(eVar2);
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a */
        private Map f13740a;

        /* JADX INFO: renamed from: b */
        private Map f13741b;

        /* synthetic */ c(j jVar) {
            this();
        }

        public Object a(q8.i iVar) {
            return this.f13741b.get(iVar);
        }

        public q8.i b(Object obj) {
            return (q8.i) this.f13740a.get(obj);
        }

        public void c(Object obj, q8.i iVar) {
            this.f13740a.put(obj, iVar);
            this.f13741b.put(iVar, obj);
        }

        public void d(q8.i iVar) {
            Object obj = this.f13741b.get(iVar);
            this.f13741b.remove(iVar);
            this.f13740a.remove(obj);
        }

        private c() {
            this.f13740a = new HashMap();
            this.f13741b = new HashMap();
        }
    }

    private class d extends Handler implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a */
        private final Lock f13742a;

        /* JADX INFO: renamed from: b */
        private final Condition f13743b;

        /* JADX INFO: renamed from: c */
        private Queue f13744c;

        /* JADX INFO: renamed from: d */
        private Queue f13745d;

        /* JADX INFO: renamed from: e */
        private Queue f13746e;

        /* JADX INFO: renamed from: f */
        private Queue f13747f;

        /* JADX INFO: renamed from: g */
        private Queue f13748g;

        /* JADX INFO: renamed from: h */
        private boolean f13749h;

        /* synthetic */ d(h hVar, j jVar) {
            this();
        }

        private void e() {
            if (!this.f13747f.isEmpty()) {
                g((q8.i) this.f13747f.poll());
                return;
            }
            if (!this.f13748g.isEmpty()) {
                ((a) this.f13748g.poll()).a();
                return;
            }
            if (!this.f13745d.isEmpty()) {
                ((b) this.f13745d.poll()).b(this);
            } else if (!this.f13744c.isEmpty()) {
                ((b) this.f13744c.poll()).b(this);
            } else {
                if (this.f13746e.isEmpty()) {
                    return;
                }
                g((q8.i) this.f13746e.poll());
            }
        }

        private void g(q8.i iVar) {
            h.this.f13721k.d(iVar);
            h.this.f13724n.d(iVar);
            h.this.f13713c.k().l(iVar);
        }

        public void a(boolean z10, b bVar) {
            this.f13742a.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f13745d.add(bVar);
            } else {
                this.f13744c.add(bVar);
            }
            this.f13742a.unlock();
        }

        public void b(e eVar, LatLng latLng, LatLng latLng2) {
            this.f13742a.lock();
            this.f13748g.add(new a(eVar, latLng, latLng2));
            this.f13742a.unlock();
        }

        public void c(e eVar, LatLng latLng, LatLng latLng2) {
            this.f13742a.lock();
            a aVar = new a(eVar, latLng, latLng2);
            aVar.b(h.this.f13713c.k());
            this.f13748g.add(aVar);
            this.f13742a.unlock();
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean d() {
            /*
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.f13742a     // Catch: java.lang.Throwable -> L30
                r0.lock()     // Catch: java.lang.Throwable -> L30
                java.util.Queue r0 = r2.f13744c     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f13745d     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f13747f     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f13746e     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f13748g     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 != 0) goto L2e
                goto L32
            L2e:
                r0 = 0
                goto L33
            L30:
                r0 = move-exception
                goto L39
            L32:
                r0 = 1
            L33:
                java.util.concurrent.locks.Lock r1 = r2.f13742a
                r1.unlock()
                return r0
            L39:
                java.util.concurrent.locks.Lock r1 = r2.f13742a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ga.h.d.d():boolean");
        }

        public void f(boolean z10, q8.i iVar) {
            this.f13742a.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f13747f.add(iVar);
            } else {
                this.f13746e.add(iVar);
            }
            this.f13742a.unlock();
        }

        public void h() {
            while (d()) {
                sendEmptyMessage(0);
                this.f13742a.lock();
                try {
                    try {
                        if (d()) {
                            this.f13743b.await();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    this.f13742a.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f13749h) {
                Looper.myQueue().addIdleHandler(this);
                this.f13749h = true;
            }
            removeMessages(0);
            this.f13742a.lock();
            for (int i10 = 0; i10 < 10; i10++) {
                try {
                    e();
                } catch (Throwable th2) {
                    this.f13742a.unlock();
                    throw th2;
                }
            }
            if (d()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f13749h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f13743b.signalAll();
            }
            this.f13742a.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private d() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f13742a = reentrantLock;
            this.f13743b = reentrantLock.newCondition();
            this.f13744c = new LinkedList();
            this.f13745d = new LinkedList();
            this.f13746e = new LinkedList();
            this.f13747f = new LinkedList();
            this.f13748g = new LinkedList();
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a */
        private final q8.i f13751a;

        /* JADX INFO: renamed from: b */
        private LatLng f13752b;

        /* synthetic */ e(q8.i iVar, j jVar) {
            this(iVar);
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f13751a.equals(((e) obj).f13751a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13751a.hashCode();
        }

        private e(q8.i iVar) {
            this.f13751a = iVar;
            this.f13752b = iVar.a();
        }
    }

    private class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final Set f13753a;

        /* JADX INFO: renamed from: b */
        private Runnable f13754b;

        /* JADX INFO: renamed from: c */
        private o8.h f13755c;

        /* JADX INFO: renamed from: d */
        private ma.b f13756d;

        /* JADX INFO: renamed from: e */
        private float f13757e;

        /* synthetic */ f(h hVar, Set set, j jVar) {
            this(set);
        }

        public void a(Runnable runnable) {
            this.f13754b = runnable;
        }

        public void b(float f10) {
            this.f13757e = f10;
            this.f13756d = new ma.b(Math.pow(2.0d, Math.min(f10, h.this.f13725o)) * 256.0d);
        }

        public void c(o8.h hVar) {
            this.f13755c = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            LatLngBounds latLngBoundsA;
            ArrayList arrayList;
            h hVar = h.this;
            if (!hVar.c0(hVar.N(hVar.f13723m), h.this.N(this.f13753a))) {
                this.f13754b.run();
                return;
            }
            ArrayList arrayList2 = null;
            d dVar = new d();
            float f10 = this.f13757e;
            boolean z10 = f10 > h.this.f13725o;
            float f11 = f10 - h.this.f13725o;
            Set<e> set = h.this.f13719i;
            try {
                latLngBoundsA = this.f13755c.b().f24492e;
            } catch (Exception e10) {
                e10.printStackTrace();
                latLngBoundsA = LatLngBounds.b().b(new LatLng(0.0d, 0.0d)).a();
            }
            if (h.this.f13723m == null || !h.this.f13715e) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (ea.a aVar : h.this.f13723m) {
                    if (h.this.d0(aVar) && latLngBoundsA.c(aVar.getPosition())) {
                        arrayList.add(this.f13756d.b(aVar.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (ea.a aVar2 : this.f13753a) {
                boolean zC = latLngBoundsA.c(aVar2.getPosition());
                if (z10 && zC && h.this.f13715e) {
                    la.b bVarG = h.this.G(arrayList, this.f13756d.b(aVar2.getPosition()));
                    if (bVarG != null) {
                        dVar.a(true, h.this.new b(aVar2, setNewSetFromMap, this.f13756d.a(bVarG)));
                    } else {
                        dVar.a(true, h.this.new b(aVar2, setNewSetFromMap, null));
                    }
                } else {
                    dVar.a(zC, h.this.new b(aVar2, setNewSetFromMap, null));
                }
            }
            dVar.h();
            set.removeAll(setNewSetFromMap);
            if (h.this.f13715e) {
                arrayList2 = new ArrayList();
                for (ea.a aVar3 : this.f13753a) {
                    if (h.this.d0(aVar3) && latLngBoundsA.c(aVar3.getPosition())) {
                        arrayList2.add(this.f13756d.b(aVar3.getPosition()));
                    }
                }
            }
            for (e eVar : set) {
                boolean zC2 = latLngBoundsA.c(eVar.f13752b);
                if (z10 || f11 <= -3.0f || !zC2 || !h.this.f13715e) {
                    dVar.f(zC2, eVar.f13751a);
                } else {
                    la.b bVarG2 = h.this.G(arrayList2, this.f13756d.b(eVar.f13752b));
                    if (bVarG2 != null) {
                        dVar.c(eVar, eVar.f13752b, this.f13756d.a(bVarG2));
                    } else {
                        dVar.f(true, eVar.f13751a);
                    }
                }
            }
            dVar.h();
            h.this.f13719i = setNewSetFromMap;
            h.this.f13723m = this.f13753a;
            h.this.f13725o = f10;
            this.f13754b.run();
        }

        private f(Set set) {
            this.f13753a = set;
        }
    }

    class g extends Handler {

        /* JADX INFO: renamed from: a */
        private boolean f13759a;

        /* JADX INFO: renamed from: b */
        private f f13760b;

        /* synthetic */ g(h hVar, j jVar) {
            this();
        }

        public /* synthetic */ void b() {
            sendEmptyMessage(1);
        }

        public void c(Set set) {
            synchronized (this) {
                this.f13760b = new f(set);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f fVar;
            if (message.what == 1) {
                this.f13759a = false;
                if (this.f13760b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f13759a || this.f13760b == null) {
                return;
            }
            o8.h hVarJ = h.this.f13711a.j();
            synchronized (this) {
                fVar = this.f13760b;
                this.f13760b = null;
                this.f13759a = true;
            }
            fVar.a(new Runnable() { // from class: ga.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13762a.b();
                }
            });
            fVar.c(hVarJ);
            fVar.b(h.this.f13711a.g().f7313b);
            h.this.f13717g.execute(fVar);
        }

        private g() {
            this.f13759a = false;
            this.f13760b = null;
        }
    }

    public h(Context context, o8.c cVar, ea.c cVar2) {
        this.f13711a = cVar;
        this.f13714d = context.getResources().getDisplayMetrics().density;
        oa.b bVar = new oa.b(context);
        this.f13712b = bVar;
        bVar.g(V(context));
        bVar.i(da.d.f10881c);
        bVar.e(U());
        this.f13713c = cVar2;
    }

    private static double F(la.b bVar, la.b bVar2) {
        double d10 = bVar.f20529a;
        double d11 = bVar2.f20529a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = bVar.f20530b;
        double d14 = bVar2.f20530b;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    public la.b G(List list, la.b bVar) {
        la.b bVar2 = null;
        if (list != null && !list.isEmpty()) {
            int iE = this.f13713c.g().e();
            double d10 = iE * iE;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                la.b bVar3 = (la.b) it.next();
                double dF = F(bVar3, bVar);
                if (dF < d10) {
                    bVar2 = bVar3;
                    d10 = dF;
                }
            }
        }
        return bVar2;
    }

    public Set N(Set set) {
        return set != null ? DesugarCollections.unmodifiableSet(set) : Collections.EMPTY_SET;
    }

    public /* synthetic */ boolean O(q8.i iVar) {
        c.e eVar = this.f13728r;
        return eVar != null && eVar.a((ea.b) this.f13721k.a(iVar));
    }

    public /* synthetic */ boolean R(q8.i iVar) {
        c.b bVar = this.f13727q;
        return bVar != null && bVar.a((ea.a) this.f13724n.a(iVar));
    }

    private LayerDrawable U() {
        this.f13718h = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f13718h});
        int i10 = (int) (this.f13714d * 3.0f);
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        return layerDrawable;
    }

    private oa.c V(Context context) {
        oa.c cVar = new oa.c(context);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        cVar.setId(da.b.f10875a);
        int i10 = (int) (this.f13714d * 12.0f);
        cVar.setPadding(i10, i10, i10, i10);
        return cVar;
    }

    protected int H(ea.a aVar) {
        int iA = aVar.a();
        int i10 = 0;
        if (iA <= f13709s[0]) {
            return iA;
        }
        while (true) {
            int[] iArr = f13709s;
            if (i10 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i11 = i10 + 1;
            if (iA < iArr[i11]) {
                return iArr[i10];
            }
            i10 = i11;
        }
    }

    protected String I(int i10) {
        if (i10 < f13709s[0]) {
            return String.valueOf(i10);
        }
        return i10 + "+";
    }

    public int J(int i10) {
        return da.d.f10881c;
    }

    public int K(int i10) {
        float fMin = 300.0f - Math.min(i10, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    protected q8.b L(ea.a aVar) {
        int iH = H(aVar);
        q8.b bVar = (q8.b) this.f13720j.get(iH);
        if (bVar != null) {
            return bVar;
        }
        this.f13718h.getPaint().setColor(K(iH));
        this.f13712b.i(J(iH));
        q8.b bVarB = q8.c.b(this.f13712b.d(I(iH)));
        this.f13720j.put(iH, bVarB);
        return bVarB;
    }

    public q8.i M(ea.b bVar) {
        return this.f13721k.b(bVar);
    }

    protected void W(ea.b bVar, q8.j jVar) {
        if (bVar.getTitle() != null && bVar.b() != null) {
            jVar.w(bVar.getTitle());
            jVar.v(bVar.b());
        } else if (bVar.getTitle() != null) {
            jVar.w(bVar.getTitle());
        } else if (bVar.b() != null) {
            jVar.w(bVar.b());
        }
        if (bVar.a() != null) {
            jVar.x(bVar.a().floatValue());
        }
    }

    protected void X(ea.a aVar, q8.j jVar) {
        Float fA;
        jVar.p(L(aVar));
        ArrayList arrayList = new ArrayList(aVar.c());
        if (arrayList.isEmpty() || (fA = ((ea.b) arrayList.get(0)).a()) == null) {
            return;
        }
        jVar.x(fA.floatValue());
    }

    protected void Z(ea.b bVar, q8.i iVar) {
        boolean z10 = true;
        boolean z11 = false;
        if (bVar.getTitle() == null || bVar.b() == null) {
            if (bVar.b() != null && !bVar.b().equals(iVar.c())) {
                iVar.k(bVar.b());
            } else if (bVar.getTitle() != null && !bVar.getTitle().equals(iVar.c())) {
                iVar.k(bVar.getTitle());
            }
            z11 = true;
        } else {
            if (!bVar.getTitle().equals(iVar.c())) {
                iVar.k(bVar.getTitle());
                z11 = true;
            }
            if (!bVar.b().equals(iVar.b())) {
                iVar.j(bVar.b());
                z11 = true;
            }
        }
        if (iVar.a().equals(bVar.getPosition())) {
            z10 = z11;
        } else {
            iVar.i(bVar.getPosition());
            if (bVar.a() != null) {
                iVar.m(bVar.a().floatValue());
            }
        }
        if (z10 && iVar.e()) {
            iVar.n();
        }
    }

    @Override // ga.a
    public void b(c.e eVar) {
        this.f13728r = eVar;
    }

    protected void b0(ea.a aVar, q8.i iVar) {
        iVar.h(L(aVar));
    }

    @Override // ga.a
    public void c(c.b bVar) {
        this.f13727q = bVar;
    }

    protected boolean c0(Set set, Set set2) {
        return !set2.equals(set);
    }

    @Override // ga.a
    public void d() {
        this.f13713c.j().p(new c.h() { // from class: ga.b
            @Override // o8.c.h
            public final boolean d(q8.i iVar) {
                return this.f13703a.O(iVar);
            }
        });
        this.f13713c.j().n(new c.f() { // from class: ga.c
            @Override // o8.c.f
            public final void h(q8.i iVar) {
                this.f13704a.P(iVar);
            }
        });
        this.f13713c.j().o(new c.g() { // from class: ga.d
            @Override // o8.c.g
            public final void a(q8.i iVar) {
                this.f13705a.Q(iVar);
            }
        });
        this.f13713c.i().p(new c.h() { // from class: ga.e
            @Override // o8.c.h
            public final boolean d(q8.i iVar) {
                return this.f13706a.R(iVar);
            }
        });
        this.f13713c.i().n(new c.f() { // from class: ga.f
            @Override // o8.c.f
            public final void h(q8.i iVar) {
                this.f13707a.S(iVar);
            }
        });
        this.f13713c.i().o(new c.g() { // from class: ga.g
            @Override // o8.c.g
            public final void a(q8.i iVar) {
                this.f13708a.T(iVar);
            }
        });
    }

    protected boolean d0(ea.a aVar) {
        return aVar.a() >= this.f13722l;
    }

    @Override // ga.a
    public void g(Set set) {
        this.f13726p.c(set);
    }

    @Override // ga.a
    public void i() {
        this.f13713c.j().p(null);
        this.f13713c.j().n(null);
        this.f13713c.j().o(null);
        this.f13713c.i().p(null);
        this.f13713c.i().n(null);
        this.f13713c.i().o(null);
    }

    public /* synthetic */ void P(q8.i iVar) {
    }

    public /* synthetic */ void Q(q8.i iVar) {
    }

    public /* synthetic */ void S(q8.i iVar) {
    }

    public /* synthetic */ void T(q8.i iVar) {
    }

    @Override // ga.a
    public void a(c.d dVar) {
    }

    @Override // ga.a
    public void e(c.f fVar) {
    }

    @Override // ga.a
    public void f(c.InterfaceC0157c interfaceC0157c) {
    }

    @Override // ga.a
    public void h(c.g gVar) {
    }

    protected void Y(ea.b bVar, q8.i iVar) {
    }

    protected void a0(ea.a aVar, q8.i iVar) {
    }
}
