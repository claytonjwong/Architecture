class Follower(val name: String) : IObserver {
    override fun update(s: String) {
        println("$name is updated with $s")
    }
}