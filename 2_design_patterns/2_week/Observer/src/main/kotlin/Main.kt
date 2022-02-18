fun main(args: Array<String>) {
    var channel = Channel()
    var A = listOf(Follower("Ace"), Follower("Bob"))
    A.forEach{ channel.registerObserver(it) }
    channel.notifyObservers("dinner time!")
    /*
        Ace is updated with dinner time!
        Bob is updated with dinner time!
    */
}