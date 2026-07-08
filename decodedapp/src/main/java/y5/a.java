package y5;

import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f32427c = {16, 74, 71, -80, 32, 101, MessagePack.Code.INT16, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Cipher f32428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cipher f32429b;

    public a(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f32428a = cipher;
            byte[] bArr2 = f32427c;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f32429b = cipher2;
            cipher2.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("Invalid environment", e10);
        }
    }

    @Override // y5.c
    public String a(String str, String str2) throws h {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f32429b.doFinal(Base64.decode(str, 0)), Utf8Charset.NAME);
            if (str3.indexOf("" + str2) == 0) {
                return str3.substring(str2.length(), str3.length());
            }
            throw new h("Header not found (invalid data or key):" + str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Invalid environment", e10);
        } catch (BadPaddingException e11) {
            e = e11;
            throw new h(e.getMessage() + ":" + str);
        } catch (IllegalBlockSizeException e12) {
            e = e12;
            throw new h(e.getMessage() + ":" + str);
        }
    }

    @Override // y5.c
    public String b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return new String(Base64.encode(this.f32428a.doFinal(("" + str2 + str).getBytes(Utf8Charset.NAME)), 0));
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            throw new RuntimeException("Invalid environment", e10);
        }
    }
}
