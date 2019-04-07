package com.ethan.spider.view;

import com.ethan.spider.model.Viewable;

import java.util.ArrayList;

public class ListViewer {
    private ArrayList<Viewable> viewableArrayList;

    public ListViewer(ArrayList<Viewable> viewableArrayList) {
        this.viewableArrayList = viewableArrayList;
    }

    public void display() {
        for (Viewable viewableItem : this.viewableArrayList) {
            System.out.println("------------------------");
            viewableItem.display();
        }
    }
}
