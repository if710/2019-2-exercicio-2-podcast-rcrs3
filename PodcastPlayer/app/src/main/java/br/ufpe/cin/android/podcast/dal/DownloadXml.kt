package br.ufpe.cin.android.podcast.dal

import java.net.URL

class DownloadXml {
    fun download(path: String): String {
        val url = URL(path)

        return url.readText()
    }

}