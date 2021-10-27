package ilkproje

class Kisi (var isim:String, var telNo: Int) {


 companion object {
  fun kisiOlustur(isim: String, telNo: Int): Kisi {

   return Kisi(isim,telNo)


  }
 }
}