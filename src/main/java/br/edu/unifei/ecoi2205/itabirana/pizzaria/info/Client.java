package br.edu.unifei.ecoi2205.itabirana.pizzaria.info;

public class Client {
    private int idClient;
    private String name;
    private String address;
    private String phone;
    private String email;
    public Client(int idClient, String name, String address, String phone, String
            email) {
        this.idClient = idClient;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public int getIdClient() {
        return idClient;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
