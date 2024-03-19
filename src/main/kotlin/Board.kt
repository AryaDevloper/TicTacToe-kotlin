abstract class Board(val size: Int = 3, private val winSize: Int = 3) {

    private val grid: Array<Array<Mark>> = Array(3) { Array(3) { Mark.BLANK } }

    init {

    }


    abstract fun win(winner: Mark)


    open fun checkWin() {
        for (x in 0 until size) {
            for (y in 0 until size) {
                val m = get(Position(x, y))

                if (m == Mark.BLANK)
                    continue

                var h = size - x >= winSize
                var v = size - y >= winSize
                var d = size - x >= winSize && size - y >= winSize


                for (c in 1 until  winSize) {
                    if (h && get(Position(c + x, y)) != m) h = false
                    if (v && get(Position(x, y + c)) != m) v = false
                    if (d && get(Position(x + c, y + c)) != m) d = false
                }
                if (d || v || h) {
                    win(m); return
                }
            }
        }
    }


    fun set(mark: Mark, position: Position) {
        grid[position.x][position.y] = mark
        checkWin()
    }


    fun get(position: Position): Mark {
        return grid[position.x][position.y]
    }


}