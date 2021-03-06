/* 
PENULISAN VARIABEL
1. Java adalah static type jadi harus menyimpan dengan tipe data yang sama , seperti: (int Variabel = 100), tidak boleh (int Variabel = true)
2. Java berbeda dengan javascript dan php
3. Nama Variabel tidak boleh mengandung whitespace (spasi,enter,tab), dan tidak boleh seluruhnya number
*/

public class Variabel {
  public static void main(String[] args) {
    
String namaVariabel;                                          //ini akan diisi default value dahulu yaitu null
namaVariabel = " kita bisa memasukkan value seperti ini " ;
namaVariabel = " ini nama baru"                                //value jadi "ini nama baru"

int angkaVariabel = "nama" // ini error karena beda tipe data
int angkaVariabel = 300 ;  //langsung inisiasi
    
 System.out.println( namaVariabel )                     // ini nama baru
 System.out.println( angkaVariabel )                    // 300
    
    }
}

/* 
KATA KUNCI VAR
1. Sejak Java versi 10 bisa menggunakan kata kunci var, sehingga tidak perlu menyebutkan tipe datanya
2. saat menggunakan kata kunci var untuk membuat variabel, harus menginisiasi value dari variabel secara langsung
*/

public class Variabel {
  public static void main(String[] args) {
    
    var NamaVariabel ;
    NamaVariabel = "ini value" // ini error
      
   var angkaVariabel = 30
   var stringVariabel  = "ini value"
      
   System.out.println( stringVariabel )                     // ini value
   System.out.println( angkaVariabel )                      // 30
      
    //lebih enak digunakan 
        }
}

/* 
KATA KUNCI FINAL
1. Secara default, variabel di Java bisa diubah-ubah nilainya
2. Jika ingin nilai data di vaiabel tidak bisa diubah setelah dibuat bisa menggunakan kata kunci final
3. Kata kunci ini banyak yang menyebutnya konstan sperti const di javascript
*/

public class Variabel {
  public static void main(String[] args) {
    
    final String NamaVariabel = " ini value " ;
    NamaVariabel = " ini value baru " //ini error (cannot assign a value to final variable NamaVariabel
      
   //jadi intinya kita gabisa re-assign atau mengubah valuenya kalau memakai kata kunci final
    }
}
    
    
    
