package ru.miet.shuvakin;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyze {
    public static void main(String[] args) throws IOException {

        BufferedReader reader;
        List<String> lines;
        reader = new BufferedReader(new InputStreamReader(new FileInputStream("myfile.txt"), Charset.defaultCharset()));
        lines = new ArrayList<String>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        String [] linesAsArray = lines.toArray(new String[lines.size()]);
        StringBuffer text = new StringBuffer();
        for (int i = 0; i < linesAsArray.length; i++) {
            text.append(linesAsArray[i]);
            text.append("\n");
        }
        System.out.println(text);
    }
}
