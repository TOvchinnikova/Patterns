class MarketingManager : HiringManager() {
    override fun makeInterviewer(): Interviewer {
        return CommunityExecutive()
    }
}