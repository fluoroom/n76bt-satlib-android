package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

/* JADX INFO: loaded from: classes.dex */
public class Polygon extends Geometry {

    @Element(required = false)
    private String altitudeMode;

    @Element(required = false)
    private String extrude;

    @ElementList(entry = "innerBoundaryIs", inline = true, name = "innerBoundaryIs", required = false, type = InnerBoundary.class)
    private List<InnerBoundary> innerBoundaryIsList;

    @Element(required = true)
    private OuterBoundary outerBoundaryIs;

    @Element(required = false)
    private String tessellate;

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public Boolean getExtrude() {
        String str = this.extrude;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public List<InnerBoundary> getInnerBoundaryIsList() {
        return this.innerBoundaryIsList;
    }

    public OuterBoundary getOuterBoundaryIs() {
        return this.outerBoundaryIs;
    }

    public Boolean getTessellate() {
        String str = this.tessellate;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setExtrude(Boolean bool) {
        if (bool != null) {
            this.extrude = bool.toString();
        } else {
            this.extrude = null;
        }
    }

    public void setInnerBoundaryIsList(List<InnerBoundary> list) {
        this.innerBoundaryIsList = list;
    }

    public void setOuterBoundaryIs(OuterBoundary outerBoundary) {
        this.outerBoundaryIs = outerBoundary;
    }

    public void setTessellate(Boolean bool) {
        if (bool != null) {
            this.tessellate = bool.toString();
        } else {
            this.tessellate = null;
        }
    }

    public void setExtrude(Integer num) {
        if (num != null) {
            this.extrude = Boolean.toString(num.intValue() == 1);
        } else {
            this.extrude = null;
        }
    }

    public void setTessellate(Integer num) {
        if (num != null) {
            this.tessellate = Boolean.toString(num.intValue() == 1);
        } else {
            this.tessellate = null;
        }
    }
}
