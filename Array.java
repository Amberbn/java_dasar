public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[2]; //deklarasi array manual dengan cara ditentukan panjang array

        stringArray[0] = "Benny";
        stringArray[1] = "Amber";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        //Mengubah value array dengan cara mereplace value dari array index keberapa sperti array stringArray[0] valuenya Benny
        // sekarang stringArray[0] diubah valuenya menjadi Baremetaly
        stringArray[0] = "Baremetaly";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[2];

        // Cara deklarasi array
        String[] namaNama = {
          "Benny", "Amber"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
          1, 2, 3, 4, 5
        };

        long[] arrayLong = {
           10L, 20L, 30L
        };

        //menghapus array dengan cara mengkosongkan isi dari index array tersebut karena untuk menghapus array sebenarnya arraynya tidak terhapus jadi harus dikosongkan index arraynya
        arrayLong[0] = 0;

        //mengatahui panajang array dengan cara menambahkan .length
        System.out.println(arrayLong.length);

        //Deklarasi array dalam array
        String[][] members = {
                {"Benny", "Amber"},
                {"Baremetaly", "Annisa"},
                {"Sudaryono"}
        };

        //mengambil data array dalam array
        //ambil array pertama atau array yang yang mau diambil kemudian baru ambil data array selanjutnya
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }
}
