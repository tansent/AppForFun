package jtli.com.appforfun;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Jingtian(Tansent).
 */
@RunWith(AndroidJUnit4.class)
public class RecycleViewActivityTest {

//    @Rule
//    public ActivityTestRule<RecycleViewActivity> mRecycleViewActivityRule =
//            new ActivityTestRule<RecycleViewActivity>(RecycleViewActivity.class);

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void progressBarRunning(){
        onView(withId(R.id.btn_recycleView))
                .perform(click());

        onView(withId(R.id.rv_android))
                .perform(RecyclerViewActions.actionOnItemAtPosition(5, click()));
    }
}