fun main() {
    print(solution("Z1-1B-63-84-45-E6"))
}

fun solution(inputString: String): Boolean {
    val tempArray = inputString.split("-")
    if (tempArray.size != 6)
        return false


    for (i in tempArray.indices) {
        if (tempArray[i].length != 2)
            return false
        for (j in 0 until 2) {
            return if ((tempArray[i][j].isDigit() && tempArray[i][j].digitToInt() in 0..9) ||
                tempArray[i][j].code in 65..70
            ) {
                continue
            } else {
                false
            }
        }
    }

    return true
}