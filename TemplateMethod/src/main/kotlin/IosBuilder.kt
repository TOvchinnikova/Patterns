class IosBuilder : Builder() {
    override fun test() {
        println("Running ios tests")
    }

    override fun lint() {
        println("Linting the ios code")
    }

    override fun assemble() {
        println("Assembling the ios build")
    }

    override fun deploy() {
        println("Deploying ios build to server")
    }
}