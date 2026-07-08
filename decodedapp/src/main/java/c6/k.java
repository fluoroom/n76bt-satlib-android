package c6;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.appcompat.widget.PopupMenu;

/* JADX INFO: loaded from: classes.dex */
public class k implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PopupMenu.OnMenuItemClickListener f4449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.widget.PopupMenu f4450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PopupMenu f4451c;

    private class a implements PopupMenu.OnMenuItemClickListener {
        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.onMenuItemClick(menuItem);
        }

        private a() {
        }
    }

    public k(Context context, View view) {
        d(context, view);
    }

    private void d(Context context, View view) {
        this.f4450b = new android.widget.PopupMenu(context, view);
        this.f4450b.setOnMenuItemClickListener(new a());
    }

    public Menu a() {
        android.widget.PopupMenu popupMenu = this.f4450b;
        return popupMenu != null ? popupMenu.getMenu() : this.f4451c.getMenu();
    }

    public MenuInflater b() {
        android.widget.PopupMenu popupMenu = this.f4450b;
        return popupMenu != null ? popupMenu.getMenuInflater() : this.f4451c.getMenuInflater();
    }

    public void c(int i10) {
        b().inflate(i10, a());
    }

    public void e(PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4449a = onMenuItemClickListener;
    }

    public void f() {
        android.widget.PopupMenu popupMenu = this.f4450b;
        if (popupMenu != null) {
            popupMenu.show();
        } else {
            this.f4451c.show();
        }
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        PopupMenu.OnMenuItemClickListener onMenuItemClickListener = this.f4449a;
        if (onMenuItemClickListener != null) {
            return onMenuItemClickListener.onMenuItemClick(menuItem);
        }
        return false;
    }
}
