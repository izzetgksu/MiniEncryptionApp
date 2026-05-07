# Mini Encryption App (JavaFX) 🔐

Bu proje; Nesne Tabanlı Programlama (OOP) prensipleri temel alınarak geliştirilmiş, kullanıcı dostu bir arayüze sahip masaüstü metin şifreleme uygulamasıdır. Yazılım mimarisi olarak mantıksal işlemler (Logic) ve kullanıcı arayüzünün (UI) birbirinden ayrıldığı, sürdürülebilir ve geliştirilmeye açık bir yapı sunmaktadır.

## 🚀 Özellikler
- **Encode/Decode:** Metinleri Sezar algoritması mantığıyla şifreler ve geri çözer.
- **Dosya İşlemleri:** Şifrelenmiş metni doğrudan `.txt` dosyası olarak sisteme kaydeder.
- **Modern UI:** JavaFX kullanılarak tasarlanmış kullanıcı dostu arayüz.
- **Temiz Kod:** Logic (Mantık) ve UI (Arayüz) katmanları birbirinden ayrılarak geliştirilmiştir (Separation of Concerns).

## 🛠️ Kullanılan Teknolojiler
- **Dil:** Java 11+
- **Arayüz:** JavaFX 26.0.1
- **Araçlar:** IntelliJ IDEA, Git

## 📦 Kurulum ve Çalıştırma
Projeyi yerelinizde çalıştırmak için:
1. JavaFX SDK'nın bilgisayarınızda kurulu olduğundan emin olun.
2. IDE'nizde **VM Options** kısmına şu modülleri ekleyin:
   ```bash
   --module-path "/yol/to/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml --enable-native-access=javafx.graphics
