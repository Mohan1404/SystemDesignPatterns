import java.util.*;
public class YoutubeChannel implements Subject {
    
    List<Subscriber>li=new ArrayList<>();
    String name;
    YoutubeChannel(String name){
        this.name=name;
    }
    
    @Override
    public void subscribe(Subscriber s) {
        li.add(s);
    }
    public void uploadVideo(){
        notifyAllSubscribers();
    }
    @Override
    public void unsubscribe(Subscriber s) {
        li.remove(s);
    }

    @Override
    public void notifyAllSubscribers() {
        for(int i=0;i<li.size();i++){
            li.get(i).update();
        }
    }
    
}
