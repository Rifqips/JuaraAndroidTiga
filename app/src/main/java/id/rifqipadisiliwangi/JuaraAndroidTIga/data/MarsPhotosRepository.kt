package id.rifqipadisiliwangi.JuaraAndroidTIga.data

import id.rifqipadisiliwangi.JuaraAndroidTIga.model.MarsPhoto
import id.rifqipadisiliwangi.JuaraAndroidTIga.network.MarsApiService


interface MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi */
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

/**
 * Network Implementation of Repository that fetch mars photos list from marsApi.
 */
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi*/
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}