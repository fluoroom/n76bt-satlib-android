package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Style extends StyleSelector {

    @Element(name = "BalloonStyle", required = false)
    private BalloonStyle balloonStyle;

    @Element(name = "IconStyle", required = false)
    private IconStyle iconStyle;

    @Element(name = "LabelStyle", required = false)
    private LabelStyle labelStyle;

    @Element(name = "LineStyle", required = false)
    private LineStyle lineStyle;

    @Element(name = "ListStyle", required = false)
    private ListStyle listStyle;

    @Element(name = "PolyStyle", required = false)
    private PolyStyle polyStyle;

    public BalloonStyle getBalloonStyle() {
        return this.balloonStyle;
    }

    public IconStyle getIconStyle() {
        return this.iconStyle;
    }

    public LabelStyle getLabelStyle() {
        return this.labelStyle;
    }

    public LineStyle getLineStyle() {
        return this.lineStyle;
    }

    public ListStyle getListStyle() {
        return this.listStyle;
    }

    public PolyStyle getPolyStyle() {
        return this.polyStyle;
    }

    public void setBalloonStyle(BalloonStyle balloonStyle) {
        this.balloonStyle = balloonStyle;
    }

    public void setIconStyle(IconStyle iconStyle) {
        this.iconStyle = iconStyle;
    }

    public void setLabelStyle(LabelStyle labelStyle) {
        this.labelStyle = labelStyle;
    }

    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public void setListStyle(ListStyle listStyle) {
        this.listStyle = listStyle;
    }

    public void setPolyStyle(PolyStyle polyStyle) {
        this.polyStyle = polyStyle;
    }
}
