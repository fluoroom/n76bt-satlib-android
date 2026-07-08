package com.facebook.stetho.dumpapp;

import ci.b;
import com.facebook.stetho.common.Util;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DumperContext {
    private final List<String> mArgs;
    private final b mParser;
    private final PrintStream mStderr;
    private final InputStream mStdin;
    private final PrintStream mStdout;

    protected DumperContext(DumperContext dumperContext, List<String> list) {
        this(dumperContext.getStdin(), dumperContext.getStdout(), dumperContext.getStderr(), dumperContext.getParser(), list);
    }

    public List<String> getArgsAsList() {
        return this.mArgs;
    }

    public b getParser() {
        return this.mParser;
    }

    public PrintStream getStderr() {
        return this.mStderr;
    }

    public InputStream getStdin() {
        return this.mStdin;
    }

    public PrintStream getStdout() {
        return this.mStdout;
    }

    public DumperContext(InputStream inputStream, PrintStream printStream, PrintStream printStream2, b bVar, List<String> list) {
        this.mStdin = (InputStream) Util.throwIfNull(inputStream);
        this.mStdout = (PrintStream) Util.throwIfNull(printStream);
        this.mStderr = (PrintStream) Util.throwIfNull(printStream2);
        this.mParser = (b) Util.throwIfNull(bVar);
        this.mArgs = (List) Util.throwIfNull(list);
    }
}
