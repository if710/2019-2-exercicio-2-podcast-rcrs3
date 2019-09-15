package br.ufpe.cin.android.podcast.tasks

import android.os.AsyncTask
import br.ufpe.cin.android.podcast.ItemFeed
import br.ufpe.cin.android.podcast.Parser
import br.ufpe.cin.android.podcast.dal.DownloadXml

class PodcastParserTask : AsyncTask<String, Int, List<ItemFeed>>() {
    override fun doInBackground(vararg parameters: String?): List<ItemFeed> {
        val xml = DownloadXml().download(parameters[0]!!)

        return Parser.parse(xml)
    }
}