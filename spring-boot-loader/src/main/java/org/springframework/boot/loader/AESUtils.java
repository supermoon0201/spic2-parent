package org.springframework.boot.loader;

import com.sprixin.cipherkey.CipherKey;

import java.io.IOException;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

public class AESUtils {
    private static String KEY = "b5952025f39d7f32";
    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";

    public static byte[] aesDecryptBytesToBytes(byte[] encrypt)
            throws Exception {
        return aesDecryptBytesToBytes(encrypt, KEY);
    }

    public static byte[] aesDecryptBytesToBytes(byte[] encryptBytes, String decryptKey)
            throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(decryptKey.getBytes(), "AES"));
        return cipher.doFinal(encryptBytes);
    }

    public static String bytesToHex(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i=0; i<4; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString().toUpperCase();
    }

    public static byte[] decrypt(byte[] cryptData) {
        if ("CAFEBABE".equals(bytesToHex(cryptData))) {
            return cryptData;
        }
        try {
            return AESUtils.aesDecryptBytesToBytes(cryptData);
        } catch (Exception e) {
            // 使用webservice时会检测不到"CAFEBABE"，但未加密，所以会报错，捕获异常后直接返回数据
            return cryptData;
        }
    }
}