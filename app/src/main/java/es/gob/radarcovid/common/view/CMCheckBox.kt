/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.common.view

import android.content.Context
import android.text.method.LinkMovementMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.CompoundButton
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import es.gob.radarcovid.R
import kotlinx.android.synthetic.main.view_cmcheckbox.view.*

class CMCheckBox @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    var isChecked: Boolean = false
        set(value) {
            field = value
            checkBox.isChecked = value
        }
        get() = checkBox.isChecked

    init {
        orientation = HORIZONTAL
        LayoutInflater.from(context).inflate(R.layout.view_cmcheckbox, this)
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CMCheckBox)
        val text = typedArray.getText(R.styleable.CMCheckBox_android_text)
        typedArray.recycle()
        textView.text = text
    }

    fun setOnCheckedChangeListener(listener: CompoundButton.OnCheckedChangeListener?) {
        checkBox.setOnCheckedChangeListener(listener)
    }

    fun setText(text: CharSequence?) {
        textView.text = text
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.highlightColor = ContextCompat.getColor(context, R.color.black_28)
    }

}