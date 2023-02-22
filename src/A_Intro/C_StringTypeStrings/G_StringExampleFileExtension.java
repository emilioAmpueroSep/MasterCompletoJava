package A_Intro.C_StringTypeStrings;

public class G_StringExampleFileExtension {
    public static void main(String[] args) {

        String file = "some.image.jpeg";
        int i = file.lastIndexOf(".");
//        System.out.println("file.length() = " + file.length());
        System.out.println(" file format = " + file.substring(i+1));
    }
}
