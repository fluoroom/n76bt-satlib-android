package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
public class LineStyle extends ColorStyle {

    @Element(required = false)
    @Namespace(prefix = "gx")
    private String labelVisibility;

    @Element(required = false)
    @Namespace(prefix = "gx")
    private String outerColor;

    @Element(required = false)
    @Namespace(prefix = "gx")
    private Float outerWidth;

    @Element(required = false)
    @Namespace(prefix = "gx")
    private Float physicalWidth;

    @Element(required = false)
    private Float width;

    public Boolean getLabelVisibility() {
        String str = this.labelVisibility;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public String getOuterColor() {
        return this.outerColor;
    }

    public Float getOuterWidth() {
        return this.outerWidth;
    }

    public Float getPhysicalWidth() {
        return this.physicalWidth;
    }

    public Float getWidth() {
        return this.width;
    }

    public void setLabelVisibility(Boolean bool) {
        if (bool != null) {
            this.labelVisibility = bool.toString();
        } else {
            this.labelVisibility = null;
        }
    }

    public void setOuterColor(String str) {
        this.outerColor = str;
    }

    public void setOuterWidth(Float f10) {
        this.outerWidth = f10;
    }

    public void setPhysicalWidth(Float f10) {
        this.physicalWidth = f10;
    }

    public void setWidth(Float f10) {
        this.width = f10;
    }

    public void setLabelVisibility(Integer num) {
        if (num != null) {
            this.labelVisibility = Boolean.toString(num.intValue() == 1);
        } else {
            this.labelVisibility = null;
        }
    }
}
