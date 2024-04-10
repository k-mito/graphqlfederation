package sake.world.resolver;

import sake.world.schema.Brand;

import java.util.ArrayList;
import java.util.List;

public class BrandDataBase {

    public static List<Brand> brands = new ArrayList<>();

    static {
        brands.add(new Brand("brand::1", "brewery::1", "泉川"));
        brands.add(new Brand("brand::2", "brewery::1", "飛露喜"));
        brands.add(new Brand("brand::3", "brewery::2", "朝日鷹"));
        brands.add(new Brand("brand::4", "brewery::2", "十四代"));
        brands.add(new Brand("brand::5", "brewery::3", "而今"));
    }

    public static int getBrandId() {
        return brands.size() + 1;
    }
}
