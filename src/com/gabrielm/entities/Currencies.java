package com.gabrielm.entities;


import com.gabrielm.dataconnector.SearchCurrencies;

public class Currencies {
    private double ARS, BRL, COP;
    SearchCurrencies search = new SearchCurrencies();
    Currency currency = search.getCurrencies();

    public void convertCurrency(int option, double value){
        switch (option){
            case 1:
                this.ARS = currency.conversion_rates().get("ARS") * value;
                System.out.println("Valor de" + "$"+ value + " Dólares " + "convertido em Pesos Argentino => " + "$"+ getArs());
                break;
            case 2:
                this.ARS = value / currency.conversion_rates().get("ARS");
                System.out.println("Valor de " + "$"+ value + " Pesos Argentino" + " convertido em Dólar => " + "$"+ getArs());
                break;
            case 3:
                this.BRL = value * currency.conversion_rates().get("BRL");
                System.out.println("Valor de " + "$"+ value + " Dólares" + " convertido em BRL => " + "$"+ getBrl());
                break;
            case 4:
                this.BRL = value / currency.conversion_rates().get("BRL");
                System.out.println("Valor de " + "R$"+ value + " BRL" + " convertido em Dólares => " + "$"+ getBrl());
                break;
            case 5:
                this.COP = value * currency.conversion_rates().get("COP");
                System.out.println("Valor de " + "$"+ value + " Dólares" + " convertido em Peso colombiano => " + "$"+ getCop());
                break;
            case 6:
                this.COP =  value / currency.conversion_rates().get("COP");
                System.out.println("Valor de " + "R$"+ value + " Peso colombiano" + " convertido em Dólares => " + "$"+ getCop());
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public double getArs(){
        return  ARS;
    }

    public double getBrl(){
        return BRL;
    }

    public double getCop(){
        return COP;
    }
}
