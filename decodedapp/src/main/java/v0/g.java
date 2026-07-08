package v0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f29476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e.f f29478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29479d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29480e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29481f = true;

    private static class a extends e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f29482a;

        a(EditText editText) {
            this.f29482a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void onInitialized() {
            super.onInitialized();
            g.c((EditText) this.f29482a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f29476a = editText;
        this.f29477b = z10;
    }

    private e.f a() {
        if (this.f29478c == null) {
            this.f29478c = new a(this.f29476a);
        }
        return this.f29478c;
    }

    static void c(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean e() {
        if (this.f29481f) {
            return (this.f29477b || androidx.emoji2.text.e.i()) ? false : true;
        }
        return true;
    }

    public boolean b() {
        return this.f29481f;
    }

    public void d(boolean z10) {
        if (this.f29481f != z10) {
            if (this.f29478c != null) {
                androidx.emoji2.text.e.c().u(this.f29478c);
            }
            this.f29481f = z10;
            if (z10) {
                c(this.f29476a, androidx.emoji2.text.e.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f29476a.isInEditMode() || e() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.e.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.e.c().s((Spannable) charSequence, i10, i10 + i12, this.f29479d, this.f29480e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
