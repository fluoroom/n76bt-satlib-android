package com.facebook.stetho.dumpapp;

import ci.h;
import ci.k;

/* JADX INFO: loaded from: classes.dex */
public class GlobalOptions {
    public final h optionHelp;
    public final h optionListPlugins;
    public final h optionProcess;
    public final k options;

    public GlobalOptions() {
        h hVar = new h("h", "help", false, "Print this help");
        this.optionHelp = hVar;
        h hVar2 = new h("l", "list", false, "List available plugins");
        this.optionListPlugins = hVar2;
        h hVar3 = new h("p", "process", true, "Specify target process");
        this.optionProcess = hVar3;
        k kVar = new k();
        this.options = kVar;
        kVar.a(hVar);
        kVar.a(hVar2);
        kVar.a(hVar3);
    }
}
