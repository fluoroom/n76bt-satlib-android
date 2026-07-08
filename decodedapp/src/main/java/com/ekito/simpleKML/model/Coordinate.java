package com.ekito.simpleKML.model;

/* JADX INFO: loaded from: classes.dex */
public class Coordinate {
    private Double altitude;
    private Double latitude;
    private Double longitude;

    public Coordinate(Double d10, Double d11, Double d12) {
        this.longitude = d10;
        this.latitude = d11;
        this.altitude = d12;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setAltitude(Double d10) {
        this.altitude = d10;
    }

    public void setLatitude(Double d10) {
        this.latitude = d10;
    }

    public void setLongitude(Double d10) {
        this.longitude = d10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        sb2.append("");
        sb2.append(this.longitude);
        sb2.append(",");
        sb2.append(this.latitude);
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        if (this.altitude != null) {
            str = "," + this.altitude;
        }
        sb3.append(str);
        return sb3.toString() + " ";
    }

    public Coordinate(String str) {
        String[] strArrSplit = str.split("(?<!\\\\)[, ]");
        this.longitude = Double.valueOf(Double.parseDouble(strArrSplit[0]));
        this.latitude = Double.valueOf(Double.parseDouble(strArrSplit[1]));
        this.altitude = strArrSplit.length > 2 ? Double.valueOf(Double.parseDouble(strArrSplit[2])) : null;
    }
}
