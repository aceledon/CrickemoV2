package com.example.julia.crickemov2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

public class CrickeMoMain extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener,GoogleMap.OnMarkerClickListener {

    private static final String TAG = CrickeMoMain.class.getSimpleName();

    private TextView textLat, textLong;
    private MapFragment mapFragment;
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricke_mo_main);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onMapClick(LatLng latLng) {

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }
}
