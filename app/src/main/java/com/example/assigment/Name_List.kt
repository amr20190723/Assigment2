package com.example.assigment
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
class Name_List :DialogFragment(R.layout.list_name){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val CanBt: Button = view.findViewById(R.id.cancleBt);
        CanBt.setOnClickListener{
            dismiss()
        }
    }
}