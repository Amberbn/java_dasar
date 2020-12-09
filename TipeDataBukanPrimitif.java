public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        //Mengkonversi type data primitif ke type data bukan primitif/type object
        int iniInt = 100;

        Integer iniObject = iniInt;

        //mengkonversi type data bukan primitif ke type data primitif jika valuenya berbeda misal Integer ke short harus menggunkan method
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        
    }

}
