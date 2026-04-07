package Mediator;

import java.util.ArrayList;
import java.util.List;

public class YeditepeChatRoom implements ChatRoom{

   List<ChatClient>  clients= new ArrayList<ChatClient>();

    @Override
    public void accept(ChatClient chatClient) {
       if(chatClient!=null && !clients.contains(chatClient)) {
           clients.add(chatClient);
           this.distrubeMessage(chatClient.getNick()+" joins the room");
       }


    }

    @Override
    public void remove(ChatClient chatClient) {
        if(chatClient!=null && clients.contains(chatClient)) {
            clients.remove(chatClient);
            this.distrubeMessage(chatClient.getNick()+" left the room");
        }
    }

    @Override
    public void distrubeMessage(String message) {
        clients.forEach(
                c->c.receiveMessage(message)
        );
    }
}
