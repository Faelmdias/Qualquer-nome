package com.imagens;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ImageDownloader {
    public static void downloadImage(String imageUrl, String destinationFile) {
        try (InputStream in = new URL(imageUrl).openStream()) {
            Files.copy(in, Paths.get(destinationFile), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✅ Imagem baixada com sucesso para: " + destinationFile);
        } catch (IOException e) {
            System.err.println("❌ Erro ao baixar imagem: " + e.getMessage());
        }
    }
}
