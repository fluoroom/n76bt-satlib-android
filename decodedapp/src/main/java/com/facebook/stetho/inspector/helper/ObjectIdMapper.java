package com.facebook.stetho.inspector.helper;

import android.util.SparseArray;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ObjectIdMapper {
    protected final Object mSync = new Object();
    private int mNextId = 1;
    private final Map<Object, Integer> mObjectToIdMap = new IdentityHashMap();
    private SparseArray<Object> mIdToObjectMap = new SparseArray<>();

    public void clear() {
        SparseArray<Object> sparseArray;
        synchronized (this.mSync) {
            sparseArray = this.mIdToObjectMap;
            this.mObjectToIdMap.clear();
            this.mIdToObjectMap = new SparseArray<>();
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            onUnmapped(sparseArray.valueAt(i10), sparseArray.keyAt(i10));
        }
    }

    public boolean containsId(int i10) {
        boolean z10;
        synchronized (this.mSync) {
            z10 = this.mIdToObjectMap.get(i10) != null;
        }
        return z10;
    }

    public boolean containsObject(Object obj) {
        boolean zContainsKey;
        synchronized (this.mSync) {
            zContainsKey = this.mObjectToIdMap.containsKey(obj);
        }
        return zContainsKey;
    }

    public Integer getIdForObject(Object obj) {
        Integer num;
        synchronized (this.mSync) {
            num = this.mObjectToIdMap.get(obj);
        }
        return num;
    }

    public Object getObjectForId(int i10) {
        Object obj;
        synchronized (this.mSync) {
            obj = this.mIdToObjectMap.get(i10);
        }
        return obj;
    }

    protected void onMapped(Object obj, int i10) {
    }

    protected void onUnmapped(Object obj, int i10) {
    }

    public int putObject(Object obj) {
        synchronized (this.mSync) {
            try {
                Integer num = this.mObjectToIdMap.get(obj);
                if (num != null) {
                    return num.intValue();
                }
                int i10 = this.mNextId;
                this.mNextId = i10 + 1;
                this.mObjectToIdMap.put(obj, Integer.valueOf(i10));
                this.mIdToObjectMap.put(i10, obj);
                onMapped(obj, i10);
                return i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Integer removeObject(Object obj) {
        synchronized (this.mSync) {
            try {
                Integer numRemove = this.mObjectToIdMap.remove(obj);
                if (numRemove == null) {
                    return null;
                }
                this.mIdToObjectMap.remove(numRemove.intValue());
                onUnmapped(obj, numRemove.intValue());
                return numRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object removeObjectById(int i10) {
        synchronized (this.mSync) {
            try {
                Object obj = this.mIdToObjectMap.get(i10);
                if (obj == null) {
                    return null;
                }
                this.mIdToObjectMap.remove(i10);
                this.mObjectToIdMap.remove(obj);
                onUnmapped(obj, i10);
                return obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int size() {
        int size;
        synchronized (this.mSync) {
            size = this.mObjectToIdMap.size();
        }
        return size;
    }
}
