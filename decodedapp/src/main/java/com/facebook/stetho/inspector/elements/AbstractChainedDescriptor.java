package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Util;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractChainedDescriptor<E> extends Descriptor<E> implements ChainedDescriptor<E> {
    private Descriptor<? super E> mSuper;

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getAttributes(E e10, AttributeAccumulator attributeAccumulator) {
        this.mSuper.getAttributes(e10, attributeAccumulator);
        onGetAttributes(e10, attributeAccumulator);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getChildren(E e10, Accumulator<Object> accumulator) {
        this.mSuper.getChildren(e10, accumulator);
        onGetChildren(e10, accumulator);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void getComputedStyles(E e10, ComputedStyleAccumulator computedStyleAccumulator) {
        this.mSuper.getComputedStyles(e10, computedStyleAccumulator);
        onGetComputedStyles(e10, computedStyleAccumulator);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getLocalName(E e10) {
        return onGetLocalName(e10);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getNodeName(E e10) {
        return onGetNodeName(e10);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final NodeType getNodeType(E e10) {
        return onGetNodeType(e10);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getNodeValue(E e10) {
        return onGetNodeValue(e10);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getStyleRuleNames(E e10, StyleRuleNameAccumulator styleRuleNameAccumulator) {
        this.mSuper.getStyleRuleNames(e10, styleRuleNameAccumulator);
        onGetStyleRuleNames(e10, styleRuleNameAccumulator);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getStyles(E e10, String str, StyleAccumulator styleAccumulator) {
        this.mSuper.getStyles(e10, str, styleAccumulator);
        onGetStyles(e10, str, styleAccumulator);
    }

    final Descriptor<? super E> getSuper() {
        return this.mSuper;
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void hook(E e10) {
        verifyThreadAccess();
        this.mSuper.hook(e10);
        onHook(e10);
    }

    protected void onGetAttributes(E e10, AttributeAccumulator attributeAccumulator) {
    }

    protected void onGetChildren(E e10, Accumulator<Object> accumulator) {
    }

    protected void onGetComputedStyles(E e10, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    protected String onGetLocalName(E e10) {
        return this.mSuper.getLocalName(e10);
    }

    protected String onGetNodeName(E e10) {
        return this.mSuper.getNodeName(e10);
    }

    protected NodeType onGetNodeType(E e10) {
        return this.mSuper.getNodeType(e10);
    }

    public String onGetNodeValue(E e10) {
        return this.mSuper.getNodeValue(e10);
    }

    protected void onGetStyleRuleNames(E e10, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    protected void onGetStyles(E e10, String str, StyleAccumulator styleAccumulator) {
    }

    protected void onHook(E e10) {
    }

    protected void onSetAttributesAsText(E e10, String str) {
        this.mSuper.setAttributesAsText(e10, str);
    }

    protected void onSetStyle(E e10, String str, String str2, String str3) {
    }

    protected void onUnhook(E e10) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void setAttributesAsText(E e10, String str) {
        onSetAttributesAsText(e10, str);
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void setStyle(E e10, String str, String str2, String str3) {
        this.mSuper.setStyle(e10, str, str2, str3);
        onSetStyle(e10, str, str2, str3);
    }

    @Override // com.facebook.stetho.inspector.elements.ChainedDescriptor
    public void setSuper(Descriptor<? super E> descriptor) {
        Util.throwIfNull(descriptor);
        Descriptor<? super E> descriptor2 = this.mSuper;
        if (descriptor != descriptor2) {
            if (descriptor2 != null) {
                throw new IllegalStateException();
            }
            this.mSuper = descriptor;
        }
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void unhook(E e10) {
        verifyThreadAccess();
        onUnhook(e10);
        this.mSuper.unhook(e10);
    }
}
