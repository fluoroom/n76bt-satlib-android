package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
public class SchemaData {

    @Namespace(prefix = "gx")
    @ElementList(entry = "SimpleArrayData", inline = true, required = false, type = SimpleArrayData.class)
    private List<? extends java.lang.Object> schemaDataExtension;

    @Attribute(required = false)
    private String schemaUrl;

    @ElementList(entry = "SimpleData", inline = true, required = false)
    private List<SimpleData> simpleDataList;

    public List<? extends java.lang.Object> getSchemaDataExtension() {
        return this.schemaDataExtension;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public List<SimpleData> getSimpleDataList() {
        return this.simpleDataList;
    }

    public void setSchemaDataExtension(List<? extends java.lang.Object> list) {
        this.schemaDataExtension = list;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSimpleDataList(List<SimpleData> list) {
        this.simpleDataList = list;
    }
}
