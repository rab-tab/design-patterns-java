package Mediator.Auction;

public class Driver {
    public static void main(String[] args) {

        AuctionMediator auctionMediator = new Auction();
        Bidder1 bidder1 = new Bidder1("A", auctionMediator);
        Bidder1 bidder2 = new Bidder1("B", auctionMediator);
        bidder1.placeBid(1000);
        bidder2.placeBid(2000);

    }

}
