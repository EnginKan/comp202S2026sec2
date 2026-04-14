package Observer;



import java.util.HashSet;
import java.util.Set;

public class YoutubeChannel {

    private Set<User> followers=new HashSet<User>();

    public void addFollowers(User user){
        if(user!=null)
            followers.add(user);
        else
            throw new IllegalArgumentException("user cannot be null");

    }

    public void publishVideo(String content){

        this.notify(
                new Action("A NEW VIDEO ADDED",content)
        );

    }

    public void removeFollower(User user){

        followers.remove(user);
    }

    public void notify(Action action){

        followers.forEach(
                f->f.update(action)
        );
    }
}
