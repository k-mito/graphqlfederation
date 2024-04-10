package world.sake.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import world.sake.schema.Brewery;
import world.sake.schema.CreateBreweryInput;
import world.sake.schema.CreateBreweryPayload;

@ApplicationScoped
public class BreweryMutationResolver {

    public CreateBreweryPayload createBrewery(CreateBreweryInput input) {
        var brewery = new Brewery("brewery::" + BreweryDataBase.getBreweryId(), input.name(), input.address());

        BreweryDataBase.breweries.add(brewery);

        return new CreateBreweryPayload(brewery);
    }
}
