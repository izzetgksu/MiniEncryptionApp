package com.izzet.encryption;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.PrintWriter;
import java.io.IOException;

public gclass MainApp extends Application {
    private EncryptionService service = new EncryptionService();

    @Override
    public void start(Stage primaryStage) {
        TextArea inputArea = new TextArea();
        inputArea.setPromptText("Metni buraya girin...");

        Button encryptBtn = new Button("Şifrele (Encode)");
        Button decryptBtn = new Button("Şifreyi Çöz (Decode)");
        Button saveBtn = new Button("Dosyaya Kaydet");

        encryptBtn.setOnAction(e -> inputArea.setText(service.encode(inputArea.getText())));
        decryptBtn.setOnAction(e -> inputArea.setText(service.decode(inputArea.getText())));

        // CV'deki "Dosya okuma/yazma" maddesi için
        saveBtn.setOnAction(e -> {
            try (PrintWriter out = new PrintWriter("encrypted_text.txt")) {
                out.println(inputArea.getText());
                System.out.println("Dosya kaydedildi.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        VBox layout = new VBox(10, inputArea, encryptBtn, decryptBtn, saveBtn);
        layout.setPadding(new Insets(20));

        primaryStage.setScene(new Scene(layout, 400, 350));
        primaryStage.setTitle("Mini Encryption App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}