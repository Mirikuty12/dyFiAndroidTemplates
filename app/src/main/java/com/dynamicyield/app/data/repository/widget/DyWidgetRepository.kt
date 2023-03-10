package com.dynamicyield.app.data.repository.widget

import com.dynamicyield.app.data.repository.CommonError
import com.dynamicyield.app.data.repository.DyResultWrapper
import com.dynamicyield.app.data.source.remote.model.DyWidgetChoice
import com.dynamicyield.templates.ui.DyWidgetName

interface DyWidgetRepository {
    suspend fun chooseDyWidgets(
        vararg widgetNames: DyWidgetName
    ): DyResultWrapper<List<DyWidgetChoice>, CommonError>
}