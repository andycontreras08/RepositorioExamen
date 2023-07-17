public class registrarse {
    public void registrarse(Request request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Registro exitoso para el usuario: " + username);
    }
}