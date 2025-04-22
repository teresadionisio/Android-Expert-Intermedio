package com.aristidevs.horoscapp.data.providers

import com.aristidevs.horoscapp.domain.model.HoroscopeInfo
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Aries
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Leo
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Libra
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.aristidevs.horoscapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

/**************************************************************************/
class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}