package ro.ase.csie.g1092.dp.chain;

public class TestChain {
    public static void main(String[] args) {

        ChatHandler broadcastNode = new BroadcastMessageHandler();
        ChatHandler privateNode = new PrivateMessageHandler();
        ChatHandler englishFilterNode = new EnglishFilter(5);

        englishFilterNode.setNext(privateNode);
        privateNode.setNext(broadcastNode);

        ChatHandler chatServer = englishFilterNode;
        chatServer
                .processMessage(new ChatMessage("Robert","@everyone","Hello guys",2));
        chatServer
                .processMessage(new ChatMessage("Robert", "@everyone","Hit superman, its a bot",3));
        chatServer
                .processMessage(new ChatMessage("Robert","@john","Hello man",1));

    }
}
