package kz.tmail.services;

import kz.tmail.entities.Letter;

import java.util.Scanner;

public class LetterServiceImpl implements LetterService {

    public Letter createLetter() {
        Scanner scanner = new Scanner(System.in);

        return createLetterByScanner();
    }



}
