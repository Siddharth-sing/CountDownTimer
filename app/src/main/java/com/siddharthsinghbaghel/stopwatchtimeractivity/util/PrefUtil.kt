package com.siddharthsinghbaghel.stopwatchtimeractivity.util

import android.content.Context
import android.preference.PreferenceManager
import com.siddharthsinghbaghel.stopwatchtimeractivity.TimerActivity

class PrefUtil {

    companion object{

        fun getTimerLength(context: Context):Int{
            //placeholder
            return 1
        }
        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID = "com.siddharthsinghbaghel.stopwatchtimeractivity.previous_timer_length"

        fun getPreviousTimerLengthSeconds(context:Context):Long{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID,0)
        }
        fun setPreviousTimerLengthSeconds(seconds : Long,context:Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID,seconds)
            editor.apply()
        }

        private const val TIMER_STATE_ID = "com.siddharthsinghbaghel.stopwatchtimeractivity.timer_state"

        fun getTimerState(context : Context ):TimerActivity.TimerState{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val ordinal = preferences.getInt(TIMER_STATE_ID,0)
            return TimerActivity.TimerState.values()[ordinal]
        }
        fun setTimerState(state: TimerActivity.TimerState, context : Context ){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val ordinal = state.ordinal
            editor.putInt(TIMER_STATE_ID,ordinal)
            editor.apply()
        }

        private const val SECONDS_REMAINING = "com.siddharthsinghbaghel.stopwatchtimeractivity.seconds_remaining"

        fun getSecondsRemaining(context:Context):Long{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SECONDS_REMAINING,0)
        }
        fun setSecondsRemaining(seconds : Long,context:Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(SECONDS_REMAINING,seconds)
            editor.apply()
        }

        private const val ALARM_SET_TIME_ID = "com.resocoder.timer.backgrounded_time"

        fun getAlarmSetTime(context: Context): Long{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return  preferences.getLong(ALARM_SET_TIME_ID, 0)
        }

        fun setAlarmSetTime(time: Long, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(ALARM_SET_TIME_ID, time)
            editor.apply()
        }
    }
}
