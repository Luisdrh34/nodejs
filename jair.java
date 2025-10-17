public int sumar(int a, int b) {
    return a + b;
}

public boolean esPar(int n) {
    return n % 2 == 0;
}

public int mayor(int a, int b) {
    return (a > b) ? a : b;
}
public String saludar(String nombre) {
    return "Hola, " + nombre + "!";
}
public int factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("El número debe ser no negativo.");
    }
    int resultado = 1;
    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}