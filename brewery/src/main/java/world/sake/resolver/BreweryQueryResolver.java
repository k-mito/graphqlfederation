package world.sake.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import world.sake.schema.Brand;
import world.sake.schema.Brewery;

import java.util.List;
import java.util.Map;

@ApplicationScoped
public class BreweryQueryResolver {

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
        return BreweryDataBase.breweries;
    }

    public Brewery brewery(String id) {
        return BreweryDataBase.breweries.stream()
                .filter(brewery -> brewery.breweryId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Brand> brands(Brewery brewery) {
        return brandMap.get(brewery.breweryId());
    }
}
