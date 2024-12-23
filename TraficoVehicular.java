import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TraficoVehicular {

    // Definir los tipos de vehículos y vías posibles
    private static final String[] TIPOS_VEHICULO = {"Automóvil", "Moto", "Bus", "Camión", "Bicicleta"};
    private static final String[] TIPOS_VIA = {"Calle", "Carrera", "Diagonal", "Transversal"};
    
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        while (true) {
            // Generar tipo de vehículo aleatorio
            String tipoVehiculo = TIPOS_VEHICULO[random.nextInt(TIPOS_VEHICULO.length)];

            // Generar velocidad aleatoria (entre 20 y 120 km/h para este ejemplo)
            int velocidad = 20 + random.nextInt(101); // De 20 a 120 km/h

            // Generar hora aleatoria (entre 0 y 23 horas)
            int hora = random.nextInt(24); // De 0 a 23 horas

            // Generar coordenadas de latitud y longitud aleatorias (ejemplo: entre -90 y 90 para latitud y -180 y 180 para longitud)
            double latitud = -90 + random.nextDouble() * 180;
            double longitud = -180 + random.nextDouble() * 360;

            // Generar tipo de vía aleatorio
            String via = TIPOS_VIA[random.nextInt(TIPOS_VIA.length)];

            // Generar código aleatorio (ejemplo: número de 6 dígitos)
            int codigo = 100000 + random.nextInt(900000); // De 100000 a 999999

            // Imprimir la estructura generada
            System.out.println("===================================");
            System.out.println("Tipo de Vehículo: " + tipoVehiculo);
            System.out.println("Velocidad: " + velocidad + " km/h");
            System.out.println("Hora: " + hora + ":00");
            System.out.println("Latitud: " + String.format("%.6f", latitud));
            System.out.println("Longitud: " + String.format("%.6f", longitud));
            System.out.println("Vía: " + via);
            System.out.println("Código: " + codigo);
            System.out.println("===================================");

            // Esperar entre 0 y 5 segundos antes de generar una nueva estructura
            int espera = random.nextInt(6); // Entre 0 y 5 segundos
            TimeUnit.SECONDS.sleep(espera);
        }
    }
}
