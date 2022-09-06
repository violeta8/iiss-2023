package injecciondependencias;

import java.time.LocalDate;

public interface BankAccount extends Comparable<BankAccount>{

	public void setId(String id);
	
	
	public LocalDate getCreationDate();

    public void setCreationDate(LocalDate date) ;

    public String getId();

    public void setComparator(ComparadorCuenta cmp);
    
    public int compareTo(BankAccount other);
}
