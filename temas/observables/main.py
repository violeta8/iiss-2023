import rx
from rx import Observable
import random

# Función que simula la emisión de eventos
def get_temperature():
    return random.randint(0, 100)

# Observable que emite valores cada segundo
observable = Observable.interval(1000).map(lambda x: get_temperature())

# Función que procesa los eventos
def process_event(temp):
    if temp > 50:
        print("La temperatura es alta: ", temp)
    else:
        print("La temperatura es normal: ", temp)

# Subscripción al observable
subscription = observable.subscribe(process_event)

# Esperar 10 segundos antes de cancelar la suscripción
import time
time.sleep(10)

# Cancelar la suscripción
subscription.dispose()
