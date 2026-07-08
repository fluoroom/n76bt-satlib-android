package com.dw.ht.entitys;

import com.google.android.gms.maps.model.LatLng;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.m;
import z4.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010.\u001a\u0004\b3\u00100\"\u0004\b4\u00102R$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010\f\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010<R$\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00109\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010<R$\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010<R$\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/dw/ht/entitys/Marker;", "Lz4/w;", "", Name.MARK, "", "latitude", "longitude", "altitude", "", "accuracy", "speed", "course", "date", "", "title", "text", "picture", "<init>", "(JDDLjava/lang/Double;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "i", "()J", "s", "(J)V", "D", "c", "()D", "b", "(D)V", "a", "d", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "p", "(Ljava/lang/Double;)V", "Ljava/lang/Float;", "f", "()Ljava/lang/Float;", "o", "(Ljava/lang/Float;)V", "l", "t", "h", "q", "getDate", "r", "Ljava/lang/String;", "n", "u", "(Ljava/lang/String;)V", "m", "setText", "k", "setPicture", "Lcom/google/android/gms/maps/model/LatLng;", "value", "j", "()Lcom/google/android/gms/maps/model/LatLng;", "setLatLng", "(Lcom/google/android/gms/maps/model/LatLng;)V", "latLng", "e", "()Z", "isKeyPoint", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class Marker implements w {
    private Float accuracy;
    private Double altitude;
    private Float course;
    private long date;
    private long id;
    private double latitude;
    private double longitude;
    private String picture;
    private Float speed;
    private String text;
    private String title;

    public Marker() {
        this(0L, 0.0d, 0.0d, null, null, null, null, 0L, null, null, null, 2047, null);
    }

    @Override // z4.w
    /* JADX INFO: renamed from: a, reason: from getter */
    public double getLongitude() {
        return this.longitude;
    }

    @Override // z4.w
    public void b(double d10) {
        this.latitude = d10;
    }

    @Override // z4.w
    /* JADX INFO: renamed from: c, reason: from getter */
    public double getLatitude() {
        return this.latitude;
    }

    @Override // z4.w
    public void d(double d10) {
        this.longitude = d10;
    }

    @Override // z4.w
    public boolean e() {
        String str = this.title;
        return str != null && str.length() > 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) other;
        return this.id == marker.id && Double.compare(this.latitude, marker.latitude) == 0 && Double.compare(this.longitude, marker.longitude) == 0 && m.a(this.altitude, marker.altitude) && m.a(this.accuracy, marker.accuracy) && m.a(this.speed, marker.speed) && m.a(this.course, marker.course) && this.date == marker.date && m.a(this.title, marker.title) && m.a(this.text, marker.text) && m.a(this.picture, marker.picture);
    }

    @Override // z4.w
    /* JADX INFO: renamed from: f, reason: from getter */
    public Float getAccuracy() {
        return this.accuracy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    @Override // z4.w
    public long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Float getCourse() {
        return this.course;
    }

    public int hashCode() {
        int iA = ((((o4.a.a(this.id) * 31) + o4.c.a(this.latitude)) * 31) + o4.c.a(this.longitude)) * 31;
        Double d10 = this.altitude;
        int iHashCode = (iA + (d10 == null ? 0 : d10.hashCode())) * 31;
        Float f10 = this.accuracy;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.speed;
        int iHashCode3 = (iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.course;
        int iHashCode4 = (((iHashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31) + o4.a.a(this.date)) * 31;
        String str = this.title;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.picture;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final LatLng j() {
        return new LatLng(getLatitude(), getLongitude());
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public Float getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public void o(Float f10) {
        this.accuracy = f10;
    }

    public final void p(Double d10) {
        this.altitude = d10;
    }

    public final void q(Float f10) {
        this.course = f10;
    }

    public void r(long j10) {
        this.date = j10;
    }

    public final void s(long j10) {
        this.id = j10;
    }

    public void t(Float f10) {
        this.speed = f10;
    }

    public String toString() {
        return "Marker(id=" + this.id + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", accuracy=" + this.accuracy + ", speed=" + this.speed + ", course=" + this.course + ", date=" + this.date + ", title=" + this.title + ", text=" + this.text + ", picture=" + this.picture + ')';
    }

    public final void u(String str) {
        this.title = str;
    }

    public Marker(long j10) {
        this(j10, 0.0d, 0.0d, null, null, null, null, 0L, null, null, null, 2046, null);
    }

    public Marker(long j10, double d10) {
        this(j10, d10, 0.0d, null, null, null, null, 0L, null, null, null, 2044, null);
    }

    public Marker(long j10, double d10, double d11) {
        this(j10, d10, d11, null, null, null, null, 0L, null, null, null, 2040, null);
    }

    public Marker(long j10, double d10, double d11, Double d12) {
        this(j10, d10, d11, d12, null, null, null, 0L, null, null, null, 2032, null);
    }

    public Marker(long j10, double d10, double d11, Double d12, Float f10) {
        this(j10, d10, d11, d12, f10, null, null, 0L, null, null, null, 2016, null);
    }

    public Marker(long j10, double d10, double d11, Double d12, Float f10, Float f11) {
        this(j10, d10, d11, d12, f10, f11, null, 0L, null, null, null, 1984, null);
    }

    public Marker(long j10, double d10, double d11, Double d12, Float f10, Float f11, Float f12) {
        this(j10, d10, d11, d12, f10, f11, f12, 0L, null, null, null, 1920, null);
    }

    public Marker(long j10, double d10, double d11, Double d12, Float f10, Float f11, Float f12, long j11) {
        this(j10, d10, d11, d12, f10, f11, f12, j11, null, null, null, 1792, null);
    }

    public Marker(long j10, double d10, double d11, Double d12, Float f10, Float f11, Float f12, long j11, String str) {
        this(j10, d10, d11, d12, f10, f11, f12, j11, str, null, null, 1536, null);
    }

    public Marker(long j10, double d10, double d11, Double d12, Float f10, Float f11, Float f12, long j11, String str, String str2) {
        this(j10, d10, d11, d12, f10, f11, f12, j11, str, str2, null, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, null);
    }

    public Marker(long j10, double d10, double d11, Double d12, Float f10, Float f11, Float f12, long j11, String str, String str2, String str3) {
        this.id = j10;
        this.latitude = d10;
        this.longitude = d11;
        this.altitude = d12;
        this.accuracy = f10;
        this.speed = f11;
        this.course = f12;
        this.date = j11;
        this.title = str;
        this.text = str2;
        this.picture = str3;
    }

    public /* synthetic */ Marker(long j10, double d10, double d11, Double d12, Float f10, Float f11, Float f12, long j11, String str, String str2, String str3, int i10, rd.h hVar) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) == 0 ? d11 : 0.0d, (i10 & 8) != 0 ? null : d12, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : f11, (i10 & 64) != 0 ? null : f12, (i10 & 128) == 0 ? j11 : 0L, (i10 & 256) != 0 ? null : str, (i10 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? null : str2, (i10 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : str3);
    }
}
