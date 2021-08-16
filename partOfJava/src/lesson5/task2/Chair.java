package lesson5.task2;

public class Chair {
    private String producer;
    private int price;


    public Chair(String model, int price) {

        this.producer = producer;
        this.price = price;

    }
    public class legs {
        public void wheel() {
            System.out.println("На колесах");
        }

        public void withoutWheel() {
            System.out.println("Без колесиков");
        }
    }
    public class seat {
        public void withMaterial() {

            System.out.println("Ткань");
        }

        public void withoutMaterial() {
            System.out.println("Дерево");
        }
    }

    public class back {
        public void folding() {
            System.out.println("Откидная спинка");
        }

        public void noFolding() {
            System.out.println("Неоткидная спинка");
        }


    }
}
