package Mediator.Auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    List<Bidder> bidders = new ArrayList<>();

    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        for (Bidder bidder1 : bidders) {
            if (!bidder1.getName().equalsIgnoreCase(bidder.getName())) {
                bidder1.receiveBidNotification(amount);
            }

        }

    }
}
