package com.bitcolon.affirmations.data

import com.bitcolon.affirmations.R
import com.bitcolon.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        var list = listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )

        return list.shuffled()
    }
}