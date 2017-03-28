package com.courses.apollo.util.encrypt;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test of EncryptUtil and DecryptUtil.
 */
public class EncryptDecryptUtilsTest {
    private String decryptionResult1 = "123456789";
    private String decryptionResult2 = "1234567890123456";
    private String encryptionResult1 = "693217458";
    private String encryptionResult2 = "2648765139015324";
    DecryptUtil decrypt = new DecryptUtil();
    EncryptUtil encrypt = new EncryptUtil();

    @Test
    public void encryptionTest() {
        Assert.assertEquals(encryptionResult1, encrypt.encrypt("123456789"));
        Assert.assertEquals(encryptionResult2, encrypt.encrypt("1234567890123456"));
    }

    @Test
    public void decryptionTest() {
        Assert.assertEquals(decryptionResult1, decrypt.decrypt("693217458"));
        Assert.assertEquals(decryptionResult2, decrypt.decrypt("2648765139015324"));
    }
}