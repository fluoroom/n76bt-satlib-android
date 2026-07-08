package s4;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public class f extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.i f26418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Cursor f26419e;

    public class a extends RecyclerView.f0 implements View.OnClickListener, View.OnLongClickListener, View.OnCreateContextMenuListener, PopupMenu.OnMenuItemClickListener {
        public final View D;
        public final TextView E;
        private final ActionButton F;
        private final Context G;
        private final ImageView H;
        private final TextView I;
        private final TextView J;
        private final TextView K;
        public d5.d L;
        private d5.d M;

        public a(View view) {
            super(view);
            this.G = view.getContext();
            this.D = view;
            this.H = (ImageView) view.findViewById(R.id.icon);
            this.E = (TextView) view.findViewById(R.id.title);
            this.J = (TextView) view.findViewById(R.id.message);
            this.I = (TextView) view.findViewById(R.id.time);
            ActionButton actionButton = (ActionButton) view.findViewById(R.id.send_message);
            this.F = actionButton;
            this.K = (TextView) view.findViewById(R.id.speed);
            view.setOnClickListener(this);
            actionButton.setOnClickListener(this);
        }

        public void O(d5.d dVar) {
            this.L = dVar;
            this.E.setText("" + dVar.f10599a + ">" + dVar.f10600b + "," + dVar.f10601c);
            this.K.setText(dVar.c());
            this.J.setText(this.L.f10610l);
            this.H.setImageBitmap(o5.a.b().c(dVar.f10607i));
            this.I.setText(DateUtils.getRelativeTimeSpanString(dVar.f10612n, System.currentTimeMillis(), 1000L));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f.this.f26418d != null) {
                f.this.f26418d.V0(this.L, view.getId());
            }
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            new MenuInflater(view.getContext()).inflate(R.menu.session_c, contextMenu);
            if (TextUtils.isEmpty(this.M.f10610l)) {
                contextMenu.findItem(R.id.copy).setVisible(false);
            }
            com.dw.android.widget.a aVar = new com.dw.android.widget.a(view);
            aVar.j("更多");
            aVar.g(contextMenu);
            aVar.i(this);
            aVar.k();
            contextMenu.clear();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.M = this.L;
            view.showContextMenu();
            return true;
        }

        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.M == null) {
                return false;
            }
            int itemId = menuItem.getItemId();
            if (itemId != R.id.copy) {
                if (itemId != R.id.del) {
                    return false;
                }
                this.M.f(this.G.getContentResolver());
                return true;
            }
            a6.e.a(this.G, this.M.f10610l, null, null);
            Toast.makeText(this.G, this.G.getString(R.string.toast_text_copied), 0).show();
            return true;
        }
    }

    public f(c6.i iVar) {
        B(true);
        this.f26418d = iVar;
    }

    public d5.d E(int i10) {
        this.f26419e.moveToPosition(i10);
        return new d5.d(this.f26419e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        aVar.O(E(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_aprs_list_item, viewGroup, false));
    }

    public void H(Cursor cursor) {
        this.f26419e = cursor;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        Cursor cursor = this.f26419e;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        this.f26419e.moveToPosition(i10);
        return this.f26419e.getLong(0);
    }
}
