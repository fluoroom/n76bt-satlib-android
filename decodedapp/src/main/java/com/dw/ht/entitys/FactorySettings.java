package com.dw.ht.entitys;

import androidx.annotation.Keep;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/BW\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/dw/ht/entitys/FactorySettings;", "", "", Name.MARK, "", "name", "", "freqRangeCount", "", "settings", "iba", "vco", "settings2", "<init>", "(JLjava/lang/String;I[B[B[B[B)V", "toJson", "()Ljava/lang/String;", "J", "getId", "()J", "setId", "(J)V", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "I", "getFreqRangeCount", "()I", "setFreqRangeCount", "(I)V", "[B", "getSettings", "()[B", "setSettings", "([B)V", "getIba", "setIba", "getVco", "setVco", "getSettings2", "setSettings2", "Lv4/a;", "getAdvancedSettings", "()Lv4/a;", "advancedSettings", "Companion", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final class FactorySettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int freqRangeCount;
    private byte[] iba;
    private long id;
    private String name;
    private byte[] settings;
    private byte[] settings2;
    private byte[] vco;

    /* JADX INFO: renamed from: com.dw.ht.entitys.FactorySettings$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final FactorySettings a(String str) {
            m.e(str, "json");
            Object objJ = new com.google.gson.f().j(str, FactorySettings.class);
            m.d(objJ, "fromJson(...)");
            return (FactorySettings) objJ;
        }

        private Companion() {
        }
    }

    public FactorySettings() {
        this(0L, null, 0, null, null, null, null, 127, null);
    }

    public final v4.a getAdvancedSettings() {
        byte[] bArr = this.settings;
        if (bArr == null) {
            return null;
        }
        try {
            return new v4.a(bArr, 0, bArr.length, this.freqRangeCount);
        } catch (w5.g e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final int getFreqRangeCount() {
        return this.freqRangeCount;
    }

    public final byte[] getIba() {
        return this.iba;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final byte[] getSettings() {
        return this.settings;
    }

    public final byte[] getSettings2() {
        return this.settings2;
    }

    public final byte[] getVco() {
        return this.vco;
    }

    public final void setFreqRangeCount(int i10) {
        this.freqRangeCount = i10;
    }

    public final void setIba(byte[] bArr) {
        this.iba = bArr;
    }

    public final void setId(long j10) {
        this.id = j10;
    }

    public final void setName(String str) {
        m.e(str, "<set-?>");
        this.name = str;
    }

    public final void setSettings(byte[] bArr) {
        this.settings = bArr;
    }

    public final void setSettings2(byte[] bArr) {
        this.settings2 = bArr;
    }

    public final void setVco(byte[] bArr) {
        this.vco = bArr;
    }

    public final String toJson() {
        String strS = new com.google.gson.f().s(this);
        m.d(strS, "toJson(...)");
        return strS;
    }

    public FactorySettings(long j10) {
        this(j10, null, 0, null, null, null, null, 126, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FactorySettings(long j10, String str) {
        this(j10, str, 0, null, null, null, null, 124, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FactorySettings(long j10, String str, int i10) {
        this(j10, str, i10, null, null, null, null, 120, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FactorySettings(long j10, String str, int i10, byte[] bArr) {
        this(j10, str, i10, bArr, null, null, null, 112, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FactorySettings(long j10, String str, int i10, byte[] bArr, byte[] bArr2) {
        this(j10, str, i10, bArr, bArr2, null, null, 96, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FactorySettings(long j10, String str, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(j10, str, i10, bArr, bArr2, bArr3, null, 64, null);
        m.e(str, "name");
    }

    public FactorySettings(long j10, String str, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        m.e(str, "name");
        this.id = j10;
        this.name = str;
        this.freqRangeCount = i10;
        this.settings = bArr;
        this.iba = bArr2;
        this.vco = bArr3;
        this.settings2 = bArr4;
    }

    public /* synthetic */ FactorySettings(long j10, String str, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i11, rd.h hVar) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 3 : i10, (i11 & 8) != 0 ? null : bArr, (i11 & 16) != 0 ? null : bArr2, (i11 & 32) != 0 ? null : bArr3, (i11 & 64) != 0 ? null : bArr4);
    }
}
