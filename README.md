# Account-v1

Account-v1, mevcut müşteriler için yeni bir "cari hesap" açmak üzere kullanılacak bir API sunar.

## Gereksinimler

- API, kullanıcı bilgilerini (customerID, initialCredit) kabul eden bir endpoint sunuyor.
- Endpoint çağrıldığında, belirtilen customerID'ye bağlı yeni bir hesap açılıyor.
- initialCredit 0 değilse, yeni hesaba bir işlem gönderiliyor.
- Başka bir Endpoint, hesapların işlemleriyle birlikte kullanıcı bilgilerini (Ad, Soyad, Bakiye) gösteriyor.

## Bonuslar

- Hesaplar ve İşlemler farklı servislerdir.
- Basit bir frontend (tek sayfa yeterlidir).



## Kurulum

Proje dosyalarını klonlayın:
```bash
git clone https://github.com/hudakocabiyik/Account-v1.git
cd Account-v1
