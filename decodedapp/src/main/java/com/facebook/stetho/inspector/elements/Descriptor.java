package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Descriptor<E> implements NodeDescriptor<E> {
    private Host mHost;

    public interface Host extends ThreadBound {
        Descriptor<?> getDescriptor(Object obj);

        void onAttributeModified(Object obj, String str, String str2);

        void onAttributeRemoved(Object obj, String str);
    }

    protected Descriptor() {
    }

    protected static Map<String, String> parseSetAttributesAsTextArg(String str) {
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        int length = str.length();
        String string = "";
        String string2 = "";
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '=') {
                string = sb2.toString();
                sb2.setLength(0);
            } else if (cCharAt == '\"') {
                if (z10) {
                    string2 = sb2.toString();
                    sb2.setLength(0);
                }
                z10 = !z10;
            } else if (cCharAt != ' ' || z10) {
                sb2.append(cCharAt);
            } else {
                map.put(string, string2);
            }
        }
        if (!string.isEmpty() && !string2.isEmpty()) {
            map.put(string, string2);
        }
        return map;
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final boolean checkThreadAccess() {
        return getHost().checkThreadAccess();
    }

    protected final Host getHost() {
        return this.mHost;
    }

    final void initialize(Host host) {
        Util.throwIfNull(host);
        Util.throwIfNotNull(this.mHost);
        this.mHost = host;
    }

    final boolean isInitialized() {
        return this.mHost != null;
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final <V> V postAndWait(UncheckedCallable<V> uncheckedCallable) {
        return (V) getHost().postAndWait(uncheckedCallable);
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void postDelayed(Runnable runnable, long j10) {
        getHost().postDelayed(runnable, j10);
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void removeCallbacks(Runnable runnable) {
        getHost().removeCallbacks(runnable);
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void verifyThreadAccess() {
        getHost().verifyThreadAccess();
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void postAndWait(Runnable runnable) {
        getHost().postAndWait(runnable);
    }
}
