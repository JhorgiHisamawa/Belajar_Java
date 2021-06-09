/*

1. Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
2. Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
3. Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
4. Tipe data bukan primitif bisa memiliki method/functiion (yang akan dibahas nanti)
5. Semua tipe data primitif di java memiliki represenaasi tipe data bukan primitifnya

*/

public class PrimitiveDanNonPrimitive {
  public static void main(String[] args) {
    
  //Tipe data primitif
    byte DataByte ;
    short DataShort ;
    int DataInt ;
    long DataLong ;
    float DataFloat ;
    double DataDouble ;
      
     char DataChar ;
     boolean DataBoolean ;
      
  //Contoh
  Integer iniInteger = 100 ; //100
  Long iniLong = 10000L ; //10000
  
  Byte iniByte ;
  Long iniLongBro = null ;
    
    
  System.out.println(iniByte) //error ( variabel iniByte belum diinisialisasi
  iniByte = 100 
    
  System.out.println(iniByte) //100
  System.out.println(iniLongBro) //null
  /* 
  saat menggunakan data primitif default value = 0 
  */
      
  //Tipe data non primitif
      Byte DataByte
      Short DataShort
      Integer DataInteger
      Long DataLong
      Float DataFLoat
      Double DataDouble
      
      Character DataChar
      Boolean DataBoolean
      
    /* 
    saat menggunakan data non primitif default value = null
    ingat String bukan data primitif
    */
    
  // Convert primitive ke non primitive
    int iniInt = 100 ;
    Integer iniInt2 = iniInt ;        //secara otomatis konversi
    
    int integerLagi = iniInt2 ;       //kalo mau kembali ke primitive lagi
    
  //Convert value yang tidak kompatibel
    short iniShort = iniInt2.shortValue() ;  //karena tipe data non primitive memiliki method jadi untuk memanggil method menggunakan (vaariabel.namamethod)
    byte iniByte = iniInt2.byteValue() ;
    short iniShort2 = iniInt2                 //error
      
    }
} 
