package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class NetworkLink extends Feature {

    @Element(required = false)
    private String flyToView;

    @Element(name = "Link", required = false)
    private Link link;

    @Element(required = false)
    private String refreshVisibility;

    public Boolean getFlyToView() {
        String str = this.flyToView;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public Link getLink() {
        return this.link;
    }

    public Boolean getRefreshVisibility() {
        String str = this.refreshVisibility;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public void setFlyToView(Boolean bool) {
        if (bool != null) {
            this.flyToView = bool.toString();
        } else {
            this.flyToView = null;
        }
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public void setRefreshVisibility(Boolean bool) {
        if (bool != null) {
            this.refreshVisibility = bool.toString();
        } else {
            this.refreshVisibility = null;
        }
    }

    public void setFlyToView(Integer num) {
        if (num != null) {
            this.flyToView = Boolean.toString(num.intValue() == 1);
        } else {
            this.flyToView = null;
        }
    }

    public void setRefreshVisibility(Integer num) {
        if (num != null) {
            this.refreshVisibility = Boolean.toString(num.intValue() == 1);
        } else {
            this.refreshVisibility = null;
        }
    }
}
