package com.jetpack.compose

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text
import androidx.glance.unit.ColorProvider

class MyAppWidget : GlanceAppWidget() {
    @SuppressLint("RestrictedApi", "ResourceType")
    @Composable
    fun Content() {
        Column(
            modifier = GlanceModifier.fillMaxSize().background(ColorProvider(android.graphics.Color.WHITE))
        ) {
            Text(text = "Hello, Widget!")
            Text(text = "This is a Glance widget.")
        }
    }

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                Content()
            }
        }
    }
}