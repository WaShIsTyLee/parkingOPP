package ModelParking;

import java.util.Arrays;

public class Parking {
    private String name;
    Car[] cars;


    public Parking(String name, int tam) {
        this.name = name;
        if (tam <= 1) {
            tam = 2;
        }
        this.cars = new Car[tam];

    }

    public Parking() {
        this("Generico", 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';

    }

    /**
     * Comprobar que todos los elementos sean distintos de null
     * @return true si no hay huecos disponibles
     */

    public boolean isFull() {
        return false;


    }

    /**
     * Cuantos coches hay en el parking
     * @return
     */
    public static int howMany(){
        return 0;

    }

    /**
     * Buscar el coche
     * @param name Matricula
     * @return
     */
    public int searchCar (String name){
        return 0;
    }

    /**
     * Aparcar el coche en el array
     * @param car Matricula
     * @return
     */
    public int parkCar (Car car){
        return 0;
    }

    /**
     * Scar el coche del array
     * @param name Matricula
     * @return
     */
    public Car unPark(String name){
        return null;

    }

}

