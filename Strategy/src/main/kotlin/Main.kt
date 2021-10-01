fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    var sorter = Sorter(BubbleSortStrategy())
    sorter.sort(list)

    sorter = Sorter(QuickSortStrategy())
    sorter.sort(list)
}