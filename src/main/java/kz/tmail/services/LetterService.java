package kz.tmail.services;

import kz.tmail.entities.Address;
import kz.tmail.entities.Letter;

import java.time.LocalDate;
import java.util.Scanner;

public interface LetterService<T extends Letter>{

    // сервис для адресов
    final AddressService addressService = new AddressService();

    //создать письмо
    public T createLetter();


    //Создаю простое письмо через сканнер использую в реализации
    public default Letter createLetterByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to create new letter");
        System.out.println("----------------------------");
        System.out.println("Input letter text");
        String text = scanner.next();
        System.out.println("------input start  recipient address ---------");
        Address recipient = addressService.createAddress(scanner);
        System.out.println("------end  recipient address ---------");

        System.out.println("------input start  sender address ---------");
        Address sender = addressService.createAddress(scanner);
        System.out.println("------end  sender address ---------");
        System.out.println("Input attachment text");
        String attachment = scanner.next();
        scanner.close();

        return new Letter(recipient, sender, text, attachment, LocalDate.now());

    }
}
