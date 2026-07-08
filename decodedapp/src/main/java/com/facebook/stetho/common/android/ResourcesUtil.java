package com.facebook.stetho.common.android;

import android.content.res.Resources;
import com.facebook.stetho.common.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class ResourcesUtil {
    private ResourcesUtil() {
    }

    private static String getFallbackIdString(int i10) {
        return "#" + Integer.toHexString(i10);
    }

    public static String getIdString(Resources resources, int i10) throws Resources.NotFoundException {
        String resourcePackageName;
        String str;
        if (resources == null) {
            return getFallbackIdString(i10);
        }
        if (getResourcePackageId(i10) != 127) {
            resourcePackageName = resources.getResourcePackageName(i10);
            str = ":";
        } else {
            resourcePackageName = "";
            str = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i10);
        String resourceEntryName = resources.getResourceEntryName(i10);
        StringBuilder sb2 = new StringBuilder(resourcePackageName.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb2.append("@");
        sb2.append(resourcePackageName);
        sb2.append(str);
        sb2.append(resourceTypeName);
        sb2.append("/");
        sb2.append(resourceEntryName);
        return sb2.toString();
    }

    public static String getIdStringQuietly(Object obj, Resources resources, int i10) {
        try {
            return getIdString(resources, i10);
        } catch (Resources.NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i10);
            LogUtil.w("Unknown identifier encountered on " + obj + ": " + fallbackIdString);
            return fallbackIdString;
        }
    }

    private static int getResourcePackageId(int i10) {
        return (i10 >>> 24) & 255;
    }
}
