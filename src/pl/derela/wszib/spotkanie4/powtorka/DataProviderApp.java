package pl.derela.wszib.spotkanie4.powtorka;

public class DataProviderApp {
    public static void main(String[] args) {

        DataProvider dataProvider = new SimpleDataProvider();
        DataPresenter dataPresenter = new DataPresenter();
        dataPresenter.showData(dataProvider);

        DataProvider dataProvider2 = new Datatxt();
        dataPresenter.showData(dataProvider2);

    }


}
