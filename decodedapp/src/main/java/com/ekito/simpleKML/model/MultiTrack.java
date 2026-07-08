package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "gx")
public class MultiTrack extends Geometry {

    @Element(required = false)
    private String altitudeMode;

    @Element(required = false)
    @Namespace(prefix = "gx")
    private Integer interpolate;

    @ElementList(entry = "Track", inline = true, required = false)
    private List<Track> trackList;

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public Integer getInterpolate() {
        return this.interpolate;
    }

    public List<Track> getTrackList() {
        return this.trackList;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setInterpolate(Integer num) {
        this.interpolate = num;
    }

    public void setTrackList(List<Track> list) {
        this.trackList = list;
    }
}
