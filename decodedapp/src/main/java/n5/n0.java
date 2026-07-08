package n5;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.benshikj.ht.R;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends v3.m0 {
    private Uri F0;
    private Uri G0;
    private int H0;

    public static byte[] A4(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight() * 4);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            Log.w("PhotoPickFragment", "Unable to serialize photo: " + e10.toString());
            return null;
        }
    }

    private void B4(Uri uri) {
        if (this.F0 == null) {
            this.F0 = a6.r.d(k1());
        }
        try {
            startActivityForResult(F4(uri, this.F0), 102);
        } catch (Exception e10) {
            Log.e("PhotoPickFragment", "Cannot crop image", e10);
            Toast.makeText(k1(), R.string.photoPickerNotFoundText, 1).show();
            I4(e10);
        }
    }

    private Uri E4() {
        if (this.G0 == null) {
            this.G0 = a6.r.f(k1());
        }
        return this.G0;
    }

    private Intent F4(Uri uri, Uri uri2) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        a6.r.c(intent, uri2);
        a6.r.a(intent, this.H0);
        return intent;
    }

    private static Intent G4(Uri uri) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE", (Uri) null);
        a6.r.c(intent, uri);
        return intent;
    }

    protected void C4() {
        try {
            E4();
            Intent intent = new Intent("android.intent.action.GET_CONTENT", (Uri) null);
            intent.setType("image/*");
            a6.r.c(intent, E4());
            startActivityForResult(intent, 101);
        } catch (ActivityNotFoundException e10) {
            Toast.makeText(k1(), R.string.photoPickerNotFoundText, 1).show();
            I4(e10);
        }
    }

    protected void D4() {
        try {
            startActivityForResult(G4(E4()), 101);
        } catch (ActivityNotFoundException e10) {
            Toast.makeText(k1(), R.string.photoPickerNotFoundText, 1).show();
            I4(e10);
        }
    }

    protected abstract void H4();

    protected abstract void I4(Exception exc);

    protected void J4(Uri uri) {
        try {
            Bitmap bitmapH = a6.r.h(k1(), uri);
            if (bitmapH != null && (bitmapH.getWidth() > this.H0 || bitmapH.getHeight() > this.H0)) {
                int i10 = this.H0;
                bitmapH = a6.k.i(bitmapH, i10, i10);
            }
            K4(bitmapH);
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            I4(e10);
        }
    }

    protected boolean L4(Uri uri) {
        if (uri == null || a6.r.j(k1(), uri, E4(), false)) {
            if (this.H0 == 0) {
                J4(this.G0);
                return true;
            }
            B4(this.G0);
            return true;
        }
        I4(new Exception("Failed to read photo: " + uri.toString()));
        return false;
    }

    protected void M4(int i10) {
        this.H0 = i10;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        bundle.putParcelable("TEMP_PHOTO_URI", this.G0);
        bundle.putParcelable("CROPPED_PHOTO_URI", this.F0);
    }

    @Override // androidx.fragment.app.o
    public void m2(int i10, int i11, Intent intent) {
        if (i11 != -1) {
            if (i10 == 101 || i10 == 102) {
                H4();
                return;
            }
            super.m2(i10, i11, intent);
        }
        if (i10 == 101) {
            L4(intent == null ? null : intent.getData());
        } else if (i10 != 102) {
            super.m2(i10, i11, intent);
        } else {
            J4((intent == null || intent.getData() == null) ? this.F0 : intent.getData());
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle != null) {
            this.G0 = (Uri) bundle.getParcelable("TEMP_PHOTO_URI");
            this.F0 = (Uri) bundle.getParcelable("CROPPED_PHOTO_URI");
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        try {
            ContentResolver contentResolver = k1().getContentResolver();
            Uri uri = this.G0;
            if (uri != null) {
                contentResolver.delete(uri, null, null);
            }
            Uri uri2 = this.F0;
            if (uri2 != null) {
                contentResolver.delete(uri2, null, null);
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }

    protected void K4(Bitmap bitmap) {
    }
}
