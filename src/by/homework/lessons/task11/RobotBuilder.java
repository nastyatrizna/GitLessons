package by.homework.lessons.task11;

    public class RobotBuilder implements RobotEngineer {
        /*
        РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
         */

        private String model;
        private int powerConsumption;
        private String countryOfOrigin;
        private String constructionUnit;
        private String material;
        private boolean isOn;

        public RobotBuilder(String model, int powerConsumption, String countryOfOrigin, String constructionUnit, String material) {
            this.model = model;
            this.powerConsumption = powerConsumption;
            this.countryOfOrigin = countryOfOrigin;
            this.constructionUnit = constructionUnit;
            this.material = material;
            this.isOn = false;
        }

        @Override
        public void turnOn() {
            isOn = true;
            System.out.println("РоботСтроитель " + model + " включен.");
        }

        @Override
        public void turnOff() {
            isOn = false;
            System.out.println("РоботСтроитель " + model + " выключен.");
        }

        @Override
        public void uniquePossibility() {
            System.out.println("РоботСтроитель " + model + " строит с помощью " + constructionUnit + ".");
        }

        @Override
        public void createItem() {
            System.out.println("РоботСтроитель " + model + " мешает " + material + ".");
        }

        public boolean isOn() {
            return isOn;
        }

        public String getModel() {
            return model;
        }
}
