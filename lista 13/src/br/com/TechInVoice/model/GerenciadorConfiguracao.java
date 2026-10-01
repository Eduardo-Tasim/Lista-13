package br.com.TechInVoice.model;

public class GerenciadorConfiguracao {
    private String apiKey = "AWS-12345-KEY";
    
    private static GerenciadorConfiguracao instanciaUnica;
      private GerenciadorConfiguracao(){ }

    public static GerenciadorConfiguracao getInstance(){
        if (instanciaUnica == null){
            instanciaUnica = new GerenciadorConfiguracao();
        }
        return instanciaUnica;
    }
}
