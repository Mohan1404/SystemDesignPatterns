public class Testing {
    public static void main(String[] args) {
        //creating a youtube channel
        YoutubeChannel yc1=new YoutubeChannel("yc1");
        //creating two subscribers
        Subscriber s1=new Subscriber("mohan");
        Subscriber s2=new Subscriber("raghu");
        //each one are subscribing to channel yc1
        yc1.subscribe(s1);
        yc1.subscribe(s2);
        //channel uploaded a video and notified to users
        yc1.uploadVideo();
    }
}
