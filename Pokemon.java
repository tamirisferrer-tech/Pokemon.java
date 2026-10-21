public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha seu pokemon inicial");
        System.out.println("1- Bulbasaur");
        System.out.println("2- Charmander");
        System.out.println("3- Squirtle");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1- Bulbasaur, pokemon de grama, forte contra o tipo agua e fraco contra o tipo fogo, boa sorte treinador/a!");
                break;
            case 2:
                System.out.println("2- Charmander, pokemon de fogo, forte contra o tipo grama e fraco contra o tipo agua, boa sorte treinador/a!");
                break;
            case 3:
                System.out.println("3- Squirtle, pokemon de agua, forte contra o tipo fogo e fraco contra o tipo grama, boa sorte treinador/a!");
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
}