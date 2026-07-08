package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Link extends Object {

    @Element(required = false)
    private String href;

    @Element(required = false)
    private String httpQuery;

    @Element(required = false)
    private Float refreshInterval;

    @Element(required = false)
    private String refreshMode;

    @Element(required = false)
    private Float viewBoundScale;

    @Element(required = false)
    private String viewFormat;

    @Element(required = false)
    private String viewRefreshMode;

    @Element(required = false)
    private Float viewRefreshTime;

    public String getHref() {
        return this.href;
    }

    public String getHttpQuery() {
        return this.httpQuery;
    }

    public Float getRefreshInterval() {
        return this.refreshInterval;
    }

    public String getRefreshMode() {
        return this.refreshMode;
    }

    public Float getViewBoundScale() {
        return this.viewBoundScale;
    }

    public String getViewFormat() {
        return this.viewFormat;
    }

    public String getViewRefreshMode() {
        return this.viewRefreshMode;
    }

    public Float getViewRefreshTime() {
        return this.viewRefreshTime;
    }

    public void setHref(String str) {
        this.href = str;
    }

    public void setHttpQuery(String str) {
        this.httpQuery = str;
    }

    public void setRefreshInterval(Float f10) {
        this.refreshInterval = f10;
    }

    public void setRefreshMode(String str) {
        this.refreshMode = str;
    }

    public void setViewBoundScale(Float f10) {
        this.viewBoundScale = f10;
    }

    public void setViewFormat(String str) {
        this.viewFormat = str;
    }

    public void setViewRefreshMode(String str) {
        this.viewRefreshMode = str;
    }

    public void setViewRefreshTime(Float f10) {
        this.viewRefreshTime = f10;
    }
}
