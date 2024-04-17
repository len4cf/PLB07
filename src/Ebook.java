public class Ebook extends ItemBibliotecaDigital implements Baixavel{

    public Ebook(){
        super();
        this.titulo = "Titulo";
        this.autor = "Autor";
    }

    @Override
    public String descricao(String titulo,String autor) {
        System.out.println("Descrição do ebook!");
        System.out.println("O título do seu livro é: " + titulo);
        System.out.println("O autor do seu livro é: " + autor);
        System.out.println("---------------------------------");
        return null;
    }
    public void baixar(){
        System.out.println("Seu livro está baixando...");
        System.out.println();
    }
}
