package br.com.pugramming.onboarding.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.pugramming.onboarding.R
import br.com.pugramming.onboarding.models.OnboardingModel

import kotlinx.android.synthetic.main.item_onboarding_page.view.*

class OnboardingContentPage : Fragment() {

    private lateinit var onboardingModel: OnboardingModel

    override fun setArguments(args: Bundle?) {
        super.setArguments(args)
        if (args != null) {
            onboardingModel = args.getParcelable(ONBOARDING_MODEL_KEY)!!
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.item_onboarding_page, container, false)

        view.titleLabel.text = onboardingModel.title
        view.subtitleLabel.text = onboardingModel.subtitle

        return view
    }
}
