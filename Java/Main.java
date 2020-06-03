/*Ejercicio 5
Se utiliza un random para los elementos del arreglo
así se evita el tedioso ingreso de numeros por el usuario.*/
import java.util.Random;

class Main {
  public static void main(String[] args) {
    int[] myArray = new int[10];
    Random aleatorio = new Random();
    System.out.print("[ ");
    for(int i = 0; i<myArray.length;i++){
      myArray[i] = aleatorio.nextInt(5)+1;//El random es del 1 al 5 para asegurar repeticiones de ocurrencias
      System.out.print(myArray[i]+" ");
    }
System.out.println("]");
    myNumber objNumber = new myNumber();

    for(int x : myArray){
      myNumber tempNumber = new myNumber(x);
      for (int y : myArray){
        if(x==y){
          tempNumber.addRepetition();
        }
      }
      if(objNumber.getRepetitions()<tempNumber.getRepetitions()){
        objNumber = tempNumber;
      }
    }
    System.out.print(objNumber);
  }
}

class myNumber{
  int numberId;
  int repetitions;
  myNumber(int numb){
    this.numberId = numb;
    this.repetitions = 0;
  }
  myNumber(){
    this.numberId = 0;
    this.repetitions = 0;
  }
  public void addRepetition(){
    repetitions++;
  }

  public int getNumber(){
    return numberId;
  }
  public int getRepetitions(){
    return repetitions;
  }
  @Override
  public String toString(){
    return "Número: " + this.numberId + "\n" 
     + "Ocurrencias: " + this.repetitions;
  }
}