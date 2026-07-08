package rg;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends x {
    public static StringBuilder m(StringBuilder sb2, String... strArr) {
        rd.m.e(sb2, "<this>");
        rd.m.e(strArr, "value");
        for (String str : strArr) {
            sb2.append(str);
        }
        return sb2;
    }
}
