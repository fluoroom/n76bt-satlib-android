package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.database.SQLiteDatabaseCompat;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDatabaseConnectionProvider implements DatabaseConnectionProvider {
    @SQLiteDatabaseCompat.SQLiteOpenOptions
    protected int determineOpenOptions(File file) {
        String parent = file.getParent();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getName());
        sb2.append("-wal");
        return new File(parent, sb2.toString()).exists() ? 1 : 0;
    }

    @Override // com.facebook.stetho.inspector.database.DatabaseConnectionProvider
    public SQLiteDatabase openDatabase(File file) throws SQLiteException {
        return performOpen(file, determineOpenOptions(file));
    }

    protected SQLiteDatabase performOpen(File file, @SQLiteDatabaseCompat.SQLiteOpenOptions int i10) {
        SQLiteDatabaseCompat sQLiteDatabaseCompat = SQLiteDatabaseCompat.getInstance();
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, sQLiteDatabaseCompat.provideOpenFlags(i10));
        sQLiteDatabaseCompat.enableFeatures(i10, sQLiteDatabaseOpenDatabase);
        return sQLiteDatabaseOpenDatabase;
    }
}
