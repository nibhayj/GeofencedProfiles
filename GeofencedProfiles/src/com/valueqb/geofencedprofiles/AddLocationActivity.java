package com.valueqb.geofencedprofiles;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback;
import com.google.android.gms.maps.MapFragment;

public class AddLocationActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	this.setContentView(R.layout.activity_add_location);
	final GoogleMap map = ((MapFragment) this.getFragmentManager().findFragmentById(R.id.map)).getMap();
	if (map != null) {
	    map.setOnMapLoadedCallback(new OnMapLoadedCallback() {
		@Override
		public void onMapLoaded() {
		    map.setMyLocationEnabled(true);
		}
	    });
	}
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	this.getMenuInflater().inflate(R.menu.add_location, menu);
	return true;
    }

}
