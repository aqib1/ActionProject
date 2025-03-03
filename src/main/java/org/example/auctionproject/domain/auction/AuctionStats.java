package org.example.auctionproject.domain.auction;

import org.example.auctionproject.domain.bid.Bid;

import java.util.List;


public record AuctionStats(
        String auctionId,
        AuctionState state,
        List<Bid> previousBids
) {
}
