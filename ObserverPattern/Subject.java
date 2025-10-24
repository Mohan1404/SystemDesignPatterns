

interface Subject{
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifyAllSubscribers();
    void uploadVideo();
}