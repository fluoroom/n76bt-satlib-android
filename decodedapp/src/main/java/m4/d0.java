package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f21046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f21047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f21048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f21049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f21051h;

    private d0(ConstraintLayout constraintLayout, TextView textView, EditText editText, Button button, Button button2, Button button3, TextView textView2, Button button4) {
        this.f21044a = constraintLayout;
        this.f21045b = textView;
        this.f21046c = editText;
        this.f21047d = button;
        this.f21048e = button2;
        this.f21049f = button3;
        this.f21050g = textView2;
        this.f21051h = button4;
    }

    public static d0 a(View view) {
        int i10 = R.id.uid_count;
        TextView textView = (TextView) r1.a.a(view, R.id.uid_count);
        if (textView != null) {
            i10 = R.id.uid_index;
            EditText editText = (EditText) r1.a.a(view, R.id.uid_index);
            if (editText != null) {
                i10 = R.id.uid_index_add;
                Button button = (Button) r1.a.a(view, R.id.uid_index_add);
                if (button != null) {
                    i10 = R.id.uid_index_dec;
                    Button button2 = (Button) r1.a.a(view, R.id.uid_index_dec);
                    if (button2 != null) {
                        i10 = R.id.uid_load;
                        Button button3 = (Button) r1.a.a(view, R.id.uid_load);
                        if (button3 != null) {
                            i10 = R.id.uid_name;
                            TextView textView2 = (TextView) r1.a.a(view, R.id.uid_name);
                            if (textView2 != null) {
                                i10 = R.id.uid_write;
                                Button button4 = (Button) r1.a.a(view, R.id.uid_write);
                                if (button4 != null) {
                                    return new d0((ConstraintLayout) view, textView, editText, button, button2, button3, textView2, button4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_id_writer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21044a;
    }
}
