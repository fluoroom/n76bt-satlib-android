package p5;

import a6.y;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import p3.b;
import v4.l1;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class c extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f23918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageView f23919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageView f23920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p3.b f23921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ProgressBar f23922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f23923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n0.c f23924g = n0.c.Idle;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23926b;

        static {
            int[] iArr = new int[n0.c.values().length];
            f23926b = iArr;
            try {
                iArr[n0.c.Connecting.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23926b[n0.c.Sending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23926b[n0.c.Idle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23926b[n0.c.Connected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23926b[n0.c.ConnectionFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23926b[n0.c.Interrupted.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[l1.h.values().length];
            f23925a = iArr2;
            try {
                iArr2[l1.h.ChannelIsOccupied.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23925a[l1.h.TxTimeout.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23925a[l1.h.UnableToRecord.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23925a[l1.h.LinkInterrupted.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23925a[l1.h.NotInChannel.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public c(Context context) {
        View viewInflate = View.inflate(context, R.layout.popup_tx_audio, null);
        this.f23918a = (TextView) viewInflate.findViewById(R.id.message);
        this.f23922e = (ProgressBar) viewInflate.findViewById(R.id.progressBar);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.level);
        this.f23919b = imageView;
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.icon);
        boolean z10 = imageView2 != null;
        this.f23923f = z10;
        if (z10) {
            this.f23920c = imageView2;
        } else {
            this.f23920c = imageView;
        }
        p3.b bVar = new p3.b(null);
        this.f23921d = bVar;
        if (Cfg.f5482d) {
            bVar.f(2);
            bVar.a(y.b(context, R.attr.colorPrimary).intValue());
            bVar.e(8191);
        } else {
            bVar.f(1);
        }
        bVar.c(20);
        imageView.setImageDrawable(bVar);
        setWidth(-2);
        setHeight(-2);
        setContentView(viewInflate);
    }

    public void a(b.a aVar) {
        this.f23921d.d(aVar);
    }

    public void b(int i10) {
        this.f23918a.setText(i10);
    }

    public void c(String str) {
        this.f23918a.setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(v4.n0.c r9, v4.l1.h r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.c.d(v4.n0$c, v4.l1$h):void");
    }

    public void e(View view) {
        int systemWindowInsetLeft;
        int systemWindowInsetTop;
        if (Build.VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            systemWindowInsetLeft = (rootWindowInsets.getSystemWindowInsetLeft() - rootWindowInsets.getSystemWindowInsetRight()) / 2;
            systemWindowInsetTop = (rootWindowInsets.getSystemWindowInsetTop() - rootWindowInsets.getSystemWindowInsetBottom()) / 2;
        } else {
            systemWindowInsetLeft = 0;
            systemWindowInsetTop = 0;
        }
        if (Cfg.f5482d) {
            showAtLocation(view, 81, systemWindowInsetLeft, systemWindowInsetTop);
        } else {
            showAtLocation(view, 17, systemWindowInsetLeft, systemWindowInsetTop);
        }
    }
}
