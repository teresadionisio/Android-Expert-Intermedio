package com.aristidevs.horoscapp.ui.horoscope.adapter

import android.content.Context
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.horoscapp.databinding.ItemHoroscopeBinding
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelect: (HoroscopeInfo) -> Unit) {
        val context: Context = binding.tvTitle.context
        binding.tvTitle.text = context.getString(horoscopeInfo.name)
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)

        binding.parent.setOnClickListener {
            starRotationAnimation(binding.ivHoroscope, newLambda = { onItemSelect(horoscopeInfo) })
            //onItemSelect(horoscopeInfo)
        }
    }

    /********************************************************************/
    private fun starRotationAnimation(view: View, newLambda: () -> Unit) {
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newLambda() }
            start()
        }
    }
}