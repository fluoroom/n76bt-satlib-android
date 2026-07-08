package com.facebook.stetho.common.android;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import com.facebook.stetho.common.android.FragmentCompat;

/* JADX INFO: loaded from: classes.dex */
final class FragmentCompatSupportLib extends FragmentCompat<o, n, w, p> {
    private static final FragmentAccessorSupportLib sFragmentAccessor = new FragmentAccessorSupportLib();
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<w, o> sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();

    private static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<n, o, w> {
        private DialogFragmentAccessorSupportLib() {
            super();
        }

        /* synthetic */ DialogFragmentAccessorSupportLib(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.facebook.stetho.common.android.DialogFragmentAccessor
        public Dialog getDialog(n nVar) {
            return nVar.X3();
        }
    }

    private static class FragmentAccessorSupportLib implements FragmentAccessor<o, w> {
        private FragmentAccessorSupportLib() {
        }

        /* synthetic */ FragmentAccessorSupportLib(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public w getChildFragmentManager(o oVar) {
            return oVar.j1();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public w getFragmentManager(o oVar) {
            return oVar.s1();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public int getId(o oVar) {
            return oVar.u1();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public Resources getResources(o oVar) {
            return oVar.H1();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public String getTag(o oVar) {
            return oVar.P1();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public View getView(o oVar) {
            return oVar.T1();
        }
    }

    private static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<p, w> {
        private FragmentActivityAccessorSupportLib() {
        }

        /* synthetic */ FragmentActivityAccessorSupportLib(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.facebook.stetho.common.android.FragmentActivityAccessor
        public w getFragmentManager(p pVar) {
            return pVar.N0();
        }
    }

    FragmentCompatSupportLib() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    /* JADX INFO: renamed from: forFragmentManager */
    public FragmentManagerAccessor<w, o> forFragmentManager2() {
        return sFragmentManagerAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<n> getDialogFragmentClass() {
        return n.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<p> getFragmentActivityClass() {
        return p.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<o> getFragmentClass() {
        return o.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public DialogFragmentAccessor<n, o, w> forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public FragmentAccessor<o, w> forFragment() {
        return sFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public FragmentActivityAccessorSupportLib forFragmentActivity() {
        return sFragmentActivityAccessor;
    }
}
