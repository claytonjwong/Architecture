interface ISubject {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObservers(s: String)
}