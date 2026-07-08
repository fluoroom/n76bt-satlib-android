package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n;

/* JADX INFO: loaded from: classes.dex */
public class m {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final h mMenu;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private l mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private n.a mPresenterCallback;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m.this.onDismiss();
        }
    }

    public m(Context context, h hVar, View view, boolean z10, int i10) {
        this(context, hVar, view, z10, i10, 0);
    }

    private l a() {
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        l eVar = Math.min(point.x, point.y) >= this.mContext.getResources().getDimensionPixelSize(h.d.f14801c) ? new e(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly) : new r(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        eVar.a(this.mMenu);
        eVar.j(this.mInternalOnDismissListener);
        eVar.e(this.mAnchorView);
        eVar.setCallback(this.mPresenterCallback);
        eVar.g(this.mForceShowIcon);
        eVar.h(this.mDropDownGravity);
        return eVar;
    }

    private void b(int i10, int i11, boolean z10, boolean z11) {
        l popup = getPopup();
        popup.k(z11);
        if (z10) {
            if ((m0.l.b(this.mDropDownGravity, this.mAnchorView.getLayoutDirection()) & 7) == 5) {
                i10 -= this.mAnchorView.getWidth();
            }
            popup.i(i10);
            popup.l(i11);
            int i12 = (int) ((this.mContext.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.f(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    public l getPopup() {
        if (this.mPopup == null) {
            this.mPopup = a();
        }
        return this.mPopup;
    }

    public boolean isShowing() {
        l lVar = this.mPopup;
        return lVar != null && lVar.isShowing();
    }

    protected void onDismiss() {
        this.mPopup = null;
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    public void setForceShowIcon(boolean z10) {
        this.mForceShowIcon = z10;
        l lVar = this.mPopup;
        if (lVar != null) {
            lVar.g(z10);
        }
    }

    public void setGravity(int i10) {
        this.mDropDownGravity = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setPresenterCallback(n.a aVar) {
        this.mPresenterCallback = aVar;
        l lVar = this.mPopup;
        if (lVar != null) {
            lVar.setCallback(aVar);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        b(0, 0, false, false);
        return true;
    }

    public m(Context context, h hVar, View view, boolean z10, int i10, int i11) {
        this.mDropDownGravity = 8388611;
        this.mInternalOnDismissListener = new a();
        this.mContext = context;
        this.mMenu = hVar;
        this.mAnchorView = view;
        this.mOverflowOnly = z10;
        this.mPopupStyleAttr = i10;
        this.mPopupStyleRes = i11;
    }

    public void show(int i10, int i11) {
        if (!tryShow(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow(int i10, int i11) {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        b(i10, i11, true, true);
        return true;
    }
}
