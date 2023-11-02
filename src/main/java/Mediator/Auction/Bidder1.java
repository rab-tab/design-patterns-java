package Mediator.Auction;

public class Bidder1 implements Bidder {
    String name;
    AuctionMediator auctionMediator;

    public Bidder1(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmt) {
        auctionMediator.placeBid(this, bidAmt);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Someone has placed a bid of " + bidAmount);

    }

    @Override
    public String getName() {
        return name;
    }
}
