package injecciondependencias;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String args[]){

        Injector inyector= Guice.createInjector(new ProductionServiceModule());
        //Comparator<BankAccount> c=(Comparator<BankAccount>) inyector.getBinding();
        Aplicacion app=inyector.getInstance(Aplicacion.class);
        app.ejecutar();


    }


}
