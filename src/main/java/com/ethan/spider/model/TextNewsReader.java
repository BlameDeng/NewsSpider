package com.ethan.spider.model;

import java.io.*;

public class TextNewsReader extends NewsReader {

    public TextNewsReader(File file) {
        super(file);
    }

    @Override
    public News readNews() {
        News news = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.file), "GBK"));
            StringBuilder title = new StringBuilder();
            StringBuilder content = new StringBuilder();
            title.append(reader.readLine());
            reader.readLine();
            content.append(reader.readLine());
            reader.close();
            news = new News(title.toString(), content.toString());
        } catch (IOException e) {
            System.out.println("Read news failed.");
        }
        return news;
    }
}
