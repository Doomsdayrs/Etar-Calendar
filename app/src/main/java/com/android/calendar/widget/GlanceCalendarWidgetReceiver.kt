package com.android.calendar.widget

import android.app.AlarmManager
import android.content.Context
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class GlanceCalendarWidgetReceiver : GlanceAppWidgetReceiver() {
	override val glanceAppWidget: GlanceAppWidget = GlanceCalendarWidget()


	/**
	 * {@inheritDoc}
	 */
	override fun onDisabled(context: Context) {
		// Unsubscribe from all AlarmManager updates
		val am = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
		val pendingUpdate = CalendarAppWidgetProvider.getUpdateIntent(context)
		am.cancel(pendingUpdate)
	}
}
