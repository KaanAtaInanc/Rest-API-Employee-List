🚀 Employee Management System - Spring Boot REST API


Bu proje, Java ve Spring Boot kullanılarak geliştirilmiş, çalışan listesini yöneten ve bir kullanıcı arayüzü (Frontend) ile entegre çalışan bir Full-Stack uygulamadır.

Özellikle Spring Boot'un paket yapısı, Component Scanning hiyerarşisi ve RESTful servis mimarisini uygulamalı olarak anlamak amacıyla geliştirilmiştir.

📋 Proje Özellikleri
Backend: Java 17 & Spring Boot tabanlı RESTful API.

Frontend: Modern ve karanlık tema (Dark Mode) destekli, dinamik bir çalışan listesi sayfası.

Entegrasyon: Backend verileri (JSON) Frontend tarafında asenkron olarak çekilip tabloda listelenir.

Lombok: Kod kalabalığını azaltmak için Getter/Setter ve Constructor yönetiminde kullanılmıştır.

🛠️ Kullanılan Teknolojiler
Java 17

Spring Boot 3.x

Spring Web (REST API endpoint'leri için)

Lombok

Maven (Bağımlılık yönetimi)

JavaScript & Tailwind CSS (Frontend arayüzü için)

📁 Paket Yapısı (Project Hierarchy)
Proje, Spring Boot'un en iyi uygulama (best practice) standartlarına göre yapılandırılmıştır:

Plaintext
src/main/java/com/kaanata/springrestapi
├── controller    # REST Endpoint'lerinin bulunduğu katman
├── service       # İş mantığının (Business Logic) yürütüldüğü katman
├── model         # Employee nesnelerinin (Entity) bulunduğu katman
└── Starter       # Uygulamanın ana giriş noktası (Main Class)
🚀 Kurulum ve Çalıştırma
Projeyi Klonlayın:

Bash
git clone https://github.com/KaanAtaInanc/Rest-API-Employee-List.git
Maven Bağımlılıklarını Yükleyin:

Bash
mvn clean install
Uygulamayı Başlatın:
SpringRestApiApplication.java dosyasını çalıştırın.

API'yi Test Edin:
http://localhost:8080/rest/api/employes-list adresine bir GET isteği atın (Postman veya Browser üzerinden).

Projeden Ekran Görüntüleri

<img width="1571" height="1077" alt="image" src="https://github.com/user-attachments/assets/f152fa3d-b022-4ce2-8780-8a63cf67873c" />

<img width="1549" height="1078" alt="image" src="https://github.com/user-attachments/assets/9ae87db6-0717-4ad5-8558-11d74b217a29" />

<img width="1743" height="763" alt="image" src="https://github.com/user-attachments/assets/234929b2-738c-4cfb-8ea2-c3d4ffa8af43" />

<img width="2559" height="1329" alt="image" src="https://github.com/user-attachments/assets/dd34d332-069e-409c-9ddc-c692145b24a3" />



