package com.eventsproject.byuievents;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class DayActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:app/src/main/java/com/eventsproject/byuievents/DayActivity.java
=======
 //       setContentView(R.layout.activity_day);
    }

>>>>>>> 9b1fd99f808d8f9e84280a86fb106053cf7096a1:Events_App/app/src/main/java/com/eventsproject/byuievents/DayActivity.java

        String [] list = new String[] {
                "Linux Meeting", "Career Fair", "I-Connect", "Game Night",
                "Theater", "Stem Fair", "Basketball", "Baseball", "Softball",
                "Ping Pong", "Racket ball", "Car Show", "English", "Math",
                "Red Hat", "Jumping Ropes"
        };

        //now to put it on the screen!
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_day,
                R.id.label, list);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView list, View v, int position, long id) {

    }
}
