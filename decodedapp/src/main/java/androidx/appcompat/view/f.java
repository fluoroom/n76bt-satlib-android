package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f1101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f1102b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f1103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f1104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f1105c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final androidx.collection.i f1106d = new androidx.collection.i();

        public a(Context context, ActionMode.Callback callback) {
            this.f1104b = context;
            this.f1103a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f1106d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p pVar = new p(this.f1104b, (f0.a) menu);
            this.f1106d.put(menu, pVar);
            return pVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f1103a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f1103a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f1103a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f1103a.onActionItemClicked(e(bVar), new k(this.f1104b, (f0.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f1105c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f1105c.get(i10);
                if (fVar != null && fVar.f1102b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1104b, bVar);
            this.f1105c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f1101a = context;
        this.f1102b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1102b.finish();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1102b.getCustomView();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p(this.f1101a, (f0.a) this.f1102b.getMenu());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1102b.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1102b.getSubtitle();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1102b.getTag();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1102b.getTitle();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1102b.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1102b.invalidate();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1102b.isTitleOptional();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1102b.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1102b.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1102b.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1102b.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f1102b.setTitleOptionalHint(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f1102b.setSubtitle(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f1102b.setTitle(i10);
    }
}
