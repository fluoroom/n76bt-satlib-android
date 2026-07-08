package ui;

import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes3.dex */
public class i extends ResourceBundle.Control {
    @Override // java.util.ResourceBundle.Control
    public ResourceBundle newBundle(String str, Locale locale, String str2, ClassLoader classLoader, boolean z10) throws IOException {
        InputStream resourceAsStream;
        URLConnection uRLConnectionOpenConnection;
        String resourceName = toResourceName(toBundleName(str, locale), "utf8");
        if (z10) {
            URL resource = classLoader.getResource(resourceName);
            if (resource == null || (uRLConnectionOpenConnection = resource.openConnection()) == null) {
                resourceAsStream = null;
            } else {
                uRLConnectionOpenConnection.setUseCaches(false);
                resourceAsStream = uRLConnectionOpenConnection.getInputStream();
            }
        } else {
            resourceAsStream = classLoader.getResourceAsStream(resourceName);
        }
        if (resourceAsStream == null) {
            return null;
        }
        try {
            return new PropertyResourceBundle(new InputStreamReader(resourceAsStream, Utf8Charset.NAME));
        } finally {
            resourceAsStream.close();
        }
    }
}
