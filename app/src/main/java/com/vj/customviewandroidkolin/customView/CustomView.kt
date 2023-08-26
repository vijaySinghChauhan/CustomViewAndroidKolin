package com.vj.customviewandroidkolin.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import android.widget.MultiAutoCompleteTextView.CommaTokenizer
import androidx.constraintlayout.widget.ConstraintLayout
import com.vj.customviewandroidkolin.R
import com.vj.customviewandroidkolin.databinding.CustomViewBinding


class CustomView(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {
    private lateinit var binding  : CustomViewBinding
    init {
        val arr = arrayOf(
            "Paries,France", "PA,United States", "Parana,Brazil",
            "Padua,Italy", "Pasadena,CA,United States"
        )
          from(context).inflate(R.layout.custom_view,this,true)
        var view=findViewById<MultiAutoCompleteTextView>(R.id.autoCompleteTextView)
//        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
//            this,
//            android.R.layout.simple_dropdown_item_1line, arr
//        )
//
//        view.threshold = 2
//        view.setAdapter(adapter)
//        view.setTokenizer(CommaTokenizer())
      }

}