package com.example.contactsapi;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.android.synthetic.main.item_layout.view.*

public class ContactsAdapter(val dataSet: ContactsResponse)
    : RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {

    class ContactsViewHolder (view: View)
    : RecyclerView.ViewHolder(view){
        val itemName:TextView =view.tv_item_name
        val itemEmail:TextView =view.tv_item_email
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ContactsViewHolder {
    val views = LayoutInflater.from(parent.context)
        .inflate(R.layout.item_layout,
        parent,
        false)
        val contactsViewHolder = ContactsViewHolder(views)
        return contactsViewHolder

    }

    override fun getItemCount(): Int {
    return dataSet.contacts.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder,
                                  position: Int) {
        holder.itemName.text = dataSet.contacts[position].name
        holder.itemEmail.text =dataSet.contacts[position].email
    }
}
