package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a implements f0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f1159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f1161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f1162g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f1164i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f1166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f1167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f1169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f1170o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1163h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1165j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f1171p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f1172q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1173r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1174s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1175t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f1167l = context;
        this.f1156a = i11;
        this.f1157b = i10;
        this.f1158c = i13;
        this.f1159d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f1166k;
        if (drawable != null) {
            if (this.f1173r || this.f1174s) {
                Drawable drawableR = e0.a.r(drawable);
                this.f1166k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f1166k = drawableMutate;
                if (this.f1173r) {
                    e0.a.o(drawableMutate, this.f1171p);
                }
                if (this.f1174s) {
                    e0.a.p(this.f1166k, this.f1172q);
                }
            }
        }
    }

    @Override // f0.b
    public m0.b a() {
        return null;
    }

    @Override // f0.b
    public f0.b b(m0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // f0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // f0.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // f0.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // f0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // f0.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // f0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // f0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1165j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1164i;
    }

    @Override // f0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1169n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1157b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1166k;
    }

    @Override // f0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1171p;
    }

    @Override // f0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1172q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1161f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1156a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // f0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1163h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1162g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1158c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1159d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1160e;
        return charSequence != null ? charSequence : this.f1159d;
    }

    @Override // f0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1170o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // f0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1175t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1175t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1175t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1175t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1164i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f1175t = (z10 ? 1 : 0) | (this.f1175t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f1175t = (z10 ? 2 : 0) | (this.f1175t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1175t = (z10 ? 16 : 0) | (this.f1175t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1166k = drawable;
        c();
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1171p = colorStateList;
        this.f1173r = true;
        c();
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1172q = mode;
        this.f1174s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1161f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f1162g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1168m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1162g = c10;
        this.f1164i = Character.toLowerCase(c11);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1159d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1160e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f1175t = (this.f1175t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1164i = Character.toLowerCase(c10);
        this.f1165j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public f0.b setContentDescription(CharSequence charSequence) {
        this.f1169n = charSequence;
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1162g = c10;
        this.f1163h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f1159d = this.f1167l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public f0.b setTooltipText(CharSequence charSequence) {
        this.f1170o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1166k = b0.b.d(this.f1167l, i10);
        c();
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1162g = c10;
        this.f1163h = KeyEvent.normalizeMetaState(i10);
        this.f1164i = Character.toLowerCase(c11);
        this.f1165j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
