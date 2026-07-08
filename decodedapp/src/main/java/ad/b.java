package ad;

import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f425a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static /* synthetic */ Class f426b;

    static {
        try {
            f425a = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    private static void b(String str) {
        if (f425a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    static Object c(String str, String str2) {
        return d(str, str2, e());
    }

    static Object d(String str, String str2, ClassLoader classLoader) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("found system property");
                stringBuffer.append(property);
                b(stringBuffer.toString());
                return f(property, classLoader);
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("java.home");
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(property2);
            String str3 = File.separator;
            stringBuffer2.append(str3);
            stringBuffer2.append("lib");
            stringBuffer2.append(str3);
            stringBuffer2.append("jaxp.properties");
            File file = new File(stringBuffer2.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                String property3 = properties.getProperty(str);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("found java.home property ");
                stringBuffer3.append(property3);
                b(stringBuffer3.toString());
                return f(property3, classLoader);
            }
        } catch (Exception e10) {
            if (f425a) {
                e10.printStackTrace();
            }
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("META-INF/services/");
        stringBuffer4.append(str);
        String string = stringBuffer4.toString();
        try {
            InputStream systemResourceAsStream = classLoader == null ? ClassLoader.getSystemResourceAsStream(string) : classLoader.getResourceAsStream(string);
            if (systemResourceAsStream != null) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("found ");
                stringBuffer5.append(string);
                b(stringBuffer5.toString());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(systemResourceAsStream, Utf8Charset.NAME));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && !"".equals(line)) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("loaded from services: ");
                    stringBuffer6.append(line);
                    b(stringBuffer6.toString());
                    return f(line, classLoader);
                }
            }
        } catch (Exception e11) {
            if (f425a) {
                e11.printStackTrace();
            }
        }
        if (str2 != null) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("loaded from fallback value: ");
            stringBuffer7.append(str2);
            b(stringBuffer7.toString());
            return f(str2, classLoader);
        }
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("Provider for ");
        stringBuffer8.append(str);
        stringBuffer8.append(" cannot be found");
        throw new a(stringBuffer8.toString(), null);
    }

    private static ClassLoader e() {
        try {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                Class clsA = f426b;
                if (clsA == null) {
                    clsA = a("javax.xml.stream.FactoryFinder");
                    f426b = clsA;
                }
                stringBuffer.append(clsA.getName());
                stringBuffer.append("$ClassLoaderFinderConcrete");
                android.support.v4.media.session.b.a(Class.forName(stringBuffer.toString()).newInstance());
                throw null;
            } catch (ClassNotFoundException unused) {
                Class clsA2 = f426b;
                if (clsA2 == null) {
                    clsA2 = a("javax.xml.stream.FactoryFinder");
                    f426b = clsA2;
                }
                return clsA2.getClassLoader();
            } catch (LinkageError unused2) {
                Class clsA3 = f426b;
                if (clsA3 == null) {
                    clsA3 = a("javax.xml.stream.FactoryFinder");
                    f426b = clsA3;
                }
                return clsA3.getClassLoader();
            }
        } catch (Exception e10) {
            throw new a(e10.toString(), e10);
        }
    }

    private static Object f(String str, ClassLoader classLoader) {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e10) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new a(stringBuffer.toString(), e10);
        } catch (Exception e11) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e11);
            throw new a(stringBuffer2.toString(), e11);
        }
    }
}
