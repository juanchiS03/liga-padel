export async function getJugadores() {
  const response = await fetch('http://localhost:8080/api/jugadores');
  if (!response.ok) {
    throw new Error('Error al conectar con el backend');
  }
  return await response.json();
}