package com.example.dbsgproject;

public class User_review_details {

    private String review_listitem;
    private String Star_listitem;
    private String profile_listitem;

    public String getReview_listitem() {
        return review_listitem;
    }

    public void setReview_listitem(String review_listitem) {
        this.review_listitem = review_listitem;
    }

    public String getStar_listitem() {
        return Star_listitem;
    }

    public void setStar_listitem(String star_listitem) {
        Star_listitem = star_listitem;
    }

    public String getProfile_listitem() {
        return profile_listitem;
    }

    public void setProfile_listitem(String profile_listitem) {
        this.profile_listitem = profile_listitem;
    }

    public User_review_details(String review_listitem, String star_listitem, String profile_listitem) {
        this.review_listitem = review_listitem;
        Star_listitem = star_listitem;
        this.profile_listitem = profile_listitem;
    }
}
