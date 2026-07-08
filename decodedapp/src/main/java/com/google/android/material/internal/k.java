package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.z;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k extends androidx.transition.k {

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f8029a;

        a(TextView textView) {
            this.f8029a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f8029a.setScaleX(fFloatValue);
            this.f8029a.setScaleY(fFloatValue);
        }
    }

    private void u0(z zVar) {
        View view = zVar.f3467b;
        if (view instanceof TextView) {
            zVar.f3466a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.k
    public void j(z zVar) {
        u0(zVar);
    }

    @Override // androidx.transition.k
    public void n(z zVar) {
        u0(zVar);
    }

    @Override // androidx.transition.k
    public Animator t(ViewGroup viewGroup, z zVar, z zVar2) {
        if (zVar == null || zVar2 == null || !(zVar.f3467b instanceof TextView)) {
            return null;
        }
        View view = zVar2.f3467b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = zVar.f3466a;
        Map map2 = zVar2.f3466a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
