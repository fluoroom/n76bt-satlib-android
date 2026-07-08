package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class ImagePyramid {

    @Element(required = false)
    private String gridOrigin;

    @Element(required = false)
    private Integer maxHeight;

    @Element(required = false)
    private Integer maxWidth;

    @Element(required = false)
    private Integer tileSize;

    public String getGridOrigin() {
        return this.gridOrigin;
    }

    public Integer getMaxHeight() {
        return this.maxHeight;
    }

    public Integer getMaxWidth() {
        return this.maxWidth;
    }

    public Integer getTileSize() {
        return this.tileSize;
    }

    public void setGridOrigin(String str) {
        this.gridOrigin = str;
    }

    public void setMaxHeight(Integer num) {
        this.maxHeight = num;
    }

    public void setMaxWidth(Integer num) {
        this.maxWidth = num;
    }

    public void setTileSize(Integer num) {
        this.tileSize = num;
    }
}
