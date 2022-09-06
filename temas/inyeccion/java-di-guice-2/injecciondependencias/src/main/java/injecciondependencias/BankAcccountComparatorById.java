package injecciondependencias;



import java.util.*;

class BankAccountComparatorById implements ComparadorCuenta {
    public int compare(BankAccount o1, BankAccount o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
