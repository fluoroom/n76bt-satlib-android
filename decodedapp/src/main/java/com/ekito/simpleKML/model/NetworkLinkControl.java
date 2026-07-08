package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;

/* JADX INFO: loaded from: classes.dex */
public class NetworkLinkControl {

    @ElementUnion({@Element(name = "Camera", required = false, type = Camera.class), @Element(name = "LookAt", required = false, type = LookAt.class)})
    private AbstractView abstractView;

    @Element(required = false)
    private String cookie;

    @Element(required = false)
    private String expires;

    @Element(required = false)
    private String linkDescription;

    @Element(required = false)
    private String linkName;

    @Element(required = false)
    private String linkSnippet;

    @Element(required = false)
    private Float maxSessionLength;

    @Element(required = false)
    private String message;

    @Element(required = false)
    private Float minRefreshPeriod;

    @Element(name = "Update", required = false)
    private Update update;

    public AbstractView getAbstractView() {
        return this.abstractView;
    }

    public String getCookie() {
        return this.cookie;
    }

    public String getExpires() {
        return this.expires;
    }

    public String getLinkDescription() {
        return this.linkDescription;
    }

    public String getLinkName() {
        return this.linkName;
    }

    public String getLinkSnippet() {
        return this.linkSnippet;
    }

    public Float getMaxSessionLength() {
        return this.maxSessionLength;
    }

    public String getMessage() {
        return this.message;
    }

    public Float getMinRefreshPeriod() {
        return this.minRefreshPeriod;
    }

    public Update getUpdate() {
        return this.update;
    }

    public void setAbstractView(AbstractView abstractView) {
        this.abstractView = abstractView;
    }

    public void setCookie(String str) {
        this.cookie = str;
    }

    public void setExpires(String str) {
        this.expires = str;
    }

    public void setLinkDescription(String str) {
        this.linkDescription = str;
    }

    public void setLinkName(String str) {
        this.linkName = str;
    }

    public void setLinkSnippet(String str) {
        this.linkSnippet = str;
    }

    public void setMaxSessionLength(Float f10) {
        this.maxSessionLength = f10;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMinRefreshPeriod(Float f10) {
        this.minRefreshPeriod = f10;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }
}
