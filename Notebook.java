package br.metodista.ads5;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação I
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  21/08/2018 - 15:00
 */
public class Notebook {
    String procesador;
    int qtdMemoria;
    String tipoMemoria;
    int qtdMemoriaHD;
    String placaVideo;
    int resolucaoMonitor;
    boolean temNotebook;
    boolean compraEfetuada;

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    public int getQtdMemoria() {
        return qtdMemoria;
    }

    public void setQtdMemoria(int qtdMemoria) {
        this.qtdMemoria = qtdMemoria;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public int getQtdMemoriaHD() {
        return qtdMemoriaHD;
    }

    public void setQtdMemoriaHD(int qtdMemoriaHD) {
        this.qtdMemoriaHD = qtdMemoriaHD;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public int getResoluçãoMonitor() {        return resolucaoMonitor;
    }

    public void setResoluçãoMonitor(int resolucaoMonitor) {
        this.resolucaoMonitor = resolucaoMonitor;
    }

    @Override
    public String toString() {
        return "Notebook{" + "procesador=" + procesador + ", qtdMemoria=" +
                qtdMemoria + ", tipoMemoria=" + tipoMemoria + ", qtdMemoriaHD=" +
                qtdMemoriaHD + ", placaVideo=" + placaVideo + ", resoluçãoMonitor=" + resolucaoMonitor + '}';
    }

    public static class Builder {
            private  Notebook notebook;
            public Builder(){
            this.notebook = new Notebook();
        }
        public Builder comProcessador(String processador){
              this.notebook.procesador = processador;
              return this;         
        } 
        public Builder comQtdMemoria(int qtdMemoria){
               this.notebook.qtdMemoria = qtdMemoria;
               return this;         
        }
        public Builder comTipoMemoria(String tipoMemora){
               this.notebook.tipoMemoria= tipoMemora;
               return this;
        }
       public Builder comQtdMemoriaHD(int qtdMemoriaHD){
               this.notebook.qtdMemoriaHD = qtdMemoriaHD;
               return this;
        } 
        public Builder comPlacaVideo(String placaVideo){
              this.notebook.placaVideo = placaVideo;
              return this;  
        }      
        public Builder comResolucaoMonitor(int resolucaoMonitor){
               this.notebook.resolucaoMonitor = resolucaoMonitor;
               return this; 
        }
         public Builder temNotebook(boolean temNotebook) {
                this.notebook.temNotebook = temNotebook;
                return this;
         }      
         public Builder compraEfetuada(boolean  compraEfetuada) {
                this.notebook.compraEfetuada = compraEfetuada;
                return this;        
        }     
        Notebook builder() {
            return this.notebook;
   
        }
    }
}
   

