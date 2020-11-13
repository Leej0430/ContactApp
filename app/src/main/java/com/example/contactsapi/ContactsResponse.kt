package com.example.contactsapi

data class ContactsResponse(
    val contacts: List<ContactsItem>
)

data class ContactsItem(
    val name: String,
    val email: String
)