package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0
    for (index in guess.indices) {
        if (guess[index] == secret[index]) {
        }
    }
}
