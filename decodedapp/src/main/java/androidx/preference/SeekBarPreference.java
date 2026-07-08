package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import i1.c;
import i1.g;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int M;
    int N;
    private int O;
    private int P;
    boolean Q;
    SeekBar R;
    private TextView S;
    boolean T;
    private boolean U;
    boolean V;
    private final SeekBar.OnSeekBarChangeListener W;
    private final View.OnKeyListener X;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.V || !seekBarPreference.Q) {
                    seekBarPreference.O(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.P(i10 + seekBarPreference2.N);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Q = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Q = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.N != seekBarPreference.M) {
                seekBarPreference.O(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.T && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.R;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.W = new a();
        this.X = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.C0, i10, i11);
        this.N = typedArrayObtainStyledAttributes.getInt(g.F0, 0);
        L(typedArrayObtainStyledAttributes.getInt(g.D0, 100));
        M(typedArrayObtainStyledAttributes.getInt(g.G0, 0));
        this.T = typedArrayObtainStyledAttributes.getBoolean(g.E0, true);
        this.U = typedArrayObtainStyledAttributes.getBoolean(g.H0, false);
        this.V = typedArrayObtainStyledAttributes.getBoolean(g.I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void N(int i10, boolean z10) {
        int i11 = this.N;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.O;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.M) {
            this.M = i10;
            P(i10);
            G(i10);
            if (z10) {
                w();
            }
        }
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    public final void L(int i10) {
        int i11 = this.N;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.O) {
            this.O = i10;
            w();
        }
    }

    public final void M(int i10) {
        if (i10 != this.P) {
            this.P = Math.min(this.O - this.N, Math.abs(i10));
            w();
        }
    }

    void O(SeekBar seekBar) {
        int progress = this.N + seekBar.getProgress();
        if (progress != this.M) {
            if (a(Integer.valueOf(progress))) {
                N(progress, false);
            } else {
                seekBar.setProgress(this.M - this.N);
                P(this.M);
            }
        }
    }

    void P(int i10) {
        TextView textView = this.S;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f15672h);
    }
}
