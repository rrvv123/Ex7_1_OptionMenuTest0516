package kr.ac.kopo.ex7_1_optionmenutest0516

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linear = findViewById<LinearLayout>(R.id.linear)
        btn = findViewById<Button>(R.id.btn)
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
            R.id.itemGray -> {
                linear.setBackgroundColor(Color.GRAY)
                return true
            }
            R.id.itemYellow -> {
                linear.setBackgroundColor(Color.YELLOW)
                return true
            }
            R.id.itemDkGray -> {
                linear.setBackgroundColor(Color.DKGRAY)
                return true
            }

            R.id.btnRotate -> {
                btn.rotation += 60f // 실수형으로 표기해야됨. 따라서 float의 f를 붙여줌.
                return true
            }
            R.id.btnZoomin -> {
                btn.scaleX = 2f
                return true
            }
        }
        return false
    }
}