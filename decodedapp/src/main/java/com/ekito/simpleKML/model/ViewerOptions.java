package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "gx")
public class ViewerOptions {

    @ElementList(entry = "option", inline = true)
    private List<Option> option;

    public List<Option> getOption() {
        return this.option;
    }

    public void setOption(List<Option> list) {
        this.option = list;
    }
}
