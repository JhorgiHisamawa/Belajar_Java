/*
Widening Casting = konversi otomatis dari java-nya yaitu:
byte-short-int-long-float-double
Narrowing Casting = konversi manual yaitu:
double-float-long-int-short-byte
*/

public class KonversiTipeDataNumber {
  public static void main(String[] args) {
    
    byte NamaVariabelByte = 10 ;
    short NamaVariabelShort = NamaVariabelByte ;
    int NamaVariabelInt = NamaVariabelShort ;
    long NamaVariabelLong = NamaVariabelInt ;
    float NamaVariabelFloat = NamaVariabelLong ;
    double NamaVariabelDouble = NamaVariabelFLoat ;
    
    float NamaVariabelFloat2 = (float) NamaVariabelDouble ;
    long NamaVariabelLong2 = (long) NamaVariabelFLoat2 ;
    int NamaVariabelInt2 = (int) NamaVariabelLong2 ;
    short NamaVariabelShort2 = (short) NamaVariabelInt2 ;
    byte NamaVariabelByte2 = (byte) NamaVariabelShort2 ;
    
    
/* HATI-HATI 
jika konversi paksa melebihi batas nilai dari tipe data number
*/
    int NamaInteger = 1000 ;
    byte NamaByte = (byte) NamaInteger // ini akan mengakibatkan number overflow
      
// jadi setelah byte mencapai angka 127, byte akan kembali ke -128, terus akan ditambahkan sampai ia akan mencapai 1000
        }
}
    
