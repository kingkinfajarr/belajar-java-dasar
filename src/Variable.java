public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Kingkin Fajar Anifianto";

        int age = 18;
        String address = "Karanganyar";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // langsung tanpa menuliskan tipe datanya tetapi harus langsung di isi valuenya.
        var firstName = "Kingkin";
        var middleName = "Fajar";
        var lastName = "Anifianto";

        // menggunakan final agar tidak bisa diubah valuenya seperti const di Javascript
        final String language = "Java";

    }
}
