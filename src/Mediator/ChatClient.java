package Mediator;

public abstract class ChatClient {

    private String nick;
    private ChatRoom chatRoom;

    public ChatClient(String nick, ChatRoom chatRoom) {
        this.nick = nick;
        this.chatRoom = chatRoom;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public String getNick() {
        return nick;
    }

    public abstract void joinChatRoom(ChatRoom chatRoom);
    public abstract void disjointChatRoom(ChatRoom chatRoom);

    public abstract void broadcastMessage(String message);

    public abstract void receiveMessage(String message);




}
