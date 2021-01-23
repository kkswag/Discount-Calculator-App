 package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ori = findViewById<EditText>(R.id.ori)
        var per = findViewById<EditText>(R.id.per)
        var total = findViewById<TextView>(R.id.total)
        val cal = findViewById<Button>(R.id.cal)
        var check = findViewById<CheckBox>(R.id.check)


        cal.setOnClickListener {
            var price = ori.text.toString().toInt()
            var cent = per.text.toString().toInt()
            var totalInt = 0.0


            if (check.isChecked){
                totalInt += (price - (price * cent/100.0)) + (price - (price * cent/100.0))*0.07
            }
            else{
                totalInt += price - (price*cent/100.0)
            }

            total.text = totalInt.toString()
        }



    }
}