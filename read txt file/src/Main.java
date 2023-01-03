import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/skye/.var/app/com.jetbrains.IntelliJ-IDEA-Ultimate/config/JetBrains/IntelliJIdea2022.3/scratches/frameStats.txt";
        String delimiter = ",";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] fields = line.split(delimiter);
                for (String field : fields){
                    System.out.println(field);
                }
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}