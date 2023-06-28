package Mediator;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.List;

public class FacebookGroupMediatorImpl implements FacebookGroupMediator {

    private List<User> users;

    public FacebookGroupMediatorImpl() {
        this.users = new ArrayList<User>();
    }
    @Override
    public void registerUser( User user )
    {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        users.add(user);
        for (User u : this.users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}
