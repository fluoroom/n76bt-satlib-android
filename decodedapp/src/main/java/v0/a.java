package v0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f29455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29456b = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29457c = 0;

    /* JADX INFO: renamed from: v0.a$a, reason: collision with other inner class name */
    private static class C0401a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f29458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f29459b;

        C0401a(EditText editText, boolean z10) {
            this.f29458a = editText;
            g gVar = new g(editText, z10);
            this.f29459b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(v0.b.getInstance());
        }

        @Override // v0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // v0.a.b
        boolean b() {
            return this.f29459b.b();
        }

        @Override // v0.a.b
        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f29458a, inputConnection, editorInfo);
        }

        @Override // v0.a.b
        void d(boolean z10) {
            this.f29459b.d(z10);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract boolean b();

        abstract InputConnection c(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void d(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        l0.g.h(editText, "editText cannot be null");
        this.f29455a = new C0401a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f29455a.a(keyListener);
    }

    public boolean b() {
        return this.f29455a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f29455a.c(inputConnection, editorInfo);
    }

    public void d(boolean z10) {
        this.f29455a.d(z10);
    }
}
