public class Main {
    public static void main(String[] args){
        Order order1 = new Order("123", OrderStatus.IN_DELIVERY);
        Order order2 = new Order("246", OrderStatus.IN_PROGRESS);
        Order order3 = new Order("456", OrderStatus.COMPLETED);
        Order order4 = new Order("673", OrderStatus.CANCELED);
        Order order5 = new Order("827", OrderStatus.RECEIVED);

        System.out.println(order1.getId());
        System.out.println(order1.getOrderStatus());

        switch(order2.getOrderStatus()) {
            case RECEIVED:
                System.out.println(OrderStatus.RECEIVED.getAbbrevation());
                break;
            case IN_PROGRESS:
                System.out.println(OrderStatus.IN_PROGRESS.getAbbrevation());
                break;
            case IN_DELIVERY:
                System.out.println(OrderStatus.IN_DELIVERY.getAbbrevation());
                break;
            case COMPLETED:
                System.out.println(OrderStatus.COMPLETED.getAbbrevation());
                break;
            case CANCELED:
                System.out.println(OrderStatus.CANCELED.getAbbrevation());
                break;
            default:
                System.out.println("Status unknown. Please contact support.");
                break;

        }

    }
}
