package com.jetpack.compose

import android.content.Context
import android.util.Log
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.glance.GlanceId
import androidx.glance.action.ActionParameters
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.state.updateAppWidgetState

class UpdateActionCallback : ActionCallback {
    suspend fun onRun(context: Context, glanceId: GlanceId, parameters: ActionParameters) {
        // 更新小组件状态
        updateAppWidgetState(context, glanceId) { prefs ->
            prefs.toMutablePreferences().apply {
                this[intPreferencesKey("widget-key")] = 1
            }
        }
        MyAppWidget().update(context, glanceId)
    }

    override suspend fun onAction(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        Log.d("BBBB", "onAction: called.")
    }
}