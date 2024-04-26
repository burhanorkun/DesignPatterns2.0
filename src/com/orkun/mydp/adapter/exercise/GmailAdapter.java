package com.orkun.mydp.adapter.exercise;

import com.orkun.mydp.adapter.exercise.gmail.GmailClient;

public class GmailAdapter extends GmailClient implements EmailProvider {
    private GmailClient client = new GmailClient();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
