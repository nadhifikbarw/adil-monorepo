package com.path_studio.adil.ui.customButtons

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.res.ResourcesCompat
import com.path_studio.adil.R

class BlueLinearButton: AppCompatButton {

    private var enabledBackground: Drawable? = null
    private var disabledBackground: Drawable? = null

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        background = when {
            isEnabled -> enabledBackground
            else -> disabledBackground
        }
        textSize = 12f
        gravity = Gravity.CENTER
    }

    private fun init() {
        enabledBackground = ResourcesCompat.getDrawable(resources, R.drawable.bg_button_blue_line, null)
        disabledBackground = ResourcesCompat.getDrawable(resources, R.drawable.bg_button_blue_line_disable, null)
    }
}