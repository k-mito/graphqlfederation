package world.sake.resolver;

import world.sake.schema.Brewery;

import java.util.ArrayList;
import java.util.List;

public class BreweryDataBase {

    public static List<Brewery> breweries = new ArrayList<>();

    static {
        breweries.add(new Brewery("brewery::1", "廣木酒造本店", "〒969-6543 福島県河沼郡会津坂下町市中市中二番甲３５７４"));
        breweries.add(new Brewery("brewery::2", "高木酒造", "〒995-0208 山形県村山市富並1826番地"));
        breweries.add(new Brewery("brewery::3", "高砂酒造", "〒518-0726 三重県名張市本町３１４−１"));
    }

    public static int getBreweryId() {
        return breweries.size() + 1;
    }


}
