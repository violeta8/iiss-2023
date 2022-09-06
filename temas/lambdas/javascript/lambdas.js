
class DataOperationsImpl{
    
    print(data) {
        data.forEach(
            (e) => console.log(e)
        );
    }

    filterPairs(data) {

        return data.filter(
            (e) => e%2==0
        );

    }

    ordenarDesc(data){
        return data.sort().reverse();
    }

    printx10(data) {
        data.forEach(
            (e) => console.log(10*e)
        );
    }

    suma(data){
        return data.reduce(
            (acumulador,valor) => acumulador+valor, // funcion lambda que suma el acumulador+ el valor del elemento
            0, // valor inicial del acumulador    
        );
    }
}

let data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log("data = " + data);
let operations = new DataOperationsImpl();
operations.print(data);
data = operations.filterPairs(data);
operations.print(data);
