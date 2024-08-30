function crearCarta() {
    const carta = [];
    const numero= new Set();

    while (numero.size < tamanho * tamanho) {
        const j = Math.floor(Math.random() * 99) + 1;
        if (!numero.has(j)) {
            numero.add(j);
        }
    }

    const arreglo = Array.from(numero);
    for (let i = 0; i < tamanho; i++) {
        carta.push(arreglo.slice(i * tamanho, (i + 1) * tamanho));
    }
    return carta;
}

function marcarNumero(carta, numero) {
    for (let i = 0; i < tamanho; i++) {
        for (let j = 0; j < tamanho; j++) {
            if (carta[i][j] === numero) {
                carta[i][j] = 'X';
                return true;
            }
        }
    }
    return false;
}

