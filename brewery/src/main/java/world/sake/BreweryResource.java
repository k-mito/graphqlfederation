package world.sake;

import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import world.sake.resolver.BreweryMutationResolver;
import world.sake.resolver.BreweryQueryResolver;
import world.sake.schema.Brand;
import world.sake.schema.Brewery;
import world.sake.schema.CreateBreweryInput;
import world.sake.schema.CreateBreweryPayload;

import java.util.List;

@GraphQLApi
public class BreweryResource {

    @Inject
    BreweryQueryResolver queryResolver;

    @Inject
    BreweryMutationResolver mutationResolver;

    @Query
    @Description("蔵元一覧")
    public List<Brewery> breweries() {
        return queryResolver.breweries();
    }

    @Query
    @Description("蔵元")
    public Brewery brewery(String breweryId) {
        return queryResolver.brewery(breweryId);
    }

    public List<Brand> brands(@Source Brewery brewery) {
        return queryResolver.brands(brewery);
    }

    @Mutation
    public CreateBreweryPayload createBrewery(CreateBreweryInput input) {
        return mutationResolver.createBrewery(input);
    }
}
