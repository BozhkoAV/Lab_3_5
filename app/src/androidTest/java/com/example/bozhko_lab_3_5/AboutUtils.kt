package com.example.bozhko_lab_3_5

import android.view.Gravity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.contrib.DrawerMatchers.isClosed
import androidx.test.espresso.contrib.NavigationViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId

private fun openAboutViaDrawer() {
    // Open Drawer to click on navigation.
    onView(withId(R.id.drawer_layout))
        .check(matches(isClosed(Gravity.LEFT))) // Left Drawer should be closed.
        .perform(DrawerActions.open()) // Open Drawer

    // Start the screen of my activity.
    onView(withId(R.id.nav_view))
        .perform(NavigationViewActions.navigateTo(R.id.nav_about))
}

fun openAbout() = openAboutViaDrawer()