package org.example.auctionproject.domain.temporal;

import io.temporal.workflow.QueryMethod;
import io.temporal.workflow.SignalMethod;
import io.temporal.workflow.WorkflowInterface;
import org.example.auctionproject.domain.auction.AuctionStats;


@WorkflowInterface
public interface AuctionWorkflow {

    @SignalMethod
    void bid(String userId, Long amount);

    @QueryMethod
    AuctionStats getStats(String auctionId);
}
