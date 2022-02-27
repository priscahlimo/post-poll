package models;

import java.util.ArrayList;

public class post {


    private  String content;



    public String getContent() {
        return content;
    }

    public static ArrayList<post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }

    private static ArrayList<post> instances = new ArrayList<>(); // I’m new. When do I get created?

    public post (String content){
        this.content = content;
        instances.add(this); //Also new. Can you figure out what I do and how I work?
    }
}
