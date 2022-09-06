package injecciondependencias;


import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;


public class ProductionServiceModule extends AbstractModule { // Clase configuradora

    /**
     * Metodo que produce la configuracion de Guice
     */
    public void configure(){
        bind(ComparadorCuenta.class)// Interface que se inyectara
                .annotatedWith(Names.named("comparadorId")) // Dependencia con nombre. Cuando se pida una inyeccion con ese nombre se inyectara el objeto aqui definido
                .to(BankAccountComparatorById.class) // Clase que implementa el interface a inuyectar
                .in(Scopes.SINGLETON); // Definimos que solo se instancie una vez y se utilice siempre ese objeto.

        bind(ComparadorCuenta.class)
                .annotatedWith(Names.named("comparadorFechaCreacion"))
                .to(BankAccountComparatorByCreationDate.class)
                .in(Scopes.SINGLETON);
        
        bind(Aplicacion.class)
        .to(AplicacionImpl.class)
        .in(Scopes.SINGLETON);

        bind(BankAccount.class)
        .to(BankAccountImpl.class);




    }

}
