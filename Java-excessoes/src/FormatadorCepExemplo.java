public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (cepInvalidoExcecao e) {
            System.out.println("O cep não corresponde com as regras do negócio");
        }
    }
    static String formatarCep (String cep) throws cepInvalidoExcecao{
        if(cep.length() != 8)
          throw new cepInvalidoExcecao();
          //simulando um cep formatado
          return "23.765-064";
    }
}
