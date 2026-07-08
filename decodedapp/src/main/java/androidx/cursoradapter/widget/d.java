package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f1993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f1994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String[] f1996d;

    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr, int i11) {
        super(context, i10, cursor, i11);
        this.f1995c = -1;
        this.f1994b = iArr;
        this.f1996d = strArr;
        a(cursor, strArr);
    }

    private void a(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f1993a = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f1993a;
        if (iArr == null || iArr.length != length) {
            this.f1993a = new int[length];
        }
        for (int i10 = 0; i10 < length; i10++) {
            this.f1993a[i10] = cursor.getColumnIndexOrThrow(strArr[i10]);
        }
    }

    public void b(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    @Override // androidx.cursoradapter.widget.a
    public void bindView(View view, Context context, Cursor cursor) {
        int[] iArr = this.f1994b;
        int length = iArr.length;
        int[] iArr2 = this.f1993a;
        for (int i10 = 0; i10 < length; i10++) {
            View viewFindViewById = view.findViewById(iArr[i10]);
            if (viewFindViewById != null) {
                String string = cursor.getString(iArr2[i10]);
                if (string == null) {
                    string = "";
                }
                if (viewFindViewById instanceof TextView) {
                    c((TextView) viewFindViewById, string);
                } else {
                    if (!(viewFindViewById instanceof ImageView)) {
                        throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                    }
                    b((ImageView) viewFindViewById, string);
                }
            }
        }
    }

    public void c(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // androidx.cursoradapter.widget.a
    public Cursor swapCursor(Cursor cursor) {
        a(cursor, this.f1996d);
        return super.swapCursor(cursor);
    }
}
