package com.dw.ht.map.ui;

import a6.k;
import a6.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import c5.b0;
import c5.x;
import c6.q;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import com.dw.ht.map.ui.GMapFragment;
import com.dw.ht.map.ui.a;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import d5.l;
import dd.d0;
import ea.c;
import ha.c;
import ha.e;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o5.g;
import o8.c;
import o8.d;
import o8.f;
import o8.j;
import org.greenrobot.eventbus.ThreadMode;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParserException;
import q8.i;
import q8.n;
import q8.w;
import q8.y;
import q8.z;
import s3.c;
import z4.h;
import z4.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0002º\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002ù\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u001b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J!\u0010:\u001a\u00020\u00062\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0005J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\u0005J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ1\u0010H\u001a\u00020\u00062\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\b\u0012\u0004\u0012\u00020D`E2\b\u0010G\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bH\u0010IJ'\u0010L\u001a\u00020\u00062\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020J0Cj\b\u0012\u0004\u0012\u00020J`EH\u0016¢\u0006\u0004\bL\u0010MJ\u001d\u0010Q\u001a\u00020\u00062\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0NH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010\u0005J\u000f\u0010T\u001a\u00020\u0006H\u0016¢\u0006\u0004\bT\u0010\u0005J\u0017\u0010W\u001a\u00020\u00062\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bY\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010a\u001a\b\u0018\u00010^R\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010l\u001a\b\u0018\u00010iR\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR*\u0010o\u001a\u0016\u0012\u0004\u0012\u00020D\u0018\u00010Cj\n\u0012\u0004\u0012\u00020D\u0018\u0001`E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010@\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010}\u001a\u00020w8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0087\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0080\u0001R\u0019\u0010\u0089\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0080\u0001R,\u0010.\u001a\u0004\u0018\u00010-2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010-8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b\u0017\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\"\u0010\u0093\u0001\u001a\u000b\u0012\u0004\u0012\u00020D\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010\u0097\u0001\u001a\u00020?2\u0007\u0010\u008a\u0001\u001a\u00020?8\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0005\b\u0096\u0001\u0010BR)\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u008a\u0001\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0005\b\u009a\u0001\u0010\u0011R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\"\u0010¤\u0001\u001a\r ¡\u0001*\u0005\u0018\u00010 \u00010 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R/\u0010©\u0001\u001a\u0005\u0018\u00010¥\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0005\b\u001c\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010¬\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bW\u0010\u0095\u0001R \u0010±\u0001\u001a\t\u0018\u00010®\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R4\u0010¹\u0001\u001a\u00030²\u00012\b\u0010\u008a\u0001\u001a\u00030²\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010½\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R/\u0010Â\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010¾\u00018\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0005\b{\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u0010vR(\u0010Ç\u0001\u001a\u0014\u0012\u0005\u0012\u00030Å\u00010Cj\t\u0012\u0005\u0012\u00030Å\u0001`E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÆ\u0001\u0010nR*\u0010Ê\u0001\u001a\u0014\u0012\u0005\u0012\u00030È\u00010Cj\t\u0012\u0005\u0012\u00030È\u0001`E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÉ\u0001\u0010nR*\u0010Ì\u0001\u001a\u0014\u0012\u0005\u0012\u00030¾\u00010Cj\t\u0012\u0005\u0012\u00030¾\u0001`E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bË\u0001\u0010nR3\u0010Ò\u0001\u001a\u00030Í\u00012\b\u0010\u008a\u0001\u001a\u00030Í\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b·\u0001\u0010Î\u0001\u001a\u0005\bq\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u001c\u0010Ö\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u001c\u0010Ú\u0001\u001a\u0005\u0018\u00010×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Ü\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÛ\u0001\u0010vR*\u0010ß\u0001\u001a\u0014\u0012\u0005\u0012\u00030Ý\u00010Cj\t\u0012\u0005\u0012\u00030Ý\u0001`E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÞ\u0001\u0010nR(\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\b\u0086\u0001\u0010ä\u0001R8\u0010ì\u0001\u001a\u0005\u0018\u00010å\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010å\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R\u0017\u0010ï\u0001\u001a\u0002028BX\u0082\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010î\u0001R\u0019\u0010ò\u0001\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001R(\u00103\u001a\u0002022\u0007\u0010\u008a\u0001\u001a\u0002028V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b¢\u0001\u0010î\u0001\"\u0005\bu\u0010ó\u0001R\u001a\u0010õ\u0001\u001a\u0005\u0018\u00010å\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010é\u0001R\u0017\u0010ø\u0001\u001a\u00020t8VX\u0096\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001¨\u0006ú\u0001"}, d2 = {"Lcom/dw/ht/map/ui/GMapFragment;", "Lo8/j;", "Lo8/f;", "Lcom/dw/ht/map/ui/a;", "<init>", "()V", "Ldd/d0;", "T4", "Lo8/a;", "update", "w4", "(Lo8/a;)V", "z4", "x4", "", "coordinatesChanged", "U4", "(Z)V", "M4", "L4", "y4", "Lcom/dw/ht/map/ui/a$a;", "callback", "C0", "(Lcom/dw/ht/map/ui/a$a;)V", "Landroid/graphics/Point;", "point", "Lcom/google/android/gms/maps/model/LatLng;", "J0", "(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "M2", "Lz4/h$b;", "event", "onMessageEvent", "(Lz4/h$b;)V", "O2", "P2", "Lo8/c;", "map", "E", "(Lo8/c;)V", "location", "", "zoom", "H", "(Lcom/google/android/gms/maps/model/LatLng;F)V", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "Landroid/graphics/Rect;", "padding", "G", "(Lcom/google/android/gms/maps/model/LatLngBounds;Landroid/graphics/Rect;)V", "O", "x0", "r0", "", Name.MARK, "z", "(J)V", "Ljava/util/ArrayList;", "Lc5/b0;", "Lkotlin/collections/ArrayList;", "list", "followingId", "n", "(Ljava/util/ArrayList;Ljava/lang/Long;)V", "Ld5/h;", "tracks", "m", "(Ljava/util/ArrayList;)V", "", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem;", "items", "d0", "(Ljava/util/List;)V", "y2", "w2", "Lc5/y;", "status", "L0", "(Lc5/y;)V", "R", "Lha/e;", "p0", "Lha/e;", "polylineManager", "Lha/e$a;", "q0", "Lha/e$a;", "destinationDistancePolylineCollection", "Lha/d;", "Lha/d;", "polygonManager", "Lha/c;", "s0", "Lha/c;", "markerManager", "Lha/c$a;", "t0", "Lha/c$a;", "destinationDistanceMarkerCollection", "u0", "Ljava/util/ArrayList;", "overlaysList", "Lq8/w;", "v0", "Lq8/w;", "tileOverlay", "", "w0", "I", "", "D", "getMinZoomLevel", "()D", "P0", "(D)V", "minZoomLevel", "Lp5/b;", "y0", "Lp5/b;", "mapOverlay", "Lp5/a;", "z0", "Lp5/a;", "clusterOverlay", "A0", "mapPicOverlay", "B0", "mapOverlayDistance", "value", "Lo8/c;", "t4", "()Lo8/c;", "D0", "Lcom/dw/ht/map/ui/a$a;", "Lea/c;", "E0", "Lea/c;", "clusterManager", "F0", "J", "H4", "focusedId", "G0", "Z", "I4", "followingFocusedId", "Ln8/b;", "H0", "Ln8/b;", "fusedLocationProviderClient", "Lz4/m;", "kotlin.jvm.PlatformType", "I0", "Lz4/m;", "mapUtils", "Lo8/d$a;", "Lo8/d$a;", "J4", "(Lo8/d$a;)V", "mOnLocationChangedListener", "K0", "F", "zoomTo", "lastZoomTo", "Lcom/dw/ht/map/ui/GMapFragment$a;", "M0", "Lcom/dw/ht/map/ui/GMapFragment$a;", "pendingCameraUpdate", "Lc5/x;", "N0", "Lc5/x;", "s4", "()Lc5/x;", "U0", "(Lc5/x;)V", "locationMode", "com/dw/ht/map/ui/GMapFragment$c", "O0", "Lcom/dw/ht/map/ui/GMapFragment$c;", "locationCallback", "Lq8/i;", "Lq8/i;", "K4", "(Lq8/i;)V", "selectedMarker", "Q0", "focusedMarkerZIndex", "Lq8/n;", "R0", "polylines", "Lq8/l;", "S0", "polygons", "T0", "markers", "Lz4/j;", "Lz4/j;", "()Lz4/j;", "setMapLayer", "(Lz4/j;)V", "mapLayer", "Lq8/y;", "V0", "Lq8/y;", "tileProvider", "Lkc/b;", "W0", "Lkc/b;", "updateKmlTask", "X0", "mKmlLayerVer", "Lka/f;", "Y0", "mKmlLayers", "Z0", "Landroid/graphics/Rect;", "u4", "()Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)V", "Landroid/location/Location;", "a1", "Landroid/location/Location;", "r4", "()Landroid/location/Location;", "P", "(Landroid/location/Location;)V", "destinationLocation", "v4", "()F", "scalePerPixel", "l", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "visibleRegion", "(F)V", "o", "center", "p", "()I", "tileLastSize", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GMapFragment extends j implements f, com.dw.ht.map.ui.a {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private p5.b mapPicOverlay;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private p5.b mapOverlayDistance;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private o8.c map;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private a.InterfaceC0095a callback;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private ea.c clusterManager;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private long focusedId;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private boolean followingFocusedId;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private n8.b fusedLocationProviderClient;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private final m mapUtils;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private d.a mOnLocationChangedListener;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private float zoomTo;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private long lastZoomTo;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private a pendingCameraUpdate;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private x locationMode;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private final c locationCallback;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private i selectedMarker;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private int focusedMarkerZIndex;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private final ArrayList polylines;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private ArrayList polygons;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private ArrayList markers;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private z4.j mapLayer;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private y tileProvider;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private kc.b updateKmlTask;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private int mKmlLayerVer;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private ArrayList mKmlLayers;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private Rect padding;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    private Location destinationLocation;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private ha.e polylineManager;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private e.a destinationDistancePolylineCollection;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private ha.d polygonManager;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private ha.c markerManager;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private c.a destinationDistanceMarkerCollection;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private ArrayList overlaysList;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private w tileOverlay;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    private final int org.simpleframework.xml.strategy.Name.MARK java.lang.String;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    private double minZoomLevel;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    private p5.b mapOverlay;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private p5.a clusterOverlay;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6613a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6614b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f6615c;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.ItemsChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6613a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.FOLLOWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[x.LOCATION_ROTATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[x.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[x.DISABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            f6614b = iArr2;
            int[] iArr3 = new int[z4.j.values().length];
            try {
                iArr3[z4.j.f32940d.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[z4.j.f32939c.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f6615c = iArr3;
        }
    }

    public static final class c extends n8.d {
        c() {
        }

        @Override // n8.d
        public void b(LocationResult locationResult) {
            Location locationE;
            o8.c map;
            rd.m.e(locationResult, "r");
            Location locationC = locationResult.c();
            if (locationC == null || (locationE = g.a.e(g.f23195s, locationC, null, 2, null)) == null) {
                return;
            }
            LatLng latLngI = GMapFragment.this.mapUtils.i(locationE);
            if (GMapFragment.this.mOnLocationChangedListener != null) {
                Location location = new Location(locationE);
                location.setLongitude(latLngI.f7321b);
                location.setLatitude(latLngI.f7320a);
                d.a aVar = GMapFragment.this.mOnLocationChangedListener;
                if (aVar != null) {
                    aVar.onLocationChanged(location);
                }
            }
            if (GMapFragment.this.getLocationMode() != x.FOLLOWING || (map = GMapFragment.this.getMap()) == null) {
                return;
            }
            map.f(o8.b.b(new LatLng(latLngI.f7320a, latLngI.f7321b)));
        }
    }

    public static final class d extends ga.h {

        /* JADX INFO: renamed from: u */
        final /* synthetic */ GMapFragment f6617u;

        public static final class a implements c.d {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ i f6618a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ b0 f6619b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ GMapFragment f6620c;

            a(i iVar, b0 b0Var, GMapFragment gMapFragment) {
                this.f6618a = iVar;
                this.f6619b = b0Var;
                this.f6620c = gMapFragment;
            }

            @Override // s3.c.d
            /* JADX INFO: renamed from: b */
            public void a(Bitmap bitmap) {
                if (bitmap != null && this.f6618a.f()) {
                    this.f6619b.r(bitmap, true);
                    p5.b bVar = this.f6620c.mapPicOverlay;
                    p5.b bVar2 = null;
                    if (bVar == null) {
                        rd.m.o("mapPicOverlay");
                        bVar = null;
                    }
                    bVar.d(this.f6619b);
                    try {
                        i iVar = this.f6618a;
                        p5.b bVar3 = this.f6620c.mapPicOverlay;
                        if (bVar3 == null) {
                            rd.m.o("mapPicOverlay");
                        } else {
                            bVar2 = bVar3;
                        }
                        iVar.h(q8.c.b(q.b(bVar2)));
                    } catch (IllegalArgumentException e10) {
                        s3.b.c("GMapFragment", "setIcon", e10);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o8.c cVar, ea.c cVar2, GMapFragment gMapFragment, Context context) {
            super(context, cVar, cVar2);
            this.f6617u = gMapFragment;
        }

        @Override // ga.h
        protected boolean d0(ea.a aVar) {
            rd.m.e(aVar, "cluster");
            return aVar.a() >= 8;
        }

        @Override // ga.h
        /* JADX INFO: renamed from: e0 */
        public void W(b0 b0Var, q8.j jVar) {
            float fN;
            rd.m.e(b0Var, "overlay");
            rd.m.e(jVar, "markerOptions");
            q8.j jVarW = jVar.w(b0Var.getTitle());
            if (b0Var.f() == this.f6617u.focusedId) {
                this.f6617u.focusedMarkerZIndex++;
                fN = this.f6617u.focusedMarkerZIndex;
            } else {
                fN = b0Var.n();
            }
            jVarW.x(fN);
            View view = null;
            if (b0Var.o()) {
                p5.a aVar = this.f6617u.clusterOverlay;
                if (aVar == null) {
                    rd.m.o("clusterOverlay");
                    aVar = null;
                }
                aVar.c(b0Var);
                p5.a aVar2 = this.f6617u.clusterOverlay;
                if (aVar2 == null) {
                    rd.m.o("clusterOverlay");
                } else {
                    view = aVar2;
                }
                rd.m.b(jVar.p(q8.c.b(q.b(view))).b(0.5f, 0.5f).c(true));
                return;
            }
            if (b0Var.p()) {
                p5.b bVar = this.f6617u.mapPicOverlay;
                if (bVar == null) {
                    rd.m.o("mapPicOverlay");
                    bVar = null;
                }
                bVar.d(b0Var);
                p5.b bVar2 = this.f6617u.mapPicOverlay;
                if (bVar2 == null) {
                    rd.m.o("mapPicOverlay");
                } else {
                    view = bVar2;
                }
                rd.m.b(jVar.p(q8.c.b(q.b(view))));
                return;
            }
            p5.b bVar3 = this.f6617u.mapOverlay;
            if (bVar3 == null) {
                rd.m.o("mapOverlay");
                bVar3 = null;
            }
            bVar3.d(b0Var);
            try {
                p5.b bVar4 = this.f6617u.mapOverlay;
                if (bVar4 == null) {
                    rd.m.o("mapOverlay");
                } else {
                    view = bVar4;
                }
                rd.m.b(jVar.p(q8.c.b(q.b(view))));
            } catch (RuntimeException e10) {
                s3.b.c("GMapFragment", "icon", e10);
            }
        }

        @Override // ga.h
        /* JADX INFO: renamed from: f0 */
        public void Y(b0 b0Var, i iVar) {
            rd.m.e(b0Var, "overlay");
            rd.m.e(iVar, "marker");
            if (b0Var.o() || b0Var.m() == 0 || b0Var.e() != null) {
                return;
            }
            l.g().h(b0Var.m(), new a(iVar, b0Var, this.f6617u));
        }

        @Override // ga.h
        /* JADX INFO: renamed from: g0 */
        public void Z(b0 b0Var, i iVar) {
            float fN;
            rd.m.e(b0Var, "overlay");
            rd.m.e(iVar, "marker");
            super.Z(b0Var, iVar);
            if (b0Var.f() == this.f6617u.focusedId) {
                this.f6617u.focusedMarkerZIndex++;
                fN = this.f6617u.focusedMarkerZIndex;
            } else {
                fN = b0Var.n();
            }
            iVar.m(fN);
        }
    }

    public static final class e implements o8.d {
        e() {
        }

        @Override // o8.d
        public void a(d.a aVar) {
            rd.m.e(aVar, "listener");
            GMapFragment.this.J4(aVar);
            g.a aVar2 = g.f23195s;
            Context contextK1 = GMapFragment.this.k1();
            rd.m.b(contextK1);
            Location locationB = aVar2.b(contextK1);
            if (locationB != null) {
                aVar.onLocationChanged(locationB);
                GMapFragment.this.L4();
            }
        }

        @Override // o8.d
        public void deactivate() {
            GMapFragment.this.J4(null);
        }
    }

    public GMapFragment() {
        int i10 = c5.w.f4365a;
        c5.w.f4365a = i10 + 1;
        this.org.simpleframework.xml.strategy.Name.MARK java.lang.String = i10;
        this.minZoomLevel = Double.NaN;
        this.mapUtils = m.b();
        this.locationMode = x.FOLLOWING;
        this.locationCallback = new c();
        this.focusedMarkerZIndex = 1073741823;
        this.polylines = new ArrayList();
        this.polygons = new ArrayList();
        this.markers = new ArrayList();
        this.mapLayer = z4.j.f32938b;
        ArrayList arrayListA = o.a();
        rd.m.d(arrayListA, "newArrayList(...)");
        this.mKmlLayers = arrayListA;
        this.padding = new Rect();
    }

    public static final boolean A4(GMapFragment gMapFragment, i iVar) {
        rd.m.e(iVar, "it");
        gMapFragment.y4();
        return true;
    }

    public static final void B4(GMapFragment gMapFragment, n nVar) {
        rd.m.e(nVar, "it");
        gMapFragment.y4();
    }

    public static final boolean C4(GMapFragment gMapFragment, o8.c cVar, ea.c cVar2, b0 b0Var) {
        if (gMapFragment.getLocationMode().d()) {
            gMapFragment.U0(x.NORMAL);
        }
        gMapFragment.H4(b0Var.f());
        gMapFragment.I4(true);
        cVar.f(o8.b.b(gMapFragment.mapUtils.j(b0Var.d())));
        ga.a aVarL = cVar2.l();
        rd.m.c(aVarL, "null cannot be cast to non-null type com.google.maps.android.clustering.view.DefaultClusterRenderer<com.dw.ht.map.ui.Overlay>");
        gMapFragment.K4(((ga.h) aVarL).M(b0Var));
        a.InterfaceC0095a interfaceC0095a = gMapFragment.callback;
        if (interfaceC0095a != null) {
            interfaceC0095a.G0(b0Var, true);
        }
        return true;
    }

    public static final boolean D4(GMapFragment gMapFragment, o8.c cVar, ea.a aVar) {
        Collection collectionC = aVar.c();
        rd.m.d(collectionC, "getItems(...)");
        LatLng latLngD = ((b0) ed.q.Y(collectionC)).d();
        if (gMapFragment.getLocationMode().d()) {
            gMapFragment.U0(x.NORMAL);
        }
        LatLngBounds latLngBounds = new LatLngBounds(latLngD, latLngD);
        Collection collectionC2 = aVar.c();
        rd.m.d(collectionC2, "getItems(...)");
        Iterator it = collectionC2.iterator();
        while (it.hasNext()) {
            latLngBounds = latLngBounds.f(((b0) it.next()).d());
            rd.m.d(latLngBounds, "including(...)");
        }
        Point pointE = k.e(gMapFragment.x3());
        rd.m.d(pointE, "getScreenSize(...)");
        cVar.f(o8.b.c(latLngBounds, Math.min(pointE.x, pointE.y) / 4));
        return true;
    }

    public static final void E4(GMapFragment gMapFragment) {
        gMapFragment.x4();
        ea.c cVar = gMapFragment.clusterManager;
        if (cVar != null) {
            cVar.a();
        }
    }

    public static final void F4(GMapFragment gMapFragment) {
        gMapFragment.x4();
    }

    public static final void G4(GMapFragment gMapFragment, int i10) {
        if (i10 == 1) {
            if (gMapFragment.getLocationMode() == x.FOLLOWING || gMapFragment.getLocationMode() == x.LOCATION_ROTATE) {
                gMapFragment.U0(x.NORMAL);
            }
            gMapFragment.I4(false);
            a.InterfaceC0095a interfaceC0095a = gMapFragment.callback;
            if (interfaceC0095a != null) {
                interfaceC0095a.b(i10);
            }
        }
    }

    private final void H4(long j10) {
        a.InterfaceC0095a interfaceC0095a;
        if (this.focusedId == j10) {
            return;
        }
        this.focusedId = j10;
        if (j10 != 0 || (interfaceC0095a = this.callback) == null) {
            return;
        }
        interfaceC0095a.G0(null, false);
    }

    private final void I4(boolean z10) {
        a.InterfaceC0095a interfaceC0095a;
        if (this.followingFocusedId == z10) {
            return;
        }
        this.followingFocusedId = z10;
        if (z10 || (interfaceC0095a = this.callback) == null) {
            return;
        }
        interfaceC0095a.G0(null, false);
    }

    public final void J4(d.a aVar) {
        this.mOnLocationChangedListener = aVar;
        z4();
    }

    private final void K4(i iVar) {
        i iVar2 = this.selectedMarker;
        if (iVar2 != null) {
            iVar2.m(-iVar2.d());
        }
        if (iVar != null) {
            int i10 = this.focusedMarkerZIndex + 1;
            this.focusedMarkerZIndex = i10;
            iVar.m(i10);
        } else {
            H4(0L);
        }
        this.selectedMarker = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0120 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:169:0x004c, B:173:0x0060, B:175:0x0068, B:178:0x00c6, B:193:0x0111, B:198:0x0123, B:201:0x012d, B:202:0x0131, B:204:0x013c, B:205:0x013f, B:207:0x015e, B:209:0x0163, B:211:0x0182, B:197:0x0120), top: B:250:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L4() {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.map.ui.GMapFragment.L4():void");
    }

    private final void M4() {
        final o8.c map = getMap();
        if (map == null) {
            return;
        }
        final Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        kc.b bVar = this.updateKmlTask;
        if (bVar == null || bVar == null || bVar.d()) {
            final h hVarI = h.i();
            if (this.mKmlLayerVer == hVarI.j()) {
                return;
            }
            this.mKmlLayerVer = hVarI.j();
            Iterator it = this.mKmlLayers.iterator();
            rd.m.d(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                rd.m.d(next, "next(...)");
                ((ka.f) next).b();
            }
            this.mKmlLayers.clear();
            hc.g gVarE = hc.g.c(hVarI).e(zc.a.b());
            final qd.l lVar = new qd.l() { // from class: c5.t
                @Override // qd.l
                public final Object l(Object obj) {
                    return GMapFragment.N4(hVarI, this, map, contextX3, (z4.h) obj);
                }
            };
            hc.g gVarE2 = gVarE.d(new mc.d() { // from class: c5.u
                @Override // mc.d
                public final Object apply(Object obj) {
                    return GMapFragment.O4(lVar, obj);
                }
            }).e(jc.a.a());
            final qd.l lVar2 = new qd.l() { // from class: c5.v
                @Override // qd.l
                public final Object l(Object obj) {
                    return GMapFragment.P4(this.f4364a, (z4.h) obj);
                }
            };
            mc.c cVar = new mc.c() { // from class: c5.k
                @Override // mc.c
                public final void accept(Object obj) {
                    GMapFragment.Q4(lVar2, obj);
                }
            };
            final qd.l lVar3 = new qd.l() { // from class: c5.l
                @Override // qd.l
                public final Object l(Object obj) {
                    return GMapFragment.R4((Throwable) obj);
                }
            };
            this.updateKmlTask = gVarE2.i(cVar, new mc.c() { // from class: c5.m
                @Override // mc.c
                public final void accept(Object obj) {
                    GMapFragment.S4(lVar3, obj);
                }
            });
        }
    }

    public static final h N4(h hVar, GMapFragment gMapFragment, o8.c cVar, Context context, h hVar2) {
        rd.m.e(hVar2, "it");
        Collection<h.c> collectionH = hVar.h();
        rd.m.d(collectionH, "getAllKmls(...)");
        for (h.c cVar2 : collectionH) {
            if (!cVar2.f()) {
                if (Cfg.f5476a) {
                    s3.b.b("GMapFragment", "start open kml:" + cVar2.e());
                }
                try {
                    gMapFragment.mKmlLayers.add(new ka.f(cVar, new FileInputStream(cVar2.b()), context, gMapFragment.markerManager, gMapFragment.polygonManager, gMapFragment.polylineManager, new ha.a(cVar), null));
                } catch (XmlPullParserException e10) {
                    e10.printStackTrace();
                }
                if (Cfg.f5476a) {
                    s3.b.b("GMapFragment", "end add KmlLayer");
                }
            }
        }
        gMapFragment.updateKmlTask = null;
        return hVar2;
    }

    public static final h O4(qd.l lVar, Object obj) {
        rd.m.e(obj, "p0");
        return (h) lVar.l(obj);
    }

    public static final d0 P4(GMapFragment gMapFragment, h hVar) {
        Iterator it = gMapFragment.mKmlLayers.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            rd.m.d(next, "next(...)");
            ((ka.f) next).d();
        }
        gMapFragment.M4();
        return d0.f10897a;
    }

    public static final void Q4(qd.l lVar, Object obj) {
        lVar.l(obj);
    }

    public static final d0 R4(Throwable th2) {
        th2.printStackTrace();
        return d0.f10897a;
    }

    public static final void S4(qd.l lVar, Object obj) {
        lVar.l(obj);
    }

    private final void T4() {
        o8.c map = getMap();
        if (map == null) {
            return;
        }
        try {
            map.r(true);
            map.k().a(false);
        } catch (SecurityException e10) {
            s3.b.d("Exception: %s", e10.getMessage());
        }
    }

    private final void U4(boolean coordinatesChanged) {
        o8.c map = getMap();
        if (map == null) {
            return;
        }
        w wVar = this.tileOverlay;
        if (wVar != null) {
            wVar.a();
        }
        this.tileOverlay = null;
        z4.e eVar = z4.e.f32898a;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        q8.x xVarA = eVar.a(contextX3, getMapLayer());
        this.tileProvider = xVarA != null ? xVarA.c() : null;
        if (xVarA != null) {
            this.tileOverlay = map.e(xVarA);
        }
        int i10 = b.f6615c[getMapLayer().ordinal()];
        if (i10 == 1) {
            map.q(3);
        } else if (i10 != 2) {
            map.q(1);
        } else {
            map.q(4);
        }
        p5.b bVar = this.mapPicOverlay;
        if (bVar == null) {
            rd.m.o("mapPicOverlay");
            bVar = null;
        }
        bVar.setMapLayer(getMapLayer());
        p5.b bVar2 = this.mapOverlay;
        if (bVar2 == null) {
            rd.m.o("mapOverlay");
            bVar2 = null;
        }
        bVar2.setMapLayer(getMapLayer());
        if (coordinatesChanged) {
            Location locationB = g.f23195s.b(k1());
            if (locationB != null) {
                c cVar = this.locationCallback;
                LocationResult locationResultB = LocationResult.b(ed.q.e(locationB));
                rd.m.d(locationResultB, "create(...)");
                cVar.b(locationResultB);
            }
            L4();
            ArrayList arrayList = this.overlaysList;
            if (arrayList != null) {
                n(arrayList, null);
            }
        }
    }

    private final float v4() {
        View viewT1;
        int width;
        o8.c map = getMap();
        if (map == null || (viewT1 = T1()) == null || (width = viewT1.getWidth()) < 1) {
            return Float.NaN;
        }
        int height = viewT1.getHeight() / 2;
        LatLng latLngA = map.j().a(new Point(0, height));
        rd.m.d(latLngA, "fromScreenLocation(...)");
        LatLng latLngA2 = map.j().a(new Point(width, height));
        rd.m.d(latLngA2, "fromScreenLocation(...)");
        return o5.h.c(latLngA, latLngA2) / width;
    }

    public final void w4(o8.a update) {
        o8.c map = getMap();
        if (map == null) {
            this.pendingCameraUpdate = new a(this, update, null, null, null, null, 30, null);
        } else {
            this.pendingCameraUpdate = null;
            map.l(update);
        }
    }

    private final void x4() {
        o8.c map = getMap();
        if (map == null) {
            return;
        }
        float fV4 = v4();
        if (Float.isNaN(fV4)) {
            return;
        }
        z zVarB = map.j().b();
        rd.m.d(zVarB, "getVisibleRegion(...)");
        LatLngBounds latLngBounds = zVarB.f24492e;
        rd.m.d(latLngBounds, "latLngBounds");
        a.InterfaceC0095a interfaceC0095a = this.callback;
        if (interfaceC0095a != null) {
            LatLng latLngH = this.mapUtils.h(latLngBounds.f7323b);
            rd.m.d(latLngH, "google2gps(...)");
            LatLng latLngH2 = this.mapUtils.h(latLngBounds.f7322a);
            rd.m.d(latLngH2, "google2gps(...)");
            interfaceC0095a.Y(latLngH, latLngH2, fV4);
        }
        L4();
    }

    private final void y4() {
        Location locationB = g.f23195s.b(k1());
        if (locationB == null || getDestinationLocation() == null) {
            return;
        }
        LatLngBounds.a aVarB = LatLngBounds.b().b(this.mapUtils.i(locationB));
        m mVar = this.mapUtils;
        Location destinationLocation = getDestinationLocation();
        rd.m.b(destinationLocation);
        LatLngBounds latLngBoundsA = aVarB.b(mVar.i(destinationLocation)).a();
        rd.m.d(latLngBoundsA, "build(...)");
        p5.b bVar = this.mapPicOverlay;
        p5.b bVar2 = null;
        if (bVar == null) {
            rd.m.o("mapPicOverlay");
            bVar = null;
        }
        int width = bVar.getWidth() / 2;
        p5.b bVar3 = this.mapPicOverlay;
        if (bVar3 == null) {
            rd.m.o("mapPicOverlay");
            bVar3 = null;
        }
        int height = bVar3.getHeight();
        p5.b bVar4 = this.mapPicOverlay;
        if (bVar4 == null) {
            rd.m.o("mapPicOverlay");
        } else {
            bVar2 = bVar4;
        }
        G(latLngBoundsA, new Rect(width, height, bVar2.getWidth() / 2, 0));
    }

    private final void z4() {
        if (getMap() == null || this.fusedLocationProviderClient == null) {
            return;
        }
        s3.b.b("GMapFragment", "removeLocationUpdates(" + this.org.simpleframework.xml.strategy.Name.MARK java.lang.String + ')');
        n8.b bVar = this.fusedLocationProviderClient;
        if (bVar != null) {
            bVar.e(this.locationCallback);
        }
        x locationMode = getLocationMode();
        s3.b.b("GMapFragment", "onLocationModeChanged " + locationMode);
        LocationRequest.a aVar = new LocationRequest.a(2000L);
        if (this.mOnLocationChangedListener == null) {
            locationMode = x.DISABLE;
        }
        a.InterfaceC0095a interfaceC0095a = this.callback;
        if (interfaceC0095a != null) {
            interfaceC0095a.q0(locationMode);
        }
        int i10 = b.f6614b[locationMode.ordinal()];
        if (i10 == 1) {
            aVar.d(1000L);
            aVar.i(1000L);
            aVar.j(100);
            I4(false);
        } else if (i10 == 2) {
            aVar.d(2000L);
            aVar.i(1000L);
            I4(false);
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new dd.o();
            }
            return;
        } else {
            aVar.d(2000L);
            rd.m.b(aVar.i(1000L));
        }
        try {
            n8.b bVar2 = this.fusedLocationProviderClient;
            if (bVar2 != null) {
                bVar2.a(aVar.a(), this.locationCallback, Looper.getMainLooper());
            }
            s3.b.b("GMapFragment", "requestLocationUpdates(" + this.org.simpleframework.xml.strategy.Name.MARK java.lang.String + ')');
        } catch (SecurityException e10) {
            s3.b.e("GMapFragment", "requestLocationUpdates(" + this.org.simpleframework.xml.strategy.Name.MARK java.lang.String + ')', e10);
        }
    }

    @Override // com.dw.ht.map.ui.a
    public void A0(Rect rect) {
        rd.m.e(rect, "<set-?>");
        this.padding = rect;
    }

    @Override // com.dw.ht.map.ui.a
    public void C0(a.InterfaceC0095a callback) {
        rd.m.e(callback, "callback");
        this.callback = callback;
        o8.c map = getMap();
        if (map != null) {
            callback.c0(map);
        }
    }

    @Override // o8.f
    public void E(final o8.c map) {
        rd.m.e(map, "map");
        this.map = map;
        ha.c cVar = new ha.c(map);
        this.markerManager = cVar;
        c.a aVarO = cVar.o();
        if (aVarO != null) {
            aVarO.p(new c.h() { // from class: c5.j
                @Override // o8.c.h
                public final boolean d(q8.i iVar) {
                    return GMapFragment.A4(this.f4337a, iVar);
                }
            });
        } else {
            aVarO = null;
        }
        this.destinationDistanceMarkerCollection = aVarO;
        this.polygonManager = new ha.d(map);
        ha.e eVar = new ha.e(map);
        this.polylineManager = eVar;
        e.a aVarO2 = eVar.o();
        if (aVarO2 != null) {
            aVarO2.i(new c.k() { // from class: c5.n
                @Override // o8.c.k
                public final void k(q8.n nVar) {
                    GMapFragment.B4(this.f4347a, nVar);
                }
            });
        } else {
            aVarO2 = null;
        }
        this.destinationDistancePolylineCollection = aVarO2;
        final ea.c cVar2 = new ea.c(x3(), map, this.markerManager);
        this.clusterManager = cVar2;
        cVar2.n(new c.e() { // from class: c5.o
            @Override // ea.c.e
            public final boolean a(ea.b bVar) {
                return GMapFragment.C4(this.f4349a, map, cVar2, (b0) bVar);
            }
        });
        cVar2.m(new c.b() { // from class: c5.p
            @Override // ea.c.b
            public final boolean a(ea.a aVar) {
                return GMapFragment.D4(this.f4352a, map, aVar);
            }
        });
        cVar2.o(new d(map, cVar2, this, k1()));
        map.s(new c.b() { // from class: c5.q
            @Override // o8.c.b
            public final void a() {
                GMapFragment.E4(this.f4355a);
            }
        });
        map.t(new c.InterfaceC0314c() { // from class: c5.r
            @Override // o8.c.InterfaceC0314c
            public final void a() {
                GMapFragment.F4(this.f4357a);
            }
        });
        map.u(new c.d() { // from class: c5.s
            @Override // o8.c.d
            public final void b(int i10) {
                GMapFragment.G4(this.f4358a, i10);
            }
        });
        map.k().d(false);
        map.p(new e());
        a aVar = this.pendingCameraUpdate;
        if (aVar != null) {
            aVar.a();
        }
        T4();
        this.mKmlLayerVer = 0;
        M4();
        U4(false);
        ArrayList arrayList = this.overlaysList;
        if (arrayList != null) {
            n(arrayList, null);
        }
        a.InterfaceC0095a interfaceC0095a = this.callback;
        if (interfaceC0095a != null) {
            interfaceC0095a.c0(map);
        }
    }

    @Override // com.dw.ht.map.ui.a
    public void G(LatLngBounds bounds, Rect padding) {
        rd.m.e(bounds, "bounds");
        U0(x.DISABLE);
        I4(false);
        if (getMap() == null) {
            this.pendingCameraUpdate = new a(null, null, null, bounds, padding);
            return;
        }
        this.pendingCameraUpdate = null;
        Rect rect = padding == null ? new Rect() : padding;
        o8.a aVarC = o8.b.c(bounds, Math.max(Math.max(Math.max(Math.max(0, getPadding().left + rect.left), getPadding().top + rect.top), getPadding().right + rect.right), getPadding().bottom + rect.bottom));
        rd.m.d(aVarC, "newLatLngBounds(...)");
        w4(aVarC);
    }

    @Override // com.dw.ht.map.ui.a
    public void H(LatLng location, float zoom) {
        rd.m.e(location, "location");
        if (getLocationMode().d()) {
            U0(x.NORMAL);
        }
        I4(false);
        if (getMap() == null) {
            this.pendingCameraUpdate = new a(this, null, location, Float.valueOf(zoom), null, null, 24, null);
            return;
        }
        this.pendingCameraUpdate = null;
        LatLng latLngJ = this.mapUtils.j(location);
        o8.c map = getMap();
        CameraPosition cameraPositionG = map != null ? map.g() : null;
        CameraPosition.a aVarE = new CameraPosition.a().a(0.0f).c(latLngJ).e(zoom);
        rd.m.d(aVarE, "zoom(...)");
        if (cameraPositionG != null && zoom == 0.0f) {
            aVarE.e(cameraPositionG.f7313b);
        }
        o8.a aVarA = o8.b.a(aVarE.b());
        rd.m.d(aVarA, "newCameraPosition(...)");
        w4(aVarA);
        s3.b.b("GMapFragment", "focus:" + location + ',' + latLngJ);
    }

    @Override // com.dw.ht.map.ui.a
    public float I0() {
        CameraPosition cameraPositionG;
        o8.c map = getMap();
        if (map == null || (cameraPositionG = map.g()) == null) {
            return 15.0f;
        }
        return cameraPositionG.f7313b;
    }

    @Override // com.dw.ht.map.ui.a
    public LatLng J0(Point point) {
        o8.h hVarJ;
        rd.m.e(point, "point");
        o8.c map = getMap();
        if (map == null || (hVarJ = map.j()) == null) {
            return null;
        }
        return hVarJ.a(point);
    }

    @Override // com.dw.ht.map.ui.a
    public void L0(c5.y status) {
        rd.m.e(status, "status");
        setMapLayer(status.f());
        U0(status.e());
        if (status.b() != null) {
            LatLng latLngB = status.b();
            rd.m.b(latLngB);
            H(latLngB, status.g());
        } else {
            o8.c map = getMap();
            if (map != null) {
                map.l(o8.b.d(map.g().f7312a, status.g()));
            }
        }
        if (status.c() != 0) {
            z(status.c());
        }
    }

    @Override // o8.j, androidx.fragment.app.o
    public void M2() {
        super.M2();
        M4();
    }

    @Override // com.dw.ht.map.ui.a
    public void O() {
        o8.c map = getMap();
        if (map != null) {
            float fI0 = I0();
            if (SystemClock.elapsedRealtime() - this.lastZoomTo < 1000) {
                fI0 = this.zoomTo;
            }
            this.zoomTo = Math.min((float) Math.ceil(fI0 + 1), map.h());
            this.lastZoomTo = SystemClock.elapsedRealtime();
            map.f(o8.b.d(map.g().f7312a, this.zoomTo));
        }
    }

    @Override // o8.j, androidx.fragment.app.o
    public void O2() {
        mi.c.e().q(this);
        super.O2();
    }

    @Override // com.dw.ht.map.ui.a
    public void P(Location location) {
        if (rd.m.a(this.destinationLocation, location)) {
            return;
        }
        this.destinationLocation = location;
        L4();
    }

    @Override // com.dw.ht.map.ui.a
    public void P0(double d10) {
        this.minZoomLevel = d10;
    }

    @Override // o8.j, androidx.fragment.app.o
    public void P2() {
        mi.c.e().t(this);
        super.P2();
    }

    @Override // androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        this.mapOverlay = new p5.b(contextX3, 0, 2, null);
        this.clusterOverlay = new p5.a(contextX3);
        p5.b bVar = new p5.b(contextX3, R.layout.widget_map_pic_overlay);
        this.mapPicOverlay = bVar;
        bVar.setRoundedIcon(true);
        this.mapOverlayDistance = new p5.b(contextX3, R.layout.widget_map_overlay_distance);
        T4();
        S3(this);
    }

    @Override // com.dw.ht.map.ui.a
    public void R(c5.y status) {
        rd.m.e(status, "status");
        status.k(getMapLayer());
        status.l(I0());
        status.i(this.followingFocusedId ? this.focusedId : 0L);
        status.j(getLocationMode());
        Location locationO = o();
        status.h(locationO != null ? z4.a.a(locationO) : null);
    }

    @Override // com.dw.ht.map.ui.a
    public void U0(x xVar) {
        rd.m.e(xVar, "value");
        if (this.locationMode == xVar) {
            return;
        }
        this.locationMode = xVar;
        z4();
    }

    @Override // com.dw.ht.map.ui.a
    public void d0(List items) {
        rd.m.e(items, "items");
        o8.c map = getMap();
        if (map == null) {
            return;
        }
        Iterator it = this.polygons.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            rd.m.d(next, "next(...)");
            ((q8.l) next).a();
        }
        Iterator it2 = this.markers.iterator();
        rd.m.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            rd.m.d(next2, "next(...)");
            ((i) next2).g();
        }
        this.polygons.clear();
        this.markers.clear();
        float fB = k.b(k1(), 1.0f);
        Iterator it3 = items.iterator();
        float f10 = 0.0f;
        while (it3.hasNext()) {
            SatelliteOfflineMapItem satelliteOfflineMapItem = (SatelliteOfflineMapItem) it3.next();
            f10++;
            LatLngBounds latLngBoundsA = satelliteOfflineMapItem.a();
            q8.m mVar = new q8.m();
            mVar.b(this.mapUtils.a(latLngBoundsA.f7323b));
            mVar.b(this.mapUtils.a(z4.a.c(latLngBoundsA)));
            mVar.b(this.mapUtils.a(latLngBoundsA.f7322a));
            mVar.b(this.mapUtils.a(z4.a.b(latLngBoundsA)));
            mVar.g(Color.argb(60, 0, 255, 0)).r(-16776961).s(fB).t(f10);
            this.polygons.add(map.c(mVar));
            p5.b bVar = this.mapOverlay;
            p5.b bVar2 = null;
            if (bVar == null) {
                rd.m.o("mapOverlay");
                bVar = null;
            }
            bVar.setTitle(satelliteOfflineMapItem.b() + '(' + satelliteOfflineMapItem.getZoom() + ')');
            p5.b bVar3 = this.mapOverlay;
            if (bVar3 == null) {
                rd.m.o("mapOverlay");
                bVar3 = null;
            }
            bVar3.setIcon((Bitmap) null);
            q8.j jVarB = new q8.j().b(0.5f, 0.5f);
            p5.b bVar4 = this.mapOverlay;
            if (bVar4 == null) {
                rd.m.o("mapOverlay");
                bVar4 = null;
            }
            i iVarB = map.b(jVarB.p(q8.c.b(q.b(bVar4))).t(this.mapUtils.a(latLngBoundsA.e())).x(f10));
            if (iVarB != null) {
                this.markers.add(iVarB);
            }
            p5.b bVar5 = this.mapOverlay;
            if (bVar5 == null) {
                rd.m.o("mapOverlay");
            } else {
                bVar2 = bVar5;
            }
            bVar2.c();
        }
    }

    @Override // com.dw.ht.map.ui.a
    public LatLngBounds l() {
        o8.h hVarJ;
        z zVarB;
        o8.c map = getMap();
        if (map == null || (hVarJ = map.j()) == null || (zVarB = hVarJ.b()) == null) {
            return null;
        }
        return zVarB.f24492e;
    }

    @Override // com.dw.ht.map.ui.a
    public void m(ArrayList tracks) {
        rd.m.e(tracks, "tracks");
        o8.c map = getMap();
        if (map == null) {
            return;
        }
        Iterator it = this.polylines.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a();
        }
        this.polylines.clear();
        Iterator it2 = tracks.iterator();
        while (it2.hasNext()) {
            d5.h hVar = (d5.h) it2.next();
            Integer numK = hVar.k();
            q8.o oVarF = new q8.o().f(numK != null ? numK.intValue() : -582176944);
            Context contextK1 = k1();
            q8.o oVarT = oVarF.t(k.b(contextK1, hVar.s() != null ? r4.floatValue() : 4.0f));
            rd.m.d(oVarT, "width(...)");
            oVarT.c(hVar.n());
            this.polylines.add(map.d(oVarT));
        }
    }

    @Override // com.dw.ht.map.ui.a
    public void n(ArrayList list, Long followingId) {
        Object next;
        d5.d dVarK;
        rd.m.e(list, "list");
        s3.b.b("GMapFragment", "onOverlaysChanged size:" + list.size());
        this.overlaysList = list;
        ea.c cVar = this.clusterManager;
        if (cVar != null) {
            cVar.e();
            cVar.c(list);
            cVar.f();
        }
        if (followingId != null) {
            H4(followingId.longValue());
            I4(true);
        }
        o8.c map = getMap();
        if (map == null || this.focusedId == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (this.focusedId == ((b0) next).f()) {
                    break;
                }
            }
        }
        b0 b0Var = (b0) next;
        if (b0Var == null) {
            if (this.followingFocusedId && (dVarK = d5.d.k(this.focusedId)) != null && dVarK.e()) {
                map.f(o8.b.b(this.mapUtils.j(dVarK.g())));
                return;
            }
            return;
        }
        a.InterfaceC0095a interfaceC0095a = this.callback;
        if (interfaceC0095a != null) {
            interfaceC0095a.G0(b0Var, false);
        }
        if (this.followingFocusedId) {
            LatLng latLngJ = this.mapUtils.j(b0Var.d());
            if (a6.q.d(map.g().f7312a, latLngJ)) {
                return;
            }
            map.f(o8.b.b(latLngJ));
        }
    }

    @Override // com.dw.ht.map.ui.a
    public Location o() {
        View viewT1;
        o8.c map = getMap();
        if (map == null || (viewT1 = T1()) == null) {
            return null;
        }
        LatLng latLngH = this.mapUtils.h(map.j().a(new Point(viewT1.getWidth() / 2, viewT1.getHeight() / 2)));
        Location location = new Location("gmap");
        location.setLatitude(latLngH.f7320a);
        location.setLongitude(latLngH.f7321b);
        return location;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(h.b event) {
        rd.m.e(event, "event");
        if (b.f6613a[event.ordinal()] != 1) {
            throw new dd.o();
        }
        M4();
    }

    @Override // com.dw.ht.map.ui.a
    public int p() {
        com.dw.ht.map.b bVar = (com.dw.ht.map.b) this.tileProvider;
        if (bVar != null) {
            return bVar.b();
        }
        return 0;
    }

    @Override // com.dw.ht.map.ui.a
    public void r0() {
        K4(null);
    }

    @Override // o8.j, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        this.fusedLocationProviderClient = n8.e.a(x3());
    }

    /* JADX INFO: renamed from: r4, reason: from getter */
    public Location getDestinationLocation() {
        return this.destinationLocation;
    }

    /* JADX INFO: renamed from: s4, reason: from getter */
    public x getLocationMode() {
        return this.locationMode;
    }

    @Override // com.dw.ht.map.ui.a
    public void setMapLayer(z4.j jVar) {
        rd.m.e(jVar, "value");
        if (this.mapLayer == jVar) {
            return;
        }
        boolean z10 = jVar.h() != this.mapLayer.h();
        this.mapLayer = jVar;
        U4(z10);
    }

    /* JADX INFO: renamed from: t4, reason: from getter */
    public o8.c getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: u4, reason: from getter */
    public Rect getPadding() {
        return this.padding;
    }

    @Override // com.dw.ht.map.ui.a
    /* JADX INFO: renamed from: v0, reason: from getter */
    public z4.j getMapLayer() {
        return this.mapLayer;
    }

    @Override // com.dw.ht.map.ui.a
    public void w0(float f10) {
        o8.c map = getMap();
        if (map != null) {
            map.f(o8.b.d(map.g().f7312a, f10));
        }
    }

    @Override // o8.j, androidx.fragment.app.o
    public void w2() {
        super.w2();
        n8.b bVar = this.fusedLocationProviderClient;
        if (bVar != null) {
            bVar.e(this.locationCallback);
        }
    }

    @Override // com.dw.ht.map.ui.a
    public void x0() {
        o8.c map = getMap();
        if (map != null) {
            float fI0 = I0();
            if (SystemClock.elapsedRealtime() - this.lastZoomTo < 1000) {
                fI0 = this.zoomTo;
            }
            this.zoomTo = Math.max((float) Math.floor(fI0 - 1), map.i());
            this.lastZoomTo = SystemClock.elapsedRealtime();
            map.f(o8.b.d(map.g().f7312a, this.zoomTo));
        }
    }

    @Override // o8.j, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.map = null;
        this.clusterManager = null;
        this.destinationDistanceMarkerCollection = null;
        this.markerManager = null;
        this.polygonManager = null;
        this.polylineManager = null;
        this.destinationDistancePolylineCollection = null;
        this.polylines.clear();
    }

    @Override // com.dw.ht.map.ui.a
    public void z(long j10) {
        LatLng latLngG;
        o8.c map;
        if (this.focusedId == j10) {
            return;
        }
        if (j10 == 0) {
            H4(0L);
            return;
        }
        if (getLocationMode().d()) {
            U0(x.NORMAL);
        }
        H4(j10);
        I4(true);
        d5.d dVarK = d5.d.k(this.focusedId);
        if (dVarK == null || (latLngG = dVarK.g()) == null || (map = getMap()) == null) {
            return;
        }
        map.f(o8.b.b(this.mapUtils.j(latLngG)));
    }

    public final class a {

        /* JADX INFO: renamed from: a */
        private final o8.a f6607a;

        /* JADX INFO: renamed from: b */
        private final LatLng f6608b;

        /* JADX INFO: renamed from: c */
        private final Float f6609c;

        /* JADX INFO: renamed from: d */
        private final LatLngBounds f6610d;

        /* JADX INFO: renamed from: e */
        private final Rect f6611e;

        public a(o8.a aVar, LatLng latLng, Float f10, LatLngBounds latLngBounds, Rect rect) {
            this.f6607a = aVar;
            this.f6608b = latLng;
            this.f6609c = f10;
            this.f6610d = latLngBounds;
            this.f6611e = rect;
        }

        public final void a() {
            o8.a aVar = this.f6607a;
            if (aVar != null) {
                GMapFragment.this.w4(aVar);
                return;
            }
            LatLng latLng = this.f6608b;
            if (latLng != null) {
                GMapFragment gMapFragment = GMapFragment.this;
                Float f10 = this.f6609c;
                gMapFragment.H(latLng, f10 != null ? f10.floatValue() : 0.0f);
            } else {
                LatLngBounds latLngBounds = this.f6610d;
                if (latLngBounds != null) {
                    GMapFragment.this.G(latLngBounds, this.f6611e);
                }
            }
        }

        public /* synthetic */ a(GMapFragment gMapFragment, o8.a aVar, LatLng latLng, Float f10, LatLngBounds latLngBounds, Rect rect, int i10, rd.h hVar) {
            this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : latLng, (i10 & 4) != 0 ? null : f10, (i10 & 8) != 0 ? null : latLngBounds, (i10 & 16) != 0 ? null : rect);
        }
    }
}
