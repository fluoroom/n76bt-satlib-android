package org.msgpack.value;

/* JADX INFO: loaded from: classes3.dex */
public interface ImmutableValue extends Value {
    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ ArrayValue asArrayValue();

    @Override // org.msgpack.value.Value
    ImmutableArrayValue asArrayValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ BinaryValue asBinaryValue();

    @Override // org.msgpack.value.Value
    ImmutableBinaryValue asBinaryValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ BooleanValue asBooleanValue();

    @Override // org.msgpack.value.Value
    ImmutableBooleanValue asBooleanValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ FloatValue asFloatValue();

    @Override // org.msgpack.value.Value
    ImmutableFloatValue asFloatValue();

    @Override // org.msgpack.value.Value
    ImmutableIntegerValue asIntegerValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ IntegerValue asIntegerValue();

    @Override // org.msgpack.value.Value
    ImmutableMapValue asMapValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ MapValue asMapValue();

    @Override // org.msgpack.value.Value
    ImmutableNilValue asNilValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ NilValue asNilValue();

    @Override // org.msgpack.value.Value
    ImmutableRawValue asRawValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ RawValue asRawValue();

    @Override // org.msgpack.value.Value
    ImmutableStringValue asStringValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ StringValue asStringValue();

    @Override // org.msgpack.value.Value
    ImmutableTimestampValue asTimestampValue();

    @Override // org.msgpack.value.Value
    /* bridge */ /* synthetic */ TimestampValue asTimestampValue();
}
