# Account-v1

Bu proje, Spring Boot kullanılarak geliştirilmiş bir hesap yönetimi mikro servisidir. Müşteri hesaplarının oluşturulması, hesap bakiyelerinin görüntülenmesi ve müşteri bilgilerinin sorgulanması gibi temel hesap işlemlerini destekler.
## Özellikler
- **Hesap Oluşturma:** Yeni müşteri hesapları oluşturma ve ilk bakiye atama.
- **Hesap Bilgileri:** Belirli bir hesabın bakiye ve işlem geçmişi gibi bilgilerini görüntüleme.
- **Müşteri Bilgileri:** Belirli bir müşterinin hesaplarını ve kişisel bilgilerini görüntüleme.
- **Hata Yönetimi:** Geçersiz istekler ve bulunamayan müşteriler gibi hataları uygun HTTP durum kodlarıyla yönetme.
- **Veri Doğrulama:** İstek verilerinin doğruluğunu kontrol etme ve geçersiz verileri reddetme.
- **Test Kapsamı:** Birim testler ve entegrasyon testleri ile kodun işlevselliğini doğrulama.
##Teknolojiler
- **Spring Boot:** Java tabanlı mikro servis geliştirme için popüler bir framework.
- **Spring Data JPA:** Veritabanı işlemlerini kolaylaştıran bir ORM (Object-Relational Mapping) aracı.
- **H2 Database:** Hafızada çalışan, geliştirme ve test amaçlı kullanılan bir ilişkisel veritabanı.
- **Kotlin:** Java ile uyumlu, modern ve özlü bir programlama dili.
- **JUnit:** Java için popüler bir birim test framework'ü.
- **Mockito:** Birim testlerde bağımlılıkları taklit etmek (mock) için kullanılan bir kütüphane.

## Kurulum
 1.**Gereksinimler**
- Java 17 veya daha yeni bir sürüm
- Maven
**Proje dosyalarını klonlayın:**
```bash
git clone https://github.com/hudakocabiyik/Account-v1.git
cd Account-v1
```
2.**Uygulamayı Derleme ve Çalıştırma**
```bash
mvn spring-boot:run
```
Uygulama, varsayılan olarak http://localhost:8080 adresinde çalışacaktır.

## API Uç Noktaları
**Hesap İşlemleri**
- POST /v1/account: Yeni bir hesap oluşturur.  
**İstek Gövdesi:**  
- customerId (String): Müşteri kimliği
- initialCredit (BigDecimal): Hesabın ilk bakiyesi (0 veya daha büyük olmalıdır)  
 **Yanıt:**  
- 200 OK: Hesap başarıyla oluşturulduğunda, oluşturulan hesabın detaylarını içeren bir AccountDto nesnesi döner.
- 400 Bad Request: İstek verileri geçersizse (örneğin, müşteri kimliği boş veya ilk bakiye negatifse) hata mesajları içeren bir yanıt döner.
- 404 Not Found: Belirtilen müşteri kimliği bulunamadıysa hata mesajı içeren bir yanıt döner.
##- Müşteri İşlemleri

GET /v1/customer/{customerId}: Belirtilen kimliğe sahip müşterinin bilgilerini ve hesaplarını getirir.  
**Yanıt:**  
200 OK: Müşteri başarıyla bulunduğunda, müşterinin detaylarını ve hesaplarını içeren bir CustomerDto nesnesi döner.
404 Not Found: Belirtilen müşteri kimliği bulunamadıysa hata mesajı içeren bir yanıt döner.
##Testler
Proje, birim testler ve entegrasyon testleri içerir. Testleri çalıştırmak için aşağıdaki komutu kullanabilirsiniz:
```bash
mvn test
```
## Katkıda Bulunma
Katkıda bulunmak isterseniz, lütfen bir pull request oluşturun veya proje hakkında herhangi bir sorun bildirmek için bir issue açın.
