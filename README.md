# Data-Structures-Samples

## Veri Yapıları ile ilgili yaptığım kodlama örnekleri

## Veri yapıları ile yapmış olduğum uygulamalar.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

# -Linked List(Bağlı Listeler)

Java dilinde Linked List'de Tek Yönlü Doğrusal Bağlı Listeler,Çift Yönlü Doğrusal Bağlı Listeler,Tek Yönlü Dairesel Bağlı Listeler ve Çift Yönlü Dairesel Bağlı Listeler üzerinde Başa(Head) ekleme, Araya ekleme, Sona(Tail) ekleme, Baştan(Head) silme, Aradan silme, Sondan(Tail) silme işlemlerini basit bir şekilde Console ekranında yapabilen küçük program örnekleridir.
Baştaki düğüme :head denir.
Sondaki düğüme :tail denir.
Bir düğümün sonraki düğümünü göstermeye next deriz eğer bir düğümden sonra düğüm yoksa yani son düğümse next'i null gösterir.
Bir düğümün önceki düğümünü göstermeye prev deriz.
Yeni bir düğüm eklerken temp kullanarak yeni düğümü orada tutup araya ekleriz.
Silme işlemi yaparken kullanıcıdan hangi indisi sileceğini sorarız.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

# -Stack(Yığın) Yapısı

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

# -Queue (Kuyruk) yapısı

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

# -Ağaç (Tree) Veri Yapısı

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

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

# -Hash Table Yapısı

Hash Table yapısı ilk olarak key ve o keylerin tuttuğu verilerden oluşur.

bir dizimiz olsun ve bu dizi 3 elemanlı olsun(0,1,2), bu elemanların her biri bir listeyi tutar ve düğümler o listede dizinin hangi elemanına yani key'ine ait ise orada tutulurlar.

Bu dizide'de Linked list mantığı kullanılır. 
Araya ekleme başa ve sona ekleme. Baştan silme, aradan silme ve ortadan silme mantığı tamamen aynıdır.

Farkı olarak burda her bağlı listenin bir keyi vardır diziye eklenecek her yeni düğüm içindeki verinin hangi keyle eşleştiğine bağlıdır.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

# -Sıralama Algoritmaları

Yaklaşık 30'dan fazla sıralama algoritması bulunmaktadır.
Sıralama algoritmaları'nın sayısı çoktur, fakat biz en çok bilinenler arasında 3 tanesini buraya ekleyeceğiz.

Sıralama algoritması, bilgisayar bilimlerinde ya da matematikte kullanılan, verilen bir listenin elemanlarını belirli bir sıraya sokan algoritmadır. En çok kullanılan sıralama türleri, sayı büyüklüğüne göre sıralama ve alfabetik sıralamadır.

## Bubble Sort - Insertion Sort - Selection Sort

                                                -------------------------------------------------------------------

### Bubble Sort(Kabarcık Sıralaması)

Sıralanacak dizinin üzerinde sürekli ilerlerken her defasında iki öğenin birbiriyle karşılaştırılıp, karşılaştırılan öğelerin yanlış sırada olmaları durumunda yerlerinin değiştirilmesi mantığına dayanır.

Algoritma, herhangi bir değişiklik yapılmayıncaya kadar dizinin başına dönerek kendisini yineler. Adına "Kabarcık" sıralaması denmesinin nedeni büyük olan sayıların aynı suyun altındaki bir kabarcık gibi dizinin üstüne doğru ilerlemesidir.

Örnek: İçeriği "5 1 4 2 8" olan bir dizi kabarcık sıralaması ile en küçükten en büyüğe doğru aşağıdaki biçimde sıralanır. Her adımda dizinin kalın olarak işaretlenmiş elemanları karşılaştırılan elemanlardır.

Birinci Geçiş:
( 5 1 4 2 8 ) --> ( 1 5 4 2 8 ) Burada algoritma ilk iki elemanı karşılaştırır ve yerlerini değiştirir.
( 1 5 4 2 8 ) --> ( 1 4 5 2 8 )
( 1 4 5 2 8 ) --> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) --> ( 1 4 2 5 8 ) Burada elemanlar zaten sıralı olduğu için algoritma yerlerini değiştirmez.
İkinci Geçiş:
( 1 4 2 5 8 ) --> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) --> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )

                                                -------------------------------------------------------------------

### Insertion Sort

Eklemeli Sıralama, bilgisayar bilimlerinde kullanılan ve sıralı diziyi her adımda öğe öğe oluşturan bir sıralama algoritmasıdır. Büyük dizilerle çalışıldığında hızlı sıralama, birleştirmeli sıralama ve yığın sıralaması gibi daha gelişmiş sıralama algoritmalarından daha verimsiz çalışır. Ancak buna karşın bazı artıları da vardır:

Uygulaması kolaydır.
Küçük Veri kümeleri üzerinde kullanıldığında verimlidir.
Çoğunluğu zaten sıralanmış olan diziler üzerinde kullanıldığında verimlidir.
Karmaşıklığı olan seçmeli sıralama ve kabarcık sıralaması gibi çoğu yalın sıralama algoritmalarından daha verimlidir.
Kararlı bir sıralama algoritmasıdır (değeri eşit olan öğelerin asıl listedeki göreceli konumlarını değiştirmez).
Sıralanacak dizinin hepsinin algoritmanın girdisi olmasına gerek yoktur. Dizi parça parça da alınabilir ve sıralama işlemi sırasında diziye yeni veriler eklenebilir.
İnsanlar herhangi bir şeyi (örneğin, iskambil kartları) sıralarken, çoğu durumda eklemeli sıralamaya benzer bir yöntem kullanırlar.

Örnek: 

8 2 4 9 3 6 --- > Bu sırasız, ham dizimiz.
8* 2 4 9 3 6 --- > Dizinin ilk indisi olan 8 seçildi. Öncesinde başka bir değer olmadığı için bir sonraki aşamaya geçiliyor.
8 2* 4 9 3 6 --- > Dizinin ikinci indisi olan 2 seçildi ve dizinin şu an tuttuğumuz 2 sayısından daha büyük bir değer oldukça başa taşınacak ve 8 ile yer değişecektir.
2 8 4* 9 3 6 --- > Benzer işlemleri bütün indislere sırası ile uyguluyoruz.
2 4 8 9* 3 6
2 4 8 9 3* 6
2 3 4 8 9 6*
2 3 4 6 8 9 --- > Sıralanmış dizimiz

                                                -------------------------------------------------------------------

### Selection Sort

Seçmeli Sıralama, bilgisayar bilimlerinde kullanılan bir sıralama algoritmasıdır. Karmaşıklığı olduğu için büyük listeler üzerinde kullanıldığında verim sağlamaz ve genel olarak benzeri olan eklemeli sıralamadan daha başarısızdır. Seçmeli sıralama yalın olduğu ve bazı durumlarda daha karmaşık olan algoritmalardan daha iyi sonuç verdiği için tercih edilebilir.

Algoritma aşağıdaki gibi çalışır:

Listedeki en küçük değerli öğeyi bul.
İlk konumdaki öğeyle bulunan en küçük değerli öğenin yerini değiştir.
Yukarıdaki adımları listenin ilk elemanından sonrası için (ikinci elemandan başlayarak) yinele.

https://tr.wikipedia.org/wiki/Dosya:Selection-Sort-Animation.gif



