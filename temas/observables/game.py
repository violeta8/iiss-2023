import rx
from rx import Observable
import time
import random

class Game:
    def __init__(self):
        self.player_move = Observable.create(lambda observer: self._player_move_observer(observer))
        self.player_shoot = Observable.create(lambda observer: self._player_shoot_observer(observer))

    def _player_move_observer(self, observer):
        while True:
            # Aquí iría la lógica de detección de eventos de movimiento del jugador
            # En este ejemplo, simplemente generamos un evento de movimiento aleatorio cada segundo
            time.sleep(1)
            observer.on_next((random.randint(-1, 1), random.randint(-1, 1)))

    def _player_shoot_observer(self, observer):
        while True:
            # Aquí iría la lógica de detección de eventos de disparo del jugador
            # En este ejemplo, simplemente generamos un evento de disparo aleatorio cada dos segundos
            time.sleep(2)
            observer.on_next(True)
