package br.metodista.ads5;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação I
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  21/08/2018 - 15:00
 */
public class Teste {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente.Builder()
          .comNome("Eduardo Ricardo Venturine")
          .comCnpj(2345678)
          .Builder();
              System.out.println(cl1);   
        Notebook not1 = new Notebook.Builder()
          .comProcessador("Duo Core")
          .comQtdMemoria(500)
          .comTipoMemoria("DDR3")
          .comQtdMemoriaHD(3)
          .comPlacaVideo("SATA")
          .comResolucaoMonitor(128)
          .builder();      
           System.out.println(not1+ "\n");
           
       Cliente cl2 = new Cliente.Builder()
            .comNome("Cristina Matarazzo Venturine")
            .comCnpj(2345678)
            .Builder();    
              System.out.println(cl2);
       Notebook not2 = new Notebook.Builder()         
           .comProcessador("Intel IV")
          .comQtdMemoria(200)
          .comTipoMemoria("DDR2")
          .comQtdMemoriaHD(3)
          .comPlacaVideo("ASUS")
          .comResolucaoMonitor(228)
          .builder();
          System.out.println( not2);
          
    }
}
