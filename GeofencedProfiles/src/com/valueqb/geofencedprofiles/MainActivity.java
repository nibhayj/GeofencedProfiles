package com.valueqb.geofencedprofiles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	this.setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	this.getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
	switch (menuItem.getItemId()) {
	case R.id.action_addlocation:
	    this.startActivity(new Intent(this, AddLocationActivity.class));
	    return true;

	default:
	    return false;
	}
    }

}
