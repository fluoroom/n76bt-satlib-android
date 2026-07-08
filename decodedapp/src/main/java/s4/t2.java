package s4;

import android.view.View;
import com.dw.ht.fragments.DeviceFragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0016¨\u0006#"}, d2 = {"Ls4/t2;", "Lcom/dw/ht/fragments/DeviceFragment;", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "", "delay", "Ldd/d0;", "s5", "(Ljava/lang/Runnable;J)V", "t5", "(Ljava/lang/Runnable;)V", "Lv4/n0;", "link", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "Ly4/b;", "newStatus", "r5", "(Ly4/b;)V", "y2", "P0", "Ljava/lang/Runnable;", "o5", "()Ljava/lang/Runnable;", "mLoadStatus", "Q0", "Ly4/b;", "p5", "()Ly4/b;", "setStatus", "status", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class t2 extends DeviceFragment {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private final Runnable mLoadStatus = new Runnable() { // from class: s4.s2
        @Override // java.lang.Runnable
        public final void run() {
            t2.q5(this.f26758a);
        }
    };

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private y4.b status = new y4.b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26774a;

        static {
            int[] iArr = new int[v4.v.values().length];
            try {
                iArr[v4.v.FREQ_MODE_GET_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26774a = iArr;
        }
    }

    public t2() {
        i5(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(t2 t2Var) {
        v4.l1 l1VarY4 = t2Var.Y4();
        if (l1VarY4 != null) {
            l1VarY4.a(v4.v.FREQ_MODE_GET_STATUS, new byte[0]);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 link, g3.d packet) {
        rd.m.e(link, "link");
        rd.m.e(packet, "packet");
        super.M(link, packet);
        if (DeviceFragment.a5(packet)) {
            if (a.f26774a[v4.v.d(packet.e()).ordinal()] == 1) {
                byte[] bArrI = packet.i();
                rd.m.d(bArrI, "getPayload(...)");
                r5(new y4.b(bArrI));
            }
        }
    }

    /* JADX INFO: renamed from: o5, reason: from getter */
    protected final Runnable getMLoadStatus() {
        return this.mLoadStatus;
    }

    /* JADX INFO: renamed from: p5, reason: from getter */
    protected final y4.b getStatus() {
        return this.status;
    }

    protected void r5(y4.b newStatus) {
        rd.m.e(newStatus, "newStatus");
        this.status = newStatus;
    }

    protected final void s5(Runnable runnable, long delay) {
        rd.m.e(runnable, "runnable");
        View viewT1 = T1();
        if (viewT1 != null) {
            viewT1.removeCallbacks(runnable);
        }
        View viewT12 = T1();
        if (viewT12 != null) {
            viewT12.postDelayed(runnable, delay);
        }
    }

    protected final void t5(Runnable runnable) {
        rd.m.e(runnable, "runnable");
        View viewT1 = T1();
        if (viewT1 != null) {
            viewT1.removeCallbacks(runnable);
        }
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        t5(this.mLoadStatus);
    }
}
