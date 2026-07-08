package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "gx")
public class SimpleArrayData {

    @Attribute(required = true)
    private String name;

    @Namespace(prefix = "gx")
    @ElementList(entry = "value", inline = true, required = true, type = String.class)
    private List<String> value;

    public String getName() {
        return this.name;
    }

    public List<String> getValue() {
        return this.value;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(List<String> list) {
        this.value = list;
    }
}
