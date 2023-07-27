package test;

public class Passenger {
    private String address;
    private String email;
    private String phone;
    private String name;

    public Passenger(Builder builder) {
        this.address = builder.address;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static class Builder {
        private String address;
        private String email;
        private String phone;
        private String name;

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Passenger build() {
            return new Passenger(this);
        }
    }
}
