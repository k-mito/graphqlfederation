package world.sake.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import world.sake.schema.Brewery;

import java.util.List;

@ApplicationScoped
public class BreweryQueryResolver {

    private final List<Brewery> breweries = List.of(
            new Brewery("brewery::1", "廣木酒造本店"),
            new Brewery("brewery::2", "高木酒造"),
            new Brewery("brewery::3", "高砂酒造")
    );

    public List<Brewery> breweries() {
        return breweries;
    }

    public Brewery brewery(String id) {
        return breweries.stream()
                .filter(brewery -> brewery.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
