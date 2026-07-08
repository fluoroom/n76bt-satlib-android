package p5;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import c5.b0;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f23910a;

    public a(Context context) {
        this(context, R.layout.widget_cluster_overlay);
    }

    public void c(b0 b0Var) {
        setTitle(b0Var.getTitle());
    }

    public void setCount(int i10) {
        this.f23910a.setText(String.valueOf(i10));
    }

    public void setTitle(String str) {
        this.f23910a.setText(str);
    }

    public a(Context context, int i10) {
        super(context);
        View.inflate(context, i10, this);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f23910a = textView;
        textView.setBackground(b0.b.d(context, R.drawable.bg_map_cluster));
    }
}
