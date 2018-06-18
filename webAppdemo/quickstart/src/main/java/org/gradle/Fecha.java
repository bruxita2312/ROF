package org.gradle;
public class Fecha {
    
    java.util.Date fechaactual;
 
    public Fecha() 
    {
        fechaactual = new java.util.Date();  
    }
    
    public String getFechaActual()
    {
         String fechahoy,diaac,mesac;
         int diaactu,mesactu,anoactu;
         
         diaactu=fechaactual.getDate();
         mesactu=fechaactual.getMonth()+1;
         anoactu=fechaactual.getYear()+1900;
         diaac=Integer.toString(diaactu);
         mesac=Integer.toString(mesactu);
         
         if(mesactu<10)
            mesac="0".concat(mesac);
         if( diaactu<10)     
           diaac="0".concat(diaac);
         
           fechahoy=diaac+"/"+mesac+"/"+anoactu;  
            return fechahoy;
    }
    public String get_hora_completa()
    {
         String horahoy;
         int hora,min,seg;

         
         hora=fechaactual.getHours();
         min=fechaactual.getMinutes();
         seg=fechaactual.getSeconds();
         
           horahoy=hora+"."+min+"."+seg;  
            return horahoy;
    }
    public int get_mesactual()
    {
        int mesactu=fechaactual.getMonth()+1;
        return mesactu;
    }
    
    public int get_anoactual()
    {
        int anoactu=fechaactual.getYear()+1900;
        return anoactu;
    }
	
    public String get_anioactual(){
      int actu=fechaactual.getYear()+1900;
      String anoactu = Integer.toString (actu);
      return anoactu;
    }
    //formato dd/mm/aaaa
    public int get_dia(String fec)
    {
        String dia1=fec.substring(0,2);
        int dia=Integer.parseInt(dia1);
        return dia;
    }
    
    
     public int get_mes(String fec)
    {
        String mes1=fec.substring(3,5);
        int mes=Integer.parseInt(mes1);
        return mes;
    }
    
    public int get_ano(String fec)
    {
        String ano1=fec.substring(6,10);
        int ano=Integer.parseInt(ano1);
        return ano;
    }
    
    public String getHoraActual()
    {
         String horahoy;
         int horac,minac,segac;
         String horactu,minactu,segactu;
         
         horac=fechaactual.getHours();
         minac=fechaactual.getMinutes();
         segac=fechaactual.getSeconds();
         
         horactu=String.valueOf(fechaactual.getHours());
         minactu=String.valueOf(fechaactual.getMinutes());
         segactu=String.valueOf(fechaactual.getSeconds());
         
         if(horac<10)
            horactu="0".concat(horactu);
         if(minac<10)     
           minactu="0".concat(minactu);
         if(segac<10)     
           segactu="0".concat(segactu);
         
           horahoy=horactu+":"+minactu+":"+segactu;  
        
           return horahoy;
    }
     public String cambiar_formato_amd(String s)
    {
        // validar que siempre entre una fecha valida
        String dia=s.substring(0,2);
        String mes=s.substring(3,5);
        String ano=s.substring(6,10);
        
        String fec=ano+"-"+mes+"-"+dia;
        
        
        return fec;
    }
    public String cambiar_formato_dma(String s)
    {
        String dia=s.substring(8,10);
        String mes=s.substring(5,7);
        String ano=s.substring(0,4);
        
        String fec=dia+"/"+mes+"/"+ano;
        
        
        return fec;
    }
    
    public String nombre_mes(int mes)
       {
           String nommes="";
           switch (mes)
        {
            case 1:
            nommes="enero";
            break;

            case 2:
            nommes="febrero";
            break;
            case 3:
            nommes="marzo";
            break;
            case 4:
            nommes="abril";
            break;

            case 5:
            nommes="mayo";
            break;
            case 6:
            nommes="junio";
            break;
            case 7:
            nommes="julio";
            break;

            case 8:
            nommes="agosto";
            break;

            case 9:
            nommes="septiembre";
            break;
            case 10:
            nommes="octubre";
            break;
            case 11:
            nommes="noviembre";
            break;
            case 12:
            nommes="diciembre";
            break;
        }
           return nommes;
       }






public String numero_mes(String mes)
       {
           String nummes="";
           if(mes.equals("enero"))
            nummes="01";
            if(mes.equals("febrero"))
            nummes="02";
            if(mes.equals("marzo"))
            nummes="03";
            if(mes.equals("abril"))
            nummes="04";
            if(mes.equals("mayo"))
            nummes="05";
           if(mes.equals("junio"))
            nummes="06";
            if(mes.equals("julio"))
            nummes="07";
            if(mes.equals("agosto"))
            nummes="08";
            if(mes.equals("septiembre"))
            nummes="09";
            if(mes.equals("octubre"))
            nummes="10";
            if(mes.equals("noviembre"))
            nummes="11";
            if(mes.equals("diciembre"))
            nummes="12";
         
           return nummes;
       }



}
