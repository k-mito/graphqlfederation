package sake.world.schema;

import io.smallrye.graphql.api.federation.Extends;
import io.smallrye.graphql.api.federation.External;
import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;

@Extends @Key(fields = "id")
public record Brewery(
        @External @Id String id
) {
}
