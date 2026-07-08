package ki;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public class c extends ki.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19968b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19969a;

        static {
            int[] iArr = new int[b.values().length];
            f19969a = iArr;
            try {
                iArr[b.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19969a[b.THREAD_SAFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        REGULAR,
        THREAD_SAFE
    }

    protected c(Map map, b bVar) {
        super(map);
        this.f19968b = bVar;
    }

    public static c f(b bVar) {
        return new c(new HashMap(), bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ki.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Set a() {
        int i10 = a.f19969a[this.f19968b.ordinal()];
        if (i10 == 1) {
            return new HashSet();
        }
        if (i10 == 2) {
            return new CopyOnWriteArraySet();
        }
        throw new IllegalStateException("Unknown set type: " + this.f19968b);
    }
}
