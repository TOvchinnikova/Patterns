abstract class HiringManager {
    // Factory method
    abstract fun makeInterviewer(): Interviewer;

    public fun takeInterview()
    {
        val interviewer = makeInterviewer()
        interviewer.askQuestions()
    }
}