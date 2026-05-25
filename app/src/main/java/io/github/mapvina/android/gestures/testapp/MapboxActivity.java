package io.github.mapvina.android.gestures.testapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import io.github.mapvina.android.MapVina;
import io.github.mapvina.android.maps.MapVinaMap;
import io.github.mapvina.android.maps.MapView;
import io.github.mapvina.android.maps.OnMapReadyCallback;

/**
 * Test activity showcasing a simple MapView with current mapbox-gestures-android library commit.
 */
public class MapboxActivity extends AppCompatActivity implements OnMapReadyCallback {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    MapVina.getInstance(this);

    setContentView(R.layout.activity_mapbox);
    MapView mapView = findViewById(R.id.map_view);
    mapView.getMapAsync(this);
  }

  @Override
  public void onMapReady(@NonNull MapVinaMap mapVinaMap) {
    mapVinaMap.setStyle("https://maps.mapvina.com/styles/v2/streets.json?key=public_key");
  }
}
