package sake.world;

import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import sake.world.resolver.BrandQueryResolver;
import sake.world.schema.Brand;
import sake.world.schema.Brewery;

import java.util.List;

@GraphQLApi
public class BrandResource {

    @Inject
    BrandQueryResolver queryResolver;

    @Query
    @Description("銘柄")
    public List<Brand> brands() {
        return queryResolver.brands();
    }

    public Brewery brewery(@Source Brand brand) {
        return queryResolver.brewery(brand.breweryId());
    }
}
