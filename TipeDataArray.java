/*
TIPE DATA ARRAY

1. Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
2. Jumlah data di Array tidak bisa dirubah setelah pertama kali dibuat

*/

    public class TipeDataArray {
      public static void main(String[] args) {
        
        String[] namaVariabelArray;             //String[] karena valuenya yaitu string kalo integer berarti int[]
        namaVariabelArray = new String [3] ;    //ini jumlah valuenya yaitu 3
        namaVariabelArray[0] = "Ini" ;
        namaVariabelArray[1] = "valuenya" ;
        namaVariabelArray[2] = "String" ;
        
        System.out.println(namaVariabelArray[2])    //String   
        //kalau langsung
        String[] namaVariabelArray = new String [3]
          
        //mengubah isi array
        namaVariabelArray[2] = "Baru" ;         
        System.out.println(namaVariabelArray[2])     //Baru
        
        System.out.println(namaVariabelArray[1])     //valuenya
        System.out.println(namaVariabelArray)        //[Ini, valuenya, Baru]
          
          
        // Array Initializer (jadi langsung memasukkan nilai arraynya)
        int[] arrayInt = new int[] {
          10, 90, 80, 76, 29
         }
        
        long[] arrayLong = {
          10, 90, 80, 76, 29
        }
              
        System.out.println(arrayLong)       // [  10, 90, 80, 76, 29  ]
        }
    }


/* 

OPERASI DI ARRAY
1. array[index]                       : mengambil data di array
2. array[index] = value               : mengubah data di array
3. array.length                       : mengambil panjang array

*/

long[] arrayLong = { 
  10L, 20L, 30L 
};

System.out.println(arrayLong.length) // 3

  /* 
  
  NOTE
  1. Di java, tidak ada penghapusan data array 
  2. hanya bisa mengkosongkan data dengan arrayLong[0] = 0
  3. kalau string bisa mengkosongkan data dengan arrayString[0] = null
  4. karena panjang array sudah fix
  
  */
  

