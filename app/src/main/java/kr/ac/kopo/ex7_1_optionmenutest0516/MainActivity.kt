package kr.ac.kopo.ex7_1_optionmenutest0516

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var editDegree : EditText
    lateinit var imgv : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linear = findViewById<LinearLayout>(R.id.linear)
        editDegree = findViewById<EditText>(R.id.editDegree)
        imgv = findViewById<ImageView>(R.id.imgv)
    }
//    옵션메뉴 등록
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmenu, menu)

        return true
    }

//    항목이 선택되었을 때 이벤트 처리할 수 있는 메소드
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.itemRotate -> {
                imgv.rotation += editDegree.text.toString().toFloat()
                return true
            }
            R.id.item1 -> {
                imgv.setImageResource(R.drawable.imgs1)
                item.setChecked(true)
                return true
            }
            R.id.item2 -> {
                imgv.setImageResource(R.drawable.imgs2)
                item.setChecked(true)
                return true
            }
            R.id.item3 -> {
                imgv.setImageResource(R.drawable.imgs3)
                item.setChecked(true)
                return true
            }
        }
        return false
    }
}