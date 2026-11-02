package main.systemdesignpattern.abstractfactorypattern;

import main.systemdesignpattern.abstractfactorypattern.DataBaseFactory.PostgresSQLDataBaseFactory;

public class Main {
    static void main(String[] args) {
        DataBaseClient dataBaseClient = new DataBaseClient(new PostgresSQLDataBaseFactory());
        dataBaseClient.interactWithDatabase("SELECT * FROM EMPLOYEES");

    }
}
