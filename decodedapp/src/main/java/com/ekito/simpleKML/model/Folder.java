package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

/* JADX INFO: loaded from: classes.dex */
public class Folder extends Feature {

    @ElementListUnion({@ElementList(entry = "Document", inline = true, required = false, type = Document.class), @ElementList(entry = "Folder", inline = true, required = false, type = Folder.class), @ElementList(entry = "NetworkLink", inline = true, required = false, type = NetworkLink.class), @ElementList(entry = "Placemark", inline = true, required = false, type = Placemark.class), @ElementList(entry = "GroundOverlay", inline = true, required = false, type = GroundOverlay.class), @ElementList(entry = "PhotoOverlay", inline = true, required = false, type = PhotoOverlay.class), @ElementList(entry = "ScreenOverlay", inline = true, required = false, type = ScreenOverlay.class)})
    private List<Feature> featureList;

    public List<Feature> getFeatureList() {
        return this.featureList;
    }

    public void setFeatureList(List<Feature> list) {
        this.featureList = list;
    }
}
