package io.objectbox.converter;

import bc.c;

/* JADX INFO: loaded from: classes3.dex */
public class IntegerLongMapConverter extends IntegerFlexMapConverter {
    @Override // io.objectbox.converter.FlexObjectConverter
    protected boolean shouldRestoreAsLong(c.g gVar) {
        return true;
    }
}
