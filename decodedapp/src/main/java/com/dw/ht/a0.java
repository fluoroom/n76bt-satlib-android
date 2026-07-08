package com.dw.ht;

import org.simpleframework.xml.strategy.Name;
import yb.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    private static void a(yb.c cVar) {
        c.b bVarE = cVar.e("ChannelBond");
        bVarE.h(2, 3746908602423597230L).i(7, 2695351833404645352L);
        bVarE.j(Name.MARK, 6).f(1, 8705218332319165696L).e(1);
        bVarE.j("networkChannelId", 6).f(2, 4472986865196771996L);
        bVarE.j("devId", 6).f(3, 2815650992328453954L);
        bVarE.j("devChannel", 5).f(4, 831024381361863555L);
        bVarE.j("routing", 1).f(5, 8795657105909166099L);
        bVarE.j("syncRfConfig", 1).f(6, 3276426173470299668L);
        bVarE.j("devRegion", 5).f(7, 2695351833404645352L);
        bVarE.e();
    }

    private static void b(yb.c cVar) {
        c.b bVarE = cVar.e("ETag");
        bVarE.h(7, 229061235790909279L).i(6, 5683833619288715682L);
        bVarE.j(Name.MARK, 6).f(1, 938303604550936295L).e(1);
        bVarE.j("mapLayer", 5).f(2, 4889090187886234163L).e(10).g(1, 7219427757459312694L);
        bVarE.j("x", 5).f(3, 6438182378891278134L).e(8).g(2, 4024960951132955796L);
        bVarE.j("y", 5).f(4, 7768997493379936494L).e(8).g(3, 1456658905354841881L);
        bVarE.j("z", 5).f(5, 8603625623511938348L).e(8).g(4, 3713820165104901184L);
        bVarE.j("tag", 9).f(6, 5683833619288715682L);
        bVarE.e();
    }

    private static void c(yb.c cVar) {
        c.b bVarE = cVar.e("FactorySettings");
        bVarE.h(9, 5041837862642379535L).i(7, 8695231854698454611L);
        bVarE.j(Name.MARK, 6).f(1, 595738197031381122L).e(1);
        bVarE.j("name", 9).f(2, 211252708735330336L);
        bVarE.j("freqRangeCount", 5).f(3, 7591163532966561384L);
        bVarE.j("settings", 23).f(4, 5614213494574114233L);
        bVarE.j("iba", 23).f(5, 1195913733434142203L);
        bVarE.j("vco", 23).f(6, 5540581912418684934L);
        bVarE.j("settings2", 23).f(7, 8695231854698454611L);
        bVarE.e();
    }

    private static void d(yb.c cVar) {
        c.b bVarE = cVar.e("IIChannel");
        bVarE.h(3, 4579680378129566605L).i(15, 2447889696140805516L);
        bVarE.j(Name.MARK, 6).f(1, 6517201765879338016L).e(1);
        bVarE.j("userId", 6).f(2, 2601253279888184737L);
        bVarE.j("ownUserId", 6).f(3, 530029597879112033L);
        bVarE.j("channelId", 6).f(4, 6282813349293133489L);
        bVarE.j("name", 9).f(5, 4348354814966324418L);
        bVarE.j("monitor", 1).f(6, 2345330312229293002L);
        bVarE.j("autoConnect", 1).f(7, 7476015279963679284L);
        bVarE.j("ban", 1).f(8, 7621149495176678070L);
        bVarE.j("isAdmin", 1).f(9, 2300929330828553120L);
        bVarE.j("txFreq", 5).f(10, 1024180385294605074L);
        bVarE.j("rxFreq", 5).f(11, 8848647648450793152L);
        bVarE.j("txSubAudio", 5).f(12, 1125639851554015322L);
        bVarE.j("rxSubAudio", 5).f(13, 2393875098445489578L);
        bVarE.j("bandwidth", 5).f(14, 1638904687511453283L);
        bVarE.j("haveNewMessage", 1).f(15, 2447889696140805516L);
        bVarE.e();
    }

    private static void e(yb.c cVar) {
        c.b bVarE = cVar.e("LinkSettings");
        bVarE.h(11, 8081326413248738355L).i(5, 2061114818077074688L);
        bVarE.j(Name.MARK, 6).f(1, 1653834085348573558L).e(1);
        bVarE.j("linkId", 6).f(4, 8469621208412021009L);
        bVarE.j("syncSignalingSettings", 1).f(3, 2095473891667082757L).e(2);
        bVarE.j("monitor", 1).f(5, 2061114818077074688L);
        bVarE.e();
    }

    private static void f(yb.c cVar) {
        c.b bVarE = cVar.e("Marker");
        bVarE.h(6, 83302880520463428L).i(11, 5779911313139038582L);
        bVarE.j(Name.MARK, 6).f(1, 2521304646745213424L).e(1);
        bVarE.j("latitude", 8).f(2, 6619307639309025093L);
        bVarE.j("longitude", 8).f(3, 5049335363987319235L);
        bVarE.j("altitude", 8).f(4, 398215979338097170L).e(2);
        bVarE.j("accuracy", 7).f(5, 420541026109511971L).e(2);
        bVarE.j("speed", 7).f(6, 8268105553110449196L).e(2);
        bVarE.j("course", 7).f(7, 6970831711798759001L).e(2);
        bVarE.j("date", 6).f(8, 3989732626386511343L);
        bVarE.j("title", 9).f(9, 5527004658718340186L);
        bVarE.j("text", 9).f(10, 4548141835178499847L);
        bVarE.j("picture", 9).f(11, 5779911313139038582L);
        bVarE.e();
    }

    private static void g(yb.c cVar) {
        c.b bVarE = cVar.e("RegionBind");
        bVarE.h(8, 190145239779512222L).i(5, 6730130283584237214L);
        bVarE.j(Name.MARK, 6).f(1, 8946983722297042502L).e(1);
        bVarE.j("devID", 6).f(2, 3008462791174922011L);
        bVarE.j("devRegion", 5).f(4, 3935363268922069365L);
        bVarE.j("regionID", 6).f(5, 6730130283584237214L);
        bVarE.e();
    }

    private static void h(yb.c cVar) {
        c.b bVarE = cVar.e("Satellite");
        bVarE.h(10, 3936398458302872636L).i(18, 6361164761169373454L);
        bVarE.j(Name.MARK, 6).f(1, 676682349099324884L).e(1);
        bVarE.j("name", 9).f(2, 2263315427782253734L);
        bVarE.j("noradCatID", 5).f(3, 6036335985473355864L);
        bVarE.j("tleLine1", 9).f(5, 7574473790504902197L);
        bVarE.j("tleLine2", 9).f(6, 6441893605105794448L);
        bVarE.j("starred", 1).f(9, 309382937642710670L);
        bVarE.j("showTrack", 1).f(8, 7984612693962232757L);
        bVarE.j("rfConfigName", 9).f(18, 6361164761169373454L);
        bVarE.j("txFreq", 5).f(10, 7838627406086353427L);
        bVarE.j("rxFreq", 5).f(11, 4860909988667680699L);
        bVarE.j("txModulation", 5).f(12, 4366346832788163568L).e(2);
        bVarE.j("rxModulation", 5).f(13, 4284136660322017599L).e(2);
        bVarE.j("txSubAudio", 5).f(14, 7609069324120113661L);
        bVarE.j("rxSubAudio", 5).f(15, 5851274636995482257L);
        bVarE.j("bandwidth", 5).f(16, 2110209701263006856L);
        bVarE.j("updatedAt", 6).f(17, 693394008986002587L);
        bVarE.e();
    }

    private static void i(yb.c cVar) {
        c.b bVarE = cVar.e("SatelliteOfflineMapItem");
        bVarE.h(1, 947895734431594806L).i(13, 4145624272035261153L);
        bVarE.g(1);
        bVarE.j(Name.MARK, 6).f(1, 6466683179906116988L).e(1);
        bVarE.j("title", 9).f(2, 294550246819483885L);
        bVarE.j("zoom", 5).f(8, 6587757199170386832L);
        bVarE.j("status", 5).f(9, 8876344418848578458L).e(2);
        bVarE.j("latest_update", 6).f(10, 844628624903477839L);
        bVarE.j("southwest_latitude", 8).f(4, 3023665881177670606L);
        bVarE.j("southwest_longitude", 8).f(5, 2961194927001178617L);
        bVarE.j("northeast_latitude", 8).f(6, 243831808246687466L);
        bVarE.j("northeast_longitude", 8).f(7, 7539917242758709073L);
        bVarE.j("justDownloadInWifi", 1).f(12, 2022963213816690059L);
        bVarE.j("_terrainMode", 1).f(11, 3753805221376481964L);
        bVarE.j("mapLayer", 5).f(13, 4145624272035261153L).e(2);
        bVarE.e();
    }

    private static void j(yb.c cVar) {
        c.b bVarE = cVar.e("SatelliteRadioConfiguration");
        bVarE.h(12, 3703568103603315249L).i(11, 9045138573299990629L);
        bVarE.j(Name.MARK, 6).f(1, 1031546316303358002L).e(1);
        bVarE.j("name", 9).f(2, 4280406597702230674L);
        bVarE.j("noradCatID", 5).f(3, 9030834885674418012L);
        bVarE.j("downlinkFreq", 5).f(4, 1569356420299047138L);
        bVarE.j("uplinkFreq", 5).f(5, 6556767196722690814L);
        bVarE.j("downlinkSubAudio", 5).f(6, 9183397114982887718L);
        bVarE.j("uplinkSubAudio", 5).f(7, 7746598274378189952L);
        bVarE.j("downlinkMod", 5).f(8, 3445860867573054715L).e(2);
        bVarE.j("uplinkMod", 5).f(9, 6544604860418590576L).e(2);
        bVarE.j("bandwidth", 5).f(10, 3067515807118796890L);
        bVarE.j("isCreatedByUser", 1).f(11, 9045138573299990629L);
        bVarE.e();
    }

    public static io.objectbox.b k() {
        io.objectbox.b bVar = new io.objectbox.b(l());
        bVar.f(com.dw.ht.entitys.a.f5717d);
        bVar.f(com.dw.ht.map.entitys.a.f6569d);
        bVar.f(com.dw.ht.entitys.b.f5730d);
        bVar.f(com.dw.ht.entitys.c.f5743d);
        bVar.f(com.dw.ht.entitys.d.f5760d);
        bVar.f(com.dw.ht.entitys.e.f5770d);
        bVar.f(com.dw.ht.entitys.f.f5787d);
        bVar.f(com.dw.ht.entitys.h.f5814d);
        bVar.f(com.dw.ht.map.entitys.b.f6581d);
        bVar.f(com.dw.ht.entitys.g.f5797d);
        return bVar;
    }

    private static byte[] l() {
        yb.c cVar = new yb.c();
        cVar.f(12, 3703568103603315249L);
        cVar.g(4, 3713820165104901184L);
        cVar.h(0, 0L);
        a(cVar);
        b(cVar);
        c(cVar);
        d(cVar);
        e(cVar);
        f(cVar);
        g(cVar);
        h(cVar);
        i(cVar);
        j(cVar);
        return cVar.c();
    }
}
