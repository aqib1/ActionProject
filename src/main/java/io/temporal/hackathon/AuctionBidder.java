package io.temporal.hackathon;

import io.temporal.client.WorkflowClient;
import io.temporal.hackathon.client.ClientProvider;

import java.io.IOException;

public class AuctionBidder {

    public static void main(String[] args) throws IOException {
        WorkflowClient client = ClientProvider.getClient();
        String name  = System.getenv("USER");

        try {
            long bid = Long.parseLong(args[0]);
            client.newUntypedWorkflowStub("car").signal("bid", name, bid);
            System.out.println("Bid placed " + bid);
        } catch (Exception e) {
            System.out.println("Please supply a bid price as the runtime argument");

            System.out.println(e);
        }
		    System.exit(0);
    }
}
