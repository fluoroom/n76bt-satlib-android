package com.facebook.stetho.dumpapp;

import ci.a;
import ci.b;
import ci.c;
import ci.e;
import ci.l;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Dumper {
    private final Map<String, DumperPlugin> mDumperPlugins;
    private final GlobalOptions mGlobalOptions;
    private final b mParser;

    public Dumper(Iterable<DumperPlugin> iterable) {
        this(iterable, new c());
    }

    private int doDump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) throws DumpException, l {
        a aVarA = this.mParser.a(this.mGlobalOptions.options, strArr, true);
        if (aVarA.d(this.mGlobalOptions.optionHelp.j())) {
            dumpUsage(printStream);
            return 0;
        }
        if (aVarA.d(this.mGlobalOptions.optionListPlugins.j())) {
            dumpAvailablePlugins(printStream);
            return 0;
        }
        if (aVarA.c().isEmpty()) {
            dumpUsage(printStream2);
            return 1;
        }
        dumpPluginOutput(inputStream, printStream, printStream2, aVarA);
        return 0;
    }

    private void dumpAvailablePlugins(PrintStream printStream) {
        ArrayList arrayList = new ArrayList();
        Iterator<DumperPlugin> it = this.mDumperPlugins.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        Collections.sort(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            printStream.println((String) it2.next());
        }
    }

    private void dumpPluginOutput(InputStream inputStream, PrintStream printStream, PrintStream printStream2, a aVar) throws DumpException {
        ArrayList arrayList = new ArrayList(aVar.c());
        if (arrayList.size() < 1) {
            throw new DumpException("Expected plugin argument");
        }
        String str = (String) arrayList.remove(0);
        DumperPlugin dumperPlugin = this.mDumperPlugins.get(str);
        if (dumperPlugin != null) {
            dumperPlugin.dump(new DumperContext(inputStream, printStream, printStream2, this.mParser, arrayList));
            return;
        }
        throw new DumpException("No plugin named '" + str + "'");
    }

    private void dumpUsage(PrintStream printStream) {
        e eVar = new e();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            eVar.g(printWriter, eVar.f(), this.mGlobalOptions.options, eVar.d(), eVar.c());
        } finally {
            printWriter.flush();
        }
    }

    private static Map<String, DumperPlugin> generatePluginMap(Iterable<DumperPlugin> iterable) {
        HashMap map = new HashMap();
        for (DumperPlugin dumperPlugin : iterable) {
            map.put(dumperPlugin.getName(), dumperPlugin);
        }
        return DesugarCollections.unmodifiableMap(map);
    }

    public int dump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) {
        try {
            return doDump(inputStream, printStream, printStream2, strArr);
        } catch (l e10) {
            printStream2.println(e10.getMessage());
            dumpUsage(printStream2);
            return 1;
        } catch (DumpException e11) {
            printStream2.println(e11.getMessage());
            return 1;
        } catch (DumpappOutputBrokenException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e13.printStackTrace(printStream2);
            return 1;
        }
    }

    public Dumper(Iterable<DumperPlugin> iterable, b bVar) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = bVar;
        this.mGlobalOptions = new GlobalOptions();
    }
}
