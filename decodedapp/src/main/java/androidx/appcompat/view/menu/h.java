package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h implements f0.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f1236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f1239e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f1248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f1249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f1250p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j f1258x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1260z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1246l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1251q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1252r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1253s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1254t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1255u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f1256v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f1257w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1259y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f1240f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f1241g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1242h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f1243i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f1244j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1245k = true;

    public interface a {
        boolean onMenuItemSelected(h hVar, MenuItem menuItem);

        void onMenuModeChange(h hVar);
    }

    public interface b {
        boolean invokeItem(j jVar);
    }

    public h(Context context) {
        this.f1235a = context;
        this.f1236b = context.getResources();
        g0(true);
    }

    private static int D(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void Q(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f1240f.size()) {
            return;
        }
        this.f1240f.remove(i10);
        if (z10) {
            N(true);
        }
    }

    private void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f1250p = view;
            this.f1248n = null;
            this.f1249o = null;
        } else {
            if (i10 > 0) {
                this.f1248n = resourcesE.getText(i10);
            } else if (charSequence != null) {
                this.f1248n = charSequence;
            }
            if (i11 > 0) {
                this.f1249o = b0.b.d(w(), i11);
            } else if (drawable != null) {
                this.f1249o = drawable;
            }
            this.f1250p = null;
        }
        N(false);
    }

    private j g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new j(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1236b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1235a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1235a
            boolean r3 = m0.r0.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1238d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.g0(boolean):void");
    }

    private void i(boolean z10) {
        if (this.f1257w.isEmpty()) {
            return;
        }
        i0();
        for (WeakReference weakReference : this.f1257w) {
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                this.f1257w.remove(weakReference);
            } else {
                nVar.updateMenuView(z10);
            }
        }
        h0();
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f1257w.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.f1257w) {
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                this.f1257w.remove(weakReference);
            } else {
                int id2 = nVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    nVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.f1257w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.f1257w) {
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                this.f1257w.remove(weakReference);
            } else {
                int id2 = nVar.getId();
                if (id2 > 0 && (parcelableOnSaveInstanceState = nVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id2, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean l(s sVar, n nVar) {
        if (this.f1257w.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = nVar != null ? nVar.onSubMenuSelected(sVar) : false;
        for (WeakReference weakReference : this.f1257w) {
            n nVar2 = (n) weakReference.get();
            if (nVar2 == null) {
                this.f1257w.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = nVar2.onSubMenuSelected(sVar);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int p(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((j) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f1250p;
    }

    public ArrayList B() {
        t();
        return this.f1244j;
    }

    boolean C() {
        return this.f1254t;
    }

    Resources E() {
        return this.f1236b;
    }

    public h F() {
        return this;
    }

    public ArrayList G() {
        if (!this.f1242h) {
            return this.f1241g;
        }
        this.f1241g.clear();
        int size = this.f1240f.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) this.f1240f.get(i10);
            if (jVar.isVisible()) {
                this.f1241g.add(jVar);
            }
        }
        this.f1242h = false;
        this.f1245k = true;
        return this.f1241g;
    }

    public boolean H() {
        return !this.f1251q;
    }

    public boolean I() {
        return this.f1259y;
    }

    boolean J() {
        return this.f1237c;
    }

    public boolean K() {
        return this.f1238d;
    }

    void L(j jVar) {
        this.f1245k = true;
        N(true);
    }

    void M(j jVar) {
        this.f1242h = true;
        N(true);
    }

    public void N(boolean z10) {
        if (this.f1251q) {
            this.f1252r = true;
            if (z10) {
                this.f1253s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f1242h = true;
            this.f1245k = true;
        }
        i(z10);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    public boolean P(MenuItem menuItem, n nVar, int i10) {
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean zK = jVar.k();
        m0.b bVarA = jVar.a();
        boolean z10 = bVarA != null && bVarA.hasSubMenu();
        if (jVar.j()) {
            boolean zExpandActionView = jVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!jVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!jVar.hasSubMenu()) {
            jVar.x(new s(w(), this, jVar));
        }
        s sVar = (s) jVar.getSubMenu();
        if (z10) {
            bVarA.onPrepareSubMenu(sVar);
        }
        boolean zL = l(sVar, nVar) | zK;
        if (!zL) {
            e(true);
        }
        return zL;
    }

    public void R(n nVar) {
        for (WeakReference weakReference : this.f1257w) {
            n nVar2 = (n) weakReference.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.f1257w.remove(weakReference);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).S(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f1239e = aVar;
    }

    public h X(int i10) {
        this.f1246l = i10;
        return this;
    }

    void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1240f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) this.f1240f.get(i10);
            if (jVar.getGroupId() == groupId && jVar.m() && jVar.isCheckable()) {
                jVar.s(jVar == menuItem);
            }
        }
        h0();
    }

    protected h Z(int i10) {
        b0(0, null, i10, null, null);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iD = D(i12);
        j jVarG = g(i10, i11, i12, iD, charSequence, this.f1246l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1247m;
        if (contextMenuInfo != null) {
            jVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f1240f;
        arrayList.add(p(arrayList, iD), jVarG);
        N(true);
        return jVarG;
    }

    protected h a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1235a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(n nVar) {
        c(nVar, this.f1235a);
    }

    public void c(n nVar, Context context) {
        this.f1257w.add(new WeakReference(nVar));
        nVar.initForMenu(context, this);
        this.f1245k = true;
    }

    protected h c0(int i10) {
        b0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.f1258x;
        if (jVar != null) {
            f(jVar);
        }
        this.f1240f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f1249o = null;
        this.f1248n = null;
        this.f1250p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1239e;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    protected h d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    public final void e(boolean z10) {
        if (this.f1255u) {
            return;
        }
        this.f1255u = true;
        for (WeakReference weakReference : this.f1257w) {
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                this.f1257w.remove(weakReference);
            } else {
                nVar.onCloseMenu(this, z10);
            }
        }
        this.f1255u = false;
    }

    protected h e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public boolean f(j jVar) {
        boolean zCollapseItemActionView = false;
        if (!this.f1257w.isEmpty() && this.f1258x == jVar) {
            i0();
            for (WeakReference weakReference : this.f1257w) {
                n nVar = (n) weakReference.get();
                if (nVar != null) {
                    zCollapseItemActionView = nVar.collapseItemActionView(this, jVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.f1257w.remove(weakReference);
                }
            }
            h0();
            if (zCollapseItemActionView) {
                this.f1258x = null;
            }
        }
        return zCollapseItemActionView;
    }

    public void f0(boolean z10) {
        this.f1260z = z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) this.f1240f.get(i11);
            if (jVar.getItemId() == i10) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (menuItemFindItem = jVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f1240f.get(i10);
    }

    boolean h(h hVar, MenuItem menuItem) {
        a aVar = this.f1239e;
        return aVar != null && aVar.onMenuItemSelected(hVar, menuItem);
    }

    public void h0() {
        this.f1251q = false;
        if (this.f1252r) {
            this.f1252r = false;
            N(this.f1253s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1260z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((j) this.f1240f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i0() {
        if (this.f1251q) {
            return;
        }
        this.f1251q = true;
        this.f1252r = false;
        this.f1253s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public boolean m(j jVar) {
        boolean zExpandItemActionView = false;
        if (this.f1257w.isEmpty()) {
            return false;
        }
        i0();
        for (WeakReference weakReference : this.f1257w) {
            n nVar = (n) weakReference.get();
            if (nVar != null) {
                zExpandItemActionView = nVar.expandItemActionView(this, jVar);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.f1257w.remove(weakReference);
            }
        }
        h0();
        if (zExpandItemActionView) {
            this.f1258x = jVar;
        }
        return zExpandItemActionView;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((j) this.f1240f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        j jVarR = r(i10, keyEvent);
        boolean zO = jVarR != null ? O(jVarR, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zO;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((j) this.f1240f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    j r(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f1256v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (j) arrayList.get(0);
        }
        boolean zJ = J();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) arrayList.get(i11);
            char alphabeticShortcut = zJ ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i10 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iN = n(i10);
        if (iN >= 0) {
            int size = this.f1240f.size() - iN;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((j) this.f1240f.get(iN)).getGroupId() != i10) {
                    break;
                }
                Q(iN, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    void s(List list, int i10, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1240f.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar = (j) this.f1240f.get(i11);
                if (jVar.hasSubMenu()) {
                    ((h) jVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = zJ ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zJ ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i10 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1240f.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) this.f1240f.get(i11);
            if (jVar.getGroupId() == i10) {
                jVar.t(z11);
                jVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1259y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1240f.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) this.f1240f.get(i11);
            if (jVar.getGroupId() == i10) {
                jVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1240f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) this.f1240f.get(i11);
            if (jVar.getGroupId() == i10 && jVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1237c = z10;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1240f.size();
    }

    public void t() {
        ArrayList arrayListG = G();
        if (this.f1245k) {
            boolean zFlagActionItems = false;
            for (WeakReference weakReference : this.f1257w) {
                n nVar = (n) weakReference.get();
                if (nVar == null) {
                    this.f1257w.remove(weakReference);
                } else {
                    zFlagActionItems |= nVar.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.f1243i.clear();
                this.f1244j.clear();
                int size = arrayListG.size();
                for (int i10 = 0; i10 < size; i10++) {
                    j jVar = (j) arrayListG.get(i10);
                    if (jVar.l()) {
                        this.f1243i.add(jVar);
                    } else {
                        this.f1244j.add(jVar);
                    }
                }
            } else {
                this.f1243i.clear();
                this.f1244j.clear();
                this.f1244j.addAll(G());
            }
            this.f1245k = false;
        }
    }

    public ArrayList u() {
        t();
        return this.f1243i;
    }

    protected String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f1235a;
    }

    public j x() {
        return this.f1258x;
    }

    public Drawable y() {
        return this.f1249o;
    }

    public CharSequence z() {
        return this.f1248n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f1236b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f1236b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        j jVar = (j) a(i10, i11, i12, charSequence);
        s sVar = new s(this.f1235a, this, jVar);
        jVar.x(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f1236b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1236b.getString(i13));
    }
}
