package com.codespacepro.onboarding.onboarding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.codespacepro.onboarding.R
import com.codespacepro.onboarding.onboarding.screens.FirstFragment
import com.codespacepro.onboarding.onboarding.screens.SecondFragment
import com.codespacepro.onboarding.onboarding.screens.ThirdFragment


class ViewPagerFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        val fragmentList = arrayListOf<Fragment>(FirstFragment(), SecondFragment(), ThirdFragment())

        val adapter =
            ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)
        view.findViewById<ViewPager2>(R.id.viewpager).adapter = adapter


        return view
    }

}