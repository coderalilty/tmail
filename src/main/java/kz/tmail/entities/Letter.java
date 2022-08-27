package kz.tmail.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Letter {
    private Address recipient;
    private Address sender;
    private String text;
    private String attachment;
    private LocalDate sendDate;

    public Letter(Address recipient, Address sender, String text, String attachment, LocalDate sendDate) {
        this.recipient = recipient;
        this.sender = sender;
        this.text = text;
        this.attachment = attachment;
        this.sendDate = sendDate;
    }

    public Address getRecipient() {
        return recipient;
    }

    public void setRecipient(Address recipient) {
        this.recipient = recipient;
    }

    public Address getSender() {
        return sender;
    }

    public void setSender(Address sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Letter letter = (Letter) o;

        if (!recipient.equals(letter.recipient)) return false;
        if (!sender.equals(letter.sender)) return false;
        if (!text.equals(letter.text)) return false;
        if (!Objects.equals(attachment, letter.attachment)) return false;
        return Objects.equals(sendDate, letter.sendDate);
    }

    @Override
    public int hashCode() {
        int result = recipient.hashCode();
        result = 31 * result + sender.hashCode();
        result = 31 * result + text.hashCode();
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (sendDate != null ? sendDate.hashCode() : 0);
        return result;
    }
}
