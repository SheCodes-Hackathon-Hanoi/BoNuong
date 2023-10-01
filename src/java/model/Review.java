package model;

public class Review {
    private int ID, mentor_ID, mentee_ID;
    private String content, rating;

    public Review() {
    }

    public Review(int ID, int mentor_ID, int mentee_ID, String content, String rating) {
        this.ID = ID;
        this.mentor_ID = mentor_ID;
        this.mentee_ID = mentee_ID;
        this.content = content;
        this.rating = rating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMentor_ID() {
        return mentor_ID;
    }

    public void setMentor_ID(int mentor_ID) {
        this.mentor_ID = mentor_ID;
    }

    public int getMentee_ID() {
        return mentee_ID;
    }

    public void setMentee_ID(int mentee_ID) {
        this.mentee_ID = mentee_ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
        
}
