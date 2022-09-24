package com.example.codepathmail

class ItemFetcher {
    companion object {
        //val names = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        //val prices = "Welcome to Kotlin!"
        //val urls = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."
        var listItems : MutableList<ListItem> = ArrayList()
        fun getEmails(name: String, price: String, url: String): MutableList<ListItem> {
            val listItem = ListItem(name, price, url)
            listItems.add(listItem)
            return listItems
        }

        /*fun getNext5Emails(): MutableList<ListItem> {
            var newListItems : MutableList<ListItem> = ArrayList()
            for (i in 10..14) {
                val listItem = ListItem(names[i], prices, urls)
                newListItems.add(listItem)
            }
            return newListItems
        }*/
    }
}

