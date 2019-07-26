package com.lethanh98.Di_example.DI;

public class ClientLogic {
    void getDate() {
        DataService dataService=new DataService(new Show2());
        dataService.showDataService();
    }
}
