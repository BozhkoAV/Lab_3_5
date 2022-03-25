package com.example.bozhko_lab_3_5

import android.widget.Button
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FragmentContentTest {
    @Test
    fun testFragment1Content(){
        val scenario = launchFragmentInContainer<Fragment1>()
        scenario.onFragment{ fragment ->
            assertNull(fragment.view!!.findViewById<Button>(R.id.bnToFirst))
            assertNotNull(fragment.view!!.findViewById<Button>(R.id.bnToSecond))
            assertNull(fragment.view!!.findViewById<Button>(R.id.bnToThird))
        }
    }

    @Test
    fun testFragment2Content(){
        val scenario = launchFragmentInContainer<Fragment2>()
        scenario.onFragment{ fragment ->
            assertNotNull(fragment.view!!.findViewById<Button>(R.id.bnToFirst))
            assertNull(fragment.view!!.findViewById<Button>(R.id.bnToSecond))
            assertNotNull(fragment.view!!.findViewById<Button>(R.id.bnToThird))
        }
    }

    @Test
    fun testFragment3Content(){
        val scenario = launchFragmentInContainer<Fragment3>()
        scenario.onFragment{ fragment ->
            assertNotNull(fragment.view!!.findViewById<Button>(R.id.bnToFirst))
            assertNotNull(fragment.view!!.findViewById<Button>(R.id.bnToSecond))
            assertNull(fragment.view!!.findViewById<Button>(R.id.bnToThird))
        }
    }
}