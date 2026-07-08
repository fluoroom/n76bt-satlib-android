package com.google.gson;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import z9.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8818a;

    public p(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f8818a = bool;
    }

    private static boolean t(p pVar) {
        Object obj = pVar.f8818a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.k
    public long e() {
        return u() ? q().longValue() : Long.parseLong(f());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f8818a == null) {
            return pVar.f8818a == null;
        }
        if (t(this) && t(pVar)) {
            return ((this.f8818a instanceof BigInteger) || (pVar.f8818a instanceof BigInteger)) ? m().equals(pVar.m()) : q().longValue() == pVar.q().longValue();
        }
        Object obj2 = this.f8818a;
        if (obj2 instanceof Number) {
            Object obj3 = pVar.f8818a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return l().compareTo(pVar.l()) == 0;
                }
                double dP = p();
                double dP2 = pVar.p();
                return dP == dP2 || (Double.isNaN(dP) && Double.isNaN(dP2));
            }
        }
        return obj2.equals(pVar.f8818a);
    }

    @Override // com.google.gson.k
    public String f() {
        Object obj = this.f8818a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (u()) {
            return q().toString();
        }
        if (s()) {
            return ((Boolean) this.f8818a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f8818a.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f8818a == null) {
            return 31;
        }
        if (t(this)) {
            jDoubleToLongBits = q().longValue();
        } else {
            Object obj = this.f8818a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(q().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal l() {
        Object obj = this.f8818a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : a0.b(f());
    }

    public BigInteger m() {
        Object obj = this.f8818a;
        return obj instanceof BigInteger ? (BigInteger) obj : t(this) ? BigInteger.valueOf(q().longValue()) : a0.c(f());
    }

    public boolean o() {
        return s() ? ((Boolean) this.f8818a).booleanValue() : Boolean.parseBoolean(f());
    }

    public double p() {
        return u() ? q().doubleValue() : Double.parseDouble(f());
    }

    public Number q() {
        Object obj = this.f8818a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new z9.y((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean s() {
        return this.f8818a instanceof Boolean;
    }

    public boolean u() {
        return this.f8818a instanceof Number;
    }

    public boolean y() {
        return this.f8818a instanceof String;
    }

    public p(Number number) {
        Objects.requireNonNull(number);
        this.f8818a = number;
    }

    public p(String str) {
        Objects.requireNonNull(str);
        this.f8818a = str;
    }
}
