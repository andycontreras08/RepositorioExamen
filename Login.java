public class Login{
    public void login (Request request){
        //Aquí va el código que recoge las credenciales del usuario
        String username = request.getParameter("username de ");
        String password = request.getParameter("password");

        if (username.equals("usuario") && password.equals("contraseña")) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("Credenciales inválidas");
    }
    }
}