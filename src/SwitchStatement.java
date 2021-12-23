public class SwitchStatement {

    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // switch lambda harus java v14
//        switch (nilai) {
//            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
//            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
//            case "D" -> System.out.println("Anda Tidak Lulus");
//            default -> {
//                System.out.println("Mungkin Anda Salah Jurusan");
//            }
//        }


    }

}
