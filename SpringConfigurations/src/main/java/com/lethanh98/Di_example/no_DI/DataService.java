package com.lethanh98.Di_example.no_DI;

public class DataService {
    private ShowData showData;

    public DataService() {
        this.showData = new Show1();
    }

    void showDataService() {
        this.showData.showData();
    }
}
