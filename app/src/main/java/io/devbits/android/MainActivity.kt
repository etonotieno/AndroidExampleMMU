package io.devbits.android

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var teamAScore: Int = 0
    private var teamBScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val teamAPlusThree: Button = findViewById(R.id.teamAPlusThree)
        val teamAPlusTwo: Button = findViewById(R.id.teamAPlusTwo)
        val teamAFreeThrow: Button = findViewById(R.id.teamAFreeThrow)

        val teamBPlusThree: Button = findViewById(R.id.teamBPlusThree)
        val teamBPlusTwo: Button = findViewById(R.id.teamBPlusTwo)
        val teamBFreeThrow: Button = findViewById(R.id.teamBFreeThrow)


        teamAPlusThree.setOnClickListener {
            teamAScore += 3
            displayScoreForTeamA()
        }
        teamAPlusTwo.setOnClickListener {
            teamAScore += 2
            displayScoreForTeamA()
        }
        teamAFreeThrow.setOnClickListener {
            teamAScore += 1
            displayScoreForTeamA()
        }

        teamBPlusThree.setOnClickListener {
            teamBScore += 3
            displayScoreForTeamB()
        }
        teamBPlusTwo.setOnClickListener {
            teamBScore += 2
            displayScoreForTeamB()
        }
        teamBFreeThrow.setOnClickListener {
            teamBScore += 1
            displayScoreForTeamB()
        }

    }

    private fun displayScoreForTeamA() {
        val teamAScoreTextView: TextView = findViewById(R.id.teamAScoreTextView)
        teamAScoreTextView.setText("$teamAScore")
    }

    fun displayScoreForTeamB() {
        val teamBScoreTextView: TextView = findViewById(R.id.teamBScoreTextView)
        teamBScoreTextView.setText("$teamBScore")
    }


}
