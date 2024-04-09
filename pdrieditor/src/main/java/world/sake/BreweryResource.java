package world.sake;

import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import world.sake.resolver.BreweryQueryResolver;
import world.sake.schema.Brewery;

import java.util.List;

@GraphQLApi
public class BreweryResource {

    @Inject
    BreweryQueryResolver queryResolver;

    @Query
    @Description("蔵元一覧")
    public List<Brewery> breweries() {
        return queryResolver.breweries();
    }

    @Query
    @Description("蔵元")
    public Brewery brewery(String id) {
        return queryResolver.brewery(id);
    }
}
