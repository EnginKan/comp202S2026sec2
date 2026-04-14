package Observer;

public class MainApp {

    public static void main(String[] args) {

        YoutubeChannel myChannel= new YoutubeChannel();
        User u;
        for(int i=0;i<5;i++){
            u= new User();
            u.follow(myChannel);
                    }

        myChannel.publishVideo(" new AI Tool...");




    }
}
