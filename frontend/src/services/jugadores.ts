const API_URL = 'http://localhost:8080/api/jugadores';

export async function getJugadores() {
  const response = await fetch(API_URL);
  return await response.json();
}

export async function registrarJugador(jugador: any) {
  const response = await fetch(API_URL, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(jugador)
  });
  return await response.json();
}