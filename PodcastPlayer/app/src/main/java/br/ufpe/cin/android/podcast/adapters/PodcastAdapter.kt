package br.ufpe.cin.android.podcast.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.ufpe.cin.android.podcast.ItemFeed
import br.ufpe.cin.android.podcast.R
import kotlinx.android.synthetic.main.itemlista.view.*

class PodcastAdapter (private var episodes: List<ItemFeed>, private val context: Context):
    RecyclerView.Adapter<PodcastAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val episodeView =
            LayoutInflater.from(context).inflate(R.layout.itemlista, parent, false)

        return ViewHolder(episodeView)
    }

    override fun getItemCount(): Int = episodes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val episode = episodes[position]

        holder.title?.text = episode.title
        holder.pubDate?.text = episode.pubDate
    }

    // Pass a new list of episodes and notify
    fun updateEpisodeList(episodeList: List<ItemFeed>) {
        this.episodes = episodeList
        notifyItemInserted(episodes.size)
    }

    class ViewHolder (episodeView : View) : RecyclerView.ViewHolder(episodeView) {
        val title = episodeView.item_title
        val pubDate = episodeView.item_date
    }
}