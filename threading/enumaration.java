package threading;

public class enumaration {
    enum fruit{
        //enumeratrion constatnts
        apple(3),guava(5),orange(99),banana(30);

        private int price;
        fruit(final int price){
            this.price=price;
        }
        public int getPrice(){
            return (this.price);
        }


    }

    public  static void main(String args[]){
        fruit fruit2=fruit.guava;   //constructor called
        System.out.println(fruit2);

        switch (fruit2) {
            case apple:
                System.out.println("Apples");
                break;

            default:
            System.out.println("A fruit");
                break;
        }

        for (fruit i : fruit.values()) {
            System.out.println("Fruit: "+i+" Price: "+i.getPrice()+" Ordinal: "+i.ordinal());
        }

        System.out.println(fruit.valueOf("banana"));
        System.out.println(Integer.sum(2, 3));
        System.out.println(Integer.toHexString(15));
    }


}
