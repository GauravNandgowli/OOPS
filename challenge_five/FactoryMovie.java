public class FactoryMovie {

    public static Movie createMovie(String type, String title) {

        switch (type) {
            case "scifi":
                return new scifi(title);

            case "adventure":
                return new adventure(title);

            default:
                throw new IllegalArgumentException("error inputs");

        }

    }
}