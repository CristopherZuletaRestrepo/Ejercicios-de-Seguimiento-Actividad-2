package vehiculos2;

import java.util.Scanner;

public class VEHICULOS2 {
    public enum TipoCombustible { gasolina, bioetanol, diesel, biodiesel, gas_natural }
    public enum TipoAuto { carro_ciudad, subcompactos, compacto, familiar, ejecutivo, SUV }
    public enum Color { blanco, negro, rojo, naranja, amarillo, verde, azul, violeta }
    private String marca;
    private String modelo;
    private float vmotor;
    private TipoCombustible combustible;
    private TipoAuto auto;
    private int numpuertas;
    private int numasientos;
    private float velocidadmaxima;
    private Color color;
    private float velocidadactual;
    public VEHICULOS2(String marca, String modelo, float vmotor, TipoCombustible combustible,TipoAuto auto, int numpuertas, int numasientos, float velocidadmaxima,Color color, float velocidadactual) {
        this.marca = marca;
        this.modelo = modelo;
        this.vmotor = vmotor;
        this.combustible = combustible;
        this.auto = auto;
        this.numpuertas = numpuertas;
        this.numasientos = numasientos;
        this.velocidadmaxima = velocidadmaxima;
        this.color = color;
        this.velocidadactual = velocidadactual;
    }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public float getVmotor() { return vmotor; }
    public TipoCombustible getCombustible() { return combustible; }
    public TipoAuto getAuto() { return auto; }
    public int getNumpuertas() { return numpuertas; }
    public int getNumasientos() { return numasientos; }
    public float getVelocidadmaxima() { return velocidadmaxima; }
    public Color getColor() { return color; }
    public float getVelocidadactual() { return velocidadactual; }
    public void setMarca(String marca) {
        if (marca != null && !marca.isBlank()) {
            this.marca = marca;
        } else {
            System.out.println("Error: La marca no puede estar vacia.");
        }
    }
    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isBlank()) {
            this.modelo = modelo;
        } else {
            System.out.println("Error: El modelo no puede estar vacio.");
        }
    }
    public void setVmotor(float vmotor) {
        if (vmotor > 0) {
            this.vmotor = vmotor;
        } else {
            System.out.println("Error: El cilindraje debe ser mayor a 0.");
        }
    }

    public void setCombustible(TipoCombustible combustible) {
        if (combustible != null) this.combustible = combustible;
    }

    public void setAuto(TipoAuto auto) {
        if (auto != null) this.auto = auto;
    }

    public void setNumeroPuertas(int puertas) {
        if (puertas >= 2 && puertas <= 6) {
            this.numpuertas = puertas;
        } else {
            System.out.println("Error: Rango de puertas permitido (2-6).");
        }
    }

    public void setNumeroAsientos(int asientos) {
        if (asientos >= 2 && asientos <= 9) {
            this.numasientos = asientos;
        } else {
            System.out.println("Error: Rango de asientos permitido (2-9).");
        }
    }

    public void setVelocidadMaxima(float velocidadmaxima) {
        if (velocidadmaxima >= 100 && velocidadmaxima <= 280) {
            this.velocidadmaxima = velocidadmaxima;
        } else {
            System.out.println("Error: Velocidad maxima fuera de rango (100-280).");
        }
    }

    public void setColor(Color color) {
        if (color != null) this.color = color;
    }

    public void setVelocidadActual(float velocidadactual) {
        if (velocidadactual >= 0 && velocidadactual <= this.velocidadmaxima) {
            this.velocidadactual = velocidadactual;
        } else {
            System.out.println("Error: Velocidad actual no permitida.");
        }
    }
    
    public void acelerar(int incremento) {
        if (velocidadactual + incremento <= velocidadmaxima) {
            velocidadactual += incremento;
            System.out.println("Acelerando... Velocidad actual: " + velocidadactual + " km/h");
        } else {
            velocidadactual = velocidadmaxima;
            System.out.println("Alerta: Se ha alcanzado el limite de velocidad maxima (" + velocidadmaxima + " km/h)");
        }
    }

    
    public void desacelerar(int decremento) {
        if (velocidadactual - decremento >= 0) {
            velocidadactual -= decremento;
            System.out.println("Desacelerando... Velocidad actual: " + velocidadactual + " km/h");
        } else {
            velocidadactual = 0;
            System.out.println("El vehiculo se ha detenido completamente (0 km/h).");
        }
    }
    public void frenar() {
        this.velocidadactual = 0;
        System.out.println("Frenado total activado. Velocidad: 0 km/h");
    }

    public float calcularTiempoLlegada(float distancia) {
        if (velocidadactual <= 0) {
            System.out.println("El vehiculo esta detenido. No se puede calcular el tiempo de llegada.");
            return 0;
        }
        return distancia / velocidadactual;
    }

    
    public void mostrarAtributos() {
        System.out.println("\n========================================");
        System.out.println("        RESUMEN DEL VEHICULO");
        System.out.println("========================================");
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
        System.out.println("Motor: " + vmotor + " L | Combustible: " + combustible);
        System.out.println("Tipo: " + auto + " | Color: " + color);
        System.out.println("Puertas: " + numpuertas + " | Asientos: " + numasientos);
        System.out.println("Velocidad Maxima: " + velocidadmaxima + " km/h");
        System.out.println("Velocidad Actual: " + velocidadactual + " km/h");
        System.out.println("========================================\n");
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese la marca del vehiculo: ");
            String marca = "";
            while (true) {
                marca = input.nextLine();
                if (marca != null && !marca.isBlank()) break;
                System.out.println("Error: Marca invalida. Intente de nuevo: ");
            }

            System.out.println("Ingrese el modelo del vehiculo: ");
            String modelo = "";
            while (true) {
                modelo = input.nextLine();
                if (modelo != null && !modelo.isBlank()) break;
                System.out.println("Error: Modelo invalido. Intente de nuevo: ");
            }

            System.out.println("Ingrese el cilindraje (litros): ");
            float vmotor = 0;
            while (true) {
                if (input.hasNextFloat()) {
                    vmotor = input.nextFloat();
                    if (vmotor > 0) break;
                }
                System.out.println("Error: Ingrese un numero positivo.");
                input.next(); 
            }

            System.out.println("Tipo de combustible (1.Gasolina, 2.Bioetanol, 3.Diesel, 4.Biodiesel, 5.Gas natural): ");
            TipoCombustible combustible = null;
            while (true) {
                if (input.hasNextInt()) {
                    int op = input.nextInt();
                    if (op >= 1 && op <= 5) {
                        combustible = TipoCombustible.values()[op - 1];
                        break;
                    }
                }
                System.out.println("Error: Elija entre 1 y 5.");
                input.nextLine();
            }

            System.out.println("Tipo de auto (1.Ciudad, 2.Subcompacto, 3.Compacto, 4.Familiar, 5.Ejecutivo, 6.SUV): ");
            TipoAuto auto = null;
            while (true) {
                if (input.hasNextInt()) {
                    int op = input.nextInt();
                    if (op >= 1 && op <= 6) {
                        auto = TipoAuto.values()[op - 1];
                        break;
                    }
                }
                System.out.println("Error: Elija entre 1 y 6.");
                input.nextLine();
            }

            System.out.println("Numero de puertas (2-6): ");
            int puertas = 0;
            while (true) {
                if (input.hasNextInt()) {
                    puertas = input.nextInt();
                    if (puertas >= 2 && puertas <= 6) break;
                }
                System.out.println("Error: Rango 2-6.");
                input.nextLine();
            }

            System.out.println("Numero de asientos (2-9): ");
            int asientos = 0;
            while (true) {
                if (input.hasNextInt()) {
                    asientos = input.nextInt();
                    if (asientos >= 2 && asientos <= 9) break;
                }
                System.out.println("Error: Rango 2-9.");
                input.nextLine();
            }

            System.out.println("Velocidad maxima (100-280 km/h): ");
            float velMax = 0;
            while (true) {
                if (input.hasNextFloat()) {
                    velMax = input.nextFloat();
                    if (velMax >= 100 && velMax <= 280) break;
                }
                System.out.println("Error: Rango 100-280.");
                input.nextLine();
            }

            System.out.println("Color (1.Blanco, 2.Negro, 3.Rojo, 4.Naranja, 5.Amarillo, 6.Verde, 7.Azul, 8.Violeta): ");
            Color color = null;
            while (true) {
                if (input.hasNextInt()) {
                    int op = input.nextInt();
                    if (op >= 1 && op <= 8) {
                        color = Color.values()[op - 1];
                        break;
                    }
                }
                System.out.println("Error: Elija entre 1 y 8.");
                input.nextLine();
            }

            VEHICULOS2 miAuto = new VEHICULOS2(marca, modelo, vmotor, combustible, auto, puertas, asientos, velMax, color, 100);

            miAuto.mostrarAtributos();
            
            
            System.out.println("--- EJECUTANDO PRUEBAS DE MOVIMIENTO ---");
            miAuto.acelerar(20);  
            miAuto.desacelerar(50);
            
            System.out.println("\nIngrese la distancia a recorrer hacia su destino (km): ");
            float dist = 0;
            while (true) {
                if (input.hasNextFloat()) {
                    dist = input.nextFloat();
                    if (dist > 0) break;
                }
                System.out.println("Error: Ingrese una distancia valida.");
                input.nextLine();
            }

            
            float tiempo = miAuto.calcularTiempoLlegada(dist);
            System.out.println("\nRESULTADO DEL VIAJE:");
            System.out.println("Para recorrer " + dist + " km a una velocidad de " + miAuto.getVelocidadactual() + " km/h...");
            System.out.println("El tiempo estimado de llegada es: " + tiempo + " horas.");
            
            
            miAuto.frenar();
            miAuto.mostrarAtributos();

        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado. Saliendo del programa.");
        }
    }
} 

