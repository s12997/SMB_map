package com.example.smb_map;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    private double latitude;
    private double longitude;
    private LocationManager lm;

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        int minCzas = 0;
        int minDystans = 0;

        lm = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        LocationListener ll = new LocationListener() {

            public void onLocationChanged(Location location) {
                //Log.i("location",location.getLatitude()+" "+location.getLongitude());
                latitude = location.getLatitude();
                longitude = location.getLongitude();
            }

            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            public void onProviderEnabled(String provider) {

            }

            public void onProviderDisabled(String provider) {

            }
        };
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, minCzas, minDystans, ll);
    }

    public void doIt(View view) {
        Toast.makeText(this, latitude+" "+longitude, Toast.LENGTH_SHORT).show();
    }
    public void localization(){
        int minCzas = 0;
        int minDystans = 0;

        lm = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        LocationListener ll = new LocationListener() {

            public void onLocationChanged(Location location) {
                //Log.i("location",location.getLatitude()+" "+location.getLongitude());
                latitude = location.getLatitude();
                longitude = location.getLongitude();
            }

            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            public void onProviderEnabled(String provider) {

            }

            public void onProviderDisabled(String provider) {

            }
        };
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, minCzas, minDystans, ll);
    }
}
