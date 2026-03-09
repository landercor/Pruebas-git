
public class i8 {

    public static void main(String[] args) {

        int intentos = 0;
        boolean acceso = false;

        intentos++;

        while (intentos < 3 && !acceso) {

            if (intentos == 3) {
                acceso = true;
                System.out.println("Acceso concedido");
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (3 - intentos));
            }
        }
        if (!acceso) {
            System.out.println("Cuenta bloqueada");
        }
    }
}

//npx @modelcontextprotocol/inspector
/*  docker run --rm \
-p 127.0.0.1:6274:6274 \
-p 127.0.0.1:6277:6277 \
-e HOST=0.0.0.0 \
-e MCP_AUTO_OPEN_ENABLED=false \
  ghcr.io/modelcontextprotocol/inspector:latest */
//---------------------------------OPOEN MCP INSPECTOR --> //http://localhost:6274/?MCP_PROXY_AUTH_TOKEN=02101a62706647fa5f05d40b12d84ee7849fa7b303912f94c4b651ebb3c1267f <--
// npx @modelcontextprotocol/inspector node build/index.js

/*# Pass arguments only
npx @modelcontextprotocol/inspector node build/index.js arg1 arg2

# Pass environment variables only
npx @modelcontextprotocol/inspector -e key=value -e key2=$VALUE2 node build/index.js

# Pass both environment variables and arguments
npx @modelcontextprotocol/inspector -e key=value -e key2=$VALUE2 node build/index.js arg1 arg2

# Use -- to separate inspector flags from server arguments
npx @modelcontextprotocol/inspector -e key=$VALUE -- node build/index.js -e server-flag */
