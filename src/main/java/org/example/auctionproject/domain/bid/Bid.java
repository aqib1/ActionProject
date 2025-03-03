package org.example.auctionproject.domain.bid;

public record Bid(
        String userId,
        Long amount,
        boolean isValid
) {
}
