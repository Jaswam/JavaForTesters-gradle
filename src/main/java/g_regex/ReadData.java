package g_regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadData {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/textfiles/ourtxtfile");

        List<String> read = Files.readAllLines(path);
//        List<String> countrynames = new ArrayList<String>("Germany", "Poland", "US");
        System.out.println(read);
//        System.out.println(countrynames);


//        List<String> fileLines = new ArrayList<>();
//        System.out.println(fileLines.get(0));

//        try {
//            fileLines.addAll(Files.readAllLines(path));
//        } catch (IOException e) {
//            System.out.println("File not found.");
//        }
//
//        Pattern pattern = Pattern.compile("[1-9][0-9,.]{1,8}");
//        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{1,8}");
//        Pattern pattern = Pattern.compile("Germany|Poland|US");
        Pattern pattern = Pattern.compile("Mountain Bike|computer|car|beer");
        for (String line: read) {
            Matcher m = pattern.matcher(line);
            while (m.find()) {
                System.out.println(m.group());

            }
        }
        }

    }
