package Timoto;

    public class Car {

        private String color ;
        private String name ;
        private int year ;

        public Car(String color, String name, int year) {
            this.color = color;
            this.name = name;
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

