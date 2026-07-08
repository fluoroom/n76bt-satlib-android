package z4;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f32949a = new l();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32950a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f32939c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f32940d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f32938b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.f32941e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.f32942f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.f32943g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f32950a = iArr;
        }
    }

    private l() {
    }

    public static /* synthetic */ PopupMenu c(l lVar, View view, j jVar, t tVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jVar = Cfg.E();
            rd.m.d(jVar, "getMapLayer(...)");
        }
        if ((i10 & 4) != 0) {
            tVar = null;
        }
        return lVar.b(view, jVar, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(j jVar, t tVar, MenuItem menuItem) {
        rd.m.e(menuItem, "item");
        j jVar2 = null;
        switch (menuItem.getItemId()) {
            case R.id.amateur_radio_satellite /* 2131296400 */:
                Cfg.O().setShowAmateurRadioSatellite(!Cfg.O().isShowAmateurRadioSatellite());
                break;
            case R.id.map /* 2131296953 */:
                jVar2 = j.f32938b;
                break;
            case R.id.satellite /* 2131297298 */:
                jVar2 = j.f32939c;
                break;
            case R.id.satellite_amap /* 2131297300 */:
                jVar2 = j.f32943g;
                break;
            case R.id.satellite_tianditu /* 2131297303 */:
                jVar2 = j.f32941e;
                break;
            case R.id.space_station /* 2131297419 */:
                Cfg.O().setShowSpaceStation(!Cfg.O().isShowSpaceStation());
                break;
            case R.id.terrain /* 2131297504 */:
                jVar2 = j.f32940d;
                break;
            case R.id.terrain_OpenTopoMap /* 2131297505 */:
                jVar2 = j.f32942f;
                break;
        }
        if (jVar2 != null && jVar != jVar2 && (tVar == null || !tVar.a(jVar2))) {
            Cfg.F0(jVar2);
        }
        return true;
    }

    public final PopupMenu b(View view, final j jVar, final t tVar) {
        MenuItem menuItemFindItem;
        rd.m.e(view, "view");
        rd.m.e(jVar, "layer");
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        Menu menu = popupMenu.getMenu();
        rd.m.d(menu, "getMenu(...)");
        popupMenu.getMenuInflater().inflate(R.menu.amap_layers, menu);
        switch (a.f32950a[jVar.ordinal()]) {
            case 1:
                MenuItem menuItemFindItem2 = menu.findItem(R.id.satellite);
                if (menuItemFindItem2 != null) {
                    menuItemFindItem2.setChecked(true);
                }
                break;
            case 2:
                MenuItem menuItemFindItem3 = menu.findItem(R.id.terrain);
                if (menuItemFindItem3 != null) {
                    menuItemFindItem3.setChecked(true);
                }
                break;
            case 3:
                MenuItem menuItemFindItem4 = menu.findItem(R.id.map);
                if (menuItemFindItem4 != null) {
                    menuItemFindItem4.setChecked(true);
                }
                break;
            case 4:
                MenuItem menuItemFindItem5 = menu.findItem(R.id.satellite_tianditu);
                if (menuItemFindItem5 != null) {
                    menuItemFindItem5.setChecked(true);
                }
                break;
            case 5:
                MenuItem menuItemFindItem6 = menu.findItem(R.id.terrain_OpenTopoMap);
                if (menuItemFindItem6 != null) {
                    menuItemFindItem6.setChecked(true);
                }
                break;
            case 6:
                MenuItem menuItemFindItem7 = menu.findItem(R.id.satellite_amap);
                if (menuItemFindItem7 != null) {
                    menuItemFindItem7.setChecked(true);
                }
                break;
            default:
                throw new dd.o();
        }
        if (Cfg.f5511u && (menuItemFindItem = menu.findItem(R.id.satellite_amap)) != null) {
            menuItemFindItem.setVisible(false);
        }
        MenuItem menuItemFindItem8 = menu.findItem(R.id.amateur_radio_satellite);
        if (menuItemFindItem8 != null) {
            menuItemFindItem8.setChecked(Cfg.O().isShowAmateurRadioSatellite());
        }
        MenuItem menuItemFindItem9 = menu.findItem(R.id.space_station);
        if (menuItemFindItem9 != null) {
            menuItemFindItem9.setChecked(Cfg.O().isShowSpaceStation());
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: z4.k
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return l.d(jVar, tVar, menuItem);
            }
        });
        popupMenu.show();
        return popupMenu;
    }
}
