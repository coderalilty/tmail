package kz.tmail.entities;

import java.time.LocalDate;
import java.util.Objects;

public class RegisteredLetter extends Letter {
    private boolean signed;
    private Letter receipt;

    public RegisteredLetter(Address recipient, Address sender, String text, String attachment, LocalDate sendDate) {
        super(recipient, sender, text, attachment, sendDate);
    }

    public RegisteredLetter(Address recipient, Address sender, String text, String attachment, LocalDate sendDate, boolean signed, Letter receipt) {
        super(recipient, sender, text, attachment, sendDate);
        this.signed = signed;
        this.receipt = receipt;
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public Letter getReceipt() {
        return receipt;
    }

    public void setReceipt(Letter receipt) {
        this.receipt = receipt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RegisteredLetter that = (RegisteredLetter) o;

        if (signed != that.signed) return false;
        return Objects.equals(receipt, that.receipt);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (signed ? 1 : 0);
        result = 31 * result + (receipt != null ? receipt.hashCode() : 0);
        return result;
    }
}
