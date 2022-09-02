package com.company;

public class SmartDevice {
    String modelo;
    String color;
    String marca;

    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public static class SmartPhone extends SmartDevice{
        int soVersion;
        double size;

        public SmartPhone() {
        }

        public SmartPhone(String marca, String modelo, String color, int soVersion, double size) {
            super(marca, modelo, color);
            this.soVersion = soVersion;
            this.size = size;
        }

        @Override
        public String toString() {
            return "soVersion= " + soVersion +
                    ", size= " + size + " pulgadas" +
                    ", modelo= " + modelo +
                    ", color= " + color +
                    ", marca= " + marca;
        }
    }
    public static class SmartWatch extends SmartDevice{
        boolean sports;
        double horasBateria;

        public SmartWatch() {

        }

        public SmartWatch(String marca, String modelo, String color, boolean sports, double horasBateria) {
            super(marca, modelo, color);
            this.sports = sports;
            this.horasBateria = horasBateria;
        }

        @Override
        public String toString() {
            return "sports= " + sports +
                    ", horasBateria= " + horasBateria + " horas" +
                    ", modelo= " + modelo +
                    ", color= " + color +
                    ", marca= " + marca;
        }
    }
}
