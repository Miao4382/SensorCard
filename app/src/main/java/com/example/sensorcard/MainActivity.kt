package com.example.sensorcard


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {

    private val REQUEST_CODE_SPEECH_INPUT = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        voiceBtn.setOnClickListener {
            speak()
        }
    }

    private fun speak() {
        val mIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        mIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
        mIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
        mIntent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hey! Say your card!")

        try {
            startActivityForResult(mIntent, REQUEST_CODE_SPEECH_INPUT)
        } catch (e: Exception){

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            REQUEST_CODE_SPEECH_INPUT -> {
                if (resultCode == Activity.RESULT_OK && null != data) {
                    // get text from result
                    val result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
                    // set the text to text view
                    val index = result[0].toInt()
                    if (index in 1..52) {
                        textTv.text = "You've chosen card " + result[0] + "!"
                        setImgCard1(result[0].toInt())
                    } else {
                        textTv.text = "Sorry, card not exist!"
                        setImgCard1(53)
                    }
                }
            }
        }
    }

    // setImgCard1(): will set the image of card 1, hard coded
    private fun setImgCard1(i: Int) {
        if (i == 1) imgvCard1.setImageResource(R.drawable.c1)
        if (i == 2) imgvCard1.setImageResource(R.drawable.c2)
        if (i == 3) imgvCard1.setImageResource(R.drawable.c3)
        if (i == 4) imgvCard1.setImageResource(R.drawable.c4)
        if (i == 5) imgvCard1.setImageResource(R.drawable.c5)
        if (i == 6) imgvCard1.setImageResource(R.drawable.c6)
        if (i == 7) imgvCard1.setImageResource(R.drawable.c7)
        if (i == 8) imgvCard1.setImageResource(R.drawable.c8)
        if (i == 9) imgvCard1.setImageResource(R.drawable.c9)
        if (i == 10) imgvCard1.setImageResource(R.drawable.c10)
        if (i == 11) imgvCard1.setImageResource(R.drawable.c11)
        if (i == 12) imgvCard1.setImageResource(R.drawable.c12)
        if (i == 13) imgvCard1.setImageResource(R.drawable.c13)
        if (i == 14) imgvCard1.setImageResource(R.drawable.c14)
        if (i == 15) imgvCard1.setImageResource(R.drawable.c15)
        if (i == 16) imgvCard1.setImageResource(R.drawable.c16)
        if (i == 17) imgvCard1.setImageResource(R.drawable.c17)
        if (i == 18) imgvCard1.setImageResource(R.drawable.c18)
        if (i == 19) imgvCard1.setImageResource(R.drawable.c19)
        if (i == 20) imgvCard1.setImageResource(R.drawable.c20)
        if (i == 21) imgvCard1.setImageResource(R.drawable.c21)
        if (i == 22) imgvCard1.setImageResource(R.drawable.c22)
        if (i == 23) imgvCard1.setImageResource(R.drawable.c23)
        if (i == 24) imgvCard1.setImageResource(R.drawable.c24)
        if (i == 25) imgvCard1.setImageResource(R.drawable.c25)
        if (i == 26) imgvCard1.setImageResource(R.drawable.c26)
        if (i == 27) imgvCard1.setImageResource(R.drawable.c27)
        if (i == 28) imgvCard1.setImageResource(R.drawable.c28)
        if (i == 29) imgvCard1.setImageResource(R.drawable.c29)
        if (i == 30) imgvCard1.setImageResource(R.drawable.c30)
        if (i == 31) imgvCard1.setImageResource(R.drawable.c31)
        if (i == 32) imgvCard1.setImageResource(R.drawable.c32)
        if (i == 33) imgvCard1.setImageResource(R.drawable.c33)
        if (i == 34) imgvCard1.setImageResource(R.drawable.c34)
        if (i == 35) imgvCard1.setImageResource(R.drawable.c35)
        if (i == 36) imgvCard1.setImageResource(R.drawable.c36)
        if (i == 37) imgvCard1.setImageResource(R.drawable.c37)
        if (i == 38) imgvCard1.setImageResource(R.drawable.c38)
        if (i == 39) imgvCard1.setImageResource(R.drawable.c39)
        if (i == 40) imgvCard1.setImageResource(R.drawable.c40)
        if (i == 41) imgvCard1.setImageResource(R.drawable.c41)
        if (i == 42) imgvCard1.setImageResource(R.drawable.c42)
        if (i == 43) imgvCard1.setImageResource(R.drawable.c43)
        if (i == 44) imgvCard1.setImageResource(R.drawable.c44)
        if (i == 45) imgvCard1.setImageResource(R.drawable.c45)
        if (i == 46) imgvCard1.setImageResource(R.drawable.c46)
        if (i == 47) imgvCard1.setImageResource(R.drawable.c47)
        if (i == 48) imgvCard1.setImageResource(R.drawable.c48)
        if (i == 49) imgvCard1.setImageResource(R.drawable.c49)
        if (i == 50) imgvCard1.setImageResource(R.drawable.c50)
        if (i == 51) imgvCard1.setImageResource(R.drawable.c51)
        if (i == 52) imgvCard1.setImageResource(R.drawable.c52)
        else imgvCard1.setImageResource(R.drawable.red_back)
    }
}