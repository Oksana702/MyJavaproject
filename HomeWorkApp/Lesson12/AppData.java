package HomeWorkApp.Lesson12;

import java.io.File;

public class AppData {
    public String[] getHeader() {
    }

    public int[][] getData() {
    }
    AppData data = new AppData();
    File file = new File ("data.csv");
CsvFileUtils.save(data, file);
}
