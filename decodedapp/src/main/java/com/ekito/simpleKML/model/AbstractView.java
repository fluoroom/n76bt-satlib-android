package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractView extends Object {

    @Namespace(prefix = "gx")
    @ElementUnion({@Element(name = "TimeSpan", required = false, type = TimeSpan.class), @Element(name = "TimeStamp", required = false, type = TimeStamp.class)})
    private TimePrimitive timePrimitive;

    @Element(name = "ViewerOptions", required = false)
    private ViewerOptions viewerOptions;

    public TimePrimitive getTimePrimitive() {
        return this.timePrimitive;
    }

    public ViewerOptions getViewerOptions() {
        return this.viewerOptions;
    }

    public void setTimePrimitive(TimePrimitive timePrimitive) {
        this.timePrimitive = timePrimitive;
    }

    public void setViewerOptions(ViewerOptions viewerOptions) {
        this.viewerOptions = viewerOptions;
    }
}
