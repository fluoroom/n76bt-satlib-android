package com.dw.ht.map.entitys;

import com.benshikj.ht.R;
import com.dw.ht.Main;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import io.objectbox.annotation.Entity;
import io.objectbox.converter.PropertyConverter;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import o4.c;
import org.simpleframework.xml.strategy.Name;
import rd.g0;
import rd.h;
import rd.m;
import z4.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0003KRSBm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\"\u0010C\u001a\u00020B8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010O\u001a\u00020I2\u0006\u0010J\u001a\u00020I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bP\u0010\u0015¨\u0006T"}, d2 = {"Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem;", "", "", Name.MARK, "", "title", "", "zoom", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;", "status", "latest_update", "", "southwest_latitude", "southwest_longitude", "northeast_latitude", "northeast_longitude", "", "justDownloadInWifi", "<init>", "(JLjava/lang/String;ILcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;JDDDDZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "c", "()J", "p", "(J)V", "Ljava/lang/String;", "l", "t", "(Ljava/lang/String;)V", "I", "m", "u", "(I)V", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;", "k", "()Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;", "s", "(Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;)V", "e", "setLatest_update", "D", "i", "()D", "setSouthwest_latitude", "(D)V", "j", "setSouthwest_longitude", "g", "setNortheast_latitude", "h", "setNortheast_longitude", "Z", "d", "()Z", "q", "(Z)V", "_terrainMode", "n", "set_terrainMode", "Lz4/j;", "mapLayer", "Lz4/j;", "f", "()Lz4/j;", "r", "(Lz4/j;)V", "Lcom/google/android/gms/maps/model/LatLngBounds;", "value", "a", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "o", "(Lcom/google/android/gms/maps/model/LatLngBounds;)V", "bounds", "b", "displayName", "StatusConverter", "MapLayerConverter", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class SatelliteOfflineMapItem {
    private boolean _terrainMode;
    private long id;
    private boolean justDownloadInWifi;
    private long latest_update;
    private j mapLayer;
    private double northeast_latitude;
    private double northeast_longitude;
    private double southwest_latitude;
    private double southwest_longitude;
    private a status;
    private String title;
    private int zoom;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$MapLayerConverter;", "Lio/objectbox/converter/PropertyConverter;", "Lz4/j;", "", "<init>", "()V", "entityProperty", "convertToDatabaseValue", "(Lz4/j;)Ljava/lang/Integer;", "databaseValue", "convertToEntityProperty", "(Ljava/lang/Integer;)Lz4/j;", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MapLayerConverter implements PropertyConverter<j, Integer> {
        @Override // io.objectbox.converter.PropertyConverter
        public Integer convertToDatabaseValue(j entityProperty) {
            if (entityProperty != null) {
                return Integer.valueOf(entityProperty.ordinal());
            }
            return null;
        }

        @Override // io.objectbox.converter.PropertyConverter
        public j convertToEntityProperty(Integer databaseValue) {
            if (databaseValue == null) {
                return null;
            }
            try {
                return j.values()[databaseValue.intValue()];
            } catch (IndexOutOfBoundsException unused) {
                return j.f32938b;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$StatusConverter;", "Lio/objectbox/converter/PropertyConverter;", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;", "", "<init>", "()V", "entityProperty", "convertToDatabaseValue", "(Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;)Ljava/lang/Integer;", "databaseValue", "convertToEntityProperty", "(Ljava/lang/Integer;)Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StatusConverter implements PropertyConverter<a, Integer> {
        @Override // io.objectbox.converter.PropertyConverter
        public Integer convertToDatabaseValue(a entityProperty) {
            if (entityProperty != null) {
                return Integer.valueOf(entityProperty.ordinal());
            }
            return null;
        }

        @Override // io.objectbox.converter.PropertyConverter
        public a convertToEntityProperty(Integer databaseValue) {
            if (databaseValue == null) {
                return null;
            }
            try {
                return a.values()[databaseValue.intValue()];
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6549a = new a("WaitForDownload", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6550b = new a("WaitForUpdate", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6551c = new a("Downloading", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6552d = new a("Updating", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f6553e = new a("Downloaded", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f6554f = new a("Cancelled", 5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f6555g = new a("Deleting", 6);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ a[] f6556h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ kd.a f6557r;

        static {
            a[] aVarArrA = a();
            f6556h = aVarArrA;
            f6557r = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6549a, f6550b, f6551c, f6552d, f6553e, f6554f, f6555g};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6556h.clone();
        }
    }

    public SatelliteOfflineMapItem() {
        this(0L, null, 0, null, 0L, 0.0d, 0.0d, 0.0d, 0.0d, false, 1023, null);
    }

    public final LatLngBounds a() {
        return new LatLngBounds(new LatLng(this.southwest_latitude, this.southwest_longitude), new LatLng(this.northeast_latitude, this.northeast_longitude));
    }

    public final String b() {
        if (this.title.length() != 0) {
            return this.title;
        }
        g0 g0Var = g0.f25951a;
        Locale locale = Locale.getDefault();
        String string = Main.f5555g.getString(R.string.offline_map_i);
        m.d(string, "getString(...)");
        String str = String.format(locale, string, Arrays.copyOf(new Object[]{Long.valueOf(this.id)}, 1));
        m.d(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getJustDownloadInWifi() {
        return this.justDownloadInWifi;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLatest_update() {
        return this.latest_update;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SatelliteOfflineMapItem)) {
            return false;
        }
        SatelliteOfflineMapItem satelliteOfflineMapItem = (SatelliteOfflineMapItem) other;
        return this.id == satelliteOfflineMapItem.id && m.a(this.title, satelliteOfflineMapItem.title) && this.zoom == satelliteOfflineMapItem.zoom && this.status == satelliteOfflineMapItem.status && this.latest_update == satelliteOfflineMapItem.latest_update && Double.compare(this.southwest_latitude, satelliteOfflineMapItem.southwest_latitude) == 0 && Double.compare(this.southwest_longitude, satelliteOfflineMapItem.southwest_longitude) == 0 && Double.compare(this.northeast_latitude, satelliteOfflineMapItem.northeast_latitude) == 0 && Double.compare(this.northeast_longitude, satelliteOfflineMapItem.northeast_longitude) == 0 && this.justDownloadInWifi == satelliteOfflineMapItem.justDownloadInWifi;
    }

    public final j f() {
        j jVar = this.mapLayer;
        return jVar == j.f32938b ? this._terrainMode ? j.f32940d : j.f32939c : jVar;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getNortheast_latitude() {
        return this.northeast_latitude;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getNortheast_longitude() {
        return this.northeast_longitude;
    }

    public int hashCode() {
        int iA = ((((o4.a.a(this.id) * 31) + this.title.hashCode()) * 31) + this.zoom) * 31;
        a aVar = this.status;
        return ((((((((((((iA + (aVar == null ? 0 : aVar.hashCode())) * 31) + o4.a.a(this.latest_update)) * 31) + c.a(this.southwest_latitude)) * 31) + c.a(this.southwest_longitude)) * 31) + c.a(this.northeast_latitude)) * 31) + c.a(this.northeast_longitude)) * 31) + o4.b.a(this.justDownloadInWifi);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getSouthwest_latitude() {
        return this.southwest_latitude;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getSouthwest_longitude() {
        return this.southwest_longitude;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getZoom() {
        return this.zoom;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean get_terrainMode() {
        return this._terrainMode;
    }

    public final void o(LatLngBounds latLngBounds) {
        m.e(latLngBounds, "value");
        LatLng latLng = latLngBounds.f7322a;
        this.southwest_latitude = latLng.f7320a;
        this.southwest_longitude = latLng.f7321b;
        LatLng latLng2 = latLngBounds.f7323b;
        this.northeast_latitude = latLng2.f7320a;
        this.northeast_longitude = latLng2.f7321b;
    }

    public final void p(long j10) {
        this.id = j10;
    }

    public final void q(boolean z10) {
        this.justDownloadInWifi = z10;
    }

    public final void r(j jVar) {
        m.e(jVar, "<set-?>");
        this.mapLayer = jVar;
    }

    public final void s(a aVar) {
        this.status = aVar;
    }

    public final void t(String str) {
        m.e(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "SatelliteOfflineMapItem(id=" + this.id + ", title=" + this.title + ", zoom=" + this.zoom + ", status=" + this.status + ", latest_update=" + this.latest_update + ", southwest_latitude=" + this.southwest_latitude + ", southwest_longitude=" + this.southwest_longitude + ", northeast_latitude=" + this.northeast_latitude + ", northeast_longitude=" + this.northeast_longitude + ", justDownloadInWifi=" + this.justDownloadInWifi + ')';
    }

    public final void u(int i10) {
        this.zoom = i10;
    }

    public SatelliteOfflineMapItem(long j10, String str, int i10, a aVar, long j11, double d10, double d11, double d12, double d13, boolean z10) {
        m.e(str, "title");
        this.id = j10;
        this.title = str;
        this.zoom = i10;
        this.status = aVar;
        this.latest_update = j11;
        this.southwest_latitude = d10;
        this.southwest_longitude = d11;
        this.northeast_latitude = d12;
        this.northeast_longitude = d13;
        this.justDownloadInWifi = z10;
        this.mapLayer = j.f32938b;
    }

    public /* synthetic */ SatelliteOfflineMapItem(long j10, String str, int i10, a aVar, long j11, double d10, double d11, double d12, double d13, boolean z10, int i11, h hVar) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 18 : i10, (i11 & 8) != 0 ? a.f6549a : aVar, (i11 & 16) == 0 ? j11 : 0L, (i11 & 32) != 0 ? 0.0d : d10, (i11 & 64) != 0 ? 0.0d : d11, (i11 & 128) != 0 ? 0.0d : d12, (i11 & 256) == 0 ? d13 : 0.0d, (i11 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? true : z10);
    }
}
