package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0
    val secretArray = secret.toCharArray()
    var secretCopy = secret
    for (index in guess.indices) {
        if (guess[index] == secret[index]) {
            rightPosition++
        } else if (guess[index] != secret[index] && guess[index] in secretArray) {
            wrongPosition++
        }
    }
    return Evaluation(rightPosition, wrongPosition)
}
