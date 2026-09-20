
package com.example.goldbot

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 24, 24, 24)
        }

        val title = TextView(this).apply {
            text = "🥇 Gold Bot"
            textSize = 28f
            gravity = Gravity.CENTER
            setTextColor(Color.BLACK)
        }
        root.addView(title)

        val info = TextView(this).apply {
            text = """
                XAUUSD
                EMA 20 / EMA 50
                RSI 14
                ATR 14
                Risk: 1%

                الوضع: Demo / Paper Trading
            """.trimIndent()
            textSize = 18f
            setPadding(0, 30, 0, 30)
        }
        root.addView(info)

        val status = TextView(this).apply {
            text = "الحالة: متوقف"
            textSize = 20f
        }
        root.addView(status)

        val start = Button(this).apply {
            text = "▶ تشغيل الروبوت"
        }
        root.addView(start)

        val stop = Button(this).apply {
            text = "■ إيقاف الروبوت"
        }
        root.addView(stop)

        start.setOnClickListener {
            status.text = "الحالة: يعمل ✓"
        }

        stop.setOnClickListener {
            status.text = "الحالة: متوقف"
        }

        setContentView(root)
    }
}
