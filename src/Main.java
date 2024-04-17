public class Main {
    public static void main(String[] args) {
        //livro 1
        Ebook livro1 = new Ebook();
        ItemBibliotecaDigital item = livro1;
        item.descricao("Meu primeiro amor", "Nati molini");
        Baixavel b;
        b = livro1;
        b.baixar();

        //video digital 1
        VideoDigital video1 = new VideoDigital();
        ItemBibliotecaDigital item1 = video1;
        item1.descricao("As aventuras de Jack e Johnny", "Nati Molini");
        Visualizavel v;
        v = video1;
        v.visualizar();

        //livro 2
        Ebook livro2 = new Ebook();
        ItemBibliotecaDigital item3 = livro2;
        item.descricao("Eu e meus gatinhos", "Karen Ubial");
        b = livro2;
        b.baixar();

        //video digital 2
        VideoDigital video2 = new VideoDigital();
        ItemBibliotecaDigital item4 = video2;
        item1.descricao("O grande polenta", "Helena Carvalho");
        v = video1;
        v.visualizar();

    }
}
