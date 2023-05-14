from functools import wraps
import time
from flask import Flask

app = Flask(__name__)

# Definición de los decoradores
def time_it(func):
    # ... definición del decorador ...
    

def log_it(func):
    # ... definición del decorador ...

def before_execution(func):
    # ... definición del decorador ...

def after_execution(func):
    # ... definición del decorador ...

def only_with_parameter(param_name):
    # ... definición del decorador ...

# Definición de las rutas y funciones decoradas
@app.route('/')
@time_it
@log_it
@before_execution
def fun_welcome():
    return '¡Bienvenidx a la primera funcion!'

@app.route('/otra_funcion/')
@time_it
def other_fun():
    return '¡Esto es otra funcion!'

@app.errorhandler(404)
def page_not_found(error):
    return 'Lo siento, no se pudo encontrar la pagina solicitada.', 404

@only_with_parameter('parametro_especial')
def function_with_special_parameter(parametro_especial):
    return parametro_especial * 2

if __name__ == '__main__':
    app.run(port=8080)
