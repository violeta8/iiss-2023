#include <iostream>
#include <cstdlib>


class PersonajeDeAccion {
     
public:
    virtual void luchar() {std::cout << "PersonajeDeAccion luchando" << std::endl;}

};


class Heroe:public PersonajeDeAccion {
     
public:
    void luchar() {std::cout << "Heroe luchando" << std::endl;}
    void volar() {std::cout << "Heroe volando" << std::endl;}
};

class Creador {

public:
    PersonajeDeAccion **personajes() {
        PersonajeDeAccion **x=new PersonajeDeAccion*[4];
        x[0]=new PersonajeDeAccion();
        x[1]=new PersonajeDeAccion();
        x[2]=new Heroe();
        x[3]=new PersonajeDeAccion();
        
       return x;
    }
};


int main(int argc,char **args) {
    Creador cr;
    PersonajeDeAccion **cuatroFantasticos = cr.personajes();
    cuatroFantasticos[1]->luchar();
    cuatroFantasticos[2]->luchar(); // Upcast

    // En tiempo de compilacion: metodo no encontrado:
    //! cuatroFantasticos[2].volar();
    ((Heroe*)cuatroFantasticos[2])->volar(); // Downcast
    ((Heroe*)cuatroFantasticos[1])->volar(); // ClassCastException
    for (int i=0;i<4;i++){
        PersonajeDeAccion *p=cuatroFantasticos[i];
        p->luchar(); // Sin problema
    }
     for (int i=0;i<4;i++){
        PersonajeDeAccion *p=cuatroFantasticos[i];
        Heroe *e=(Heroe*)p;
        e->volar(); // El 0, 1 y 3 van a lanzar ClassCastException
     }
}
   