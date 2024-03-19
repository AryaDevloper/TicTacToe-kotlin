fun main() {


}


fun displayBoard(board: Board) {


    for (y in 0 until board.size) {
        for (x in 0 until board.size) {

            print(
                when (board.get(Position(x, y))) {

                    Mark.X -> "x"
                    Mark.O -> "o"

                    else -> "#"
                }
            )
            print("\t")

        }
        println()
    }

}