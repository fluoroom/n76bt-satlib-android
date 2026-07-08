package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
class u implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w f2455a;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f2456a;

        a(b0 b0Var) {
            this.f2456a = b0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            o oVarK = this.f2456a.k();
            this.f2456a.m();
            m0.u((ViewGroup) oVarK.T.getParent(), u.this.f2455a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    u(w wVar) {
        this.f2455a = wVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        b0 b0VarW;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2455a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0.c.f31540a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(x0.c.f31541b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x0.c.f31542c, -1);
        String string = typedArrayObtainStyledAttributes.getString(x0.c.f31543d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !s.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        o oVarI0 = resourceId != -1 ? this.f2455a.i0(resourceId) : null;
        if (oVarI0 == null && string != null) {
            oVarI0 = this.f2455a.j0(string);
        }
        if (oVarI0 == null && id2 != -1) {
            oVarI0 = this.f2455a.i0(id2);
        }
        if (oVarI0 == null) {
            oVarI0 = this.f2455a.u0().a(context.getClassLoader(), attributeValue);
            oVarI0.f2402y = true;
            oVarI0.I = resourceId != 0 ? resourceId : id2;
            oVarI0.J = id2;
            oVarI0.K = string;
            oVarI0.f2403z = true;
            w wVar = this.f2455a;
            oVarI0.E = wVar;
            oVarI0.F = wVar.w0();
            oVarI0.D2(this.f2455a.w0().g(), attributeSet, oVarI0.f2376b);
            b0VarW = this.f2455a.j(oVarI0);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Fragment " + oVarI0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (oVarI0.f2403z) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            oVarI0.f2403z = true;
            w wVar2 = this.f2455a;
            oVarI0.E = wVar2;
            oVarI0.F = wVar2.w0();
            oVarI0.D2(this.f2455a.w0().g(), attributeSet, oVarI0.f2376b);
            b0VarW = this.f2455a.w(oVarI0);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + oVarI0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        z0.c.g(oVarI0, viewGroup);
        oVarI0.S = viewGroup;
        b0VarW.m();
        b0VarW.j();
        View view2 = oVarI0.T;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (oVarI0.T.getTag() == null) {
            oVarI0.T.setTag(string);
        }
        oVarI0.T.addOnAttachStateChangeListener(new a(b0VarW));
        return oVarI0.T;
    }
}
