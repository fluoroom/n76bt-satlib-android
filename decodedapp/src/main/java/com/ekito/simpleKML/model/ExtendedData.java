package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.ElementList;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedData {

    @ElementList(entry = "Data", inline = true, required = false)
    private List<Data> dataList;

    @ElementList(entry = "SchemaData", inline = true, required = false)
    private List<SchemaData> schemaDataList;

    public List<Data> getDataList() {
        return this.dataList;
    }

    public List<SchemaData> getSchemaDataList() {
        return this.schemaDataList;
    }

    public void setDataList(List<Data> list) {
        this.dataList = list;
    }

    public void setSchemaDataList(List<SchemaData> list) {
        this.schemaDataList = list;
    }
}
