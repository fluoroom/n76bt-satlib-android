package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class PhotoOverlay extends Overlay {

    @Element(name = "ImagePyramid", required = false)
    private ImagePyramid imagePyramid;

    @Element(name = "Point", required = false)
    private Point point;

    @Element(required = false)
    private Float rotation;

    @Element(required = false)
    private String shape;

    @Element(name = "ViewVolume", required = false)
    private ViewVolume viewVolume;

    public ImagePyramid getImagePyramid() {
        return this.imagePyramid;
    }

    public Point getPoint() {
        return this.point;
    }

    public Float getRotation() {
        return this.rotation;
    }

    public String getShape() {
        return this.shape;
    }

    public ViewVolume getViewVolume() {
        return this.viewVolume;
    }

    public void setImagePyramid(ImagePyramid imagePyramid) {
        this.imagePyramid = imagePyramid;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRotation(Float f10) {
        this.rotation = f10;
    }

    public void setShape(String str) {
        this.shape = str;
    }

    public void setViewVolume(ViewVolume viewVolume) {
        this.viewVolume = viewVolume;
    }
}
