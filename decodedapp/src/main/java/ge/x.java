package ge;

import ed.r0;
import ee.o;
import ef.f0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f13878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f13879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f13880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f13881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f13882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f13883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f13884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f13885h;

    static {
        x xVar = new x();
        f13878a = xVar;
        f0 f0Var = f0.f11965a;
        f13879b = r0.k(f0Var.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f13880c = r0.j(r0.j(r0.j(r0.j(r0.j(r0.j(xVar.b(), f0Var.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), f0Var.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), f0Var.e("Double", "isInfinite()Z", "isNaN()Z")), f0Var.e("Float", "isInfinite()Z", "isNaN()Z")), f0Var.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), f0Var.e("CharSequence", "isEmpty()Z"));
        f13881d = f0Var.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f13882e = r0.j(r0.j(r0.j(r0.j(r0.j(r0.j(f0Var.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), f0Var.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), f0Var.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), f0Var.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), f0Var.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), f0Var.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f0Var.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f13883f = r0.j(r0.j(f0Var.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), f0Var.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f0Var.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set setA = xVar.a();
        String[] strArrB = f0Var.b("D");
        Set setJ = r0.j(setA, f0Var.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = f0Var.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f13884g = r0.j(setJ, f0Var.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = f0Var.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f13885h = f0Var.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private x() {
    }

    private final Set a() {
        f0 f0Var = f0.f11965a;
        vf.e eVar = vf.e.BYTE;
        List listN = ed.q.n(vf.e.BOOLEAN, eVar, vf.e.DOUBLE, vf.e.FLOAT, eVar, vf.e.INT, vf.e.LONG, vf.e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            String strD = ((vf.e) it.next()).i().f().d();
            rd.m.d(strD, "asString(...)");
            String[] strArrB = f0Var.b("Ljava/lang/String;");
            ed.q.A(linkedHashSet, f0Var.e(strD, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set b() {
        f0 f0Var = f0.f11965a;
        List<vf.e> listN = ed.q.n(vf.e.BOOLEAN, vf.e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (vf.e eVar : listN) {
            String strD = eVar.i().f().d();
            rd.m.d(strD, "asString(...)");
            ed.q.A(linkedHashSet, f0Var.e(strD, eVar.g() + "Value()" + eVar.f()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return f13881d;
    }

    public final Set d() {
        return f13879b;
    }

    public final Set e() {
        return f13884g;
    }

    public final Set f() {
        return f13880c;
    }

    public final Set g() {
        return f13883f;
    }

    public final Set h() {
        return f13885h;
    }

    public final Set i() {
        return f13882e;
    }

    public final boolean j(mf.d dVar) {
        rd.m.e(dVar, "fqName");
        return rd.m.a(dVar, o.a.f11877i) || ee.o.e(dVar);
    }

    public final boolean k(mf.d dVar) {
        rd.m.e(dVar, "fqName");
        if (j(dVar)) {
            return true;
        }
        mf.b bVarN = c.f13796a.n(dVar);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.a().a()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
