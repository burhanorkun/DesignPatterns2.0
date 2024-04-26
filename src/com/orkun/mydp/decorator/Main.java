package com.orkun.mydp.decorator;

public class Main {
    public static void main(String[] args) {
        //storeCreditCard(new CloudStream());
        //storeCreditCard(new EncryptedCloudStream(new CloudStream()));
        //storeCreditCard(new CompressedCloudStream(new CloudStream()));
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    private static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
