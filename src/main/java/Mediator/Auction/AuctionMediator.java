package Mediator.Auction;

public interface AuctionMediator {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder,int amount);
}
