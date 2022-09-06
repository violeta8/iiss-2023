package injecciondependencias;


import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.*;
import java.io.*;
import java.time.*;

public final class BankAccountImpl implements BankAccount {
    private String id;
    private LocalDate creationDate;

    @Inject
    @Named("comparadorId")
    private ComparadorCuenta comparator;

    public BankAccountImpl() {
        this.id =null;
    }
    
    

    public void setId(String id) {
		this.id = id;
	}



	public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate date) {
        this.creationDate = date;
    }

    public String getId() {
        return id;
    }

    public void setComparator(ComparadorCuenta cmp) {
        comparator = cmp;
    }

    

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof BankAccountImpl))
            return false;
        BankAccountImpl that = (BankAccountImpl) other;
        return this.id.equals(that.getId());
    }

    @Override
    public String toString() {
        return id.toString();
    }



	public int compareTo(BankAccount other) {
		if (this == other) {
            return 0;
		}
        assert this.equals(other) : "compareTo inconsistent with equals.";
        return comparator.compare(this, other);
	}

    
 
}
