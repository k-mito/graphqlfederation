package world.sake.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import world.sake.schema.Brewery;

import java.util.List;

@ApplicationScoped
public class BreweryQueryResolver {

    private final List<Brewery> breweries = List.of(
            new Brewery("1", "飛露喜酒造"),
            new Brewery("2", "高木酒造"),
            new Brewery("3", "高砂酒造")
    );

    public List<Brewery> breweries() {
        return breweries;
    }
}
