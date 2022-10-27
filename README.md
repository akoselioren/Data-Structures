# Data-Structures-Samples
Veri Yapıları ile ilgili yaptığım kodlama örnekleri

Almış olduğum Veri yapıları kursu ile yapmış olduğum uygulamalar.

-Linked List(Tek Yönlü Bağlı Listeler)

Java dilinde Linked List'de Tek Yönlü Doğrusal Bağlı Listeler,Çift Yönlü Doğrusal Bağlı Listeler,Tek Yönlü Dairesel Bağlı Listeler ve Çift Yönlü Dairesel Bağlı Listeler üzerinde Başa(Head) ekleme, Araya ekleme, Sona(Tail) ekleme, Baştan(Head) silme, Aradan silme, Sondan(Tail) silme işlemlerini basit bir şekilde Console ekranında yapabilen küçük program örnekleridir.
Baştaki düğüme :head denir.
Sondaki düğüme :tail denir.
Bir düğümün sonraki düğümünü göstermeye next deriz eğer bir düğümden sonra düğüm yoksa yani son düğümse next'i null gösterir.
Bir düğümün önceki düğümünü göstermeye prev deriz.
Yeni bir düğüm eklerken temp kullanarak yeni düğümü orada tutup araya ekleriz.
Silme işlemi yaparken kullanıcıdan hangi indisi sileceğini sorarız.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Stack(Yığın) yapısı

LIFO(Last In First Out)
Mantığı ilk giren düğüm son çıkar, Son giren düğüm ilk çıkar şeklindedir.
Örneğin bir kavanozun içine dizilen topların geri çıkarılırken en son koyduğumuzu geri almamız gibidir.
En alttaki düğümün göstericisi her zaman null'u gösterir.
Düğümler üst üste eklenerek devam ederler.
Silerkende üstten aşşağı doğru silinir.
Ekleme işlemi :Push fonksiyonuyla yapılır.
Çıkartma işlemi :Pop fonksiyonuyla yapılır.
En üstteki düğümü tutan değişkene top adı verilir.(bağlı listelerdeki Head gibi)
Top'ı gösteren düğümün next'i bir altındaki düğümü gösterir.
Stack yapısında düğümlerin boyutuda kontrol edilir yani düğüm sayısını kontrol ederek yapının dolu yada boş olma durumlarını değerlendirebilmek için fonksiyon yazılır.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Queue (Kuyruk) yapısı
FIFO (First In First Out)
Mantığı kuyruğa ilk giren ilk çıkar, son giren düğüm son çıkar şeklindedir.
Örneğin ATM kuyruğu gibi düşünebiliriz kuyruğa ilk girip işlem yapan kişi ilk çıkar son gelen kişide en son çıkan kişi'dir.
Kuyruğun başındaki Düğüm'e Front denir.
Kuyruğun sonundaki Düğüm'e Rear denir.
Kuyruğa gelecek(Ekleme işlemine) olan Düğüm'e Enqueue denir.
Kuyrukdan ayrılacak(Silme işlemine) olan Düğüm'e Dequeue denir.
Kuyruğun sonundaki düğüm yani Rear'ın göstericisi her zaman null'u gösterir.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
