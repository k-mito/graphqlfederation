package sake.world.resolver;

import jakarta.enterprise.context.ApplicationScoped;
import sake.world.schema.Brand;
import sake.world.schema.Brewery;

import java.util.List;

@ApplicationScoped
public class BrandQueryResolver {

    private final List<Brand> brands = List.of(
            new Brand("brand::1", "brewery::1", "泉川"),
            new Brand("brand::2", "brewery::1", "飛露喜"),
            new Brand("brand::3", "brewery::2", "朝日鷹"),
            new Brand("brand::4", "brewery::2", "十四代"),
            new Brand("brand::5", "brewery::3", "而今")

    );

    public List<Brand> brands() {
        return brands;
    }

    public Brewery brewery(String breweryId) {
        return new Brewery(breweryId);
    }
}
