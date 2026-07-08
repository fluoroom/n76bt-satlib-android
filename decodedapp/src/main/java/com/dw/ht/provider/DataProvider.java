package com.dw.ht.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import g4.f;

/* JADX INFO: loaded from: classes.dex */
public class DataProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UriMatcher f6652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f6653c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f6654a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f6656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f6657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Uri f6658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f6659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f6660f;

        public a(Uri uri) {
            this(uri, null, false);
        }

        public String b(String str) {
            f fVar = new f(str);
            if (fVar.o()) {
                this.f6660f = fVar.m();
                fVar.i();
            }
            if (this.f6659e != null) {
                fVar.h(new f("_id=" + this.f6659e));
            }
            return fVar.n();
        }

        public a(Uri uri, String[] strArr, boolean z10) {
            this.f6658d = uri;
            int iMatch = DataProvider.f6652b.match(uri);
            this.f6655a = iMatch;
            switch (iMatch) {
                case 2:
                    this.f6659e = uri.getLastPathSegment();
                case 1:
                    this.f6657c = "date";
                    this.f6656b = "sessions";
                    return;
                case 4:
                    this.f6659e = uri.getLastPathSegment();
                case 3:
                    this.f6657c = "_id";
                    this.f6656b = "channels";
                    return;
                case 6:
                    this.f6659e = uri.getLastPathSegment();
                case 5:
                    this.f6657c = "title,_id";
                    this.f6656b = "regions";
                    return;
                case 8:
                    this.f6659e = uri.getLastPathSegment();
                case 7:
                    this.f6657c = "date";
                    this.f6656b = "location_map";
                    return;
                case 10:
                    this.f6659e = uri.getLastPathSegment();
                case 9:
                    this.f6657c = "_id";
                    this.f6656b = "users";
                    return;
                default:
                    throw new IllegalArgumentException("Unknown URI " + uri);
            }
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6652b = uriMatcher;
        String str = com.dw.ht.provider.a.f6662b;
        uriMatcher.addURI(str, "sessions", 1);
        uriMatcher.addURI(str, "sessions/#", 2);
        uriMatcher.addURI(str, "location_map", 7);
        uriMatcher.addURI(str, "location_map/#", 8);
        uriMatcher.addURI(str, "channels", 3);
        uriMatcher.addURI(str, "channels/#", 4);
        uriMatcher.addURI(str, "regions", 5);
        uriMatcher.addURI(str, "regions/#", 6);
        uriMatcher.addURI(str, "users", 9);
        uriMatcher.addURI(str, "users/#", 10);
    }

    private void b(a aVar, Uri uri) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        context.getContentResolver().notifyChange(uri, null);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.f6654a.getWritableDatabase();
        a aVar = new a(uri);
        String strB = aVar.b(str);
        if (TextUtils.isEmpty(strB)) {
            strB = "1";
        }
        int iDelete = writableDatabase.delete(aVar.f6656b, strB, strArr);
        if (iDelete > 0) {
            b(aVar, uri);
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = f6652b.match(uri);
        if (iMatch == 1) {
            return "vnd.android.cursor.dir/vnd.benshikj.ht.data.sessions";
        }
        if (iMatch == 2) {
            return "vnd.android.cursor.item/vnd.benshikj.ht.data.sessions";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        a aVar = new a(uri);
        long jInsert = this.f6654a.getWritableDatabase().insert(aVar.f6656b, null, contentValues);
        if (jInsert > 0) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(uri, jInsert);
            b(aVar, uriWithAppendedId);
            return uriWithAppendedId;
        }
        throw new SQLException("Failed to insert row into " + uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f6654a = new b(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        a aVar = new a(uri, strArr, true);
        String strB = aVar.b(str);
        String queryParameter = uri.getQueryParameter("GROUP_BY");
        if (aVar.f6660f != null) {
            if (queryParameter == null) {
                queryParameter = aVar.f6660f;
            } else {
                queryParameter = queryParameter + "," + aVar.f6660f;
            }
        }
        String str3 = queryParameter;
        String queryParameter2 = uri.getQueryParameter("PRE_SORT");
        if (queryParameter2 == null) {
            sQLiteQueryBuilder.setTables(aVar.f6656b);
        } else {
            sQLiteQueryBuilder.setTables("(SELECT * FROM " + aVar.f6656b + " ORDER BY " + queryParameter2 + ")");
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = aVar.f6657c;
        }
        try {
            Cursor cursorQuery = sQLiteQueryBuilder.query(this.f6654a.getReadableDatabase(), strArr, strB, strArr2, str3, null, str2, uri.getQueryParameter("LIMIT"));
            cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
            return cursorQuery;
        } catch (SQLiteException e10) {
            String message = e10.getMessage();
            if (!message.startsWith("Can't upgrade read-only database") && !message.startsWith("unable to open database file")) {
                throw e10;
            }
            f6653c = true;
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            b(null, uri);
            return 0;
        }
        SQLiteDatabase writableDatabase = this.f6654a.getWritableDatabase();
        a aVar = new a(uri);
        int iUpdate = writableDatabase.update(aVar.f6656b, contentValues, aVar.b(str), strArr);
        if (iUpdate > 0) {
            b(aVar, uri);
        }
        return iUpdate;
    }
}
