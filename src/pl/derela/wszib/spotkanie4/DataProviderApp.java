package pl.derela.wszib.spotkanie4;

import pl.derela.wszib.spotkanie4.lab14.DataPresenter;

public class DataProviderApp {

    public static void main(String[] args) {

        DataProvider dataProvider = new FileDataProvider(); // jedyne miejsce modyfikacji
        DataPresenter dataPresenter = new DataPresenter();
        dataPresenter.showData(dataProvider);


    }
}
