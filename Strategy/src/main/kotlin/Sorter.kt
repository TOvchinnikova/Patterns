class Sorter(private val strategy: SortStrategy) {
    fun sort(list: List<Int>): List<Int> {
        return strategy.sort(list)
    }
}