package android.example.tourguide;

public class Icons {
    /** String resource Id for the image*/
    private int mImage;

    /** String resource Id for the description*/
    private  String mDescription;

    //resource id for pool icon
    private int pool;

    //resource id for food icon
    private int food;

    //resource id for the wifi icon
    private int wifi;

    //resource if for the child friendly icon
    private int child_friendly;

    //resource id for the accessibility icon
    private int accessible;

    /**
     *
     * @param mImage resource id for images
     * @param mDescription resource id for the description
     * @param pool resource id for the pool icon
     * @param food resource id for the food icon
     * @param wifi resource id for the wifi icon
     * @param child_friendly resource id for the child friendly icon
     * @param accessible resource id for the accessibility icon
     */
    public Icons(int mImage, String mDescription, int pool, int food, int wifi, int child_friendly, int accessible) {
        this.mImage = mImage;
        this.mDescription = mDescription;
        this.pool = pool;
        this.food = food;
        this.wifi = wifi;
        this.child_friendly = child_friendly;
        this.accessible = accessible;
    }

    //getter for the String url of image
    public int getmImage() {
        return mImage;
    }

    //setter for String url of image
    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    //getter for the string description
    public String getmDescription() {
        return mDescription;
    }

    //etter for the string description
    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    //getter for pool icon
    public int getPool() {
        return pool;
    }

    // setter for the pool icon
    public void setPool(int pool) {
        this.pool = pool;
    }
     //getter for the good icon
    public int getFood() {
        return food;
    }

    //setter for the  food icon
    public void setFood(int food) {
        this.food = food;
    }

    //getter for the wifi icon
    public int getWifi() {
        return wifi;
    }

    //setter for the wifi icon
    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    //getter for the child friendly icon
    public int getChild_friendly() {
        return child_friendly;
    }

    //setter for the child friendly icon
    public void setChild_friendly(int child_friendly) {
        this.child_friendly = child_friendly;
    }

    //getter for the accessibility icon
    public int getAccessible() {
        return accessible;
    }

    //setter for the accessibility icon
    public void setAccessible(int accessible) {
        this.accessible = accessible;
    }
}
