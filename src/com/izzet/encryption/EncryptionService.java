package com.izzet.encryption;

public class EncryptionService {
    // Basit bir Sezar Şifreleme mantığı (Kaydırma: 3)
    private final int KEY = 3;

    public String encode(String text) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            result.append((char) (character + KEY));
        }
        return result.toString();
    }

    public String decode(String text) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            result.append((char) (character - KEY));
        }
        return result.toString();
    }
}