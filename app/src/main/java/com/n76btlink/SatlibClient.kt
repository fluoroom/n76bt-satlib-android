package com.n76btlink

import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

data class SatlibData(
    val satName: String,
    val catNum: Int,
    val azimuthDeg: Float,
    val elevationDeg: Float,
    val altitudeKm: Float,
    val distanceKm: Float,
    val txFrequencyHz: Long?,
    val rxFrequencyHz: Long?,
    val ctcssTxToneHz: Float?,
    val ctcssRxToneHz: Float?,
    val mode: String?,
    val aboveHorizon: Boolean,
    val aosTime: Long,
    val losTime: Long,
    val timestamp: Long
) {
    val isIdle: Boolean get() = satName.isEmpty() || timestamp == 0L
}

class SatlibClient(val host: String, val port: Int) {

    fun poll(): SatlibData {
        val conn = URL("http", host, port, "/").openConnection() as HttpURLConnection
        conn.connectTimeout = 2000
        conn.readTimeout    = 2000
        conn.requestMethod  = "GET"
        return try {
            conn.connect()
            val j = JSONObject(conn.inputStream.bufferedReader().readText())
            SatlibData(
                satName       = j.optString("satName", ""),
                catNum        = j.optInt("catNum", 0),
                azimuthDeg    = j.optDouble("azimuthDeg", 0.0).toFloat(),
                elevationDeg  = j.optDouble("elevationDeg", 0.0).toFloat(),
                altitudeKm    = j.optDouble("altitudeKm", 0.0).toFloat(),
                distanceKm    = j.optDouble("distanceKm", 0.0).toFloat(),
                txFrequencyHz = if (j.isNull("txFrequencyHz")) null else j.getLong("txFrequencyHz"),
                rxFrequencyHz = if (j.isNull("rxFrequencyHz")) null else j.getLong("rxFrequencyHz"),
                ctcssTxToneHz = if (j.isNull("ctcssTxToneHz")) null else j.getDouble("ctcssTxToneHz").toFloat(),
                ctcssRxToneHz = if (j.isNull("ctcsRxToneHz")) null else j.getDouble("ctcsRxToneHz").toFloat(),
                mode          = if (j.isNull("mode")) null else j.optString("mode"),
                aboveHorizon  = j.optBoolean("aboveHorizon", false),
                aosTime       = j.optLong("aosTime", 0L),
                losTime       = j.optLong("losTime", 0L),
                timestamp     = j.optLong("timestamp", 0L)
            )
        } finally {
            conn.disconnect()
        }
    }
}
