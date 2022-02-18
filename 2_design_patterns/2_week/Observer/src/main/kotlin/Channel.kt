class Channel : ISubject {
    private var A: MutableList<IObserver>
    private var status: String
    init {
        A = mutableListOf<IObserver>()
        status = "Initialized"
    }
    override fun registerObserver(observer: IObserver) {
        A.add(observer)
    }
    override fun removeObserver(observer: IObserver) {
        A.remove(observer)
    }
    override fun notifyObservers(s: String) {
        for (observer in A)
            observer.update(s)
    }
}