## Construcción y compilación del ejemplo
Para que salga todo correctamente debe situarse en la terminal (cmd) en el directorio donde se encuentre el archivo cpp

Ejecutar el siguiente comando en la terminal:
    g++ exampleUndefined.cpp -std=c++17

## Ejecución del ejemplo

Ejecutar el siguiente comando en la terminal:
    
    .\a.exe

## Codigo
#include <iostream>
#include <optional>
#include <string>
#include <vector>

struct Animal {
    std::string name;
};

struct Person {
    std::string name;
    std::vector<Animal> pets;
    
    std::optional<Animal> pet_with_name(const std::string &name) {
        for (const Animal &pet : pets) {
            if (pet.name == name) {
                return pet;
            }
        }
        return std::nullopt;
    }
};

int main() {
    Person paulo;
    paulo.name = "Paulo";
    
    Animal fluffy;
    fluffy.name = "Fluffy";
    paulo.pets.push_back(fluffy);
    
    Animal furball;
    furball.name = "Furball";
    paulo.pets.push_back(furball);
    
    std::optional<Animal> whiskers = paulo.pet_with_name("UCA");
    if (whiskers) {
        std::cout << "Paulo tiene una mascota llamada UCA." << std::endl;
    }
    else {
        std::cout << "UCA no pertenece a Paulo" << std::endl;
    }
}

## Explicacion
El uso del optional, a partir de c++17, es bastante importante, puesto que antes el nullptr representaba la ausencia de un valor comúnmente, sobre todo en objetos grandes, pero para valores pequeños o por ejemplo un int, rara vez se asignan dinámicamente por punteros, entonces para esto se introdujo unos de los usos del optional en c++.

En este ejemplo, Paulo recibe dos mascotas, Fluffy y Furball. Luego se llama a la función Person::pet_with_name() para recuperar los bigotes de la mascota de Paulo. Como Paulo no tiene una mascota llamada UCA, la función falla y std::nullopt se devuelve en su lugar.