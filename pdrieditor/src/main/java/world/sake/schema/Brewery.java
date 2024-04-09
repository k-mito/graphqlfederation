package world.sake.schema;

import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;



@Key(fields = "id")
public record Brewery(
        @Id String id,
        String name
) {
}
