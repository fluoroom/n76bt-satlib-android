package com.dw.ht.provider;

import android.net.Uri;
import android.provider.BaseColumns;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f6661a = "com.benshikj.ht.provider.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f6662b = f6661a + "Data";

    /* JADX INFO: renamed from: com.dw.ht.provider.a$a, reason: collision with other inner class name */
    public static final class C0096a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Uri f6663a = Uri.parse("content://" + a.f6662b + "/channels");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f6664b = {0, 6700, 6930, 7190, 7440, 7700, 7970, 8250, 8540, 8850, 9150, 9480, 9740, 10000, 10350, 10720, 11090, 11480, 11880, 12300, 12730, 13180, 13650, 14130, 14620, 15000, 15140, 15670, 15980, 16220, 16550, 16790, 17130, 17380, 17730, 17990, 18350, 18620, 18990, 19280, 19660, 19950, 20350, 20650, 21070, 21380, 21810, 22130, 22570, 22910, 23360, 23710, 24180, 24550, 25030, 25410, 23, 25, 26, 31, 32, 36, 43, 47, 51, 53, 54, 65, 71, 72, 73, 74, 114, 115, 116, 122, 125, 131, 132, 134, 143, 145, 152, 155, 156, 162, 165, 172, 174, 205, 212, 223, 225, 226, 243, 244, 245, 246, 251, 252, 255, 261, 263, 265, 266, 271, 274, 306, 311, 315, 325, 331, 332, 343, 346, 351, 356, 364, 365, 371, 411, 412, 413, 423, 431, 432, 445, 446, 452, 454, 455, 462, 464, 465, 466, 503, 506, 516, 523, 526, 532, 546, 565, 606, 612, 624, 627, 631, 632, 654, 662, 664, 703, 712, 723, 731, 732, 734, 743, 754};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f6665c = "pre_de_emph_bypass";
    }

    public static final class b implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Uri f6666a = Uri.parse("content://" + a.f6662b + "/location_map");
    }

    public static final class c implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Uri f6667a = Uri.parse("content://" + a.f6662b + "/regions");
    }

    public static final class d implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Uri f6668a = Uri.parse("content://" + a.f6662b + "/sessions");
    }

    public static final class e implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Uri f6669a = Uri.parse("content://" + a.f6662b + "/users");
    }
}
