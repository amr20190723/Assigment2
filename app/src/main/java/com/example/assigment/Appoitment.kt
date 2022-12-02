package com.example.assigment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class Appoitment:DialogFragment(R.layout.appointment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val submitBt:Button= view.findViewById(R.id.button);

        submitBt.setOnClickListener{
            val num : EditText= view.findViewById(R.id.num1);
            val m1:MainActivity = getActivity() as MainActivity
            m1.recieveFeedback(num.text.toString());
            dismiss();
        }
    }

}