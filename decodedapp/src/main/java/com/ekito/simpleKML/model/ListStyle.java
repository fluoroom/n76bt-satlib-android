package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

/* JADX INFO: loaded from: classes.dex */
public class ListStyle extends ColorStyle {

    @Element(required = false)
    private String bgColor;

    @ElementList(entry = "ItemIcon", inline = true, name = "ItemIcon", required = false, type = Icon.class)
    private List<Icon> itemIconList;

    @Element(required = false)
    private String listItemType;

    public String getBgColor() {
        return this.bgColor;
    }

    public List<Icon> getItemIcon() {
        return this.itemIconList;
    }

    public String getListItemType() {
        return this.listItemType;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setItemIcon(List<Icon> list) {
        this.itemIconList = list;
    }

    public void setListItemType(String str) {
        this.listItemType = str;
    }
}
