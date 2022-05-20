package com.example.myapplication

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Utils.getwithoutFullPic
import com.webqbms.Constants.Constants

class AllSectionAdapter(
    allHistoryViewModelArrayList: ArrayList<Dataclass>, context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val allHistoryViewModelArrayList: ArrayList<Dataclass>
    private val context: Context
    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        var view: View
        lateinit var viewHolder: RecyclerView.ViewHolder

        if (viewType.equals(Constants.section)) {
            view = LayoutInflater.from(context).inflate(R.layout.container_section, viewGroup, false)
            viewHolder = SectionViewHolder(view)
        }
        if (viewType.equals(Constants.sectiontwo)) {
            view = LayoutInflater.from(context).inflate(R.layout.container_sectiontwo, viewGroup, false)
            viewHolder = SectiontwoViewHolder(view)
        }

        return viewHolder

    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            Constants.sectiontwo -> {
                val holdertwo: SectiontwoViewHolder = viewHolder as SectiontwoViewHolder
                getwithoutFullPic(
                    context,
                    allHistoryViewModelArrayList.get(position).list.imageurl3,
                    holdertwo.banner,
                    R.mipmap.ic_launcher,
                    "" + System.currentTimeMillis(),
                    false
                )
                getwithoutFullPic(
                    context,
                    allHistoryViewModelArrayList.get(position).list.imageurl2,
                    holdertwo.bannerone,
                    R.mipmap.ic_launcher,
                    "" + System.currentTimeMillis(),
                    false
                )
                getwithoutFullPic (
                    context,
                    allHistoryViewModelArrayList.get(position).list.imageurl1,
                    holdertwo.bannertwo,
                    R.mipmap.ic_launcher,
                    "" + System.currentTimeMillis(),
                    false
                )
                Log.e("Request",  allHistoryViewModelArrayList.get(position).list.title)

                holdertwo.title.setText(allHistoryViewModelArrayList.get(position).list.title)

            }

            Constants.section -> {
                val holder: SectionViewHolder = viewHolder as SectionViewHolder
                getwithoutFullPic(
                    context,
                    allHistoryViewModelArrayList.get(position).list.imageurl2,
                    holder.banner,
                    R.mipmap.ic_launcher,
                    "" + System.currentTimeMillis(),
                    false
                )
                getwithoutFullPic(
                    context,
                    allHistoryViewModelArrayList.get(position).list.imageurl1,
                    holder.bannerone,
                    R.mipmap.ic_launcher,
                    "" + System.currentTimeMillis(),
                    false
                )
                Log.e("Request 1",  allHistoryViewModelArrayList.get(position).list.imageurl3)
                getwithoutFullPic (
                    context,
                    allHistoryViewModelArrayList.get(position).list.imageurl3,
                    holder.bannertwo,
                    R.mipmap.ic_launcher,
                    "" + System.currentTimeMillis(),
                    false
                )
                holder.title.setText(allHistoryViewModelArrayList.get(position).list.title)
            }


        }
    }

    override fun getItemViewType(position: Int): Int {
//        Log.d("itemviewtype",""+allHistoryViewModelArrayList.get(position).getCategory());
        return allHistoryViewModelArrayList[position].type
    }

    override fun getItemCount(): Int {
        return allHistoryViewModelArrayList.size
    }

    internal inner class SectiontwoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val banner: ImageView
        val bannerone: ImageView
        val bannertwo: ImageView
        val title: TextView

        init {
            banner = itemView.findViewById(R.id.banner)
            bannerone = itemView.findViewById(R.id.bannerone)
            bannertwo = itemView.findViewById(R.id.bannertwo)
            title = itemView.findViewById(R.id.title)

        }
    }

    internal inner class SectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val banner: ImageView
        val bannerone: ImageView
        val bannertwo: ImageView
        val title: TextView
        init {
            banner = itemView.findViewById(R.id.banner)
            bannerone = itemView.findViewById(R.id.bannerone)
            bannertwo = itemView.findViewById(R.id.bannertwo)
            title = itemView.findViewById(R.id.title)

        }
    }

    init {
        this.allHistoryViewModelArrayList = allHistoryViewModelArrayList
        this.context = context
    }
}