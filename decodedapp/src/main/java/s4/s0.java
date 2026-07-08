package s4;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.provider.a;
import com.dw.widget.ActionButton;
import com.dw.widget.AutoCompleteTextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import d5.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u008b\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b-\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b.\u0010,J\u0011\u0010/\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b/\u0010,J\u0011\u00100\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b0\u0010,J\u0011\u00102\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u000204H\u0014¢\u0006\u0004\b5\u00106J!\u0010;\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u0001072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J!\u0010@\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020>H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00052\u0006\u0010B\u001a\u00020>H\u0014¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010\u0004J\u0017\u0010G\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\fH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00052\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010MH\u0014¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0005H\u0014¢\u0006\u0004\bP\u0010\u0004J\u0017\u0010R\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0005H\u0014¢\u0006\u0004\bT\u0010\u0004J\u0011\u0010U\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J!\u0010c\u001a\u00020\u00052\u0006\u0010`\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00052\u0006\u0010?\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020\u00052\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ/\u0010p\u001a\u00020\u00052\u0006\u0010l\u001a\u00020\u00142\u0006\u0010m\u001a\u00020\u00142\u0006\u0010n\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u0014H\u0016¢\u0006\u0004\bp\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010'\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R;\u0010\u008a\u0001\u001a$\u0012\u0004\u0012\u00020>\u0012\u0006\u0012\u0004\u0018\u00010=0\u0086\u0001j\u0011\u0012\u0004\u0012\u00020>\u0012\u0006\u0012\u0004\u0018\u00010=`\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001"}, d2 = {"Ls4/s0;", "Lcom/dw/ht/fragments/j;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Ldd/d0;", "f6", "s6", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "newState", "d4", "(I)V", "Landroid/widget/ListView;", "o5", "()Landroid/widget/ListView;", "Lc5/y;", "status", "R", "(Lc5/y;)V", "L0", "", "map", "c0", "(Ljava/lang/Object;)V", "Lcom/dw/widget/ActionButton;", "s5", "()Lcom/dw/widget/ActionButton;", "t5", "r5", "q5", "n5", "Landroid/widget/TextView;", "g5", "()Landroid/widget/TextView;", "Landroid/database/Cursor;", "z5", "(Landroid/database/Cursor;)V", "Lcom/google/android/gms/maps/model/LatLng;", "location", "", "zoom", "H", "(Lcom/google/android/gms/maps/model/LatLng;F)V", "Ld5/h;", "", Name.MARK, "O5", "(Ld5/h;Ljava/lang/String;)V", "keyPrefix", "J5", "(Ljava/lang/String;)V", "y2", "outState", "N2", "(Landroid/os/Bundle;)V", "Lz4/j;", "layer", "setMapLayer", "(Lz4/j;)V", "Landroid/location/Location;", "E5", "(Landroid/location/Location;)V", "C5", "v", "onClick", "(Landroid/view/View;)V", "D5", "p5", "()Landroid/location/Location;", "Ld5/c;", "item", "f5", "(Ld5/c;)V", "", "show", "M5", "(Z)V", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "Landroid/graphics/Rect;", "padding", "G", "(Lcom/google/android/gms/maps/model/LatLngBounds;Landroid/graphics/Rect;)V", "", "z", "(J)V", "Lc5/x;", "locationMode", "q0", "(Lc5/x;)V", "left", "top", "right", "bottom", "L5", "(IIII)V", "Lm4/v;", "o1", "Lm4/v;", "binding", "Ls4/s0$a;", "p1", "Ls4/s0$a;", "searchViewAdapter", "q1", "Lcom/google/android/gms/maps/model/LatLngBounds;", "focusLatLngBounds", "Lcom/dw/ht/map/ui/a;", "r1", "Lcom/dw/ht/map/ui/a;", "s1", "Landroid/widget/TextView;", "coordinateTextView", "t1", "Z", "coordinateTextViewInitialized", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "u1", "Ljava/util/HashMap;", "tracks", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 extends com.dw.ht.fragments.j implements View.OnClickListener {

    /* JADX INFO: renamed from: o1, reason: from kotlin metadata */
    private m4.v binding;

    /* JADX INFO: renamed from: p1, reason: from kotlin metadata */
    private a searchViewAdapter;

    /* JADX INFO: renamed from: q1, reason: from kotlin metadata */
    private LatLngBounds focusLatLngBounds;

    /* JADX INFO: renamed from: r1, reason: from kotlin metadata */
    private com.dw.ht.map.ui.a map;

    /* JADX INFO: renamed from: s1, reason: from kotlin metadata */
    private TextView coordinateTextView;

    /* JADX INFO: renamed from: t1, reason: from kotlin metadata */
    private boolean coordinateTextViewInitialized;

    /* JADX INFO: renamed from: u1, reason: from kotlin metadata */
    private HashMap tracks = new HashMap();

    private static final class a extends androidx.cursoradapter.widget.d {

        /* JADX INFO: renamed from: e */
        private final Context f26737e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context, R.layout.support_simple_spinner_dropdown_item, null, new String[]{"_from"}, new int[]{android.R.id.text1}, 0);
            rd.m.e(context, "context");
            this.f26737e = context;
        }

        @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
        public CharSequence convertToString(Cursor cursor) {
            rd.m.e(cursor, "cursor");
            String string = cursor.getString(3);
            return string == null ? "" : string;
        }

        @Override // androidx.cursoradapter.widget.b.a
        public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
            rd.m.e(charSequence, "constraint");
            if (TextUtils.isEmpty(charSequence)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('%');
            sb2.append((Object) charSequence);
            sb2.append('%');
            g4.f fVar = new g4.f("_from LIKE ? AND (latitude <> 0 OR longitude <> 0)", new String[]{sb2.toString()});
            if (Cfg.c0()) {
                fVar.h(new g4.f("starred==1"));
            }
            Cursor cursorQuery = this.f26737e.getContentResolver().query(a.b.f6666a, d.c.f10625a, fVar.n(), fVar.k(), "_from");
            rd.m.b(cursorQuery);
            return cursorQuery;
        }
    }

    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m4.v f26738a;

        b(m4.v vVar) {
            this.f26738a = vVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rd.m.e(editable, "s");
            if (editable.length() == 0) {
                this.f26738a.f21615m.setVisibility(8);
            } else {
                this.f26738a.f21615m.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            rd.m.e(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            rd.m.e(charSequence, "s");
        }
    }

    public static final class c implements z4.t {
        c() {
        }

        @Override // z4.t
        public boolean a(z4.j jVar) {
            rd.m.e(jVar, "newLayer");
            s0.this.setMapLayer(jVar);
            return true;
        }
    }

    private final void f6() {
        final m4.v vVar = this.binding;
        if (vVar != null) {
            Context contextX3 = x3();
            rd.m.d(contextX3, "requireContext(...)");
            a aVar = new a(contextX3);
            this.searchViewAdapter = aVar;
            vVar.f21614l.setAdapter(aVar);
            vVar.f21614l.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: s4.q0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                    s0.g6(this.f26665a, vVar, adapterView, view, i10, j10);
                }
            });
            vVar.f21614l.setOnCompletedListener(new AutoCompleteTextView.a() { // from class: s4.r0
                @Override // com.dw.widget.AutoCompleteTextView.a
                public final boolean a(AutoCompleteTextView autoCompleteTextView) {
                    return s0.h6(this.f26684a, vVar, autoCompleteTextView);
                }
            });
            vVar.f21615m.setOnClickListener(new View.OnClickListener() { // from class: s4.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s0.i6(vVar, view);
                }
            });
            vVar.f21614l.addTextChangedListener(new b(vVar));
            if (v3.o.a(x3())) {
                vVar.f21617o.setVisibility(0);
                vVar.f21617o.setOnClickListener(new View.OnClickListener() { // from class: s4.i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        s0.j6(this.f26518a, view);
                    }
                });
            }
            vVar.f21614l.setCursorVisible(false);
        }
    }

    public static final void g6(s0 s0Var, m4.v vVar, AdapterView adapterView, View view, int i10, long j10) {
        a aVar = s0Var.searchViewAdapter;
        rd.m.b(aVar);
        Cursor cursor = (Cursor) aVar.getItem(i10);
        if (cursor == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) s0Var.x3().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(vVar.f21614l.getWindowToken(), 2);
        }
        Location locationA = new d5.d(cursor).a();
        if (locationA != null) {
            s0Var.e5(locationA, 18.0f);
        }
    }

    public static final boolean h6(s0 s0Var, m4.v vVar, AutoCompleteTextView autoCompleteTextView) {
        rd.m.e(autoCompleteTextView, "it");
        a aVar = s0Var.searchViewAdapter;
        rd.m.b(aVar);
        Cursor cursor = (Cursor) aVar.getItem(0);
        if (cursor == null) {
            return false;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) s0Var.x3().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(vVar.f21614l.getWindowToken(), 2);
        }
        try {
            Location locationA = new d5.d(cursor).a();
            if (locationA != null) {
                s0Var.e5(locationA, 18.0f);
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    public static final void i6(m4.v vVar, View view) {
        vVar.f21614l.setText("");
    }

    public static final void j6(s0 s0Var, View view) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        s0Var.startActivityForResult(intent, 1);
    }

    public static final void k6(s0 s0Var, View view) {
        com.dw.ht.map.ui.a aVar = s0Var.map;
        if (aVar != null) {
            aVar.O();
        }
    }

    public static final void l6(s0 s0Var, View view) {
        com.dw.ht.map.ui.a aVar = s0Var.map;
        if (aVar != null) {
            aVar.x0();
        }
    }

    public static final void m6(m4.v vVar, View view) {
        vVar.f21614l.setCursorVisible(true);
        vVar.f21614l.showDropDown();
    }

    public static final void n6(s0 s0Var, View view) {
        s0Var.c4();
    }

    public static final void o6(s0 s0Var, View view) {
        rd.m.b(view);
        s0Var.onClick(view);
    }

    public static final void p6(s0 s0Var, View view) {
        rd.m.b(view);
        s0Var.onClick(view);
    }

    public static final void q6(s0 s0Var, View view) {
        rd.m.b(view);
        s0Var.onClick(view);
    }

    public static final void r6(s0 s0Var, View view) {
        rd.m.b(view);
        s0Var.onClick(view);
    }

    private final void s6() {
        ArrayList arrayList = new ArrayList(this.tracks.size());
        for (Object obj : this.tracks.entrySet()) {
            rd.m.d(obj, "next(...)");
            d5.h hVar = (d5.h) ((Map.Entry) obj).getValue();
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            aVar.m(arrayList);
        }
    }

    @Override // com.dw.ht.fragments.j
    protected void C5() {
        c5.x xVarL5 = l5();
        rd.m.d(xVarL5, "getLocationMode(...)");
        Location locationI5 = i5();
        if (locationI5 != null) {
            e5(locationI5, 17.0f);
        } else {
            Toast.makeText(k1(), R.string.canNotGetYourLocation, 1).show();
        }
        c5.x xVar = c5.x.FOLLOWING;
        if (xVarL5 == xVar) {
            xVar = c5.x.LOCATION_ROTATE;
        }
        U0(xVar);
    }

    @Override // com.dw.ht.fragments.j
    protected void D5() {
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            ArrayList arrayList = this.S0;
            rd.m.d(arrayList, "mOverlays");
            aVar.n(arrayList, null);
        }
    }

    @Override // com.dw.ht.fragments.j
    protected void E5(Location location) {
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            aVar.P(location);
        }
    }

    @Override // com.dw.ht.fragments.j
    public void G(LatLngBounds bounds, Rect padding) {
        rd.m.e(bounds, "bounds");
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar == null) {
            this.focusLatLngBounds = bounds;
        } else if (aVar != null) {
            aVar.G(bounds, padding);
        }
    }

    @Override // com.dw.ht.fragments.j
    public void H(LatLng location, float zoom) {
        com.dw.ht.map.ui.a aVar;
        if (location == null || (aVar = this.map) == null) {
            return;
        }
        aVar.H(location, zoom);
    }

    @Override // com.dw.ht.fragments.j
    protected void J5(String keyPrefix) {
        rd.m.e(keyPrefix, "keyPrefix");
        Iterator it = this.tracks.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            rd.m.d(next, "next(...)");
            Object key = ((Map.Entry) next).getKey();
            rd.m.d(key, "<get-key>(...)");
            if (rg.q.J((String) key, keyPrefix, false, 2, null)) {
                it.remove();
                z10 = true;
            }
        }
        if (z10) {
            s6();
        }
    }

    @Override // com.dw.ht.fragments.j
    public void L0(c5.y status) {
        rd.m.e(status, "status");
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            aVar.L0(status);
        }
    }

    @Override // com.dw.ht.fragments.j
    public void L5(int left, int top, int right, int bottom) {
        super.L5(left, top, right, bottom);
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            Rect rect = this.Q0;
            rd.m.d(rect, "padding");
            aVar.A0(rect);
        }
    }

    @Override // com.dw.ht.fragments.j
    public void M5(boolean show) {
        CardView cardView;
        m4.v vVar = this.binding;
        if (vVar != null && (cardView = vVar.f21623u) != null) {
            cardView.setVisibility(show ? 0 : 8);
        }
        super.M5(show);
    }

    @Override // com.dw.ht.fragments.j, v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle outState) {
        rd.m.e(outState, "outState");
        super.N2(outState);
        outState.putBoolean("map.show_search_bar", this.O0);
    }

    @Override // com.dw.ht.fragments.j
    protected void O5(d5.h data, String str) {
        rd.m.e(str, Name.MARK);
        this.tracks.put(str, data);
        s6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dw.ht.fragments.j, v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        Location locationI5;
        c5.b0 b0VarH5;
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final m4.v vVar = this.binding;
        boolean z10 = false;
        if (vVar != null) {
            vVar.f21625w.f21693c.setOnClickListener(new View.OnClickListener() { // from class: s4.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.k6(this.f26452a, view2);
                }
            });
            vVar.f21625w.f21694d.setOnClickListener(new View.OnClickListener() { // from class: s4.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.l6(this.f26531a, view2);
                }
            });
            vVar.f21614l.setOnClickListener(new View.OnClickListener() { // from class: s4.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.m6(vVar, view2);
                }
            });
            vVar.f21604b.setOnClickListener(new View.OnClickListener() { // from class: s4.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.n6(this.f26559a, view2);
                }
            });
            vVar.f21609g.setOnClickListener(new View.OnClickListener() { // from class: s4.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.o6(this.f26603a, view2);
                }
            });
            vVar.f21612j.setOnClickListener(new View.OnClickListener() { // from class: s4.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.p6(this.f26613a, view2);
                }
            });
            vVar.f21611i.setOnClickListener(new View.OnClickListener() { // from class: s4.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.q6(this.f26637a, view2);
                }
            });
            vVar.f21618p.setOnClickListener(new View.OnClickListener() { // from class: s4.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s0.r6(this.f26652a, view2);
                }
            });
            if (u5()) {
                vVar.f21613k.setVisibility(0);
            }
            if (!v5() || !this.O0) {
                vVar.f21623u.setVisibility(8);
            }
            if (!this.P0) {
                vVar.f21610h.setVisibility(8);
            }
            if (!this.f6264b1.f4297s) {
                vVar.f21625w.b().setVisibility(8);
            }
        }
        l1.i iVarI0 = j1().i0(R.id.map_fragment);
        if (iVarI0 == null) {
            androidx.fragment.app.o oVarD = z4.m.d();
            this.map = (com.dw.ht.map.ui.a) oVarD;
            j1().o().b(R.id.map_fragment, oVarD).i();
        } else {
            this.map = (com.dw.ht.map.ui.a) iVarI0;
        }
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            aVar.C0(this);
            Rect rect = this.Q0;
            rd.m.d(rect, "padding");
            aVar.A0(rect);
            c5.x xVarL5 = l5();
            rd.m.d(xVarL5, "getLocationMode(...)");
            aVar.U0(xVarL5);
            c5.a aVar2 = this.f6264b1;
            if (Math.abs(aVar2.e()) <= Double.MAX_VALUE) {
                aVar.P0(aVar2.e());
            }
        }
        c5.x xVarL52 = l5();
        rd.m.d(xVarL52, "getLocationMode(...)");
        q0(xVarL52);
        D5();
        if (savedInstanceState == null) {
            LatLngBounds latLngBounds = this.focusLatLngBounds;
            boolean z11 = true;
            if (latLngBounds != null) {
                rd.m.b(latLngBounds);
                G(latLngBounds, null);
                this.focusLatLngBounds = null;
                z10 = true;
            }
            Bundle bundleI1 = i1();
            if (z10 || bundleI1 == null || (b0VarH5 = h5()) == null) {
                z11 = z10;
            } else {
                U0(c5.x.DISABLE);
                H(b0VarH5.d(), 18.0f);
            }
            if (!z11 && !m5().d() && (locationI5 = i5()) != null) {
                e5(locationI5, 15.0f);
            }
        }
        z4.j jVarE = Cfg.E();
        rd.m.d(jVarE, "getMapLayer(...)");
        setMapLayer(jVarE);
        s6();
    }

    @Override // com.dw.ht.fragments.j
    public void R(c5.y status) {
        rd.m.e(status, "status");
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            aVar.R(status);
        }
    }

    @Override // com.dw.ht.fragments.j, com.dw.ht.map.ui.a.InterfaceC0095a
    public void c0(Object map) {
        rd.m.e(map, "map");
        super.c0(map);
    }

    @Override // v3.v
    protected void d4(int newState) {
        com.dw.ht.map.ui.a aVar;
        super.d4(newState);
        if (newState != 5 || (aVar = this.map) == null) {
            return;
        }
        rd.m.b(aVar);
        aVar.r0();
    }

    @Override // com.dw.ht.fragments.j
    public void f5(d5.c item) {
        rd.m.e(item, "item");
        U0(c5.x.NORMAL);
        e5(item.a(), 15.0f);
        m4.v vVar = this.binding;
        if (vVar != null) {
            vVar.f21614l.setText(item.f10599a);
            AutoCompleteTextView autoCompleteTextView = vVar.f21614l;
            autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
            vVar.f21614l.dismissDropDown();
        }
    }

    @Override // com.dw.ht.fragments.j
    protected TextView g5() {
        m4.v vVar = this.binding;
        if (vVar == null) {
            return null;
        }
        if (!this.coordinateTextViewInitialized) {
            this.coordinateTextViewInitialized = true;
            this.coordinateTextView = (TextView) vVar.b().findViewById(R.id.coordinate);
        }
        return this.coordinateTextView;
    }

    @Override // com.dw.ht.fragments.j, androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        ArrayList<String> stringArrayListExtra;
        m4.v vVar;
        super.m2(requestCode, resultCode, data);
        if (requestCode != 1 || data == null || (stringArrayListExtra = data.getStringArrayListExtra("android.speech.extra.RESULTS")) == null || stringArrayListExtra.size() == 0 || (vVar = this.binding) == null) {
            return;
        }
        vVar.f21614l.setText(stringArrayListExtra.get(0));
        AutoCompleteTextView autoCompleteTextView = vVar.f21614l;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
    }

    @Override // com.dw.ht.fragments.j
    protected ActionButton n5() {
        m4.v vVar = this.binding;
        if (vVar != null) {
            return vVar.f21612j;
        }
        return null;
    }

    @Override // com.dw.ht.fragments.j, v3.f0
    /* JADX INFO: renamed from: o5 */
    public ListView B4() {
        m4.v vVar = this.binding;
        if (vVar != null) {
            return vVar.f21616n;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        rd.m.e(v10, "v");
        int id2 = v10.getId();
        if (id2 == R.id.map_layer) {
            z4.l lVar = z4.l.f32949a;
            z4.j jVarE = Cfg.E();
            rd.m.d(jVarE, "getMapLayer(...)");
            lVar.b(v10, jVarE, new c());
            return;
        }
        if (id2 == R.id.my_loc) {
            C5();
        } else {
            if (id2 != R.id.settings) {
                return;
            }
            FragmentShowActivity.h2(x3(), N1(R.string.settings), k5.w0.class);
        }
    }

    @Override // com.dw.ht.fragments.j
    public Location p5() {
        Location locationI5;
        if (l5().d() && (locationI5 = i5()) != null) {
            return locationI5;
        }
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            return aVar.o();
        }
        return null;
    }

    @Override // com.dw.ht.fragments.j, com.dw.ht.map.ui.a.InterfaceC0095a
    public void q0(c5.x locationMode) {
        rd.m.e(locationMode, "locationMode");
        super.q0(locationMode);
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            aVar.U0(locationMode);
        }
    }

    @Override // com.dw.ht.fragments.j
    protected ActionButton q5() {
        m4.v vVar = this.binding;
        if (vVar != null) {
            return vVar.f21619q;
        }
        return null;
    }

    @Override // com.dw.ht.fragments.j
    protected ActionButton r5() {
        m4.v vVar = this.binding;
        if (vVar != null) {
            return vVar.f21621s;
        }
        return null;
    }

    @Override // com.dw.ht.fragments.j
    protected ActionButton s5() {
        m4.v vVar = this.binding;
        if (vVar != null) {
            return vVar.f21622t;
        }
        return null;
    }

    @Override // com.dw.ht.fragments.j
    public void setMapLayer(z4.j layer) {
        rd.m.e(layer, "layer");
        if (this.f6264b1.g() == null) {
            Cfg.F0(layer);
        }
        com.dw.ht.map.ui.a aVar = this.map;
        z4.j mapLayer = aVar != null ? aVar.getMapLayer() : null;
        com.dw.ht.map.ui.a aVar2 = this.map;
        if (aVar2 != null) {
            aVar2.setMapLayer(layer);
        }
        m4.v vVar = this.binding;
        if (vVar != null) {
            vVar.f21620r.setText(layer.g());
            vVar.f21620r.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (mapLayer == null) {
            mapLayer = z4.j.f32938b;
        }
        B5(mapLayer, layer);
    }

    @Override // com.dw.ht.fragments.j
    protected ActionButton t5() {
        m4.v vVar = this.binding;
        if (vVar != null) {
            return vVar.f21624v;
        }
        return null;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        if (savedInstanceState != null) {
            this.O0 = savedInstanceState.getBoolean("map.show_search_bar", this.O0);
        }
        this.binding = m4.v.c(inflater, container, false);
        f6();
        m4.v vVar = this.binding;
        rd.m.b(vVar);
        FrameLayout frameLayoutB = vVar.b();
        rd.m.d(frameLayoutB, "getRoot(...)");
        return frameLayoutB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        a aVar = this.searchViewAdapter;
        if (aVar != null) {
            aVar.changeCursor(null);
        }
        this.coordinateTextViewInitialized = false;
        this.binding = null;
    }

    @Override // com.dw.ht.fragments.j
    public void z(long j10) {
        com.dw.ht.map.ui.a aVar = this.map;
        if (aVar != null) {
            aVar.z(j10);
        }
    }

    @Override // com.dw.ht.fragments.j
    protected void z5(Cursor data) {
        rd.m.e(data, "data");
    }
}
