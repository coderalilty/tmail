package kz.tmail.entities;

import java.util.List;
import java.util.Objects;

public class Post {
    private String zip;
    private List<Address> addresses;

    public Post(String zip, List<Address> addresses) {
        this.zip = zip;
        this.addresses = addresses;
    }

    public Post(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (!Objects.equals(zip, post.zip)) return false;
        return Objects.equals(addresses, post.addresses);
    }

    @Override
    public int hashCode() {
        int result = zip != null ? zip.hashCode() : 0;
        result = 31 * result + (addresses != null ? addresses.hashCode() : 0);
        return result;
    }
}
