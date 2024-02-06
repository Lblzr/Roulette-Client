import java.io.File;

public class FM {

    public static void makeDir() {

        File dir = new File(System.getenv("APPDATA") + "/Roulette-Client/");

        if (!dir.exists()) {
            dir.mkdir();
        }

    } // end of makeDir

} // end of FM