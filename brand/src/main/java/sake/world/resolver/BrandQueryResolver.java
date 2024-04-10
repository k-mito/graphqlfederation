package sake.world.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import sake.world.schema.Brand;
import sake.world.schema.Brewery;

import java.util.List;

@ApplicationScoped
public class BrandQueryResolver {

    public List<Brand> brands() {
        return BrandDataBase.brands;
    }

    public Brewery brewery(String breweryId) {
        return new Brewery(breweryId);
    }

    public Brand brand(String brandId) {
        return BrandDataBase.brands.stream()
                .filter(brand -> brand.brandId().equals(brandId))
                .findFirst()
                .orElse(null);
    }
}
