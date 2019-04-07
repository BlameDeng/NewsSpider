package com.ethan.spider.model;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class JsonNewsReader extends NewsReader {
    public JsonNewsReader(File file) {
        super(file);
    }

    @Override
    public News readNews() {
        News news = null;
        try {
            String jsonString = FileUtils.readFileToString(this.file, "utf-8");
            JSONObject jsonObject=new JSONObject(jsonString);
            String title=jsonObject.getString("title");
            String content=jsonObject.getString("content");
            news=new News(title,content);
        } catch (IOException e) {
            System.out.println("Read file failed.");
        }
        return news;
    }
}
