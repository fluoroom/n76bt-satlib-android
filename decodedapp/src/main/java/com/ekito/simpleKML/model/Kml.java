package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Root(name = "kml")
public class Kml {

    @ElementUnion({@Element(name = "Document", required = false, type = Document.class), @Element(name = "Folder", required = false, type = Folder.class), @Element(name = "NetworkLink", required = false, type = NetworkLink.class), @Element(name = "Placemark", required = false, type = Placemark.class), @Element(name = "GroundOverlay", required = false, type = GroundOverlay.class), @Element(name = "PhotoOverlay", required = false, type = PhotoOverlay.class), @Element(name = "ScreenOverlay", required = false, type = ScreenOverlay.class)})
    private Feature feature;

    @Element(name = "NetworkLinkControl", required = false)
    private NetworkLinkControl networkLinkControl;

    public Feature getFeature() {
        return this.feature;
    }

    public NetworkLinkControl getNetworkLinkControl() {
        return this.networkLinkControl;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public void setNetworkLinkControl(NetworkLinkControl networkLinkControl) {
        this.networkLinkControl = networkLinkControl;
    }
}
