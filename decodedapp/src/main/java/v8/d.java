package v8;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class d extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f30498a;

    public d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f30498a = new Matrix();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f30498a.set(imageView.getImageMatrix());
        return this.f30498a;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
