package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

/* JADX INFO: loaded from: classes.dex */
public class Update {

    @ElementListUnion({@ElementList(entry = "Change", inline = true, type = Change.class), @ElementList(entry = "Create", inline = true, type = Create.class), @ElementList(entry = "Delete", inline = true, type = Delete.class)})
    private List<UpdateProcess> crudList;

    @Element(required = true)
    private String targetHref;

    public List<UpdateProcess> getCrudList() {
        return this.crudList;
    }

    public String getTargetHref() {
        return this.targetHref;
    }

    public void setCrudList(List<UpdateProcess> list) {
        this.crudList = list;
    }

    public void setTargetHref(String str) {
        this.targetHref = str;
    }
}
