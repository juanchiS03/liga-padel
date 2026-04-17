const API_URL = 'http://localhost:8080/api/parejas';

export async function getParejas() {
  const response = await fetch(API_URL);
  return await response.json();
}

export async function registrarPareja(jugador1Id: number, jugador2Id: number) {
  const response = await fetch(API_URL, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({
      jugador1: { id: jugador1Id },
      jugador2: { id: jugador2Id },
      puntosTotales: 0,
      partidosGanados: 0
    })
  });

  // Si el servidor responde con error (400, 500, etc)
  if (!response.ok) {
    const errorTexto = await response.text();
    console.error("Error detallado del servidor:", errorTexto);
    throw new Error("El servidor rechazó la creación de la pareja");
  }

  return await response.json();
}