package lesson5.task2;

public class Chair {
    private String producer;


    public Chair(String model) {

        this.producer = producer;

    }

    public class Legs {
        public void wheel() {
            System.out.println("На колесах");
        }
    }

    public class Seat {
        public void withMaterial() {

            System.out.println("Ткань");
        }


    }

    public class Back {
        public void folding() {
            System.out.println("Откидная спинка");
        }

    }
}
