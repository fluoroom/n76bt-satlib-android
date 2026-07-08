package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {
    private final v0.f mEmojiTextViewHelper;
    private final TextView mView;

    AppCompatEmojiTextHelper(TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new v0.f(textView, false);
    }

    InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.a(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.b();
    }

    void loadFromAttributes(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, h.j.f14962i0, i10, 0);
        try {
            int i11 = h.j.f15032w0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            setEnabled(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void setAllCaps(boolean z10) {
        this.mEmojiTextViewHelper.c(z10);
    }

    void setEnabled(boolean z10) {
        this.mEmojiTextViewHelper.d(z10);
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.e(transformationMethod);
    }
}
