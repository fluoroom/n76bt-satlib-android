package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.android.widget.ListItemView;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CardView f21566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListItemView f21568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutCompat f21569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f21570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f21571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ListItemView f21572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f21573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ListItemView f21574i;

    private t1(CardView cardView, Button button, ListItemView listItemView, LinearLayoutCompat linearLayoutCompat, Button button2, Button button3, ListItemView listItemView2, ImageView imageView, ListItemView listItemView3) {
        this.f21566a = cardView;
        this.f21567b = button;
        this.f21568c = listItemView;
        this.f21569d = linearLayoutCompat;
        this.f21570e = button2;
        this.f21571f = button3;
        this.f21572g = listItemView2;
        this.f21573h = imageView;
        this.f21574i = listItemView3;
    }

    public static t1 a(View view) {
        int i10 = R.id.delete;
        Button button = (Button) r1.a.a(view, R.id.delete);
        if (button != null) {
            i10 = R.id.email;
            ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.email);
            if (listItemView != null) {
                i10 = R.id.linearLayoutCompat;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) r1.a.a(view, R.id.linearLayoutCompat);
                if (linearLayoutCompat != null) {
                    i10 = R.id.login;
                    Button button2 = (Button) r1.a.a(view, R.id.login);
                    if (button2 != null) {
                        i10 = R.id.logout;
                        Button button3 = (Button) r1.a.a(view, R.id.logout);
                        if (button3 != null) {
                            i10 = R.id.nickname;
                            ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.nickname);
                            if (listItemView2 != null) {
                                i10 = R.id.photo;
                                ImageView imageView = (ImageView) r1.a.a(view, R.id.photo);
                                if (imageView != null) {
                                    i10 = R.id.username;
                                    ListItemView listItemView3 = (ListItemView) r1.a.a(view, R.id.username);
                                    if (listItemView3 != null) {
                                        return new t1((CardView) view, button, listItemView, linearLayoutCompat, button2, button3, listItemView2, imageView, listItemView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static t1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_user_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CardView b() {
        return this.f21566a;
    }
}
