package interfaces;

public class MusicoEstudiante implements Estudiante,Musico {

    @Override
    public void estudiar() {
        System.out.println("estoy estudiando musica");
    }

    @Override
    public void tocarMusica() {
        System.out.println("estoy tocando una cancion");
    }

    @Override
    public void hablar() {
        System.out.println("estoy hablando español");
    }
}
