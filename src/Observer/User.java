package Observer;

public class User {


    public void update(Action action) {
        System.out.println("Hey you have a new:\n"
                +action.toString());
    }

    public void follow(YoutubeChannel channel){
        channel.addFollowers(this);
    }

    public void unfollow(YoutubeChannel channel){
        channel.removeFollower(this);
    }


}
