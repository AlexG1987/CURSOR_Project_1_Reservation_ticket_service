package booking;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public
class Client {
    private String name;
    private String surName;
    private int age;
    private String email;
    private String phone;

    public Client(String name, String surName, int age, String email, String phone) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
}
