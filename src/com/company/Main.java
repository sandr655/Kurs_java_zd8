package com.company;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        Color color = new Color();
        client.old = 30;
        client.Vgod = "Zima";
        client.zvet = color.zvet(client.Vgod);
        client.print();


        Employee employee = new Employee();
        employee.name = "Zohan";
        employee.old = 20;
        employee.Vgod = "Leto";
        employee.zvet = color.zvet(employee.Vgod);
        employee.print();


        client.clik();
        employee.clik();
    }
}
