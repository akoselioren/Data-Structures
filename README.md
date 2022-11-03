# Data-Structures-Samples
Veri Yapıları ile ilgili yaptığım kodlama örnekleri

Veri yapıları ile yapmış olduğum uygulamalar.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Linked List(Bağlı Listeler)

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
Düğümlerin boyutuda kontrol edilir yani düğüm sayısını kontrol ederek yapının dolu yada boş olma durumlarını değerlendirebilmek için fonksiyon yazılır.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Queue (Kuyruk) yapısı

FIFO (First In First Out)
Mantığı kuyruğa ilk giren ilk çıkar, son giren düğüm son çıkar şeklindedir.
Örneğin ATM kuyruğu gibi düşünebiliriz kuyruğa ilk girip işlem yapan kişi ilk çıkar son gelen kişide en son çıkan kişi'dir.
Kuyruğun başındaki Düğüm'e Front denir. (bağlı listelerdeki Head gibi)
Kuyruğun sonundaki Düğüm'e Rear denir.  (bağlı listelerdeki Tail gibi)
Kuyruğa gelecek(Ekleme işlemine) olan Düğüm'e Enqueue denir.
Kuyrukdan ayrılacak(Silme işlemine) olan Düğüm'e Dequeue denir.
Kuyruğun sonundaki düğüm yani Rear'ın göstericisi her zaman null'u gösterir.
Düğümlerin boyutuda kontrol edilir yani düğüm sayısını kontrol ederek yapının dolu yada boş olma durumlarını değerlendirebilmek için fonksiyon yazılır.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Palindrom Uygulaması
Palindrom :Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.

Stack Yapısı + Queue Yapısı ile uygulama

İki yapıda'da düğümler oluşturarak bu düğümlere kullanıcının girmiş olduğu datayı char tipinde rakam rakam yada harf harf her düğüme bir tane olacak şekilde atıyarak karşılaştırma işlemini yapıyoruz.

Stack yapısında son giren ve aynı zamanda ilk çıkan Char tipindeki harf yada sayı ile Queue yaısında kuyruğa ilk giren ve aynı zamanda ilk çıkan harf yada sayı karşılaştırılarak o datanın bir palindrom olup olmadığını sorguluyoruz, sonucu console'da ekrana yazdırıyoruz.


----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Ağaç (Tree) Veri Yapısı

İlk oluşturulan düğüme kök düğüm(root) denir.
Kendisinden türeyen düğüm yoksa o düğüme yaprak düğüm denir.
Kök düğümden türeyen bir düğümden türeyen başka bir düğüm varsa o düğüm ebeveyn düğümdür.
Köklerde derinlik yada yükseklik kavramı vardır, düğümün kök düğüme olan uzaklığına denir, kök düğümden itibaren kendiside dahil olmak üzere kaç düğüm varsa o düğümün derinliği o sayıdır.
Düğümlerin kuralına göre düğümün'ün solundaki veri düğümden küçük sağındaki veri düğümden büyük olmak zorundadır, bu kural her düğüm için ayrı uygulanır.

Kök(Root): Ağacın en üstteki düğümü.

Ebeveyn(Parent): Bir çocuğu veya çocukları olan bir düğüm.

Çocuk(Child): Başka bir düğümden (üst düğüm) genişletilmiş bir düğüm.

Yaprak(Leaf): Çocuğu olmayan bir düğüm.

BTree (İkili arama ağacı)

Bu yapılar İkili arama ağaçlarını belirli bir düzene sokarak üzerinde işlem yapmamıza ve aranan veriyi rahat bulmamızı sağlar. Yani kısaca özetlemek gerekirse ağaç üzerinde gezinmemizi sağlar

Bir ağacın üzerinde gezmenin yöntemleri her birinin izledikleri belirli bir sıra vardır:

preOrder(önce kök) için:  sol alt ağaçtan köke , ardından sağ alt ağaca geçersiniz. (Sol, Kök, Sağ)

İnOrder(ortada Kök) için: kökten sol alt ağaca , ardından sağ alt ağaca geçersiniz. (Kök, Sol, Sağ)

PostOrder(sonda kök) için: sol alt ağaçtan sağ alt ağaca ve ardından köke geçersiniz. (Sol, Sağ, Kök)














