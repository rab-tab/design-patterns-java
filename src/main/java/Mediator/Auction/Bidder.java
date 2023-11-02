package Mediator.Auction;

public interface Bidder {
    void placeBid(int bidAmt);
    void receiveBidNotification(int bidAmount);
    String getName();
}
