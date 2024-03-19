fun main() {


    val board = object : Board() {
        override fun win(winner: Mark) {
            println("win")
        }
    }


//    board.set(Mark.O, Position(2, 0))
//    board.set(Mark.O, Position(1, 0))
//    board.set(Mark.O, Position(0, 0))

    board.set(Mark.O, Position(2, 2))
    board.set(Mark.O, Position(1, 1))
    board.set(Mark.O, Position(0, 0))

    displayBoard(board)

}