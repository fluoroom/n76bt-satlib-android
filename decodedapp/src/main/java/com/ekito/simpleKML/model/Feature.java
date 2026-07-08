package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
public abstract class Feature extends Object {

    @ElementUnion({@Element(name = "Camera", required = false, type = Camera.class), @Element(name = "LookAt", required = false, type = LookAt.class)})
    private AbstractView abstractView;

    @Element(required = false)
    private String address;

    @Element(name = "AddressDetails", required = false)
    @Namespace(prefix = "xal")
    private String addressDetails;

    @Element(required = false)
    @Namespace(prefix = "atom")
    private String author;

    @Element(name = "link", required = false)
    @Namespace(prefix = "atom")
    private com.ekito.simpleKML.model.atom.Link authorLink;

    @Element(required = false)
    private String description;

    @Element(name = "ExtendedData", required = false)
    private ExtendedData extendedData;

    @Element(required = false)
    private String name;

    @Element(required = false)
    private String open;

    @Element(required = false)
    private String phoneNumber;

    @Element(name = "Region", required = false)
    private Region region;

    @Element(name = "Snippet", required = false)
    private String snippet;

    @ElementListUnion({@ElementList(entry = "Style", inline = true, required = false, type = Style.class), @ElementList(entry = "StyleMap", inline = true, required = false, type = StyleMap.class)})
    private List<StyleSelector> styleSelector;

    @Element(required = false)
    private String styleUrl;

    @ElementUnion({@Element(name = "TimeSpan", required = false, type = TimeSpan.class), @Element(name = "TimeStamp", required = false, type = TimeStamp.class)})
    private TimePrimitive timePrimitive;

    @Element(required = false)
    private String visibility;

    public AbstractView getAbstractView() {
        return this.abstractView;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAddressDetails() {
        return this.addressDetails;
    }

    public String getAuthor() {
        return this.author;
    }

    public com.ekito.simpleKML.model.atom.Link getAuthorLink() {
        return this.authorLink;
    }

    public String getDescription() {
        return this.description;
    }

    public ExtendedData getExtendedData() {
        return this.extendedData;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getOpen() {
        String str = this.open;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Region getRegion() {
        return this.region;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public List<StyleSelector> getStyleSelector() {
        return this.styleSelector;
    }

    public String getStyleUrl() {
        return this.styleUrl;
    }

    public TimePrimitive getTimePrimitive() {
        return this.timePrimitive;
    }

    public Boolean getVisibility() {
        String str = this.visibility;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public void setAbstractView(AbstractView abstractView) {
        this.abstractView = abstractView;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setAddressDetails(String str) {
        this.addressDetails = str;
    }

    public void setAuthor(String str) {
        this.author = str;
    }

    public void setAuthorLink(com.ekito.simpleKML.model.atom.Link link) {
        this.authorLink = link;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExtendedData(ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpen(Boolean bool) {
        if (bool != null) {
            this.open = bool.toString();
        } else {
            this.open = null;
        }
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setSnippet(String str) {
        this.snippet = str;
    }

    public void setStyleSelector(List<StyleSelector> list) {
        this.styleSelector = list;
    }

    public void setStyleUrl(String str) {
        this.styleUrl = str;
    }

    public void setTimePrimitive(TimePrimitive timePrimitive) {
        this.timePrimitive = timePrimitive;
    }

    public void setVisibility(Boolean bool) {
        if (bool != null) {
            this.visibility = bool.toString();
        } else {
            this.visibility = null;
        }
    }

    public void setOpen(Integer num) {
        if (num != null) {
            this.open = Boolean.toString(num.intValue() == 1);
        } else {
            this.open = null;
        }
    }

    public void setVisibility(Integer num) {
        if (num != null) {
            this.visibility = Boolean.toString(num.intValue() == 1);
        } else {
            this.visibility = null;
        }
    }
}
