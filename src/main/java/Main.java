import javax.json.Json;
import javax.json.JsonArray;


public class Main {
    public int main() {
        JsonArray array;
        array = Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                        .add("office", "ABC")
                        .add("amount", 100))
                .add(Json.createObjectBuilder()
                        .add("office", "XYZ")
                        .add("amount", 200))
                .add(Json.createObjectBuilder()
                        .add("office", "ABC")
                        .add("amount", 300))
                .build();

        int sum = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).asJsonObject().getString("office")
                    .equalsIgnoreCase("ABC")) {
                sum += array.get(i).asJsonObject().getInt("amount");
            }
            ;
        }
        System.out.println(sum);

        return sum;

    }
}
