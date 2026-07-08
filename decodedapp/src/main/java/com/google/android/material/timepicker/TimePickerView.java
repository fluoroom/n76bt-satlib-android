package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import u8.h;

/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip I;
    private final Chip J;
    private final ClockHandView K;
    private final ClockFaceView L;
    private final MaterialButtonToggleGroup M;
    private final View.OnClickListener N;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.y(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.z(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f8533a;

        c(GestureDetector gestureDetector) {
            this.f8533a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f8533a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        Chip chip = this.I;
        int i10 = u8.f.P;
        chip.setTag(i10, 12);
        this.J.setTag(i10, 10);
        this.I.setOnClickListener(this.N);
        this.J.setOnClickListener(this.N);
        this.I.setAccessibilityClassName("android.view.View");
        this.J.setAccessibilityClassName("android.view.View");
    }

    private void B() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.I.setOnTouchListener(cVar);
        this.J.setOnTouchListener(cVar);
    }

    static /* synthetic */ e y(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d z(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.J.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.N = new a();
        LayoutInflater.from(context).inflate(h.f28687p, this);
        this.L = (ClockFaceView) findViewById(u8.f.f28651i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(u8.f.f28654l);
        this.M = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f8545a.getClass();
            }
        });
        this.I = (Chip) findViewById(u8.f.f28657o);
        this.J = (Chip) findViewById(u8.f.f28655m);
        this.K = (ClockHandView) findViewById(u8.f.f28652j);
        B();
        A();
    }
}
