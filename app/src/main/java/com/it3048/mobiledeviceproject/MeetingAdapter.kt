package com.it3048.mobiledeviceproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeetingAdapter(val c:Context, val meetingList:ArrayList<MeetingDAO>):RecyclerView.Adapter<MeetingAdapter.meetingViewHolder>() {
    inner class meetingViewHolder(val v:View):RecyclerView.ViewHolder(v){
        val title = v.findViewById<TextView>(R.id.meetingNameTxt)
        val date = v.findViewById<TextView>(R.id.meetingDateTxt)
        val description = v.findViewById<TextView>(R.id.meetingDescriptionTxt)
        val link = v.findViewById<TextView>(R.id.meetingUrlTxt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): meetingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.meeting_card, parent, false)
        return meetingViewHolder(v)
    }

    override fun onBindViewHolder(holder: meetingViewHolder, position: Int) {
        val newList = meetingList[position]
        holder.title.text = newList.meetingTitle
        holder.date.text = newList.meetingDate
        holder.description.text = newList.meetingDescription
        holder.link.text = newList.meetingLocLink
    }

    override fun getItemCount(): Int {
        return meetingList.size
    }
}