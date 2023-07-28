package test.data;

public class Ticket {
    private String name;
    private long price;

    public long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Ticket(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }
    public static class Builder {
        private String name;
        private long price;
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder price(long price) {
            this.price = price;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
