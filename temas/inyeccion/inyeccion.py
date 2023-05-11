class Proveedor:
    def __init__(self, productos_por_defecto):
        self.productos_por_defecto = productos_por_defecto
        self.productos = productos_por_defecto[:]
        
    def obtener_productos(self):
        return self.productos
    
    def agregar_producto(self, producto):
        self.productos.append(producto)
        print(f'Producto agregado: {producto}')
        
    def restablecer_productos(self):
        self.productos = self.productos_por_defecto[:]
        print('La lista de productos se ha restablecido a los productos por defecto.')



class Comprador:
    def __init__(self, proveedor):
        self.proveedor = proveedor
        
    def realizar_compra(self, producto):
        if producto in self.proveedor.obtener_productos():
            print(f'Compra realizada: {producto}')
        else:
            print(f'Producto no disponible: {producto}')
            
    def agregar_producto(self, producto):
        self.proveedor.agregar_producto(producto)
        print(f'Producto agregado: {producto}')




if __name__ == '__main__':
    productos_por_defecto = ['camisa', 'pantalon', 'calcetines', 'zapatos', 'gorra', 'cinturon']
    proveedor = Proveedor(productos_por_defecto)

    while True:
        print('\n¿Qué deseas hacer?')
        print('1. Ver la lista de productos')
        print('2. Agregar un producto a la lista')
        print('3. Restablecer la lista de productos')
        print('4. Salir')

        opcion = input('Introduce el número de opción deseada: ')

        if opcion == '1':
            productos = proveedor.obtener_productos()
            print('Productos disponibles:')
            for producto in productos:
                print(f'- {producto}')

        elif opcion == '2':
            producto = input('Introduce el nombre del producto que deseas agregar: ')
            proveedor.agregar_producto(producto)

        elif opcion == '3':
            proveedor.restablecer_productos()

        elif opcion == '4':
            break

        else:
            print('Opción no válida. Por favor, introduce una opción válida.')
