package br.com.pugramming.onboarding.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OnboardingModel(
    val title: String? = "",
    val subtitle: String? = ""
) : Parcelable