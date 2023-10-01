/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Course {
    private int ID;
    private String name;
    private int mentor_ID;
    private String video, image;

    public Course() {
    }

    public Course(int ID, String name, int mentor_ID, String video, String image) {
        this.ID = ID;
        this.name = name;
        this.mentor_ID = mentor_ID;
        this.video = video;
        this.image = image;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMentor_ID() {
        return mentor_ID;
    }

    public void setMentor_ID(int mentor_ID) {
        this.mentor_ID = mentor_ID;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
