package kz.tmail.entities;

public record Address(String streetName, String recipientName, Post post, String phoneNumber
, Integer build, Integer flat) {
}
