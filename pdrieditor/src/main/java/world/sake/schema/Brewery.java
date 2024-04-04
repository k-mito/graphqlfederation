package world.sake.schema;

import org.eclipse.microprofile.graphql.Id;

public record Brewery(
        @Id String id,
        String name
) {
}
