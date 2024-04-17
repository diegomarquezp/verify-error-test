package org.example;

import com.google.cloud.filestore.v1.CloudFilestoreManagerClient;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    System.out.println("Hello world!");
    CloudFilestoreManagerClient.create();
  }
}