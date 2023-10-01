package model;

public class Mentor {
    private int ID;
    private int Account_ID;
    private int CCCD;
    private String email;
    private int phoneNumber;
    private int Location_ID;
    private String name;
    private int Field_ID;
    private String level;
    private String education;
    private String experience;
    private String certification;
    private int course_ID, mentee_ID, review_ID, status_ID;

    public Mentor() {
    }

    public Mentor(int ID, int Account_ID, int CCCD, String email, int phoneNumber, int Location_ID, String name, int Field_ID, String level, String education, String experience, String certification, int course_ID, int mentee_ID, int review_ID, int status_ID) {
        this.ID = ID;
        this.Account_ID = Account_ID;
        this.CCCD = CCCD;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.Location_ID = Location_ID;
        this.name = name;
        this.Field_ID = Field_ID;
        this.level = level;
        this.education = education;
        this.experience = experience;
        this.certification = certification;
        this.course_ID = course_ID;
        this.mentee_ID = mentee_ID;
        this.review_ID = review_ID;
        this.status_ID = status_ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int Account_ID) {
        this.Account_ID = Account_ID;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLocation_ID() {
        return Location_ID;
    }

    public void setLocation_ID(int Location_ID) {
        this.Location_ID = Location_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getField_ID() {
        return Field_ID;
    }

    public void setField_ID(int Field_ID) {
        this.Field_ID = Field_ID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public int getMentee_ID() {
        return mentee_ID;
    }

    public void setMentee_ID(int mentee_ID) {
        this.mentee_ID = mentee_ID;
    }

    public int getReview_ID() {
        return review_ID;
    }

    public void setReview_ID(int review_ID) {
        this.review_ID = review_ID;
    }

    public int getStatus_ID() {
        return status_ID;
    }

    public void setStatus_ID(int status_ID) {
        this.status_ID = status_ID;
    }
    
}
