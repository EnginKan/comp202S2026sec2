package Mediator;

public class ChatClientImpl extends ChatClient{


    public ChatClientImpl(String nick, ChatRoom chatRoom) {
        super(nick, chatRoom);
    }

    @Override
    public void joinChatRoom(ChatRoom chatRoom) {
        chatRoom.accept(this);
    }

    @Override
    public void disjointChatRoom(ChatRoom chatRoom) {
        chatRoom.remove(this);
    }

    @Override
    public void broadcastMessage(String message) {
       this.getChatRoom().distrubeMessage(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message:"+ message);
    }
}
