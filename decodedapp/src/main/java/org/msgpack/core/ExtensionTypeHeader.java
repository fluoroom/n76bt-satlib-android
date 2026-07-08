package org.msgpack.core;

/* JADX INFO: loaded from: classes3.dex */
public class ExtensionTypeHeader {
    private final int length;
    private final byte type;

    public ExtensionTypeHeader(byte b10, int i10) {
        Preconditions.checkArgument(i10 >= 0, "length must be >= 0");
        this.type = b10;
        this.length = i10;
    }

    public static byte checkedCastToByte(int i10) {
        Preconditions.checkArgument(-128 <= i10 && i10 <= 127, "Extension type code must be within the range of byte");
        return (byte) i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExtensionTypeHeader) {
            ExtensionTypeHeader extensionTypeHeader = (ExtensionTypeHeader) obj;
            if (this.type == extensionTypeHeader.type && this.length == extensionTypeHeader.length) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return this.length;
    }

    public byte getType() {
        return this.type;
    }

    public int hashCode() {
        return ((this.type + 31) * 31) + this.length;
    }

    public boolean isTimestampType() {
        return this.type == -1;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.type), Integer.valueOf(this.length));
    }
}
