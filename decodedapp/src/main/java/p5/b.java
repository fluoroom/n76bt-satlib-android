package p5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import c5.b0;
import com.benshikj.ht.R;
import com.dw.ht.widget.StrokeTextView;
import dd.o;
import p3.d;
import p3.e;
import rd.h;
import rd.m;
import z4.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f23911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageView f23912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageView f23913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorMatrixColorFilter f23916f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23917a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f32938b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f32940d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f32942f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.f32939c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.f32941e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.f32943g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f23917a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i10) {
        super(context);
        m.e(context, "context");
        View.inflate(context, i10, this);
        this.f23911a = (TextView) findViewById(R.id.title);
        this.f23912b = (ImageView) findViewById(R.id.icon);
        this.f23913c = (ImageView) findViewById(R.id.f4938bg);
    }

    private final void setLowVisibility(boolean z10) {
        if (z10 == this.f23915e) {
            return;
        }
        this.f23915e = z10;
        if (!z10) {
            ImageView imageView = this.f23912b;
            if (imageView != null) {
                imageView.setColorFilter((ColorFilter) null);
            }
            ImageView imageView2 = this.f23913c;
            if (imageView2 != null) {
                imageView2.setColorFilter((ColorFilter) null);
                return;
            }
            return;
        }
        if (this.f23916f == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f23916f = new ColorMatrixColorFilter(colorMatrix);
        }
        ImageView imageView3 = this.f23912b;
        if (imageView3 != null) {
            imageView3.setColorFilter(this.f23916f);
        }
        ImageView imageView4 = this.f23913c;
        if (imageView4 != null) {
            imageView4.setColorFilter(this.f23916f);
        }
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(this);
    }

    public final void d(b0 b0Var) {
        m.e(b0Var, "overlay");
        setTitle(b0Var.getTitle());
        Bitmap bitmapE = b0Var.e();
        if (bitmapE != null) {
            setIcon(bitmapE);
        } else {
            setIcon(R.drawable.icon_gcoding);
        }
        setLowVisibility(b0Var.k());
    }

    public final void setIcon(int i10) {
        if (i10 == 0) {
            ImageView imageView = this.f23912b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f23912b;
        if (imageView2 != null) {
            imageView2.setImageResource(i10);
        }
        ImageView imageView3 = this.f23912b;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
    }

    public final void setMapLayer(j jVar) {
        m.e(jVar, "layer");
        TextView textView = this.f23911a;
        StrokeTextView strokeTextView = textView instanceof StrokeTextView ? (StrokeTextView) textView : null;
        if (strokeTextView == null) {
            return;
        }
        switch (a.f23917a[jVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                strokeTextView.setTextColor(-13421773);
                strokeTextView.setStrokeColor(-1);
                return;
            case 4:
            case 5:
            case 6:
                strokeTextView.setTextColor(-1);
                strokeTextView.setStrokeColor(-16777216);
                return;
            default:
                throw new o();
        }
    }

    public final void setRoundedIcon(boolean z10) {
        this.f23914d = z10;
    }

    public final void setTitle(String str) {
        TextView textView = this.f23911a;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f23911a;
        if (textView2 != null) {
            textView2.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        }
    }

    public final void setIcon(Bitmap bitmap) {
        if (bitmap == null) {
            ImageView imageView = this.f23912b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f23914d) {
            d dVarA = e.a(getResources(), bitmap);
            dVarA.e(true);
            ImageView imageView2 = this.f23912b;
            if (imageView2 != null) {
                imageView2.setImageDrawable(dVarA);
            }
        } else {
            ImageView imageView3 = this.f23912b;
            if (imageView3 != null) {
                imageView3.setImageBitmap(bitmap);
            }
        }
        ImageView imageView4 = this.f23912b;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
    }

    public /* synthetic */ b(Context context, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? R.layout.widget_map_overlay : i10);
    }
}
