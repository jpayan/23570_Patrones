package Wrappers;

public class DHLDataWrapper {
    private double latitude;
    private double longitude;

    public DHLDataWrapper(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
