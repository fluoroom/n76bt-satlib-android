package ka;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static String a(String str, k kVar) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile("\\$\\[(.+?)]").matcher(str);
        while (matcher.find()) {
            String strC = kVar.c(matcher.group(1));
            if (strC != null) {
                matcher.appendReplacement(stringBuffer, strC);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
