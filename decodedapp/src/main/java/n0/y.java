package n0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22396a;

    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y f22397a;

        a(y yVar) {
            this.f22397a = yVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            x xVarB = this.f22397a.b(i10);
            if (xVarB == null) {
                return null;
            }
            return xVarB.X0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f22397a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((x) listC.get(i11)).X0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            x xVarD = this.f22397a.d(i10);
            if (xVarD == null) {
                return null;
            }
            return xVarD.X0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f22397a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(y yVar) {
            super(yVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f22397a.a(i10, x.Y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public y() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f22396a = new b(this);
        } else {
            this.f22396a = new a(this);
        }
    }

    public x b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public x d(int i10) {
        return null;
    }

    public Object e() {
        return this.f22396a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public y(Object obj) {
        this.f22396a = obj;
    }

    public void a(int i10, x xVar, String str, Bundle bundle) {
    }
}
