package com.ethan.spider;

import com.ethan.spider.model.*;
import com.ethan.spider.view.ListViewer;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        String newsUrl = "https://readhub.me/topic/5bMmlAm75lD";
        News textNews = new TextNewsReader(new File("./src/main/resources/TextNews.txt")).readNews();
        News jsonNews = new JsonNewsReader(new File("./src/main/resources/JsonNews.json")).readNews();
        News urlNews = UrlNewsReader.read(newsUrl);
        ArrayList<Viewable> viewableArrayList = new ArrayList<Viewable>();
        viewableArrayList.add(textNews);
        viewableArrayList.add(jsonNews);
        viewableArrayList.add(urlNews);
        ListViewer listViewer = new ListViewer(viewableArrayList);
        listViewer.display();
    }
}
