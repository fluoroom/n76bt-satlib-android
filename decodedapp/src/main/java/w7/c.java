package w7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(Parcel parcel) {
        return w(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        x(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, boolean z10) {
        y(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeBundle(bundle);
            x(parcel, iW);
        }
    }

    public static void e(Parcel parcel, int i10, byte b10) {
        y(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void f(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeByteArray(bArr);
            x(parcel, iW);
        }
    }

    public static void g(Parcel parcel, int i10, double d10) {
        y(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void h(Parcel parcel, int i10, float f10) {
        y(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void i(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            y(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            y(parcel, i10, 0);
        }
    }

    public static void j(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            x(parcel, iW);
        }
    }

    public static void k(Parcel parcel, int i10, int i11) {
        y(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void l(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeIntArray(iArr);
            x(parcel, iW);
        }
    }

    public static void m(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            y(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            y(parcel, i10, 0);
        }
    }

    public static void n(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeList(list);
            x(parcel, iW);
        }
    }

    public static void o(Parcel parcel, int i10, long j10) {
        y(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void p(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            x(parcel, iW);
        }
    }

    public static void q(Parcel parcel, int i10, short s10) {
        y(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    public static void r(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeString(str);
            x(parcel, iW);
        }
    }

    public static void s(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeStringArray(strArr);
            x(parcel, iW);
        }
    }

    public static void t(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                y(parcel, i10, 0);
            }
        } else {
            int iW = w(parcel, i10);
            parcel.writeStringList(list);
            x(parcel, iW);
        }
    }

    public static void u(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11, boolean z10) {
        if (parcelableArr == null) {
            if (z10) {
                y(parcel, i10, 0);
                return;
            }
            return;
        }
        int iW = w(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                z(parcel, parcelable, i11);
            }
        }
        x(parcel, iW);
    }

    public static void v(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                y(parcel, i10, 0);
                return;
            }
            return;
        }
        int iW = w(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                z(parcel, parcelable, 0);
            }
        }
        x(parcel, iW);
    }

    private static int w(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void x(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    private static void y(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    private static void z(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
