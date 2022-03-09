package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    List<Video> inventory = new ArrayList<>();

    public void addToInventory(Video video){
        this.inventory.add(video);
    }

    public void checkOutVideo(String title){
        for (Video i : inventory){
            if (i.getTitle().equals(title)){
                i.setCheckedOut();
            }
        }
    }

    public void returnVideo(String title){
        for (Video i : inventory){
            if (i.getTitle().equals(title)){
                i.setCheckedIn();
            }
        }
    }
    public void takeRating(String title,int rating){
        for (Video i : inventory){
            if (i.getTitle().equals(title)){
                i.setRating(rating);
            }
        }

    }
    public void listInventory(){
        System.out.println(inventory.toString());
    }

}
