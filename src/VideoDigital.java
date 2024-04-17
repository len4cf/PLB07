public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel{
    public VideoDigital(){
        super();
        this.titulo = "Titulo";
        this.autor = "Autor";
    }
    @Override
    public String descricao(String titulo, String autor) {
        System.out.println("Descrição de VideoDigital!");
        System.out.println("O título do seu livro é: "+titulo);
        System.out.println("O autor do seu livro é: "+autor);
        System.out.println("------------------------------");
        return null;
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando...");
        System.out.println();
    }
}
