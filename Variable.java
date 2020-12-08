public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Benny Amber";

        System.out.println(name);

        int age = 17;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        //Mengganti variable name dengan cara mereplace value dari variablenya jadi variable name isinya berubah menjadi "Baremetaly Annisa"
        name = "Baremetaly Annisa";

        System.out.println(name);

        //variabel yang menggunakan var valuenya harus diisi langsung atau langsung diinisialisasi.
        var firstName = "Benny";
        var lastName = "Amber";

        System.out.println(firstName);
        System.out.println(lastName);

        //variable yang menggunkan kata kunci final maka value varibelnya tidak bisa diubah ubah.
        final String application = "Belajar java";

        System.out.println(application);
    }
}
