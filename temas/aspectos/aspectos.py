from functools import wraps
import time
from flask import Flask

app = Flask(__name__)

def time_it(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"La funcion {func.__name__} tardo {end - start} segundos en ejecutarse.")
        return result
    return wrapper

def log_it(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        print(f"Llamando a la funcion {func.__name__}.")
        result = func(*args, **kwargs)
        print(f"La funcion {func.__name__} ha sido llamada.")
        return result
    return wrapper

@app.route('/')
@time_it
@log_it
def fun_welcome():
    return '¡Bienvenidx a la primera funcion!'

@app.route('/otra_funcion/')
@time_it
def other_fun():
    return '¡Esto es otra funcion!'

@app.errorhandler(404)
def page_not_found(error):
    return 'Lo siento, no se pudo encontrar la pagina solicitada.', 404

if __name__ == '__main__':
    app.run(port=8080)
