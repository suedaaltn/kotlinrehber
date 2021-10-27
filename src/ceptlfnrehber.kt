package ilkproje

class ceptlfnrehber(val kendiNumaram:String) {

    private val rehber: ArrayList<Kisi>

    init {
        this.rehber = ArrayList()
    }

    fun ekleYeniKisi(yeniKisi: Kisi): Boolean {
        if (kisiBul(yeniKisi.isim) >= 0) {
            println("$yeniKisi.isim zaten rehberde kayıtlı")
            return false
        }
        this.rehber.add(yeniKisi)
        println("Başarılı bir şekilde yeni kişi eklendi ")
        return true
    }

    fun kisiBul(aranacakKisi: Kisi): Int {
        return this.rehber.indexOf(aranacakKisi)

    }

    fun kisiBul(isim: String): Int {

        for (i: Int in rehber.indices) {
            val oankiKisi = rehber[i]
            if (oankiKisi.isim.equals(isim)) {
                return i
            }

        }
        return -1
    }

    fun tumkisileriListele() {
        println("***********REHBER**********")
        if (rehber.size == 0) {
            println("Rehberde kayıtlı kişi bulunmuyor")
            return
        }
        for (oankiKisi: Kisi in rehber) {
            println("* ${oankiKisi.isim} -----${oankiKisi.telNo}")


        }

    }
       fun kisiSorgula(isim: String):Kisi? {

        val position = kisiBul(isim)
        return if (position >= 0) {
            rehber[position]
        }
        else null
       }

    fun kisiSil(silinecekKisi:Kisi):Boolean {
     val position=kisiBul(silinecekKisi)
        if(position<0){
      println("böyle bir kişi rehberde yok")
    return false
        }
        this.rehber.remove(silinecekKisi)
        println("kişi silindi")
        return true


    }

    fun kisiGüncelle(eskiKisi:Kisi,yeniKisi:Kisi):Boolean{

        val bulunanPosition=kisiBul(eskiKisi)
if(bulunanPosition<0){
    println("böyle böyle bir kişi rehberde yok")
    return false
}
       rehber[bulunanPosition]=yeniKisi
        println("${eskiKisi.isim}kişisi${yeniKisi.isim}olarak güncellenmiştir.")
return true
    }

}















