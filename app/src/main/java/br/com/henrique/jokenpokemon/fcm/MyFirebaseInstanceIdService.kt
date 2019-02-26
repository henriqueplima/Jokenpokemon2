package br.com.henrique.jokenpokemon.fcm

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

//import com.google.firebase.iid.FirebaseInstaceId

class MyFirebaseInstanceIdService : FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Log.i("Token", FirebaseInstanceId.getInstance().token)
    }

}