package world.sake.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import world.sake.schema.Brand;
import world.sake.schema.Brewery;

import java.util.List;
import java.util.Map;

@ApplicationScoped
public class BreweryQueryResolver {

    private final List<Brewery> breweries = List.of(
            new Brewery("brewery::1", "廣木酒造本店", "〒969-6543 福島県河沼郡会津坂下町市中市中二番甲３５７４"),
            new Brewery("brewery::2", "高木酒造", "〒995-0208 山形県村山市富並1826番地"),
            new Brewery("brewery::3", "高砂酒造", "〒518-0726 三重県名張市本町３１４−１")
    );

    private final Map<String, List<Brand>> brandMap = Map.of(
            "brewery::1", List.of(
                    new Brand("brand::1"),
                    new Brand("brand::2")
            ),
            "brewery::2", List.of(
                    new Brand("brand::3"),
                    new Brand("brand::4")
            ),
            "brewery::3", List.of(
                    new Brand("brand::5")
            )
    );

    public List<Brewery> breweries() {
        return breweries;
    }

    public Brewery brewery(String id) {
        return breweries.stream()
                .filter(brewery -> brewery.breweryId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Brand> brands(Brewery brewery) {
        return brandMap.get(brewery.breweryId());
    }
}
