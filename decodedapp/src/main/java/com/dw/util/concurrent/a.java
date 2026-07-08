package com.dw.util.concurrent;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f6901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ArrayList f6902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f6903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f6904d;

    /* JADX INFO: renamed from: com.dw.util.concurrent.a$a, reason: collision with other inner class name */
    public interface InterfaceC0105a {
        void i(a aVar);
    }

    public a(String str) {
        this(str, null);
    }

    public void addOnStopListener(InterfaceC0105a interfaceC0105a) {
        synchronized (this.f6903c) {
            try {
                if (!this.f6901a) {
                    if (this.f6902b == null) {
                        this.f6902b = new ArrayList();
                    }
                    if (this.f6902b.contains(interfaceC0105a)) {
                        throw new IllegalArgumentException("已经包含此监听器");
                    }
                    this.f6902b.add(interfaceC0105a);
                    interfaceC0105a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC0105a != null) {
            interfaceC0105a.i(this);
        }
    }

    public final void cancel() {
        interrupt();
    }

    protected abstract void doInBackground();

    public Object getTag() {
        return this.f6904d;
    }

    @Override // java.lang.Thread
    public void interrupt() {
        this.f6901a = true;
        onCancel();
        super.interrupt();
    }

    public final boolean isCancelled() {
        return this.f6901a;
    }

    protected void onCancel() {
    }

    protected boolean onInit() {
        return true;
    }

    protected void onStop() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        try {
            if (!onInit()) {
                this.f6901a = true;
                synchronized (this.f6903c) {
                    arrayList2 = this.f6902b;
                }
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC0105a) it.next()).i(this);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
                onStop();
                return;
            }
            doInBackground();
            this.f6901a = true;
            synchronized (this.f6903c) {
                arrayList = this.f6902b;
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC0105a) it2.next()).i(this);
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
            }
        } catch (InterruptedException unused) {
            this.f6901a = true;
            synchronized (this.f6903c) {
                ArrayList arrayList3 = this.f6902b;
                if (arrayList3 != null) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((InterfaceC0105a) it3.next()).i(this);
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            this.f6901a = true;
            synchronized (this.f6903c) {
                ArrayList arrayList4 = this.f6902b;
                if (arrayList4 != null) {
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((InterfaceC0105a) it4.next()).i(this);
                        } catch (Throwable th6) {
                            th6.printStackTrace();
                        }
                    }
                }
                onStop();
                throw th5;
            }
        }
        onStop();
    }

    public void setTag(Object obj) {
        this.f6904d = obj;
    }

    public a(String str, Object obj) {
        super(str);
        this.f6901a = false;
        this.f6903c = new Object();
        this.f6904d = obj;
    }
}
