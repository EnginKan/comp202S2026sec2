package Mediator;

public class MainApp {

    public static void main(String[] args) {

        YeditepeChatRoom chatRoom=new YeditepeChatRoom();
        ChatClientImpl myUser=new ChatClientImpl("Engin",chatRoom);
        for(int i=1;i<=10;i++){

            chatRoom.accept(new ChatClientImpl("User"+i,chatRoom));
        }

        myUser.disjointChatRoom(chatRoom);
        myUser.broadcastMessage("My name is "+ myUser.getNick());



    }
}
