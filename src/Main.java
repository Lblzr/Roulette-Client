import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * The main method is the entry point of the Java program.
     * It calls the getLatest method and prints the result.
     *
     * @param args The command line arguments passed to the program.
     */
    public static void main(String[] args) {

        System.out.println(getLatest());

    } // end of Main


    public static int getLatest() {

        File folder = new File(System.getenv("APPDATA") + "/Roulette-Client/");
        File[] files = folder.listFiles();

        return (files != null) ? files.length : 0;

    } // end of getLatest

} // end of Main
