/*
PENJELASAN
Integer number = bilangan bulat
Floating point number = bilangan pecahan / desimal

Tipe data Integer:
byte        :  -128 sampai 127 (1 byte)
short       :  -32.768 sampai 32.767  (2 byte)
int         :  -2.147.483.648 sampai 2.147.483.647  (4 byte)
long        :  -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807 (8 byte)

nb : paling sering digunakan int
nilai default = 0 (kalau tidak diisi)
*/
public class TipeDataNumber {
  public static void main(String[] args) {
    
    // tipe data number
byte NamaVariabel = 100 ;
byte NamaVariabel2 = 1000 ; // ini akan error karena keluar dari angka minimum dan maksimum
short NamaVariabel = 3478 ;
int NamaVariabel = 4356672 ;
long NamaVariabel = 342879879 ;
long NamaVariabel2 = 397678688L ; //<========= bisa ditambahkan L di depan angka untuk menandakan ini long
  }
}

/*
PENJELASAN
Tipe data Float:
float       : 3,4e-038 sampai 3,42+038 (4 byte)
double      : 1.7e-308 sampai 1.7e+308 (8 byte)

nb: paling sering digunakan double
nilai default = 0,0 (kalau tidak diisi)
*/

public class TipeDataNumber {
  public static void main (String[] args) {
    
float NamaVariabel = 10.10F ; //pake titik dan huruf F
double NamaVariabel = 10.10 ; // ini angkanya sama namun tipe datanya berbeda
    
    }
}

/*
PENJELASAN
Tipe data literals number:
int decimalint = 25
int hexInt = 0xA123B              bilangan pecahan 16 (0 sampai 9 A sampai F) (harus ada "0x")
int binInt = 0b100101             ( angka 0 dan angka 1 ) (harus ada "0b")

*/

public class TipeDataNumber {
  public static void main(String[] args) {
    
int NamaVariabel = 25 ;   //ini desimal
int NamaVariabel = 0xFFFFF ;  //ini hexadesimal
int NamaVariabel = 0xF335JK ; //ini akan error karena ada huruf selain huruf A-F dan angka 0-9
int NamaVariabel = 0b10101 ;  //ini binary
int NamaVariabel = 0b0432 ; //ini akan error karena ada angka selain 1 dan 0
       }
}

/*
PENJELASAN
Tipe data number dengan underscore:
long NumberName = 1_000_000_000L
int NumberName = 60_000_000

nb : posisi underscore terserah , dan biasanya digunakan untuk memisah angka
ini ga wajib

*/

public class TipeDataNumber {
  public static void main(String[] args) {
    long NumberName = 1_000_000_000L ;
    int NumberName = 60_000_000 ;
    
      }
}


  
