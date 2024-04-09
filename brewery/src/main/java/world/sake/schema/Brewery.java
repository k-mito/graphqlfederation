package world.sake.schema;

import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;



@Key(fields = "breweryId")
public record Brewery(
        @Id String breweryId,
        String name,
        String address
) {
}
