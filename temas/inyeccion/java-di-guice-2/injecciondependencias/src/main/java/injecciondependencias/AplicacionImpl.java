package injecciondependencias;

import java.time.LocalDate;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class AplicacionImpl implements Aplicacion{
	
	@Inject
	BankAccount b1;
	
	@Inject
	BankAccount b2;
	
	@Inject  // Declaramos que necesitamos una inyeccion aqui
	@Named("comparadorId")  // Declaramos la inyeccion por nombre
    public ComparadorCuenta cId;

    @Inject
    @Named("comparadorFechaCreacion")
    public ComparadorCuenta cDate;
	
    
    public void ejecutar() {
    	ComparadorCuenta c;

        
        b1.setId("ES01123456789");
        b1.setCreationDate(LocalDate.of(2022, 1, 1));
        b2.setId("ES01987654321");
        b2.setCreationDate(LocalDate.of(2021, 1, 1));

        if(b1.compareTo(b2)>0){
            System.out.println("La cuenta b1 es mayor que la b2 comparando los id");
        }
        else{
            System.out.println("La cuenta b2 es mayor que la b1 comparando los id");
        }

        
        b1.setComparator(cDate);
        
        if(b1.compareTo(b2)>0){
            System.out.println("La cuenta b1 es mayor que la b2 comparando las fechas de creacion");
        }
        else{
            System.out.println("La cuenta b2 es mayor que la b1 comparando las fechas de creacion");
        }
    }
    
	

}
