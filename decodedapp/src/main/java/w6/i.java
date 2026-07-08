package w6;

import e6.m;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import u6.g0;

/* JADX INFO: loaded from: classes.dex */
public class i extends g0 {

    /* JADX INFO: renamed from: e */
    private static final boolean f31320e;

    static {
        File[] fileArrListRoots = File.listRoots();
        int length = fileArrListRoots.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String path = fileArrListRoots[i10].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z10 = true;
                break;
            }
            i10++;
        }
        f31320e = z10;
    }

    public i() {
        super(b.a());
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1 */
    public Path e(e6.j jVar, p6.h hVar) {
        if (!jVar.N0(m.VALUE_STRING)) {
            return f.a(hVar.s0(b.a(), jVar));
        }
        String strC0 = jVar.C0();
        if (strC0.indexOf(58) < 0) {
            return Paths.get(strC0, new String[0]);
        }
        if (f31320e && strC0.length() >= 2 && Character.isLetter(strC0.charAt(0)) && strC0.charAt(1) == ':') {
            return Paths.get(strC0, new String[0]);
        }
        try {
            URI uri = new URI(strC0);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e10) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(g.a()).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProviderA = h.a(it.next());
                        if (fileSystemProviderA.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProviderA.getPath(uri);
                        }
                    }
                    return f.a(hVar.l0(p(), strC0, e10));
                } catch (ServiceConfigurationError e11) {
                    e11.addSuppressed(e10);
                    return f.a(hVar.l0(p(), strC0, e11));
                }
            } catch (Exception e12) {
                return f.a(hVar.l0(p(), strC0, e12));
            }
        } catch (URISyntaxException e13) {
            return f.a(hVar.l0(p(), strC0, e13));
        }
    }
}
