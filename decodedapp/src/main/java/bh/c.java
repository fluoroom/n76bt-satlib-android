package bh;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f4048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f4050d;

    public c(PackageInfo packageInfo, boolean z10) {
        this(packageInfo.packageName, b(packageInfo.signatures), packageInfo.versionName, z10);
    }

    public static String a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set b(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(a(signature));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            if (this.f4047a.equals(cVar.f4047a) && this.f4049c.equals(cVar.f4049c) && this.f4050d == cVar.f4050d && this.f4048b.equals(cVar.f4048b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f4047a.hashCode() * 92821) + this.f4049c.hashCode()) * 92821) + (this.f4050d.booleanValue() ? 1 : 0);
        Iterator it = this.f4048b.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 92821) + ((String) it.next()).hashCode();
        }
        return iHashCode;
    }

    public c(String str, Set set, String str2, boolean z10) {
        this.f4047a = str;
        this.f4048b = set;
        this.f4049c = str2;
        this.f4050d = Boolean.valueOf(z10);
    }
}
