package com.ethan.spider.model;

import java.util.HashMap;
import java.util.Map;

public class NewsWithRelated extends UrlNews {

    private HashMap<String, String> relateds = new HashMap<String, String>();

    public NewsWithRelated(String url, String title, String content) {
        super(url, title, content);
    }

    public HashMap<String, String> getRelateds() {
        return relateds;
    }

    public void addRelated(String title, String url) {
        this.relateds.put(title, url);
    }

//    @Override
//    public void display() {
//        super.display();
//        System.out.println("|Related|");
//        for (Map.Entry<String, String> entry : this.relateds.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//    }
}
