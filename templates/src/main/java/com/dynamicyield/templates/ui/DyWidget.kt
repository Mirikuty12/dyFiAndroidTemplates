package com.dynamicyield.templates.ui

interface DyWidget {
    val dyName: DyWidgetName
}

enum class DyWidgetName(val selector: String) {
    CreditCardPromotion("credit-card-promotion"),
    CreditCardPromotionSlider("credit-card-promotion-slider"),
    QuickActions("quick-actions"),
    QuickActionsSlider("quick-actions-slider"),
    CrossUpsell("cross-upsell"),
    Activation("activation"),
    Offers("offers"),
    OffersSlider("offers-slider");

    companion object {
        fun fromSelector(selector: String): DyWidgetName? = when (selector) {
            CreditCardPromotion.selector -> CreditCardPromotion
            CreditCardPromotionSlider.selector -> CreditCardPromotionSlider
            QuickActions.selector -> QuickActions
            QuickActionsSlider.selector -> QuickActionsSlider
            CrossUpsell.selector -> CrossUpsell
            Activation.selector -> Activation
            Offers.selector -> Offers
            OffersSlider.selector -> OffersSlider
            else -> null
        }
    }
}