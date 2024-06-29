package algorithms;

public class Point3D {

    // Клас, който представлява точка в 3D пространство

        // Полета за координатите x, y и z
        private double x, y, z;

        // Конструктор за инициализиране на координатите
        public Point3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Метод за изчисляване на хеш код на обекта
        @Override
        public int hashCode() {
            final int prime = 31; // Първично число за изчисляване на хеш кода
            int result = 1; // Начална стойност на резултата
            long temp; // Временна променлива за преобразуване на double към long

            // Изчисляване на хеш кода за координатата x
            temp = Double.doubleToLongBits(x);
            result = prime * result + (int) (temp ^ (temp >>> 32));

            // Изчисляване на хеш кода за координатата y
            temp = Double.doubleToLongBits(y);
            result = prime * result + (int) (temp ^ (temp >>> 32));

            // Изчисляване на хеш кода за координатата z
            temp = Double.doubleToLongBits(z);
            result = prime * result + (int) (temp ^ (temp >>> 32));

            return result; // Връщане на изчисления хеш код
        }

        // Метод за сравнение на два обекта за равенство
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true; // Проверка дали обектът е същият
            if (obj == null)
                return false; // Проверка дали обектът е null
            if (getClass() != obj.getClass())
                return false; // Проверка дали обектите са от един и същи клас

            Point3D other = (Point3D) obj; // Преобразуване на обекта към Point3D

            // Сравнение на координатата x
            if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
                return false;

            // Сравнение на координатата y
            if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
                return false;

            // Сравнение на координатата z
            if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
                return false;

            return true; // Връщане на true, ако всички координати са равни
        }
    }

