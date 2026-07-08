package com.dw.ht.entitys;

import d5.a;
import io.objectbox.converter.PropertyConverter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dw/ht/entitys/ModulationConverter;", "Lio/objectbox/converter/PropertyConverter;", "Ld5/a$d;", "", "<init>", "()V", "databaseValue", "convertToEntityProperty", "(Ljava/lang/Integer;)Ld5/a$d;", "entityProperty", "convertToDatabaseValue", "(Ld5/a$d;)Ljava/lang/Integer;", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ModulationConverter implements PropertyConverter<a.d, Integer> {
    @Override // io.objectbox.converter.PropertyConverter
    public Integer convertToDatabaseValue(a.d entityProperty) {
        return Integer.valueOf(entityProperty != null ? entityProperty.ordinal() : 0);
    }

    @Override // io.objectbox.converter.PropertyConverter
    public a.d convertToEntityProperty(Integer databaseValue) {
        return databaseValue == null ? a.d.FM : a.d.d(databaseValue.intValue());
    }
}
