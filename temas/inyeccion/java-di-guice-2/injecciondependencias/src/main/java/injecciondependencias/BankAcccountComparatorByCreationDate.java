package injecciondependencias;


import java.util.*;

class BankAccountComparatorByCreationDate implements ComparadorCuenta {

	public int compare(BankAccount o1, BankAccount o2) {
		if( o1.getCreationDate().toEpochDay()>o2.getCreationDate().toEpochDay() ) {
        	return 1;
        }
        else if( o1.getCreationDate().toEpochDay()<o2.getCreationDate().toEpochDay() ) {
        	return -1;
        }
        else {
        	return 0;
        }
	}
    
}
