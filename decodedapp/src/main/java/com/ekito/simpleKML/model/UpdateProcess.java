package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;

/* JADX INFO: loaded from: classes.dex */
public abstract class UpdateProcess {

    @ElementUnion({@Element(name = "Document", required = false, type = Document.class), @Element(name = "Folder", required = false, type = Folder.class), @Element(name = "NetworkLink", required = false, type = NetworkLink.class), @Element(name = "Placemark", required = false, type = Placemark.class), @Element(name = "GroundOverlay", required = false, type = GroundOverlay.class), @Element(name = "PhotoOverlay", required = false, type = PhotoOverlay.class), @Element(name = "ScreenOverlay", required = false, type = ScreenOverlay.class)})
    private Feature feature;

    public Feature getFeature() {
        return this.feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
