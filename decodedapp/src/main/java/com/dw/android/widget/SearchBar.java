package com.dw.android.widget;

import a6.o;
import a6.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AutoCompleteTextView;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatLinearLayout;
import com.dw.widget.ActionButton;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import v3.j;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends AppCompatLinearLayout implements View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener {
    private static Boolean B;
    private View.OnFocusChangeListener A;

    /* JADX INFO: renamed from: a */
    private final ActionButton f5354a;

    /* JADX INFO: renamed from: b */
    private boolean f5355b;

    /* JADX INFO: renamed from: c */
    private AbsListView f5356c;

    /* JADX INFO: renamed from: d */
    private AutoCompleteTextView f5357d;

    /* JADX INFO: renamed from: e */
    private boolean f5358e;

    /* JADX INFO: renamed from: f */
    private ArrayList f5359f;

    /* JADX INFO: renamed from: g */
    private ImageView f5360g;

    /* JADX INFO: renamed from: h */
    private View f5361h;

    /* JADX INFO: renamed from: r */
    private View f5362r;

    /* JADX INFO: renamed from: s */
    private String f5363s;

    /* JADX INFO: renamed from: t */
    private SharedPreferences f5364t;

    /* JADX INFO: renamed from: u */
    private String f5365u;

    /* JADX INFO: renamed from: v */
    private c6.a f5366v;

    /* JADX INFO: renamed from: w */
    private boolean f5367w;

    /* JADX INFO: renamed from: x */
    private g f5368x;

    /* JADX INFO: renamed from: y */
    private final View.OnKeyListener f5369y;

    /* JADX INFO: renamed from: z */
    private TextWatcher f5370z;

    class a implements View.OnKeyListener {
        a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 && i10 == 66) {
                return SearchBar.this.k();
            }
            return false;
        }
    }

    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String strTrim = charSequence.toString().trim();
            if (strTrim.length() == 0) {
                SearchBar.this.f5361h.setVisibility(0);
                SearchBar.this.f5362r.setVisibility(8);
            } else {
                SearchBar.this.f5361h.setVisibility(8);
                SearchBar.this.f5362r.setVisibility(0);
            }
            SearchBar.this.m(strTrim);
        }
    }

    class c implements View.OnFocusChangeListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) SearchBar.this.getContext().getSystemService("input_method")).showSoftInput(SearchBar.this.f5357d, 1);
            }
        }

        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (!z10) {
                SearchBar.this.r();
            } else if (SearchBar.this.f5358e) {
                view.post(new a());
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchBar.this.l();
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchBar.this.j();
        }
    }

    class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Activity f5377a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Intent f5378b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f5379c;

        f(Activity activity, Intent intent, int i10) {
            this.f5377a = activity;
            this.f5378b = intent;
            this.f5379c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.g(this.f5377a, this.f5378b, this.f5379c);
        }
    }

    public interface g {
        void a(SearchBar searchBar, String str);

        boolean b(SearchBar searchBar);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5355b = true;
        this.f5358e = true;
        this.f5365u = "defalut";
        a aVar = new a();
        this.f5369y = aVar;
        this.f5370z = new b();
        this.A = new c();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(k3.g.f19227u, this);
        setGravity(16);
        this.f5360g = (ImageView) findViewById(k3.f.B);
        this.f5354a = (ActionButton) findViewById(k3.f.C);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(k3.f.G);
        this.f5357d = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(this.f5370z);
        this.f5357d.setOnFocusChangeListener(this.A);
        this.f5357d.setOnClickListener(this);
        this.f5357d.setOnKeyListener(aVar);
        this.f5361h = findViewById(k3.f.F);
        this.f5362r = findViewById(k3.f.E);
        this.f5361h.setOnClickListener(new d());
        this.f5362r.setOnClickListener(new e());
        this.f5364t = context.getSharedPreferences("com.dw.android.widget.SearchBar", 0);
        c6.a aVar2 = new c6.a(context, k3.g.f19228v);
        this.f5366v = aVar2;
        this.f5357d.setAdapter(aVar2);
    }

    public boolean k() {
        g gVar = this.f5368x;
        if (gVar == null) {
            return false;
        }
        return gVar.b(this);
    }

    public void m(String str) {
        if (q.d(this.f5363s, str)) {
            return;
        }
        g gVar = this.f5368x;
        if (gVar != null) {
            gVar.a(this, str);
        }
        this.f5363s = str;
        AbsListView absListView = this.f5356c;
        if (absListView == null) {
            return;
        }
        ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
        if (TextUtils.isEmpty(str)) {
            this.f5356c.clearTextFilter();
            if (listAdapter instanceof Filterable) {
                ((Filterable) listAdapter).getFilter().filter(str);
                return;
            }
            return;
        }
        if (!(listAdapter instanceof Filterable)) {
            this.f5356c.setFilterText(str);
        } else {
            this.f5356c.clearTextFilter();
            ((Filterable) listAdapter).getFilter().filter(str);
        }
    }

    private void q() {
        this.f5367w = false;
        if (this.f5355b) {
            String string = this.f5364t.getString(this.f5365u, null);
            String[] strArrSplit = TextUtils.isEmpty(string) ? d4.c.f10567g : string.split(";");
            this.f5359f = o.b(strArrSplit);
            this.f5366v.c(o.b(strArrSplit));
        }
    }

    public void r() {
        ArrayList arrayList;
        if (!this.f5355b || TextUtils.isEmpty(this.f5363s) || (arrayList = this.f5359f) == null) {
            return;
        }
        if (arrayList.size() <= 0 || !this.f5363s.equals(this.f5359f.get(0))) {
            if (this.f5359f.remove(this.f5363s)) {
                this.f5359f.add(0, this.f5363s);
                this.f5366v.d();
                this.f5366v.b(this.f5359f);
            } else {
                this.f5359f.add(0, this.f5363s);
                this.f5366v.h(this.f5363s, 0);
            }
            this.f5367w = true;
        }
    }

    private void s() {
        if (this.f5367w) {
            y5.d.b(this.f5364t.edit().putString(this.f5365u, TextUtils.join(";", 20 > this.f5359f.size() ? this.f5359f : this.f5359f.subList(0, 20))));
            this.f5367w = false;
        }
    }

    public void j() {
        r();
        this.f5357d.setText((CharSequence) null);
    }

    public void l() {
        m(this.f5357d.getText().toString().trim());
    }

    public void n(Activity activity, int i10) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        if (B == null) {
            B = Boolean.valueOf(activity.getPackageManager().resolveActivity(intent, WXMediaMessage.THUMB_LENGTH_LIMIT) != null);
        }
        if (B.booleanValue()) {
            View viewFindViewById = findViewById(k3.f.H);
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new f(activity, intent, i10));
        }
    }

    public void o(Intent intent) {
        ArrayList<String> stringArrayListExtra;
        if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) == null || stringArrayListExtra.size() == 0) {
            return;
        }
        this.f5357d.setText(stringArrayListExtra.get(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        SharedPreferences sharedPreferences = this.f5364t;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
            q();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f5357d.getText().toString().trim().length() != 0) {
            return;
        }
        this.f5357d.showDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f5364t.unregisterOnSharedPreferenceChangeListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        r();
        s();
        return super.onSaveInstanceState();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.f5365u.equals(str)) {
            q();
        }
    }

    public void p() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f5357d.getWindowToken(), 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f5357d.requestFocus()) {
            return true;
        }
        return super.requestFocus(i10, rect);
    }

    public void setActionListener(g gVar) {
        this.f5368x = gVar;
    }

    public void setAppIcon(Drawable drawable) {
        this.f5360g.setVisibility(0);
        this.f5360g.setImageDrawable(drawable);
    }

    public void setAppIconContentDescription(String str) {
        this.f5360g.setContentDescription(str);
    }

    public void setAppIconImageResource(int i10) {
        this.f5360g.setVisibility(0);
        this.f5360g.setImageResource(i10);
    }

    public void setAppIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5360g.setVisibility(0);
        this.f5360g.setOnClickListener(onClickListener);
    }

    public void setAutoShowSoftInput(boolean z10) {
        this.f5358e = z10;
    }

    public void setBackIcon(Drawable drawable) {
        this.f5354a.setVisibility(0);
        this.f5354a.setImageDrawable(drawable);
    }

    public void setBackOnClickListener(View.OnClickListener onClickListener) {
        this.f5354a.setOnClickListener(onClickListener);
        this.f5354a.setVisibility(0);
    }

    public void setHistoryEnable(boolean z10) {
        this.f5355b = z10;
    }

    public void setSearchItem(AbsListView absListView) {
        if (absListView != null) {
            absListView.setTextFilterEnabled(true);
        }
        this.f5356c = absListView;
    }

    public void setSearchText(String str) {
        this.f5357d.setText(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AutoCompleteTextView autoCompleteTextView = this.f5357d;
        autoCompleteTextView.setSelection(autoCompleteTextView.length());
    }

    public void setShowAppIcon(boolean z10) {
        if (z10) {
            this.f5360g.setVisibility(0);
        } else {
            this.f5360g.setVisibility(8);
        }
    }
}
