package ilkproje
import java.util.*
private val tara = Scanner(System.`in`)
private val cepTelefonu= ceptlfnrehber(kendiNumaram = "555 555 55 55")


fun main(args:Array<String>) {

    telefonuBaslat()
    menuGoster()

    var cikis: Boolean = false
    while (!cikis) {
        println(
            "SEÇİMİNİZİ YAPINIZ : " +
                    " ( menüyü tekrar görmek istiyorsanız 6 yı tuşlayınız)"
        )
        var secim = tara.nextInt()
         when (secim) {

            0 -> {
                println("çıkış yapılıypr")
                cikis = true
            }

                1 -> {
                    cepTelefonu.tumkisileriListele()

                }
            2 -> {
                yenikisieklefonksiyonu()

            }
            3 -> {
               kisiSorgulamafonksiyonu()
            }
             4->{
                 kisiSilfonksiyonu()


             }

             5->{
                 kisiGüncellefonksiyonu()
             }
            6 -> {
                menuGoster()

            }
            else -> {
                println("yanlış bir seçim yaptınız")

            }

        }
    }
}

fun kisiGüncellefonksiyonu() {
    println("güncellemek istediğiniz kişiyi giriniz:")
    val isim = tara.next()
    val bulunanKisi = cepTelefonu.kisiSorgula(isim)
    if (bulunanKisi == null) {
        println("kişi bulunamadı")
        return
    }
    println(" kişinin yeni ismini giriniz")
    val yeniisim = tara.next()
    println("kişinin yeni numarasını giriniz")
    val yeninumara = tara.nextInt()
    cepTelefonu.kisiGüncelle(bulunanKisi, Kisi.kisiOlustur(yeniisim, yeninumara))

}
fun kisiSilfonksiyonu() {
    println("silinecek kişinin adı:")
    val isim=tara.next()
    val bulunanKisi= cepTelefonu.kisiSorgula(isim)
    if(bulunanKisi!=null){
if(cepTelefonu.kisiSil(bulunanKisi!!)){
    println("kişi silindi")
}

    } else{
        println("böyle bir kişi rehberde yok")
    }

}

fun yenikisieklefonksiyonu() {
    println("yeni kişinin adını giriniz :")
    val isim = tara.next()
    println("yeni kişinin numarasını giriniz :")
    val numara = tara.nextInt()
    //var eklenecekKisi = Kisi(isim , numara)
    //cepTelefonu.ekleYeniKisi(eklenecekKisi)
      cepTelefonu.ekleYeniKisi(Kisi.kisiOlustur(isim, numara))

}

fun menuGoster() {
    println("*********** MENÜ ***********")
    println("0-)çıkış\n" +
            "1-) kişilerin listesi?\n"+
            "2-) yenikişi ekle\n"+
            "3-) kişi sorgula\n"+
            "4-) kişi sil\n"+
            "5-) kişi güncelle\n"+
            "6-) menüyü göster\n")


}

    fun telefonuBaslat() {
        println("Telefon başlatılıyor...")
    }

fun kisiSorgulamafonksiyonu(){
println("sorgulamak istediğiniz kişinin ismini giriniz:")
    val isim=tara.next()
val bulunanKisi=cepTelefonu.kisiSorgula(isim)
if(bulunanKisi==null) {
    println("rehberde böyle bu isimde kişi yok")
    return
}else {
    println("bulunan kişi: ${bulunanKisi.isim}------${bulunanKisi.telNo}")
}
}



