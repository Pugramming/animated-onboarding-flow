package br.com.pugramming.utils

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager

const val ONBOARDING_TOTAL_PAGES = 3

class ViewPagerMotion @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr), ViewPager.OnPageChangeListener {

    override fun onPageScrollStateChanged(state: Int) {}

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        progress = (position + positionOffset) / (ONBOARDING_TOTAL_PAGES - 1)
    }

    override fun onPageSelected(position: Int) {}
}