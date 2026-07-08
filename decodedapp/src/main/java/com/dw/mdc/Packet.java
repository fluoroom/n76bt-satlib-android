package com.dw.mdc;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class Packet {
    short address;
    byte argument;
    final byte[] extra;
    int extraLen;
    boolean isEx;
    byte op;
    byte[] stream;

    public Packet() {
        this.extra = new byte[4];
    }

    public static Packet i(boolean z10, int i10) {
        Packet packet = new Packet();
        packet.k(1);
        packet.j(i10);
        return packet;
    }

    public short a() {
        return this.address;
    }

    public byte b() {
        return this.argument;
    }

    public int c() {
        return this.op & 31;
    }

    public String d() {
        if (this.stream == null) {
            return null;
        }
        return Charset.forName("utf-8").decode(ByteBuffer.wrap(this.stream)).toString();
    }

    public boolean e() {
        return (this.op & 32) != 0;
    }

    public boolean f() {
        return this.isEx;
    }

    public boolean g() {
        return (this.op & 128) != 0;
    }

    public boolean h() {
        return (this.op & 64) != 0;
    }

    public void j(int i10) {
        this.address = (short) i10;
    }

    public void k(int i10) {
        this.op = (byte) ((i10 & 31) | (this.op & MessagePack.Code.NEGFIXINT_PREFIX));
    }

    public String toString() {
        String str = g() ? "GRB " : "GIB ";
        String str2 = h() ? str + "IN  " : str + "OUT ";
        if (e()) {
            str2 = str2 + "AckReq";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2 + "\n");
        Locale locale = Locale.ENGLISH;
        sb2.append(String.format(locale, "OP=%X\n", Integer.valueOf(c())));
        String str3 = sb2.toString() + String.format(locale, "%02X %02X %04X", Byte.valueOf(this.op), Byte.valueOf(this.argument), Short.valueOf(this.address));
        for (int i10 = 0; i10 < this.extraLen; i10++) {
            str3 = str3 + String.format(Locale.ENGLISH, " %02X", Byte.valueOf(this.extra[i10]));
        }
        String strD = d();
        if (strD == null) {
            return str3;
        }
        return (str3 + "\n") + strD;
    }

    public Packet(boolean z10) {
        this.extra = new byte[4];
        this.isEx = z10;
    }
}
