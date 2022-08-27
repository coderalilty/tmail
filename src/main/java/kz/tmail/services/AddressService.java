package kz.tmail.services;

import kz.tmail.entities.Address;
import kz.tmail.entities.Post;

import java.util.Scanner;

public class AddressService {

    public Address createAddress(Scanner scanner) {
        System.out.println("Start--------------");
        System.out.println("input Street");
        String street = scanner.next();
        System.out.println("input recipientName");
        String recipientName = scanner.next();
        System.out.println("input zip");
        Post post = new Post(scanner.next());
        System.out.println("input phoneNumber");
        String phoneNumber = scanner.next();
        System.out.println("input build");
        Integer build = scanner.nextInt();
        System.out.println("do you have input flat yes=1, no=2");
        int flatInp = scanner.nextInt();
        Integer flat = null;
        if(flatInp == 1) {
            flat = scanner.nextInt();
        }
        return new Address(street, recipientName, post, phoneNumber, build, flat);
    }
}
