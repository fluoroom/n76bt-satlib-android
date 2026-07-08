package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.o;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import m0.b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements f0.b {
    private View A;
    private m0.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f1270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f1271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f1272h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f1274j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1276l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    h f1278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private s f1279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f1280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f1282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f1283s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1290z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1273i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1275k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1277m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f1284t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f1285u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1286v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1287w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1288x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1289y = 16;
    private boolean D = false;

    class a implements b.InterfaceC0281b {
        a() {
        }

        @Override // m0.b.InterfaceC0281b
        public void onActionProviderVisibilityChanged(boolean z10) {
            j jVar = j.this;
            jVar.f1278n.M(jVar);
        }
    }

    j(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1278n = hVar;
        this.f1265a = i11;
        this.f1266b = i10;
        this.f1267c = i12;
        this.f1268d = i13;
        this.f1269e = charSequence;
        this.f1290z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1288x && (this.f1286v || this.f1287w)) {
            drawable = e0.a.r(drawable).mutate();
            if (this.f1286v) {
                e0.a.o(drawable, this.f1284t);
            }
            if (this.f1287w) {
                e0.a.p(drawable, this.f1285u);
            }
            this.f1288x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f1278n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f1290z & 4) == 4;
    }

    @Override // f0.b
    public m0.b a() {
        return this.B;
    }

    @Override // f0.b
    public f0.b b(m0.b bVar) {
        m0.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.reset();
        }
        this.A = null;
        this.B = bVar;
        this.f1278n.N(true);
        m0.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.setVisibilityListener(new a());
        }
        return this;
    }

    public void c() {
        this.f1278n.L(this);
    }

    @Override // f0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1290z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1278n.f(this);
        }
        return false;
    }

    @Override // f0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1278n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f1268d;
    }

    char g() {
        return this.f1278n.J() ? this.f1274j : this.f1272h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // f0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        m0.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewOnCreateActionView = bVar.onCreateActionView(this);
        this.A = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // f0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1275k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1274j;
    }

    @Override // f0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1282r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1266b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1276l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1277m == 0) {
            return null;
        }
        Drawable drawableB = i.a.b(this.f1278n.w(), this.f1277m);
        this.f1277m = 0;
        this.f1276l = drawableB;
        return e(drawableB);
    }

    @Override // f0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1284t;
    }

    @Override // f0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1285u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1271g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1265a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // f0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1273i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1272h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1267c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1279o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1269e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1270f;
        return charSequence != null ? charSequence : this.f1269e;
    }

    @Override // f0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1283s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f1278n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1278n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(h.h.f14902o));
        }
        int i10 = this.f1278n.J() ? this.f1275k : this.f1273i;
        d(sb2, i10, WXMediaMessage.THUMB_LENGTH_LIMIT, resources.getString(h.h.f14898k));
        d(sb2, i10, 4096, resources.getString(h.h.f14894g));
        d(sb2, i10, 2, resources.getString(h.h.f14893f));
        d(sb2, i10, 1, resources.getString(h.h.f14899l));
        d(sb2, i10, 4, resources.getString(h.h.f14901n));
        d(sb2, i10, 8, resources.getString(h.h.f14897j));
        if (cG == '\b') {
            sb2.append(resources.getString(h.h.f14895h));
        } else if (cG == '\n') {
            sb2.append(resources.getString(h.h.f14896i));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(h.h.f14900m));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1279o != null;
    }

    CharSequence i(o.a aVar) {
        return (aVar == null || !aVar.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    @Override // f0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1289y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1289y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1289y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        m0.b bVar = this.B;
        return (bVar == null || !bVar.overridesItemVisibility()) ? (this.f1289y & 8) == 0 : (this.f1289y & 8) == 0 && this.B.isVisible();
    }

    public boolean j() {
        m0.b bVar;
        if ((this.f1290z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.onCreateActionView(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1281q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        h hVar = this.f1278n;
        if (hVar.h(hVar, this)) {
            return true;
        }
        Runnable runnable = this.f1280p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1271g != null) {
            try {
                this.f1278n.w().startActivity(this.f1271g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        m0.b bVar = this.B;
        return bVar != null && bVar.onPerformDefaultAction();
    }

    public boolean l() {
        return (this.f1289y & 32) == 32;
    }

    public boolean m() {
        return (this.f1289y & 4) != 0;
    }

    public boolean n() {
        return (this.f1290z & 1) == 1;
    }

    public boolean o() {
        return (this.f1290z & 2) == 2;
    }

    @Override // f0.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f0.b setActionView(int i10) {
        Context contextW = this.f1278n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f0.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1265a) > 0) {
            view.setId(i10);
        }
        this.f1278n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1278n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f1289y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1289y = i11;
        if (i10 != i11) {
            this.f1278n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1274j == c10) {
            return this;
        }
        this.f1274j = Character.toLowerCase(c10);
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1289y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1289y = i11;
        if (i10 != i11) {
            this.f1278n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1289y & 4) != 0) {
            this.f1278n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1289y |= 16;
        } else {
            this.f1289y &= -17;
        }
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1277m = 0;
        this.f1276l = drawable;
        this.f1288x = true;
        this.f1278n.N(false);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1284t = colorStateList;
        this.f1286v = true;
        this.f1288x = true;
        this.f1278n.N(false);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1285u = mode;
        this.f1287w = true;
        this.f1288x = true;
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1271g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1272h == c10) {
            return this;
        }
        this.f1272h = c10;
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1281q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1272h = c10;
        this.f1274j = Character.toLowerCase(c11);
        this.f1278n.N(false);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1290z = i10;
        this.f1278n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1269e = charSequence;
        this.f1278n.N(false);
        s sVar = this.f1279o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1270f = charSequence;
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1278n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1289y = (z10 ? 4 : 0) | (this.f1289y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1269e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f1289y |= 32;
        } else {
            this.f1289y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // f0.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(s sVar) {
        this.f1279o = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f1289y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1289y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f1278n.C();
    }

    @Override // android.view.MenuItem
    public f0.b setContentDescription(CharSequence charSequence) {
        this.f1282r = charSequence;
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public f0.b setTooltipText(CharSequence charSequence) {
        this.f1283s = charSequence;
        this.f1278n.N(false);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1274j == c10 && this.f1275k == i10) {
            return this;
        }
        this.f1274j = Character.toLowerCase(c10);
        this.f1275k = KeyEvent.normalizeMetaState(i10);
        this.f1278n.N(false);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1272h == c10 && this.f1273i == i10) {
            return this;
        }
        this.f1272h = c10;
        this.f1273i = KeyEvent.normalizeMetaState(i10);
        this.f1278n.N(false);
        return this;
    }

    @Override // f0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1272h = c10;
        this.f1273i = KeyEvent.normalizeMetaState(i10);
        this.f1274j = Character.toLowerCase(c11);
        this.f1275k = KeyEvent.normalizeMetaState(i11);
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1276l = null;
        this.f1277m = i10;
        this.f1288x = true;
        this.f1278n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1278n.w().getString(i10));
    }
}
