create user keycloak with password '1234';
connect helha_freshbread;
create schema keycloak;
GRANT CONNECT ON DATABASE helha_freshbread TO keycloak;
GRANT USAGE ON SCHEMA keycloak TO keycloak;
GRANT CREATE ON SCHEMA keycloak TO keycloak;
GRANT SELECT ON ALL TABLES IN SCHEMA keycloak TO keycloak;