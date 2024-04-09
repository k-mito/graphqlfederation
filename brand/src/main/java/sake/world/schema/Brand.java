package sake.world.schema;

import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;

@Key(fields = "id")
public record Brand(
        @Id String id,
        String breweryId,

        String name
) {
}
