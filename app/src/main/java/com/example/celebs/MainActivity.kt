package com.example.celebs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val nelsonMandelaAge = 95
        val williamShakespeareAge = 52
        val albertEinsteinAge = 76
        val leonardoDaVinciAge = 67
        val isaacNewtonAge = 84
        val marieCurieAge = 66
        val mahatmaGandhiAge = 78
        val queenVictoriaAge = 81
        val charlesDarwinAge = 73
        val mozartAge = 35


        print("Enter your age: ")
        val userAgeInput = readlnOrNull()?.toIntOrNull()


        if (userAgeInput == null || userAgeInput !in 20..100) {
            println("Invalid age input. Please enter a valid age between 20 and 100.")
            return
        }


        val matchedPerson = when (userAgeInput) {
            nelsonMandelaAge -> "Nelson Mandela"
            williamShakespeareAge -> "William Shakespeare"
            albertEinsteinAge -> "Albert Einstein"
            leonardoDaVinciAge -> "Leonardo da Vinci"
            isaacNewtonAge -> "Isaac Newton"
            marieCurieAge -> "Marie Curie"
            mahatmaGandhiAge -> "Mahatma Gandhi"
            queenVictoriaAge -> "Queen Victoria"
            charlesDarwinAge -> "Charles Darwin"
            mozartAge -> "Mozart"
            else -> null
        }


        if (matchedPerson != null) {
            println("$matchedPerson passed away at the age of $userAgeInput.")
        } else {
            println("No famous person found with the given age.")
        }
    }
}