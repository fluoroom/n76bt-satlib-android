package fa;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import na.a;

/* JADX INFO: loaded from: classes3.dex */
public class c extends fa.a {

    /* JADX INFO: renamed from: e */
    private static final ma.b f12897e = new ma.b(1.0d);

    /* JADX INFO: renamed from: b */
    private int f12898b = 100;

    /* JADX INFO: renamed from: c */
    protected final Collection f12899c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    protected final na.a f12900d = new na.a(0.0d, 1.0d, 0.0d, 1.0d);

    protected static class a implements a.b, ea.a {

        /* JADX INFO: renamed from: a */
        protected final ea.b f12901a;

        /* JADX INFO: renamed from: b */
        private final la.b f12902b;

        /* JADX INFO: renamed from: c */
        private final LatLng f12903c;

        /* JADX INFO: renamed from: d */
        private Set f12904d;

        /* synthetic */ a(ea.b bVar, d dVar) {
            this(bVar);
        }

        @Override // ea.a
        public int a() {
            return 1;
        }

        @Override // na.a.b
        public la.b b() {
            return this.f12902b;
        }

        @Override // ea.a
        /* JADX INFO: renamed from: d */
        public Set c() {
            return this.f12904d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return ((a) obj).f12901a.equals(this.f12901a);
            }
            return false;
        }

        @Override // ea.a
        public LatLng getPosition() {
            return this.f12903c;
        }

        public int hashCode() {
            return this.f12901a.hashCode();
        }

        private a(ea.b bVar) {
            this.f12901a = bVar;
            LatLng position = bVar.getPosition();
            this.f12903c = position;
            this.f12902b = c.f12897e.b(position);
            this.f12904d = Collections.singleton(bVar);
        }
    }

    @Override // fa.b
    public Set b(float f10) {
        double dPow = (((double) this.f12898b) / Math.pow(2.0d, (int) f10)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.f12900d) {
            try {
                Iterator it = k(this.f12900d, f10).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (!hashSet.contains(aVar)) {
                        Collection<a> collectionD = this.f12900d.d(i(aVar.b(), dPow));
                        if (collectionD.size() == 1) {
                            hashSet2.add(aVar);
                            hashSet.add(aVar);
                            map.put(aVar, Double.valueOf(0.0d));
                        } else {
                            h hVar = new h(aVar.f12901a.getPosition());
                            hashSet2.add(hVar);
                            for (a aVar2 : collectionD) {
                                Double d10 = (Double) map.get(aVar2);
                                Iterator it2 = it;
                                double dJ = j(aVar2.b(), aVar.b());
                                if (d10 == null) {
                                    map.put(aVar2, Double.valueOf(dJ));
                                    hVar.b(aVar2.f12901a);
                                    map2.put(aVar2, hVar);
                                } else if (d10.doubleValue() >= dJ) {
                                    ((h) map2.get(aVar2)).d(aVar2.f12901a);
                                    map.put(aVar2, Double.valueOf(dJ));
                                    hVar.b(aVar2.f12901a);
                                    map2.put(aVar2, hVar);
                                }
                                it = it2;
                            }
                            hashSet.addAll(collectionD);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet2;
    }

    @Override // fa.b
    public boolean c(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (h((ea.b) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // fa.b
    public void d() {
        synchronized (this.f12900d) {
            this.f12899c.clear();
            this.f12900d.b();
        }
    }

    @Override // fa.b
    public int e() {
        return this.f12898b;
    }

    public boolean h(ea.b bVar) {
        boolean zAdd;
        a aVar = new a(bVar);
        synchronized (this.f12900d) {
            try {
                zAdd = this.f12899c.add(aVar);
                if (zAdd) {
                    this.f12900d.a(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zAdd;
    }

    protected la.a i(la.b bVar, double d10) {
        double d11 = d10 / 2.0d;
        double d12 = bVar.f20529a;
        double d13 = bVar.f20530b;
        return new la.a(d12 - d11, d12 + d11, d13 - d11, d13 + d11);
    }

    protected double j(la.b bVar, la.b bVar2) {
        double d10 = bVar.f20529a;
        double d11 = bVar2.f20529a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = bVar.f20530b;
        double d14 = bVar2.f20530b;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    protected Collection k(na.a aVar, float f10) {
        return this.f12899c;
    }
}
