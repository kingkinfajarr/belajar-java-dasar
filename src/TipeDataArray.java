public class TipeDataArray {
    public static void main(String[] args) {

        String [] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Kingkin";
        arrayString[1] = "Fajar";
        arrayString[2] = "Anifianto";

        System.out.println(arrayString[0]);


        String [] namaNama = {
                "Kingkin", "Fajar", "Anifianto"
        };
        System.out.println(namaNama.length);


        // array dalam array
        String [][] members = {
            {"Kingkin", "Fajar"},
            {"Joko", "pambudi"},
            {"Niko"}
        };

        System.out.println(members[0][1]); //Fajar
        System.out.println(members[2][0]); //Niko
    }
}
