package model;
import java.sql.Timestamp;

public class Mentee {
    private int ID, tax_ID, location_ID, status_ID, field_ID, course_ID,review_ID, mentor_ID, account_ID;
    private String name, legal_representative, phoneNumber, business_entity_types;
    private Timestamp start_date;

    public Mentee() {
    }

    public Mentee(int ID, int tax_ID, int location_ID, int status_ID, int field_ID, int course_ID, int review_ID, int mentor_ID, int account_ID, String name, String legal_representative, String phoneNumber, String business_entity_types, Timestamp start_date) {
        this.ID = ID;
        this.tax_ID = tax_ID;
        this.location_ID = location_ID;
        this.status_ID = status_ID;
        this.field_ID = field_ID;
        this.course_ID = course_ID;
        this.review_ID = review_ID;
        this.mentor_ID = mentor_ID;
        this.account_ID = account_ID;
        this.name = name;
        this.legal_representative = legal_representative;
        this.phoneNumber = phoneNumber;
        this.business_entity_types = business_entity_types;
        this.start_date = start_date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTax_ID() {
        return tax_ID;
    }

    public void setTax_ID(int tax_ID) {
        this.tax_ID = tax_ID;
    }

    public int getLocation_ID() {
        return location_ID;
    }

    public void setLocation_ID(int location_ID) {
        this.location_ID = location_ID;
    }

    public int getStatus_ID() {
        return status_ID;
    }

    public void setStatus_ID(int status_ID) {
        this.status_ID = status_ID;
    }

    public int getField_ID() {
        return field_ID;
    }

    public void setField_ID(int field_ID) {
        this.field_ID = field_ID;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public int getReview_ID() {
        return review_ID;
    }

    public void setReview_ID(int review_ID) {
        this.review_ID = review_ID;
    }

    public int getMentor_ID() {
        return mentor_ID;
    }

    public void setMentor_ID(int mentor_ID) {
        this.mentor_ID = mentor_ID;
    }

    public int getAccount_ID() {
        return account_ID;
    }

    public void setAccount_ID(int account_ID) {
        this.account_ID = account_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegal_representative() {
        return legal_representative;
    }

    public void setLegal_representative(String legal_representative) {
        this.legal_representative = legal_representative;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBusiness_entity_types() {
        return business_entity_types;
    }

    public void setBusiness_entity_types(String business_entity_types) {
        this.business_entity_types = business_entity_types;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }
    
}
