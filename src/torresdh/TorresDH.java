package torresdh;
public class TorresDH {
public static void main(String[] args) {
        // TODO code application logic here
        TorresDH objHanoi=new TorresDH();
        objHanoi.torresHanoi(3, 30, 20, 10);
        System.out.println("JUEGO FINALIZADO");
    }
    //CREANDO METODO RECURSIVO PARA LAS TORRES HANOI
public void torresHanoi(int discos, int torre30, int torre20,int torre10){
    // parte inicial
    if(discos==1){
        System.out.println("Mover Disco de torre" + torre30 + "a torre" +torre10);
    }else{
        torresHanoi(discos-1,torre30,torre10,torre20);
        System.out.println("Mover Disco de torre" + torre30 + "a torre" +torre10);
        torresHanoi(discos-1,torre20,torre30,torre10);
    }

}
}
