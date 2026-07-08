package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "gx")
public class Track extends Geometry {

    @Element(required = false)
    private String altitudeMode;

    @Namespace(prefix = "gx")
    @ElementList(entry = "angles", inline = true, required = false, type = String.class)
    private List<String> angleList;

    @Namespace(prefix = "gx")
    @ElementList(entry = "coord", inline = true, required = false, type = String.class)
    private List<String> coordList;

    @Element(name = "ExtendedData", required = false)
    private ExtendedData extendedData;

    @Element(name = "Model", required = false)
    private Model model;

    @ElementList(entry = "when", inline = true, required = false, type = String.class)
    private List<String> whenList;

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public List<String> getAngleList() {
        return this.angleList;
    }

    public List<String> getCoordList() {
        return this.coordList;
    }

    public ExtendedData getExtendedData() {
        return this.extendedData;
    }

    public Model getModel() {
        return this.model;
    }

    public List<String> getWhenList() {
        return this.whenList;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setAngleList(List<String> list) {
        this.angleList = list;
    }

    public void setCoordList(List<String> list) {
        this.coordList = list;
    }

    public void setExtendedData(ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setWhenList(List<String> list) {
        this.whenList = list;
    }
}
