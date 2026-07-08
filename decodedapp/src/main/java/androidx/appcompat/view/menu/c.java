package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements n {
    private n.a mCallback;
    protected Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected h mMenu;
    private int mMenuLayoutRes;
    protected o mMenuView;
    protected Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public c(Context context, int i10, int i11) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = i10;
        this.mItemLayoutRes = i11;
    }

    protected void addItemView(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.mMenuView).addView(view, i10);
    }

    public abstract void bindItemView(j jVar, o.a aVar);

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    public o.a createItemView(ViewGroup viewGroup) {
        return (o.a) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    protected boolean filterLeftoverView(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public n.a getCallback() {
        return this.mCallback;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.mId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getItemView(j jVar, View view, ViewGroup viewGroup) {
        o.a aVarCreateItemView = view instanceof o.a ? (o.a) view : createItemView(viewGroup);
        bindItemView(jVar, aVarCreateItemView);
        return (View) aVarCreateItemView;
    }

    public o getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            o oVar = (o) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView = oVar;
            oVar.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, h hVar) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mMenu = hVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(h hVar, boolean z10) {
        n.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z10);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        n.a aVar = this.mCallback;
        h hVar = sVar;
        if (aVar == null) {
            return false;
        }
        if (sVar == null) {
            hVar = this.mMenu;
        }
        return aVar.onOpenSubMenu(hVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.mCallback = aVar;
    }

    public void setId(int i10) {
        this.mId = i10;
    }

    public abstract boolean shouldIncludeItem(int i10, j jVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return;
        }
        h hVar = this.mMenu;
        int i10 = 0;
        if (hVar != null) {
            hVar.t();
            ArrayList arrayListG = this.mMenu.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                j jVar = (j) arrayListG.get(i12);
                if (shouldIncludeItem(i11, jVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    j itemData = childAt instanceof o.a ? ((o.a) childAt).getItemData() : null;
                    View itemView = getItemView(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        addItemView(itemView, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!filterLeftoverView(viewGroup, i10)) {
                i10++;
            }
        }
    }
}
