package id.rifqipadisiliwangi.JuaraAndroidTIga

import android.app.Application
import id.rifqipadisiliwangi.JuaraAndroidTIga.data.AppContainer
import id.rifqipadisiliwangi.JuaraAndroidTIga.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}