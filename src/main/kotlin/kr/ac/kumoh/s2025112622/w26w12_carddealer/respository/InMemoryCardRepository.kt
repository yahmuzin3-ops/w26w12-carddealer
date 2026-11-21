package kr.ac.kumoh.s2025112622.w26w12_carddealer.respository

import kr.ac.kumoh.s2025112622.w26w12_carddealer.model.Card
import org.springframework.stereotype.Repository


@Repository
class InMemoryCardRepository : CardRepository {
    private val _cards: MutableList<Card> = mutableListOf()

    override val cards
        get() = _cards.toList()

    override fun save(card: Card) {
        if (!_cards.contains(card)) {
            _cards.add(card)
        }
    }

    override fun deleteAll() {
        _cards.clear()
    }
}