# Account-v1

Account-v1, mevcut müşteriler için yeni bir "cari hesap" açmak üzere kullanılacak bir API sunar.

## Gereksinimler

- API, kullanıcı bilgilerini (customerID, initialCredit) kabul eden bir endpoint sunacaktır.
- Endpoint çağrıldığında, belirtilen customerID'ye bağlı yeni bir hesap açılacaktır.
- initialCredit 0 değilse, yeni hesaba bir işlem gönderilecektir.
- Başka bir Endpoint, hesapların işlemleriyle birlikte kullanıcı bilgilerini (Ad, Soyad, Bakiye) gösterecektir.

## Bonuslar

- Hesaplar ve İşlemler farklı servislerdir.
- Basit bir frontend (tek sayfa yeterlidir).
- CI/CD'ye dikkat.

## Kısıtlamalar

- Herhangi bir açık kaynak aracı veya framework'ü kullanmakta özgürsünüz.
- Veriyi saklamak için, veri bellekte saklanabilir ve gerçekten dış bir veritabanına kaydedilmek zorunda değildir. Ancak, bu bir backend görevi olduğundan, katmanları, soyutlamaları, test edilebilirliği ve kurumsal düzeydeki mimariyi dikkatlice değerlendirin.
- Programlama dili olarak varsayılan Java / C# kullanılmalıdır, ancak başka bir dili tercih ediyorsanız bize bildirin.

## Beklentiler

- Beklenen teslimat, GitHub veya GitLab üzerinde yayınlanan kaynak kod ve bunu nasıl çalıştırıp test edeceğinize dair talimatlardır.
- İyi git uygulamaları ve iş akışı gösterimi bekliyoruz; takım içinde nasıl çalıştığınızı gösterin.

## Kurulum

Proje dosyalarını klonlayın:
```bash
git clone https://github.com/kullaniciadi/Account-v1.git
cd Account-v1
