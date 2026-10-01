package br.com.TechInVoice.model;

public class NotaFiscal implements IDocumento {

    @Override 
    public void gerarPDF(){
        System.out.println("Gerando Recibo simples de pagamento...");
    }

}
