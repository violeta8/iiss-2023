from rx import Observable
import time
import random

class Enemy:
    def __init__(self):
        self.move = Observable.create(lambda observer: self._move_observer(observer))

    def _move_observer(self, observer):
        while True:
            # Aquí iría la lógica de movimiento de los enemigos
            # En este ejemplo, simplemente generamos un movimiento aleatorio cada segundo
            time.sleep(1)
            observer.on_next((random.randint(-1, 1), random.randint(-1, 1)))
