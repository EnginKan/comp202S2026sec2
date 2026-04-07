package Mediator;

public interface ChatRoom {


    void accept(ChatClient chatClient);

    void remove(ChatClient chatClient);

    void distrubeMessage(String message);


}
