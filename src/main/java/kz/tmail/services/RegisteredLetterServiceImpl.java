package kz.tmail.services;

import kz.tmail.entities.Letter;
import kz.tmail.entities.RegisteredLetter;

public class RegisteredLetterServiceImpl implements LetterService {
    @Override
    public RegisteredLetter createLetter() {
        Letter letter = createLetterByScanner();

        return new RegisteredLetter(letter.getRecipient(), letter.getSender(), letter.getText(),
                letter.getAttachment(), letter.getSendDate());
    }
}
