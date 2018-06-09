package com.example.tanushreechaubal.pune_aconfluenceofeastandwest;

/**
 * Created by TanushreeChaubal on 3/7/18.
 */

public class PuneInfo {

    private String name;
    private String location;
    private String description;
    private static final int NO_IMAGE_RESOURCE_ID = -1;
    private int imageResourceID = NO_IMAGE_RESOURCE_ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNoImageResourceId() {
        return NO_IMAGE_RESOURCE_ID;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PuneInfo(String nm, String lc, String dc, int iRI) {
        name = nm;
        location = lc;
        description = dc;
        imageResourceID = iRI;
    }

    public boolean hasImage(){
        return imageResourceID != NO_IMAGE_RESOURCE_ID;
    }
}
