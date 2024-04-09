package sake.world.schema;

import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;

@Key(fields = "brandId")
public record Brand(
        @Id String brandId,
        String breweryId,
        String name
) {
}
