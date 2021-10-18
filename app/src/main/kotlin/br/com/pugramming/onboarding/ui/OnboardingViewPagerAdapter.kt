package br.com.pugramming.onboarding.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import br.com.pugramming.onboarding.models.OnboardingModel

const val ONBOARDING_MODEL_KEY = "onboardingModelKey"

class OnboardingViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragmentList = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    private fun addFragment(fragment: Fragment) {
        fragmentList.add(fragment)
    }

    fun addPage(onboardingData: OnboardingModel) {
        val page = OnboardingContentPage()
        val arg = Bundle()
        arg.putParcelable(ONBOARDING_MODEL_KEY, onboardingData)
        page.arguments = arg

        addFragment(page)
    }
}