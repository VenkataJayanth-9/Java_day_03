public class Car {
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    private String model = "C-Class";

    private String make = "Benz";
    private String color = "Black";
    private int doors = 5;
    public boolean isConvertible () {
        return convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

        public void setColor (String color){
            this.color = color;
        }

        public void setDoors(int doors){
            this.doors = doors;
        }

        public void setConvertible ( boolean convertible){
            this.convertible = convertible;
        }

        private boolean convertible = true;
        public void describeCar ()
        {
            System.out.println(doors + "-Door" +
                    color + "-color" +
                    make + "-make" +
                    model + "-model" +
                    (convertible ? "Convertible" : ""));

        }
    }

