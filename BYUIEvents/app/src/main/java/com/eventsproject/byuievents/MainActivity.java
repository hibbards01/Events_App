package com.eventsproject.byuievents;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.TabHost;
import android.content.Intent;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create tabs!
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("DayTab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("WeekTab");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("MonthTab");
        TabHost.TabSpec tab4 = tabHost.newTabSpec("MyEventsTab");

        //set up tab name and activity
        tab1.setIndicator("Day");
        tab1.setContent(new Intent(this, DayActivity.class));

        tab2.setIndicator("Week");
        tab2.setContent(new Intent(this, WeekActivity.class));

        tab3.setIndicator("Month");
        tab3.setContent(new Intent(this, MonthActivity.class));

        tab4.setIndicator("My Events");
        tab4.setContent(new Intent(this, MyEventsActivity.class));

        //now add to the host!
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);
        //tabHost.setBackgroundColor(getResources().getColor(R.color.blue));

        /*if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    /*public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }*/

    /**
     * WEEKACTIVITY
     *  This will create an intent and run the WeekActivity class
     * @param view
     */
    public void weekActivity(View view) {
        Toast.makeText(this, "You are almost there!", Toast.LENGTH_LONG).show();
    }
}
