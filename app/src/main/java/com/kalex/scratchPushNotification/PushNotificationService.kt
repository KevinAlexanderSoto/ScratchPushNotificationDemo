package com.kalex.scratchPushNotification

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast
import kotlinx.coroutines.delay

class PushNotificationService: Service() {
    override fun onBind(intent: Intent?): IBinder? {
     return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        var cont = 0
        while (cont < 20){
        Toast.makeText(this,"Service running in the backGround",Toast.LENGTH_LONG).show()
        cont++
        }
        return  START_STICKY
    }
}