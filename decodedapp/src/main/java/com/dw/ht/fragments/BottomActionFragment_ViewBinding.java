package com.dw.ht.fragments;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import com.benshikj.ht.R;
import com.dw.ht.widget.DTMFKeyboard;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public class BottomActionFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BottomActionFragment f6135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f6136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f6137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f6138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f6139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f6140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f6141h;

    class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomActionFragment f6142a;

        a(BottomActionFragment bottomActionFragment) {
            this.f6142a = bottomActionFragment;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f6142a.onTouch(view, motionEvent);
        }
    }

    class b extends t1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BottomActionFragment f6144d;

        b(BottomActionFragment bottomActionFragment) {
            this.f6144d = bottomActionFragment;
        }

        @Override // t1.b
        public void b(View view) {
            this.f6144d.send();
        }
    }

    class c extends t1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BottomActionFragment f6146d;

        c(BottomActionFragment bottomActionFragment) {
            this.f6146d = bottomActionFragment;
        }

        @Override // t1.b
        public void b(View view) {
            this.f6146d.onPlaceButtonClick();
        }
    }

    class d extends t1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BottomActionFragment f6148d;

        d(BottomActionFragment bottomActionFragment) {
            this.f6148d = bottomActionFragment;
        }

        @Override // t1.b
        public void b(View view) {
            this.f6148d.onClick(view);
        }
    }

    class e extends t1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BottomActionFragment f6150d;

        e(BottomActionFragment bottomActionFragment) {
            this.f6150d = bottomActionFragment;
        }

        @Override // t1.b
        public void b(View view) {
            this.f6150d.onClick(view);
        }
    }

    class f implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomActionFragment f6152a;

        f(BottomActionFragment bottomActionFragment) {
            this.f6152a = bottomActionFragment;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f6152a.onTouch(view, motionEvent);
        }
    }

    public BottomActionFragment_ViewBinding(BottomActionFragment bottomActionFragment, View view) {
        this.f6135b = bottomActionFragment;
        bottomActionFragment.mBigTxButton = t1.c.c(view, R.id.transmission, "field 'mBigTxButton'");
        View viewC = t1.c.c(view, R.id.hold_to_speak, "field 'mSmallTxButton' and method 'onTouch'");
        bottomActionFragment.mSmallTxButton = viewC;
        this.f6136c = viewC;
        viewC.setOnTouchListener(new a(bottomActionFragment));
        View viewC2 = t1.c.c(view, R.id.send, "field 'mSendButton' and method 'send'");
        bottomActionFragment.mSendButton = (ActionButton) t1.c.a(viewC2, R.id.send, "field 'mSendButton'", ActionButton.class);
        this.f6137d = viewC2;
        viewC2.setOnClickListener(new b(bottomActionFragment));
        View viewC3 = t1.c.c(view, R.id.place, "field 'mPlaceButton' and method 'onPlaceButtonClick'");
        bottomActionFragment.mPlaceButton = (ActionButton) t1.c.a(viewC3, R.id.place, "field 'mPlaceButton'", ActionButton.class);
        this.f6138e = viewC3;
        viewC3.setOnClickListener(new c(bottomActionFragment));
        View viewC4 = t1.c.c(view, R.id.type, "field 'mTypeButton' and method 'onClick'");
        bottomActionFragment.mTypeButton = (ActionButton) t1.c.a(viewC4, R.id.type, "field 'mTypeButton'", ActionButton.class);
        this.f6139f = viewC4;
        viewC4.setOnClickListener(new d(bottomActionFragment));
        View viewC5 = t1.c.c(view, R.id.morse_code_play, "field 'mMorseCodePlayButton' and method 'onClick'");
        bottomActionFragment.mMorseCodePlayButton = (ActionButton) t1.c.a(viewC5, R.id.morse_code_play, "field 'mMorseCodePlayButton'", ActionButton.class);
        this.f6140g = viewC5;
        viewC5.setOnClickListener(new e(bottomActionFragment));
        bottomActionFragment.mMorseCodeOutputView = (TextView) t1.c.d(view, R.id.morse_code_output, "field 'mMorseCodeOutputView'", TextView.class);
        bottomActionFragment.mTextInput = (EditText) t1.c.d(view, R.id.input, "field 'mTextInput'", EditText.class);
        bottomActionFragment.mMorseCodeBar = t1.c.c(view, R.id.morse_code_bar, "field 'mMorseCodeBar'");
        bottomActionFragment.mDTMFKeyboard = (DTMFKeyboard) t1.c.d(view, R.id.dtmf_keyboard, "field 'mDTMFKeyboard'", DTMFKeyboard.class);
        View viewC6 = t1.c.c(view, R.id.tx, "method 'onTouch'");
        this.f6141h = viewC6;
        viewC6.setOnTouchListener(new f(bottomActionFragment));
    }
}
