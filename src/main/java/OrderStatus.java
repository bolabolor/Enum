public enum OrderStatus {
    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELED("Canceled");

    private String abbrevation;
    OrderStatus(String abbrevation) {
        this.abbrevation = abbrevation;
    }

    public String getAbbrevation() {
        return this.abbrevation;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "abbrevation='" + abbrevation + '\'' +
                '}';
    }
}