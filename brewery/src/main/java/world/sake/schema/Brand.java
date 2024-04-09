package world.sake.schema;

import io.smallrye.graphql.api.federation.Extends;
import io.smallrye.graphql.api.federation.External;
import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;

@Extends @Key(fields = "brandId")
public record Brand(
        @External @Id String brandId
) {
}
