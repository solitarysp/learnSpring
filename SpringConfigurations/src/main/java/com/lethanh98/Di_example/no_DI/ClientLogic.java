package com.lethanh98.Di_example.no_DI;

public class ClientLogic {
    void getDate() {
        DataService dataService=new DataService();
        dataService.showDataService();
    }
}
