package w7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private static void A(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    private static void B(Parcel parcel, int i10, int i11) {
        int iX = x(parcel, i10);
        if (iX == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + iX + " (0x" + Integer.toHexString(iX) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iX);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iX);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iX);
        return iArrCreateIntArray;
    }

    public static Parcelable d(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iX);
        return parcelable;
    }

    public static String e(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iX);
        return string;
    }

    public static String[] f(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iX);
        return strArrCreateStringArray;
    }

    public static ArrayList g(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateStringArrayList;
    }

    public static Object[] h(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return objArrCreateTypedArray;
    }

    public static ArrayList i(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateTypedArrayList;
    }

    public static void j(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    public static int k(int i10) {
        return (char) i10;
    }

    public static boolean l(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static byte m(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double n(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float o(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float p(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        if (iX == 0) {
            return null;
        }
        A(parcel, i10, iX, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int q(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder r(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iX);
        return strongBinder;
    }

    public static int s(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer t(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        if (iX == 0) {
            return null;
        }
        A(parcel, i10, iX, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void u(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + iX);
    }

    public static long v(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readLong();
    }

    public static short w(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int x(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void y(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i10));
    }

    public static int z(Parcel parcel) {
        int iQ = q(parcel);
        int iX = x(parcel, iQ);
        int iK = k(iQ);
        int iDataPosition = parcel.dataPosition();
        if (iK != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iQ))), parcel);
        }
        int i10 = iX + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
    }
}
