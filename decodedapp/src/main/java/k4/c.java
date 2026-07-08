package k4;

import a6.f;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.util.Log;
import com.benshikj.ht.R;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f19385a = {500, 500};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f19386b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static MediaPlayer f19387c = null;

    class a implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19388a;

        a(Context context) {
            this.f19388a = context;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            Log.e("AlarmKlaxon", "Error occurred while playing audio. Stopping AlarmKlaxon.");
            c.d(this.f19388a);
            return true;
        }
    }

    private static void a(Context context, MediaPlayer mediaPlayer, int i10) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(i10);
        if (assetFileDescriptorOpenRawResourceFd != null) {
            mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
            assetFileDescriptorOpenRawResourceFd.close();
        }
    }

    public static void b(Context context, b bVar, boolean z10) {
        Log.v("AlarmKlaxon", "AlarmKlaxon.start()");
        d(context);
        if (!b.f19379d.equals(bVar.f19383b)) {
            Uri defaultUri = bVar.f19383b;
            if (defaultUri == null) {
                defaultUri = RingtoneManager.getDefaultUri(4);
                if (f.f328a) {
                    Log.v("AlarmKlaxon", "Using default alarm: " + defaultUri.toString());
                }
            }
            MediaPlayer mediaPlayer = new MediaPlayer();
            f19387c = mediaPlayer;
            mediaPlayer.setOnErrorListener(new a(context));
            try {
                if (z10) {
                    Log.v("AlarmKlaxon", "Using the in-call alarm");
                    f19387c.setVolume(0.125f, 0.125f);
                    a(context, f19387c, R.raw.in_call_alarm);
                } else {
                    f19387c.setDataSource(context, defaultUri);
                }
                c(context, f19387c);
            } catch (Exception unused) {
                Log.v("AlarmKlaxon", "Using the fallback ringtone");
                try {
                    f19387c.reset();
                    a(context, f19387c, R.raw.fallbackring);
                    c(context, f19387c);
                } catch (Exception e10) {
                    Log.e("AlarmKlaxon", "Failed to play fallback ringtone", e10);
                }
            }
        }
        if (bVar.f19382a) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(f19385a, 0);
        }
        f19386b = true;
    }

    private static void c(Context context, MediaPlayer mediaPlayer) throws IOException {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager.getStreamVolume(2) != 0) {
            mediaPlayer.setAudioStreamType(2);
            mediaPlayer.setLooping(true);
            mediaPlayer.prepare();
            audioManager.requestAudioFocus(null, 2, 2);
            mediaPlayer.start();
        }
    }

    public static void d(Context context) {
        Log.v("AlarmKlaxon", "stop()");
        if (f19386b) {
            f19386b = false;
            MediaPlayer mediaPlayer = f19387c;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(null);
                f19387c.release();
                f19387c = null;
            }
            ((Vibrator) context.getSystemService("vibrator")).cancel();
        }
    }
}
