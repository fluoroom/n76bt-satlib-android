package ya;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import dd.d0;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    public static final e f32461a = new e();

    private e() {
    }

    public static final d0 c(String str) {
        sa.d dVarD = sa.e.f27124a.d(str);
        if (dVarD == null) {
            return null;
        }
        if (dVarD.u() != null && dVarD.s() != null) {
            WindowManager.LayoutParams layoutParamsS = dVarD.s();
            m.b(layoutParamsS);
            layoutParamsS.flags = 40;
            if (dVarD.q().F()) {
                WindowManager.LayoutParams layoutParamsS2 = dVarD.s();
                m.b(layoutParamsS2);
                WindowManager.LayoutParams layoutParamsS3 = dVarD.s();
                m.b(layoutParamsS3);
                layoutParamsS2.flags = layoutParamsS3.flags | 16;
            }
            if (dVarD.q().m()) {
                WindowManager.LayoutParams layoutParamsS4 = dVarD.s();
                m.b(layoutParamsS4);
                WindowManager.LayoutParams layoutParamsS5 = dVarD.s();
                m.b(layoutParamsS5);
                layoutParamsS4.flags = layoutParamsS5.flags | WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
            WindowManager windowManagerU = dVarD.u();
            m.b(windowManagerU);
            windowManagerU.updateViewLayout(dVarD.r(), dVarD.s());
        }
        return d0.f10897a;
    }

    public static final boolean e(EditText editText, String str, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        f(editText, str);
        return false;
    }

    public static final void f(final EditText editText, String str) {
        m.e(editText, "editText");
        sa.d dVarD = sa.e.f27124a.d(str);
        if (dVarD != null) {
            if (dVarD.u() == null || dVarD.s() == null) {
                return;
            }
            WindowManager.LayoutParams layoutParamsS = dVarD.s();
            m.b(layoutParamsS);
            layoutParamsS.flags = 32;
            if (dVarD.q().F()) {
                WindowManager.LayoutParams layoutParamsS2 = dVarD.s();
                m.b(layoutParamsS2);
                WindowManager.LayoutParams layoutParamsS3 = dVarD.s();
                m.b(layoutParamsS3);
                layoutParamsS2.flags = layoutParamsS3.flags | 16;
            }
            if (dVarD.q().m()) {
                WindowManager.LayoutParams layoutParamsS4 = dVarD.s();
                m.b(layoutParamsS4);
                WindowManager.LayoutParams layoutParamsS5 = dVarD.s();
                m.b(layoutParamsS5);
                layoutParamsS4.flags = layoutParamsS5.flags | WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
            WindowManager windowManagerU = dVarD.u();
            m.b(windowManagerU);
            windowManagerU.updateViewLayout(dVarD.r(), dVarD.s());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ya.d
            @Override // java.lang.Runnable
            public final void run() {
                e.g(editText);
            }
        }, 100L);
    }

    public static final void g(EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    public final void d(final EditText editText, final String str) {
        m.e(editText, "editText");
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: ya.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return e.e(editText, str, view, motionEvent);
            }
        });
    }
}
