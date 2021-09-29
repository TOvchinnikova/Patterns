class DevelopmentManager : HiringManager() {
    override fun makeInterviewer(): Interviewer {
        return Developer()
    }
}