package com.example.myapplication


import com.google.gson.Gson


class Storage {

    fun SaveData(matches: Array<Match>, context: Any): Boolean {
        val gson = Gson()
        val matchListJson: String = gson.toJson(matches)
        val filename = "matches.json"
     //   context.openFileOutput(filename, Context.MODE_PRIVATE).use {
      //      it.write(fileContents.toByteArray())
      //  }
        return true
    }

}