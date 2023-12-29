// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
         // Vetores
        Pessoa [] p = new Pessoa[2];
        Livros [] l = new Livros[3];
        // New Pessoas
        p [0] = new Pessoa("Arnaldo",30,"M");
        p [1] = new Pessoa("Marlon",29,"M");
        // New Livros
        l [0] = new Livros("Se ontem fosse ontem","Albert Einstem ", 350,p [0]);
        l [1] = new Livros("O dia que nao terminou","Tesla",550, p[1]);
        l [2] = new Livros("Risada Mortal","Tiririca",350,p [0]);



        l [1].abrir();
        l [1].nextpag(300);
        l[1].backpag(239);

        System.out.println(l [1].Detalhes());





    }
    }
