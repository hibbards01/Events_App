package com.eventsproject.byuievents;

import android.app.Application;
import android.os.Bundle;
import android.test.ApplicationTestCase;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import junit.framework.TestResult;

import dalvik.annotation.TestTargetClass;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    public ApplicationTest() {
        super(Application.class);
    }

    public void testSearch() {

        MainActivity activity = new MainActivity();

        activity.onCreate(new Bundle());

        View view = activity.findViewById(R.id.action_search);

        Button button = (Button)view;

        assertEquals(button.getText(), "Search");
    }

}