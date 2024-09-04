package patterns;


//Builder (Строител): Позволява изграждането на сложни обекти стъпка по стъпка.
// Строителят може да създава различни представяния на един и същ обект.

    class Productt {
        private String partA;
        private String partB;

        public void setPartA(String partA) { this.partA = partA; }
        public void setPartB(String partB) { this.partB = partB; }

        @Override
        public String toString() {
            return "Product [partA=" + partA + ", partB=" + partB + "]";
        }
    }

    abstract class Builder {
        protected Productt product = new Productt();

        public abstract void buildPartA();
        public abstract void buildPartB();

        public Productt getResult() {
            return product;
        }
    }

    class ConcreteBuilder extends Builder {
        @Override
        public void buildPartA() {
            product.setPartA("Part A");
        }

        @Override
        public void buildPartB() {
            product.setPartB("Part B");
        }
    }

    class Director {
        private Builder builder;

        public void setBuilder(Builder builder) {
            this.builder = builder;
        }

        public Productt construct() {
            builder.buildPartA();
            builder.buildPartB();
            return builder.getResult();
        }
    }

