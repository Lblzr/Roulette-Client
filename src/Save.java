import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class represents the format used to save files in .gds.

 * The file format is as follows:
 * Each line of the file corresponds to an index number, where the first line starts from 1
 * and the title corresponds to the int value at index 0.

 * Format:
 * <ul>
 *   <li>0 - Title (int)</li>
 *   <li>1 - Seed (int)</li>
 *   <li>2 - List (String)</li>
 *   <li>3 - Progress (int)</li>
 *   <li>4 - History (List&lt;String&gt;)</li>
 *   <li>5 - Percentage (int)</li>
 * </ul>
 *
 * Explanations:
 * <ul>
 *   <li>Seed - The post-hash number used to generate the order of the list.</li>
 *   <li>List - The selected list, ex. "Demon-list".</li>
 *   <li>Progress - The number of levels completed so far, ex. 5.</li>
 *   <li>History - The percentage completion of the levels so far.</li>
 *   <li>Percentage - The current percentage to go far.</li>
 * </ul>
 *
 * This class provides a foundational structure for storing `.gds` files,
 * including the title, seed, list, progress, history, and percentage data.
 * It offers the basic methods for accessing and modifying this data as
 * it's loaded and created. However, this class is not responsible for
 * complex data processing tasks, which are intended to be handled by
 * other components of the application, such as FM.
 */
public class Save {

    // Field Variables
    int title, seed, progress, percentage;
    String list;
    List<String> history;

    // Constructor(s)
    public Save() { // Random new save, no parameters, default values
        this.title = Main.getLatest();
        this.seed = new Random().nextInt();
        this.progress = 0;
        this.percentage = 0;
        this.list = "Demon-list";
        this.history = new ArrayList<>();
    } // end of Save

    // // Overloaded constructor(s)
    public Save(Integer cSeed, String cList) {
        this();
        if (cSeed != null) { this.seed=cSeed; }
        if (cList != null) { this.list=cList; }
    } // end of Save

    // Accessor methods
    public int getTitle() {
        return title;

    } // end of getTitle


    public int getSeed() {
        return seed;

    } // end of getSeed


    public int getProgress() {
        return progress;

    } // end of getProgress


    public int getPercentage() {
        return percentage;

    } // end of getPercentage


    public String getList() {
        return list;

    } // end of getList


    public List<String> getHistory() {
        return history;

    } // end of getHistory


    // Modification methods
    public void setTitle(int title) {
        this.title = title;

    } // end of setTitle



    public void setProgress(int progress) {
        this.progress = progress;

    } // end of setProgress


    public void setPercentage(int percentage) {
        this.percentage = percentage;

    } // end of setPercentage


    public void addToHistory(String action) {
        this.history.add(action);

    } // end of addToHistory


    public void writeToFile(int title, String... data) {
        // code utilizing @FM.java here

    } // end of writeToFile

} // end of Save