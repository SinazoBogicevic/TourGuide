package android.example.tourguide;

import java.util.ArrayList;

public class Tour {

    /** String resource Id for the image*/
    private int mImage;

    /** String resource Id for the description*/

    private  String mDescription;


    /***
     * @param mImage is the string resource for the image
     * @param mDescription is the string resource for the image description
     */
    public Tour(int mImage, String mDescription) {
        this.mImage = mImage;
        this.mDescription = mDescription;
    }

    /**
     * Get the string resource Id for the image
     */
    public int getmImage(){
        return mImage;
    }

    /**
     * Get the string resource ID for the description
     */
    public String getmDescription(){
        return mDescription;
    }

    /**
     * Set the string resource for the image
     */
    public void setmImage(int image){
        this.mImage = image;
    }

    /**
     * Set the string resource for the description
     */
    public void setmDescription(String description){
        this.mDescription = description;
    }
}
