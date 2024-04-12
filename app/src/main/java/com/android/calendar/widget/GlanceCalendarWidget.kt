package com.android.calendar.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.glance.GlanceId
import androidx.glance.GlanceTheme
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.text.Text as GText

class GlanceCalendarWidget : GlanceAppWidget() {
	override suspend fun provideGlance(context: Context, id: GlanceId) {
		// In this method, load data needed to render the AppWidget.
		// Use `withContext` to switch to another thread for long running
		// operations.

		provideContent {
			GlanceTheme {
				Content()
			}
		}
	}

	@Composable
	private fun Content(){
		GText("Hello World")
	}
}


