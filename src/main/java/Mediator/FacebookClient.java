package Mediator;

public class FacebookClient {
    public static void main(String[] args) {
        FacebookGroupMediator facebookMediator = new FacebookGroupMediatorImpl();
        User user1 = new UserImpl(facebookMediator, "user1");
        User user2 = new UserImpl(facebookMediator, "user2");
        User user3 = new UserImpl(facebookMediator, "user3");

        facebookMediator.registerUser(user1);
        facebookMediator.registerUser(user2);
        facebookMediator.registerUser(user3);
        user1.send("what is Design Patterns? Please explain");

    }
}
