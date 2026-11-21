package kr.ac.kumoh.s2025112622.w26w12_carddealer.respository

import kr.ac.kumoh.s2025112622.w26w12_carddealer.model.Card

interface CardRepository {
    val cards: List<Card>
    fun save(card: Card)
    fun deleteAll()
}