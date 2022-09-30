
/* ******   Libraries Imported **** */

package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.app.Dialog
import android.content.Intent
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton


/*              *****   Main Activity Class   *****                  */


class MainActivity : AppCompatActivity() {


    var Xturn = 0   // It determines whether it is X's turns or O's


    /*        ***** IDs stored in variable ******       */

    private val _1 by lazy { findViewById<TextView>(R.id.tvFR1) }
    private val _2 by lazy { findViewById<TextView>(R.id.tvFR2) }
    private val _3 by lazy { findViewById<TextView>(R.id.tvFR3) }
    private val _4 by lazy { findViewById<TextView>(R.id.tvSR1) }
    private val _5 by lazy { findViewById<TextView>(R.id.tvSR2) }
    private val _6 by lazy { findViewById<TextView>(R.id.tvSR3) }
    private val _7 by lazy { findViewById<TextView>(R.id.tvTR1) }
    private val _8 by lazy { findViewById<TextView>(R.id.tvTR2) }
    private val _9 by lazy { findViewById<TextView>(R.id.tvTR3) }

    private val btnRefresh by lazy {findViewById<ImageButton>(R.id.btnRefresh)}

/*    *****       On Create function    ******          */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        /*  ******   Conditions of winning  ******  */
        /*
        val cnd1 = arrayOf(_1, _2, _3)
        val cnd2 = arrayOf(_1, _4, _7)
        val cnd3 = arrayOf(_1, _5, _9)
        val cnd4 = arrayOf(_4, _5, _6)
        val cnd5 = arrayOf(_7, _8, _9)
        val cnd6 = arrayOf(_2, _5, _8)
        val cnd7 = arrayOf(_3, _6, _9)
        val cnd8 = arrayOf(_3, _5, _7)
        */


        /*   ******     On Click listeners to Text Views     *****   */


        _1.setOnClickListener {

            if (_1.text.isEmpty()) {

                if (Xturn == 0) {
                    xTurn(_1)
                } else {
                    oTurn(_1)
                }
            } else {
                warningToast()
            }
            draw()
            winner(_1,_2,_3,"X")
            winner(_1,_2,_3, "O")

            winner(_1, _4,_7,"X")
            winner(_1, _4,_7,"O")

            winner(_1,_5,_9, "X")
            winner(_1,_5,_9, "O")
        }
        _2.setOnClickListener {

            if (_2.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_2)

                } else {
                    oTurn(_2)


                }
            } else {
                warningToast()
            }
            draw()
            winner(_1,_2,_3,"X")
            winner(_1,_2,_3, "O")

            winner(_2, _5 ,_8, "X")
            winner(_2, _5 ,_8, "O")

        }
        _3.setOnClickListener {

            if (_3.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_3)

                } else {
                    oTurn(_3)
                }

            } else {
                warningToast()
            }
            draw()
            winner(_1,_2,_3,"X")
            winner(_1,_2,_3, "O")

            winner(_3,_5,_7,"X")
            winner(_3,_5,_7,"O")


            winner(_3,_6,_9,"X")
            winner(_3,_6,_9,"O")
        }

        _4.setOnClickListener {

            if (_4.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_4)

                } else {
                    oTurn(_4)
                }

            } else {
                warningToast()
            }
            draw()
            winner(_1, _4,_7,"X")
            winner(_1, _4,_7,"O")

            winner(_4,_5,_6, "X")
            winner(_4,_5,_6,"O")
        }
        _5.setOnClickListener {

            if (_5.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_5)

                } else {
                    oTurn(_5)
                }

            } else {
                warningToast()
            }
            draw()
            winner(_1,_5,_9, "X")
            winner(_1,_5,_9, "O")

            winner(_2, _5 ,_8, "X")
            winner(_2, _5 ,_8, "O")

            winner(_4,_5,_6, "X")
            winner(_4,_5,_6,"O")

            winner(_3,_5,_7,"X")
            winner(_3,_5,_7,"O")
        }
        _6.setOnClickListener {

            if (_6.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_6)

                } else {
                    oTurn(_6)


                }

            } else {
                warningToast()
            }
            draw()
            winner(_4,_5,_6, "X")
            winner(_4,_5,_6,"O")

            winner(_3,_6,_9,"X")
            winner(_3,_6,_9,"O")
        }
        _7.setOnClickListener {

            if (_7.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_7)

                } else {
                    oTurn(_7)
                }

            } else {
                warningToast()
            }
            draw()
            winner(_1, _4,_7,"X")
            winner(_1, _4,_7,"O")

            winner(_3,_5,_7,"X")
            winner(_3,_5,_7,"O")

            winner(_7,_8,_9,"X")
            winner(_7,_8,_9,"O")
        }
        _8.setOnClickListener {

            if (_8.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_8)

                } else {
                    oTurn(_8)
                }

            } else {
                warningToast()
            }
            draw()
            winner(_2, _5 ,_8, "X")
            winner(_2, _5 ,_8, "O")

            winner(_7,_8,_9,"X")
            winner(_7,_8,_9,"O")
        }
        _9.setOnClickListener {

            if (_9.text.isEmpty()) {
                if (Xturn == 0) {
                    xTurn(_9)

                } else {
                    oTurn(_9)
                }

            } else {
                warningToast()
            }
            draw()
            winner(_1,_5,_9, "X")
            winner(_1,_5,_9, "O")

            winner(_3,_6,_9,"X")
            winner(_3,_6,_9,"O")

            winner(_7,_8,_9,"X")
            winner(_7,_8,_9,"O")
        }


        /*   ****** Refresh button creates a new activity ******    */

        btnRefresh.setOnClickListener{
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }

    }

    /* *****   Private Functions    ***** */


    /*    ******  Creates X's turn   ***** */
    private fun xTurn(b : TextView){
        b.text = "X"
        Xturn = 1

    }

    /*    ******  Creates O's turn   ***** */

    private fun oTurn(a : TextView){
        a.text = "O"
        a.textSize = 65F
        Xturn = 0

    }

    /*  *****   If a user clicks on text view where someone has already
                played there then it will show a Toast   ******   */


    private fun warningToast(){
        Toast.makeText(this, "Already played here", Toast.LENGTH_SHORT).show()
    }


    /*   ******        Checks winning condition         ********/


    private fun winner(x : TextView, y: TextView, z:TextView, s : String){
        if(x.text == s && y.text == s && z.text == s) {


            /*  ****** If a winning condition matches it will show a dialog box  ***** */

            Dialog(this).show()
            val dialogbinding = layoutInflater.inflate(R.layout.custom_dialog, null)
            val dialog = Dialog(this)

            dialog.setContentView(dialogbinding)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.radius_dialog))
            dialog.show()

            val tvWin = dialogbinding.findViewById<TextView>(R.id.tvWin)
            val btnExit = dialogbinding.findViewById<AppCompatButton>(R.id.btnExit)
            val btnPlayAgain = dialogbinding.findViewById<AppCompatButton>(R.id.btnPlayAgain)

            when (x.text) {
                "X" -> {
                    tvWin.text = "Player 1  has Won".uppercase()
                }
                "O" -> {
                    tvWin.text = "Player 2  has Won".uppercase()
                }
                else -> {
                    tvWin.text = "It is a Draw".uppercase()
                }
            }


            /* ******    Button Exit will kill the activity     *******/
            btnExit.setOnClickListener{
                finish()
            }

            /*  ******   Button Play Again will restart the activity   ****** */

            btnPlayAgain.setOnClickListener {
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }

        }

    }

    /*   *******   Check if it is a Draw   ******** */


    private fun draw(){
        if((_1.text == "X" || _1.text == "O") &&
            (_2.text == "X" || _2.text == "O") &&
            (_3.text == "X" || _3.text == "O") &&
            (_4.text == "X" || _4.text == "O") &&
            (_5.text == "X" || _5.text == "O") &&
            (_6.text == "X" || _6.text == "O") &&
            (_7.text == "X" || _7.text == "O") &&
            (_8.text == "X" || _8.text == "O") &&
            (_9.text == "X" || _9.text == "O")
        )
        {
            Dialog(this).show()
            val dialogbinding = layoutInflater.inflate(R.layout.custom_dialog, null)
            val dialog = Dialog(this)

            dialog.setContentView(dialogbinding)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.radius_dialog))
            dialog.show()

            val tvWin = dialogbinding.findViewById<TextView>(R.id.tvWin)
            val btnExit = dialogbinding.findViewById<AppCompatButton>(R.id.btnExit)
            val btnPlayAgain = dialogbinding.findViewById<AppCompatButton>(R.id.btnPlayAgain)
            tvWin.text = "It  is  a  Draw".uppercase()

            btnExit.setOnClickListener{
                finish()
            }
            btnPlayAgain.setOnClickListener {
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }

        }
    }
}


/*     ********************************      Game Over       ******************************   */