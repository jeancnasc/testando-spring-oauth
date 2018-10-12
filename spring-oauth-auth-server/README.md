App Cliente:

usuario: webapp-client
senha: secreto

Usuario (Resource Owner)

usuário: teste
senha: 123

Authorization Code Flow

http://localhost:8080/spring-oauth-auth-server/oauth/authorize?client_id=webapp-client&response_type=code&redirect_uri=http://localhost:8080/spring-oauth-auth-server

Basic dGVzdGU6MTIz

localhost:8080/spring-oauth-auth-server/oauth/token?client_id=webapp-client&redirect_uri=http://localhost:8080/spring-oauth-auth-server&grant_type=authorization_code&code=6sWulw

Basic bm9zc28tYmFpcnJvLXdlYmFwcDpzZWNyZXRv

Implicit Flow

localhost:8080/spring-oauth-auth-server/oauth/authorize?client_id=webapp-client&response_type=token&redirect_uri=http://localhost:8080/spring-oauth-auth-server