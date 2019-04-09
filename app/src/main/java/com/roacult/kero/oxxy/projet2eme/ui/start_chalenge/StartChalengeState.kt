package com.roacult.kero.oxxy.projet2eme.ui.start_chalenge

import com.roacult.kero.oxxy.domain.interactors.None
import com.roacult.kero.oxxy.domain.interactors.SubmitionResult
import com.roacult.kero.oxxy.domain.modules.ChalengeDetailles
import com.roacult.kero.oxxy.projet2eme.base.State
import com.roacult.kero.oxxy.projet2eme.utils.Async
import com.roacult.kero.oxxy.projet2eme.utils.Event

data class StartChalengeState(val selectedFragment : Event<Int>,
                              val getChalengeDetailles  : Async<ChalengeDetailles>,
                              val startChalenge :Async<None>?,
                              val page : Event<Int>,
                              val solvedBy : Int,
                              val questionSolved :Int,
                              val submition : Async<SubmitionResult>?) : State

const val STARTCHALENGE_FRAGMENT1 = 0
const val STARTCHALENGE_FRAGMENT2 = 1
