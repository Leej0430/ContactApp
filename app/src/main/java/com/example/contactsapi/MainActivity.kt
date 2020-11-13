package com.example.contactsapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayoutManager = LinearLayoutManager(this)
        val gridLayoutManager = GridLayoutManager(this,
        3)
        val staggeredGridLayoutManager
                =StaggeredGridLayoutManager(3,
            StaggeredGridLayoutManager.VERTICAL)
        recycler_view.layoutManager = linearLayoutManager
        val contactsAdapter = ContactsAdapter(generateContactsResponse())
        recycler_view.adapter = contactsAdapter

    }
    private fun generateContactsResponse():ContactsResponse{
        val listOfContacts = mutableListOf<ContactsItem>()
        val contactsItem = ContactsItem("Juneyeob","leejuneyeoblee@mgaail.com")
        listOfContacts.add(contactsItem)

        return ContactsResponse(listOfContacts)

    }
}

/*
1- Item Layout (xml file)
2- RecyclerView Adapter / Recycler View. ViewHolder
3- Layout Manager
 */