const { ApolloServer } = require('apollo-server');
const { ApolloGateway, IntrospectAndCompose } = require('@apollo/gateway');

const gateway = new ApolloGateway({
    supergraphSdl: new IntrospectAndCompose({
        subgraphs: [
            /*
            {
                name: 'author',
                url: 'http://localhost:4001',
            },
            {
                name: 'book',
                url: 'http://localhost:4002',
            },
             */
            {
                name: 'brewery',
                url: 'http://localhost:9991/graphql',
            },
            {
                name: 'brand',
                url: 'http://localhost:9992/graphql',
            }
        ],
    })
});

const server = new ApolloServer({
    gateway,
    subscriptions: false,
});

server.listen().then(({ url }) => {
    console.log(`🚀  Gateway ready at ${url}`);
}).catch(err => {console.error(err)});
