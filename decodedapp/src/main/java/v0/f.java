package v0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f29471a;

    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f29472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f29473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29474c = true;

        a(TextView textView) {
            this.f29472a = textView;
            this.f29473b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f29473b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f29473b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f29472a.setFilters(a(this.f29472a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // v0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f29474c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // v0.f.b
        public boolean b() {
            return this.f29474c;
        }

        @Override // v0.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // v0.f.b
        void d(boolean z10) {
            this.f29474c = z10;
            l();
            k();
        }

        @Override // v0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f29474c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f29474c = z10;
        }

        void l() {
            this.f29472a.setTransformationMethod(e(this.f29472a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z10);

        abstract void d(boolean z10);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f29475a;

        c(TextView textView) {
            this.f29475a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.i();
        }

        @Override // v0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f29475a.a(inputFilterArr);
        }

        @Override // v0.f.b
        public boolean b() {
            return this.f29475a.b();
        }

        @Override // v0.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f29475a.c(z10);
        }

        @Override // v0.f.b
        void d(boolean z10) {
            if (f()) {
                this.f29475a.i(z10);
            } else {
                this.f29475a.d(z10);
            }
        }

        @Override // v0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f29475a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        l0.g.h(textView, "textView cannot be null");
        if (z10) {
            this.f29471a = new a(textView);
        } else {
            this.f29471a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f29471a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f29471a.b();
    }

    public void c(boolean z10) {
        this.f29471a.c(z10);
    }

    public void d(boolean z10) {
        this.f29471a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f29471a.e(transformationMethod);
    }
}
