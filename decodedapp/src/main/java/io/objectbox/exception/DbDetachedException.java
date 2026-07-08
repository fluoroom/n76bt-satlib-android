package io.objectbox.exception;

/* JADX INFO: loaded from: classes3.dex */
public class DbDetachedException extends DbException {
    public DbDetachedException() {
        this("Entity must be attached to a Box.");
    }

    public DbDetachedException(String str) {
        super(str);
    }
}
