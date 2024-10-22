package com.example.myrecyclervew;

public class Item {
    String name;
    String email;
    int image;
    public Item(String name, String Email, int image){
        this.name=name;
        this.email=name;
        this.image=image;
    }
    public String getName(){
        return name;
    }
    public int getImage(){
        return image;
    }
    public String getEmail(){
        return email;}
    public void setName(String name){
        this.name=name;}

    public void SetEmail(String email){
        this.email=email;
    }
    public void setImage(int image){
        this.image=image;
    }
}
