package z1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: z1.a$a, reason: collision with other inner class name */
    public enum EnumC0443a {
        Unknown,
        RegisterCallback,
        StartTransmission,
        StopTransmission;

        public static EnumC0443a d(int i10) {
            return (i10 < 0 || i10 >= values().length) ? Unknown : values()[i10];
        }
    }

    public enum b {
        Unknown,
        Command,
        Audio;

        public static b d(int i10) {
            return (i10 < 0 || i10 >= values().length) ? Unknown : values()[i10];
        }
    }

    public static Bundle a(long j10, short[] sArr) {
        Bundle bundle = new Bundle();
        bundle.putShortArray("audio", sArr);
        bundle.putLong("dev_id", j10);
        return bundle;
    }

    public static short[] b(Bundle bundle) {
        return bundle.getShortArray("audio");
    }
}
