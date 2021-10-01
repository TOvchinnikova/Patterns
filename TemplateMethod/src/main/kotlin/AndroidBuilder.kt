class AndroidBuilder : Builder() {
    override fun test() {
        println("Running android tests")
    }

    override fun lint() {
        println("Linting the android code")
    }

    override fun assemble() {
        println("Assembling the android build")
    }

    override fun deploy() {
        println("Deploying android build to server")
    }
}