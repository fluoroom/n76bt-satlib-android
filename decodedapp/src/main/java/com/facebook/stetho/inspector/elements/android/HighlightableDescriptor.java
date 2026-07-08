package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface HighlightableDescriptor<E> {
    Object getElementToHighlightAtPosition(E e10, int i10, int i11, Rect rect);

    View getViewAndBoundsForHighlighting(E e10, Rect rect);
}
