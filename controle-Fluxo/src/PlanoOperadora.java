public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("Disney+ e StarPlus");
                break;
            }
            case "M": {
                System.out.println("Redes Sociais Ilimitadas");
                break;
            }
            case "B": {
                System.out.println("Netflix e Amazon Prime");
                break;
            }
            case "C": {
                System.out.println("5GB de Internet e 100 Minutos de Ligação");
                break;
            }
        }
    }
}
