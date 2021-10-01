abstract class Builder {
    // Шаблонный метод
    fun build()
    {
        test()
        lint()
        assemble()
        deploy()
    }

    abstract fun test()
    abstract fun lint()
    abstract fun assemble()
    abstract fun deploy()
}