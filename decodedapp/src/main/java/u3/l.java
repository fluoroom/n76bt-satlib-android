package u3;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends c6.a {

    static class a implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f28030a;

        /* JADX INFO: renamed from: u3.l$a$a, reason: collision with other inner class name */
        class C0390a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f28031a;

            C0390a() {
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MenuItem next() {
                Menu menu = a.this.f28030a;
                int i10 = this.f28031a;
                this.f28031a = i10 + 1;
                return menu.getItem(i10);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f28031a < a.this.f28030a.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                a.this.f28030a.removeItem(a.this.f28030a.getItem(this.f28031a - 1).getItemId());
            }
        }

        public a(Menu menu) {
            this.f28030a = menu;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0390a();
        }
    }

    public l(Context context, Menu menu) {
        this(context, (ArrayList) null);
        n(menu);
    }

    public void n(Menu menu) {
        ArrayList arrayList = new ArrayList();
        for (MenuItem menuItem : new a(menu)) {
            if (menuItem.isVisible() && menuItem.getItemId() != k3.f.f19204x && menuItem.getAlphabeticShortcut() != 's') {
                arrayList.add(menuItem);
            }
        }
        c(arrayList);
    }

    public l(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
    }
}
