package br.com.pugramming.onboarding.ui

import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import br.com.pugramming.onboarding.R
import br.com.pugramming.onboarding.models.OnboardingModel
import kotlinx.android.synthetic.main.activity_onboarding.*

const val ONBOARDING_TOTAL_PAGES = 3

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        setupViews()
        setupListeners()
    }

    private fun setupViews() {
        setupViewPagerAdapter()
        setupViewPager()
    }

    private fun setupListeners() {
        letsStartButton.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                v.performClick()
            }
            false
        }
    }

    private fun setupViewPagerAdapter() {
        val adapter = OnboardingViewPagerAdapter(supportFragmentManager)

        adapter.addPage(
            OnboardingModel(getString(R.string.first_page_title),
            getString(R.string.first_page_subtitle))
        )
        adapter.addPage(
            OnboardingModel(getString(R.string.second_page_title),
            getString(R.string.second_page_subtitle))
        )
        adapter.addPage(
            OnboardingModel(getString(R.string.third_page_title),
                getString(R.string.third_page_subtitle))
        )

        viewPager.adapter = adapter
    }

    private fun setupViewPager() {
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(onboardingLayout)
            viewPager.offscreenPageLimit = ONBOARDING_TOTAL_PAGES
        }
    }

}