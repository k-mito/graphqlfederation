package sake.world.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import sake.world.schema.Brand;
import sake.world.schema.CreateBrandInput;
import sake.world.schema.CreateBrandPayload;

@ApplicationScoped
public class BrandMutationResolver {

    public CreateBrandPayload createBrand(CreateBrandInput input) {
        var brand = new Brand("brand::" + BrandDataBase.getBrandId(),input.breweryId(), input.name());

        BrandDataBase.brands.add(brand);

        return new CreateBrandPayload(brand);
    }
}
