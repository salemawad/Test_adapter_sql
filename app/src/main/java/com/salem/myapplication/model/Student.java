package com.salem.myapplication.model;

import android.os.Parcel;
import android.widget.TextView;

public class Student {
    private String name;
    private String image ;


    public Student() {
    }

    public Student(String name, String image) {
        this.name = name;
        this.image = image;
    }
    protected Student (Parcel parcel){
        name= parcel.readString();
        image=parcel.readString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static final  String  PROJECT = "student";

    public static final  String  NAME = "name";
    public static final  String   ID = "id";
    public static final String   IMAGE = "image";

    public static final String CREATE_TABLE= "CREATE TABLE "+ PROJECT +"("+
            ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
           NAME+" TEXT NOT NULL,"+
            IMAGE+" TEXT NOT NULL)";

}
