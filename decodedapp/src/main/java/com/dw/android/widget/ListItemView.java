package com.dw.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.dw.android.widget.ListItemView;
import com.dw.widget.ActionButton;
import dd.o;
import k3.l;
import kotlin.Metadata;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0004\u001e!\u0017\u001bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\fJ;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\"R*\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u00102\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00108\u001a\u0004\u0018\u0001032\b\u0010&\u001a\u0004\u0018\u0001038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010;\u001a\u0004\u0018\u0001032\b\u0010&\u001a\u0004\u0018\u0001038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00105\"\u0004\b:\u00107R(\u0010A\u001a\u0004\u0018\u00010<2\b\u0010&\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R.\u0010C\u001a\u0004\u0018\u00010B2\b\u0010&\u001a\u0004\u0018\u00010B8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR.\u0010J\u001a\u0004\u0018\u00010I2\b\u0010&\u001a\u0004\u0018\u00010I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR(\u0010R\u001a\u0004\u0018\u00010<2\b\u0010&\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010>\"\u0004\bQ\u0010@¨\u0006S"}, d2 = {"Lcom/dw/android/widget/ListItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/dw/android/widget/ListItemView$b;", "layout", "<init>", "(Landroid/content/Context;Lcom/dw/android/widget/ListItemView$b;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/dw/android/widget/ListItemView$b;)V", "defStyleRes", "Ldd/d0;", "e", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/dw/android/widget/ListItemView$b;)V", "f", "()V", "res", "setImageResource", "(I)V", "Lcom/dw/widget/ActionButton;", "a", "Lcom/dw/widget/ActionButton;", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "accessoryView", "c", "actionView", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "detailView", "titleView", "Lcom/dw/android/widget/ListItemView$a;", "value", "Lcom/dw/android/widget/ListItemView$a;", "getAccessory", "()Lcom/dw/android/widget/ListItemView$a;", "setAccessory", "(Lcom/dw/android/widget/ListItemView$a;)V", "accessory", "_", "getActionButton", "()Lcom/dw/widget/ActionButton;", "setActionButton", "(Lcom/dw/widget/ActionButton;)V", "actionButton", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getDetail", "setDetail", "detail", "Landroid/graphics/drawable/Drawable;", "getDetailDrawable", "()Landroid/graphics/drawable/Drawable;", "setDetailDrawable", "(Landroid/graphics/drawable/Drawable;)V", "detailDrawable", "Lcom/dw/android/widget/ListItemView$c;", "onAccessoryClickListener", "Lcom/dw/android/widget/ListItemView$c;", "getOnAccessoryClickListener", "()Lcom/dw/android/widget/ListItemView$c;", "setOnAccessoryClickListener", "(Lcom/dw/android/widget/ListItemView$c;)V", "Lcom/dw/android/widget/ListItemView$d;", "onIconClickListener", "Lcom/dw/android/widget/ListItemView$d;", "getOnIconClickListener", "()Lcom/dw/android/widget/ListItemView$d;", "setOnIconClickListener", "(Lcom/dw/android/widget/ListItemView$d;)V", "getImageDrawable", "setImageDrawable", "imageDrawable", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ListItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ActionButton imageView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AppCompatImageView accessoryView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ActionButton actionView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TextView detailView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private TextView titleView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a accessory;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0080a f5292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f5293b = new a("None", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5294c = new a("DisclosureIndicator", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f5295d = new a("ActionMore", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f5296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kd.a f5297f;

        /* JADX INFO: renamed from: com.dw.android.widget.ListItemView$a$a, reason: collision with other inner class name */
        public static final class C0080a {
            public /* synthetic */ C0080a(h hVar) {
                this();
            }

            public final a a(int i10) {
                return (i10 < 0 || i10 > a.values().length) ? a.f5293b : a.values()[i10];
            }

            private C0080a() {
            }
        }

        static {
            a[] aVarArrA = a();
            f5296e = aVarArrA;
            f5297f = kd.b.a(aVarArrA);
            f5292a = new C0080a(null);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f5293b, f5294c, f5295d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f5296e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f5299b = new b("Default", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5300c = new b("RightDetail", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f5301d = new b("Subtitle", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f5302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kd.a f5303f;

        public static final class a {
            public /* synthetic */ a(h hVar) {
                this();
            }

            public final b a(int i10) {
                return (i10 < 0 || i10 > b.values().length) ? b.f5299b : b.values()[i10];
            }

            private a() {
            }
        }

        static {
            b[] bVarArrA = a();
            f5302e = bVarArrA;
            f5303f = kd.b.a(bVarArrA);
            f5298a = new a(null);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f5299b, f5300c, f5301d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f5302e.clone();
        }
    }

    public interface c {
    }

    public interface d {
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5305b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f5299b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f5300c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f5301d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5304a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.f5294c.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.f5295d.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f5305b = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        m.e(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ListItemView listItemView, View view) {
        listItemView.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ListItemView listItemView, View view) {
        listItemView.getClass();
    }

    private final void e(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, b layout) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, l.f19315n1, defStyleAttr, defStyleRes);
        m.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int i10 = typedArrayObtainStyledAttributes.getInt(l.f19335r1, 0);
            if (layout == b.f5299b && i10 != 0) {
                layout = b.f5298a.a(i10);
            }
            int i11 = e.f5304a[layout.ordinal()];
            if (i11 == 1 || i11 == 2) {
                h4.b bVarB = h4.b.b(LayoutInflater.from(context), this);
                m.d(bVarB, "inflate(...)");
                TextView textView = bVarB.f15124g;
                m.d(textView, "titleView");
                this.titleView = textView;
                TextView textView2 = bVarB.f15121d;
                m.d(textView2, "detailView");
                this.detailView = textView2;
                AppCompatImageView appCompatImageView = bVarB.f15119b;
                m.d(appCompatImageView, "accessoryView");
                this.accessoryView = appCompatImageView;
                ActionButton actionButton = bVarB.f15120c;
                m.d(actionButton, "actionView");
                this.actionView = actionButton;
                ActionButton actionButton2 = bVarB.f15123f;
                m.d(actionButton2, "imageView");
                this.imageView = actionButton2;
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                h4.c cVarB = h4.c.b(LayoutInflater.from(context), this);
                m.d(cVarB, "inflate(...)");
                TextView textView3 = cVarB.f15130f;
                m.d(textView3, "titleView");
                this.titleView = textView3;
                TextView textView4 = cVarB.f15128d;
                m.d(textView4, "detailView");
                this.detailView = textView4;
                AppCompatImageView appCompatImageView2 = cVarB.f15126b;
                m.d(appCompatImageView2, "accessoryView");
                this.accessoryView = appCompatImageView2;
                ActionButton actionButton3 = cVarB.f15127c;
                m.d(actionButton3, "actionView");
                this.actionView = actionButton3;
                ActionButton actionButton4 = cVarB.f15129e;
                m.d(actionButton4, "imageView");
                this.imageView = actionButton4;
            }
            setTitle(typedArrayObtainStyledAttributes.getString(l.f19340s1));
            setDetail(typedArrayObtainStyledAttributes.getString(l.f19325p1));
            setAccessory(a.f5292a.a(typedArrayObtainStyledAttributes.getInt(l.f19320o1, a.f5293b.ordinal())));
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f19330q1, -1);
            if (resourceId != -1) {
                setImageDrawable(i.a.b(context, resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final void f() {
        CharSequence detail = getDetail();
        TextView textView = null;
        if ((detail == null || detail.length() == 0) && getDetailDrawable() == null) {
            TextView textView2 = this.detailView;
            if (textView2 == null) {
                m.o("detailView");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView3 = this.detailView;
        if (textView3 == null) {
            m.o("detailView");
        } else {
            textView = textView3;
        }
        textView.setVisibility(0);
    }

    private final void setActionButton(ActionButton actionButton) {
    }

    public final a getAccessory() {
        return this.accessory;
    }

    public final ActionButton getActionButton() {
        ActionButton actionButton = this.actionView;
        if (actionButton != null) {
            return actionButton;
        }
        m.o("actionView");
        return null;
    }

    public final CharSequence getDetail() {
        TextView textView = this.detailView;
        if (textView == null) {
            m.o("detailView");
            textView = null;
        }
        return textView.getText();
    }

    public final Drawable getDetailDrawable() {
        TextView textView = this.detailView;
        if (textView == null) {
            m.o("detailView");
            textView = null;
        }
        return textView.getCompoundDrawables()[2];
    }

    public final Drawable getImageDrawable() {
        ActionButton actionButton = this.imageView;
        if (actionButton == null) {
            m.o("imageView");
            actionButton = null;
        }
        return actionButton.getDrawable();
    }

    public final c getOnAccessoryClickListener() {
        return null;
    }

    public final d getOnIconClickListener() {
        return null;
    }

    public final CharSequence getTitle() {
        TextView textView = this.titleView;
        if (textView == null) {
            m.o("titleView");
            textView = null;
        }
        return textView.getText();
    }

    public final void setAccessory(a aVar) {
        m.e(aVar, "value");
        if (this.accessory == aVar) {
            return;
        }
        this.accessory = aVar;
        AppCompatImageView appCompatImageView = this.accessoryView;
        View view = null;
        if (appCompatImageView == null) {
            m.o("accessoryView");
            appCompatImageView = null;
        }
        appCompatImageView.setVisibility(8);
        ActionButton actionButton = this.actionView;
        if (actionButton == null) {
            m.o("actionView");
            actionButton = null;
        }
        actionButton.setVisibility(8);
        int i10 = e.f5305b[aVar.ordinal()];
        if (i10 == 1) {
            AppCompatImageView appCompatImageView2 = this.accessoryView;
            if (appCompatImageView2 == null) {
                m.o("accessoryView");
                appCompatImageView2 = null;
            }
            appCompatImageView2.setImageResource(k3.e.f19178c);
            AppCompatImageView appCompatImageView3 = this.accessoryView;
            if (appCompatImageView3 == null) {
                m.o("accessoryView");
            } else {
                view = appCompatImageView3;
            }
            view.setVisibility(0);
            return;
        }
        if (i10 != 2) {
            return;
        }
        ActionButton actionButton2 = this.actionView;
        if (actionButton2 == null) {
            m.o("actionView");
            actionButton2 = null;
        }
        actionButton2.setImageResource(k3.e.f19177b);
        ActionButton actionButton3 = this.actionView;
        if (actionButton3 == null) {
            m.o("actionView");
        } else {
            view = actionButton3;
        }
        view.setVisibility(0);
    }

    public final void setDetail(CharSequence charSequence) {
        TextView textView = this.detailView;
        if (textView == null) {
            m.o("detailView");
            textView = null;
        }
        textView.setText(charSequence);
        f();
    }

    public final void setDetailDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        TextView textView = this.detailView;
        if (textView == null) {
            m.o("detailView");
            textView = null;
        }
        textView.setCompoundDrawables(null, null, drawable, null);
        f();
    }

    public final void setImageDrawable(Drawable drawable) {
        ActionButton actionButton = this.imageView;
        ActionButton actionButton2 = null;
        if (actionButton == null) {
            m.o("imageView");
            actionButton = null;
        }
        actionButton.setImageDrawable(drawable);
        if (drawable == null) {
            ActionButton actionButton3 = this.imageView;
            if (actionButton3 == null) {
                m.o("imageView");
            } else {
                actionButton2 = actionButton3;
            }
            actionButton2.setVisibility(8);
            return;
        }
        ActionButton actionButton4 = this.imageView;
        if (actionButton4 == null) {
            m.o("imageView");
        } else {
            actionButton2 = actionButton4;
        }
        actionButton2.setVisibility(0);
    }

    public final void setImageResource(int res) {
        ActionButton actionButton = this.imageView;
        ActionButton actionButton2 = null;
        if (actionButton == null) {
            m.o("imageView");
            actionButton = null;
        }
        actionButton.setImageResource(res);
        if (res == 0) {
            ActionButton actionButton3 = this.imageView;
            if (actionButton3 == null) {
                m.o("imageView");
            } else {
                actionButton2 = actionButton3;
            }
            actionButton2.setVisibility(8);
            return;
        }
        ActionButton actionButton4 = this.imageView;
        if (actionButton4 == null) {
            m.o("imageView");
        } else {
            actionButton2 = actionButton4;
        }
        actionButton2.setVisibility(0);
    }

    public final void setOnAccessoryClickListener(c cVar) {
        ActionButton actionButton = null;
        View.OnClickListener onClickListener = cVar == null ? null : new View.OnClickListener() { // from class: u3.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListItemView.c(this.f28029a, view);
            }
        };
        AppCompatImageView appCompatImageView = this.accessoryView;
        if (appCompatImageView == null) {
            m.o("accessoryView");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(onClickListener);
        ActionButton actionButton2 = this.actionView;
        if (actionButton2 == null) {
            m.o("actionView");
        } else {
            actionButton = actionButton2;
        }
        actionButton.setOnClickListener(onClickListener);
    }

    public final void setOnIconClickListener(d dVar) {
        ActionButton actionButton = null;
        View.OnClickListener onClickListener = dVar == null ? null : new View.OnClickListener() { // from class: u3.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListItemView.d(this.f28028a, view);
            }
        };
        ActionButton actionButton2 = this.imageView;
        if (actionButton2 == null) {
            m.o("imageView");
        } else {
            actionButton = actionButton2;
        }
        actionButton.setOnClickListener(onClickListener);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.titleView;
        if (textView == null) {
            m.o("titleView");
            textView = null;
        }
        textView.setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemView(Context context, b bVar) {
        this(context, (AttributeSet) null, k3.b.f19160h, bVar);
        m.e(context, "context");
        m.e(bVar, "layout");
    }

    public /* synthetic */ ListItemView(Context context, b bVar, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? b.f5299b : bVar);
    }

    public /* synthetic */ ListItemView(Context context, AttributeSet attributeSet, int i10, b bVar, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? k3.b.f19160h : i10, (i11 & 8) != 0 ? b.f5299b : bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemView(Context context, AttributeSet attributeSet, int i10, b bVar) {
        super(context, attributeSet, i10);
        m.e(context, "context");
        m.e(bVar, "layout");
        this.accessory = a.f5293b;
        e(context, attributeSet, i10, 0, bVar);
    }
}
